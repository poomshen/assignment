package ex02;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Program {
	public static void main(String[] args) {
//		ProtocolHandler ph = new ProtocolHandler();
//		ArrayList<MyFilter> arrayList = new ArrayList<MyFilter>();
//		arrayList.add(new ZipFilter());
//		arrayList.add(new HeaderFilter());
//		arrayList.add(new EncFilter());
//		
//		ph.setFilters(arrayList);
		ApplicationContext context = new GenericXmlApplicationContext("classpath:ex02/DI_07.xml");
		ProtocolHandler ph =context.getBean("protocolHandler",ProtocolHandler.class);
		
		System.out.println(ph.Filter_length());
		System.out.println("됬다 ~~~ ");
		System.out.println("이제 뭐할까요 형?");
	}
}
