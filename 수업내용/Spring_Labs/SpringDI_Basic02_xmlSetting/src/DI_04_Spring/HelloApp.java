package DI_04_Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloApp {
	public static void main(String[] args){
		/*
		MessageBeanImpl messagebean = new MessageBeanImpl("kglim");
		messagebean.setGreeting("hello");
		*/
		
		//xml설정을 통해서 IOC 컨테이너 구성
		ApplicationContext context = 
				new GenericXmlApplicationContext("classpath:DI_04_Spring/DI_04.xml");
		//컨테이너 안에 있는  객체(bean) 얻어오기
		MessageBean messagebean = context.getBean("m4", MessageBean.class);
		messagebean.sayHello();
		
	}
}
