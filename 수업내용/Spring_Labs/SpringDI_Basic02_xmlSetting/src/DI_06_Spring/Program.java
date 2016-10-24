package DI_06_Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Program {

	public static void main(String[] args) {
		//Mysql 연동 , insert 작업
		/*
		MysqlArticleDAO articledao = new MysqlArticleDAO();
		WriteArticleService service = new WriteArticleService(articledao);
		Article article = new Article();
		service.Write(article);
		*/
		ApplicationContext context = 
				new GenericXmlApplicationContext("classpath:DI_06_Spring/DI_06.xml");
		
		WriteArticleService service = context.getBean("service",WriteArticleService.class);
		Article article = context.getBean("article", Article.class);
		//실행결과
		service.Write(article);

	}

}
