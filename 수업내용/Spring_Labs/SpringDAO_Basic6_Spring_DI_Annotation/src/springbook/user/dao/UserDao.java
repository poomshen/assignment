package springbook.user.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;

import springbook.user.domain.User;

public class UserDao {
	
	private ConnectionMaker connectionmaker;
	@Autowired
	public UserDao(ConnectionMaker simpleconnectionmaker){
		this.connectionmaker = simpleconnectionmaker;
	
	}
	
	
	//Data Add
	public void add(User user) throws ClassNotFoundException , SQLException {
		Connection c = connectionmaker.makeConnection();
		PreparedStatement ps = c.prepareStatement("insert into users(id,name,password) values(?,?,?)");
		ps.setString(1, user.getId());
		ps.setString(2, user.getName());
		ps.setString(3, user.getPassword());
		
		ps.executeUpdate();
		
		ps.close();
		c.close();
		
	}
	
	//Data Get
	public User get(String id) throws ClassNotFoundException , SQLException {
		Connection c = connectionmaker.makeConnection();
		PreparedStatement ps = c.prepareStatement("select * from users where id =?");
		ps.setString(1, id);
		ResultSet rs = ps.executeQuery();
		rs.next();
		User user = new User();
		user.setId(rs.getString("id"));
		user.setName(rs.getString("name"));
		user.setPassword(rs.getString("password"));
		return user;
	}
	

	
}
