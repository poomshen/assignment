package dao;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import vo.Notice;

public class NewNoticeDao implements NoticeDao{
   
   private JdbcTemplate jdbcTemplate;
   @Autowired
   public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
      this.jdbcTemplate = jdbcTemplate;
   }
   
   @Override
   public int getCount(String field, String query) throws ClassNotFoundException, SQLException {
      String sql = "SELECT COUNT(*) CNT FROM NOTICES WHERE "+field+" LIKE ?";
      int count = this.jdbcTemplate.queryForObject(sql, Integer.class, "%"+query+ "%");
      return count;
   }
   
   @Override
   public List<Notice> getNotices(int page, String field, String query) throws ClassNotFoundException, SQLException {
      int srow = 1 + (page-1)*5; // 1, 16, 31, 46, 61, ... an = a1 + (n-1)*d
      int erow = 5 + (page-1)*5; //15, 30, 45, 60, 75, ...
      
      String sql = "SELECT * FROM";
      sql += "(SELECT ROWNUM NUM, N.* FROM (SELECT * FROM NOTICES WHERE "+field+" LIKE ? ORDER BY REGDATE DESC) N)";
      sql += "WHERE NUM BETWEEN ? AND ?";
      Object[] obj = {"%" + query + "%", srow, erow};
      return this.jdbcTemplate.query(sql, obj , new BeanPropertyRowMapper<Notice>(Notice.class));
   }
   
   @Override
   public int delete(String seq) throws ClassNotFoundException, SQLException {
      String sql = "DELETE NOTICES WHERE SEQ=?";
      int result = this.jdbcTemplate.update(sql, seq);
      return result;
   }
   
   @Override
   public int update(Notice notice) throws ClassNotFoundException, SQLException {
      String sql = "UPDATE NOTICES SET TITLE=?, CONTENT=?, FILESRC1=?, FILESRC2=? WHERE SEQ=?";
      Object[] obj = {notice.getTitle(), notice.getContent(), notice.getFileSrc1(), notice.getFileSrc2(), notice.getSeq()};
      int result = this.jdbcTemplate.update(sql, obj);
      return result;
   }
   
   @Override
   public Notice getNotice(String seq) throws ClassNotFoundException, SQLException {
      String sql = "SELECT * FROM NOTICES WHERE SEQ=?";
      Notice notice = this.jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Notice>(Notice.class), seq);
      return notice;
   }
   
   @Override
   public int insert(Notice n) throws ClassNotFoundException, SQLException {
      String sql = "INSERT INTO NOTICES(SEQ, TITLE, CONTENT, WRITER, REGDATE, HIT, FILESRC1,FILESRC2) VALUES( (SELECT MAX(TO_NUMBER(SEQ))+1 FROM NOTICES), ?, ?, 'newlec', SYSDATE, 0, ?,?)";
      Object[] obj = {n.getTitle(), n.getContent(), n.getFileSrc1(), n.getFileSrc2()};
      int result = this.jdbcTemplate.update(sql, obj);
      return result;
   }
}