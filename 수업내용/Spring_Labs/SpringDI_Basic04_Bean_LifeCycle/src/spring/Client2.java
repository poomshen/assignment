package spring;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Client2 {
    
	public Client2() {
		System.out.println("Client2 Default");
	}
	
	private String defaulthost;
	public Client2(String defaulthost){
		this.defaulthost = defaulthost;
		System.out.println("Client2 Overloading :" + this.defaulthost);
	}
	
	private String host;
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
		System.out.println("Client2 setHost() 호출 : " + this.host);
	}

	public void send(){
		System.out.println("데이터 보내기....");
	}
	
	public void Client2_init(){
		System.out.println("사용자 정의 초기화 함수 호출");
	}
	public void Client2_close(){
		System.out.println("사용자 정의 소멸자 함수 호출");
	}

}
