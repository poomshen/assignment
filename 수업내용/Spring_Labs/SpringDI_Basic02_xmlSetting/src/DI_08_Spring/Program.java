package DI_08_Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Program {

	public static void main(String[] args) {
		/*
		JobExecute jobexecute = new JobExecute("kglim", 100);
		
		ArticleDao articledao = new ArticleDao();
		jobexecute.setArticledao(articledao);

		jobexecute.setData(500);
		*/
		ApplicationContext context = 
				new GenericXmlApplicationContext("classpath:DI_08_Spring/DI_08.xml");
		
	}

}
