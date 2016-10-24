package AOP_Spring_07;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.aop.MethodBeforeAdvice;

public class LogPrintBeforeAdvice implements MethodBeforeAdvice {

	@Override
	public void before(Method method, Object[] args, Object target)
			throws Throwable {
		Log log = LogFactory.getLog(this.getClass());
		log.info("[ Before Advice START]");
		log.info("[ 보조업무 ] : 주업무 시작전");
		log.info("method : " + method.getName());
		log.info("args : " + Arrays.toString(args));
		log.info("target : " + target.toString());
		
	}

}
