package ex01;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Map;

public class ProtocolHandlerFactory {
	//Map 구조 (key ,value)
	@Autowired
	private Map<String,ProtocolHandler> handlers;

	public void setHandlers(Map<String, ProtocolHandler> handlers) {
		this.handlers = handlers;
		System.out.println("setter 주입 성공 :" + this.handlers.toString());
	}
	
	
}
