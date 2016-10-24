package springbook.user.main;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import springbook.user.dao.NConnectionMaker;
import springbook.user.dao.UserDao;
import springbook.user.domain.User;

public class program {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//UserDao dao = new UserDao(new NConnectionMaker());
		ApplicationContext context = 
				new  GenericXmlApplicationContext("classpath:ApplicationContext.xml");	
		UserDao dao = context.getBean("userDao", UserDao.class);
		
		
		User user = new User();
		 	 user.setId("kglim");
			 user.setName("홍길동");
			 user.setPassword("1004");

				// insert
				dao.add(user);

				System.out.println(user.getId() + "등록성공");

				User user2 = dao.get(user.getId());
				System.out.println(user2.getName());
				System.out.println(user2.getPassword());

				System.out.println(user.getId() + "조회성공");

			}

		}