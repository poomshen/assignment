package DI_Annotation_05_Config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Program {
	public static void main(String[] args) {
		ApplicationContext context = new 
				AnnotationConfigApplicationContext(ConfigContext.class);
		User u = context.getBean("user", User.class); //"user" >  함수명
		u.userMethod();

		User2 u2 = context.getBean("user2", User2.class); //"user2" >  함수명
		u2.user2Method();
	}

}
