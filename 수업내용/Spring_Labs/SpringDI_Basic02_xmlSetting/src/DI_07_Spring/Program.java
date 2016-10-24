package DI_07_Spring;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Program {

	public static void main(String[] args) {
		
		/*
		ProtocolHandler ph = new ProtocolHandler();
		ArrayList<MyFilter> arraylist = new ArrayList<MyFilter>();
		arraylist.add(new ZipFilter());
		arraylist.add(new HeaderFilter());
		arraylist.add(new EncFilter());
		
		ph.setFilters(arraylist);
		System.out.println(ph.Filter_length());
		*/
		ApplicationContext context = 
				new GenericXmlApplicationContext("classpath:DI_07_Spring/DI_07.xml");
		
		ProtocolHandler ph = context.getBean("protocolHandler", ProtocolHandler.class);
		System.out.println(ph.Filter_length());
		

	}

}
