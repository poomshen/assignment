package kr.or.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import kr.or.vo.Member;

public class MemberDao {
	
	
	public int insert(Member member) throws SQLException, ClassNotFoundException{
		
		String sql = "INSERT INTO test_member values(?,?)";
		// 0. 드라이버 로드
		Class.forName("oracle.jdbc.driver.OracleDriver");
		// 1. 접속
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",
				"springuser", "1004");
		// 2. 실행
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, member.getId());
		st.setString(2, member.getPwd());
		
		int result = st.executeUpdate();
		
		st.close();
		con.close();
		
		return result;
	}
}
