package DI_05_Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloApp {

	public static void main(String[] args) {
		/*MyBean mybean = new MyBean();
		MyBean mybean2 = new MyBean("kglim");
		Singleton single = Singleton.getInstance();
		Singleton single2 = Singleton.getInstance();
		System.out.println("mybean :" + mybean);
		System.out.println("mybean2 :" + mybean2);
		System.out.println("single :" + single);
		System.out.println("single2 :" + single2);*/
		
		ApplicationContext context = 
				new GenericXmlApplicationContext("classpath:DI_05_Spring/DI_05.xml");
		//IOC 컨테이너 안의 객체는 default singleton
		System.out.println("before : mybean 객체 생성");
		MyBean mybean = context.getBean("mybean", MyBean.class);
		System.out.println("mybean 주소 : " + mybean);
	
		System.out.println("before : mybean 객체 생성");
		MyBean mybean2 = context.getBean("mybean", MyBean.class);
		System.out.println("mybean2 주소 : " + mybean2);
		
		Singleton single = context.getBean("single", Singleton.class);
		System.out.println(single);
	}

}
