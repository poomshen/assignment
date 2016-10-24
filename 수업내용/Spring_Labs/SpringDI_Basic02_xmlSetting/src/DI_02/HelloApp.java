package DI_02;

public class HelloApp {

	public static void main(String[] args) {
		//영문
		//MessageBean_En message_en = new MessageBean_En();
		//message_en.sayHello("kglim");
		
		//한글
		//MessageBean_kr message_kr = new MessageBean_kr();
		//message_kr.sayHello("kglim");
		
		//다형성 (부모타입)
		MessageBean message = new MessageBean_En();
		message.sayHello("kglim");
	}

}
//요구사항
//MessageBean > Hello 입력한값
//영문버전(Hello kglim) , 한글버전(안녕 kglim)
//인터페이스 활용
//result : 하나의 타입(Interface)으로 여러개의 타입을 가진 수 있다
