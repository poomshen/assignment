package XML_Base;

import org.aspectj.lang.ProceedingJoinPoint;

public class AspectAdvice {
	
	public Object trace(ProceedingJoinPoint joinPoint) throws Throwable{
		
		System.out.println("여기는 joinPoint.proceed()의 before 입니다.");
		
		Object result = joinPoint.proceed();
		
		System.out.println("여기는 joinPoint.proceed()의 after 입니다.");
		
		return result;
	}
}
