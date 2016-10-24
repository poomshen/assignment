package DI_04_Spring;

public class MessageBeanImpl implements MessageBean {
	private String name;
	private String greeting;
	
	public MessageBeanImpl(String name) {
		this.name = name; //생성자 초기화
	}
		
	public void setGreeting(String greeting) {
		this.greeting = greeting; //setter 초기화
	}
	@Override
	public void sayHello() {
		System.out.println(this.name + "/" + this.greeting);
		
	}

}
