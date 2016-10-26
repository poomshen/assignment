package XML_Base;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Program {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext context = new GenericXmlApplicationContext("classpath:XML_Base/Application.xml");
		
		MainFunction mainFunction = context.getBean("mainFunction", MainFunction.class);
		mainFunction.operatorSum(100, 100);
		
		context.close();

	}
	
}
