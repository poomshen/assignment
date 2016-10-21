package ex01;

import java.util.Map;

public class ProtocolHandlerFactory {
	//Map 구조 (key ,value)
	private Map<String,ProtocolHandler> handlers;

	public void setHandlers(Map<String, ProtocolHandler> handlers) {
		this.handlers = handlers;
		System.out.println("여기 풀었어요 ~~  :" + this.handlers.toString());
	}
	
	
}
