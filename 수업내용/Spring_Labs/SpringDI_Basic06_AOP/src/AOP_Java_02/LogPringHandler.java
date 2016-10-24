package AOP_Java_02;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.StopWatch;

//가짜를 만들어서 진짜 처럼 : java (reflect :InvocationHandler 구현)
//InvocationHandler 대리함수 역활 (invoke)

public class LogPringHandler implements InvocationHandler {

	private Object target;
	public LogPringHandler(Object target) {
		System.out.println("LogPringHandler 보조 관심사 생성자 호출");
		this.target = target;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("Invoke 메서드 호출 START");
		//System.out.println("Proxy : " + proxy);
		System.out.println("method : " + method);
		System.out.println("args" + Arrays.toString(args));
		
		//보조 업무 구현//////////////////////////////
		Log log = LogFactory.getLog(this.getClass());
		StopWatch sw = new StopWatch();
		sw.start();
		log.info("[타이머 시작]"); //console 에 출력
		//////////////////////////////////////////////
		
		//주업무//////////////////////////////////////
		//invoke 메서드 : ADD ,MUL ,SUB 호출
		int result = (int)method.invoke(this.target, args);
		/////////////////////////////////////////////
		
		//보조 업무 구현//////////////////////////////
		sw.stop();
		log.info("[타이머 시작]");
		log.info("[TIME LOG] Method : " + method);
		log.info("[TIME LOG] Process Time : " + sw.getTotalTimeMillis());
		//////////////////////////////////////////////
		
		return result;
	}

}
