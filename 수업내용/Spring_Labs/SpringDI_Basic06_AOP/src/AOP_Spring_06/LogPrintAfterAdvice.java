package AOP_Spring_06;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.aop.AfterReturningAdvice;

public class LogPrintAfterAdvice implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object returnvale, 
			                   Method method, 
			                   Object[] args,
			                   Object target) throws Throwable {
		Log log = LogFactory.getLog(this.getClass());
		log.info("[ AfterReturningAdvice START]");
		log.info("[ 보조업무 ] : 주업무 실행되고 돌아와서 바로 실행");
		log.info("returnvale : " + returnvale);
		log.info("method : " + method.getName());
		log.info("args : " + Arrays.toString(args));
		log.info("target : " + target.toString());
		
	}

}
