package ex01_teamQuiz1019;

import java.util.Map;

public class ProtocolHandlerFactory {
	//Map 구조 (key ,value)
	private Map<String,ProtocolHandler> handlers;

	public void setHandlers(Map<String, ProtocolHandler> handlers) {
		this.handlers = handlers;
		System.out.println("setter 주입 성공 :" + this.handlers.toString());
	}
	
	
}
