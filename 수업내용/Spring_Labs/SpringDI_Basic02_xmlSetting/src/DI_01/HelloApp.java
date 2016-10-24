package DI_01;

public class HelloApp {

	public static void main(String[] args) {
		MessageBean messagebean = new MessageBean();
		messagebean.sayHello("kglim");

	}

}
//요구사항
//MessageBean > Hello 입력한값
//영문버전(Hello kglim) , 한글버전(안녕 kglim)
//인터페이스 활용
