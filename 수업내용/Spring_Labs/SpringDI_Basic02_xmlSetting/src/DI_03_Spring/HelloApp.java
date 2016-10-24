package DI_03_Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloApp {

	public static void main(String[] args) {
		//영문
		//MessageBean_En message_en = new MessageBean_En();
		//message_en.sayHello("kglim");
		
		//한글
		//MessageBean_kr message_kr = new MessageBean_kr();
		//message_kr.sayHello("kglim");
		
		//다형성 (부모타입)
		
		//Spring xml 설정 으로
		//MessageBean message = new MessageBean_En();
		
		ApplicationContext context = 
				new GenericXmlApplicationContext("classpath:DI_03_Spring/DI_03.xml");
		//컨테이너 안에 자원(객체) 얻기
		MessageBean message = context.getBean("message",MessageBean.class);
		message.sayHello("kglim");
	}

}
//요구사항
//MessageBean > Hello 입력한값
//영문버전(Hello kglim) , 한글버전(안녕 kglim)
//인터페이스 활용
//result : 하나의 타입(Interface)으로 여러개의 타입을 가진 수 있다
