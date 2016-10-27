package dao;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;


import vo.Member;

public class NewMemberDao implements MemberDao {


   private JdbcTemplate jdbcTemplate;

   @Autowired
   public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
      this.jdbcTemplate = jdbcTemplate;
   }
   @Override
   public Member getMember(String uid) throws ClassNotFoundException, SQLException {
      
      
      String sql = "SELECT * FROM MEMBER WHERE UID=?";
      // 0. 드라이버 로드
      try{
         return this.jdbcTemplate.queryForObject(sql,
                                              new BeanPropertyRowMapper<Member>(Member.class),
                                              uid);
      }catch(EmptyResultDataAccessException e){
         return null;
      }
      
   }

   @Override
   public boolean insert(Member member) throws ClassNotFoundException, SQLException {
      String sql = "INSERT INTO MEMBER VALUES( ?, ?, ?, ?, ?, ?, ?, ?, ?, SYSDATE)";
      boolean result = false;
      Object[] params = {member.getUid(),member.getPwd(),member.getName(),member.getGender(),member.getBirth(),member.getIsLunar(),member.getCPhone(),member.getHabit()};
      if(this.jdbcTemplate.update(sql, params) > 0){
         result = true;
      }
      return result;
   }

}