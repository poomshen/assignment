package ANNOTATION_configuration_Base;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Program {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(ANNOTATION_configuration_Base.Application.class);
		
		MainFunction mainFunction = context.getBean("mainFunction", MainFunction.class);
		mainFunction.operatorSum(100, 100);
		

	}
	
}
