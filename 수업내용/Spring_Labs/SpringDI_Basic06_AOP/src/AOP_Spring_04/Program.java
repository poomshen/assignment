package AOP_Spring_04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Program {

	public static void main(String[] args) {
		 
		
		ApplicationContext context 
		= new GenericXmlApplicationContext("classpath:AOP_Spring_04/ApplicationContext.xml");
		 Calc calc =  (Calc)context.getBean("proxy");
		 System.out.println(calc.ADD(100, 100));

	}

}
