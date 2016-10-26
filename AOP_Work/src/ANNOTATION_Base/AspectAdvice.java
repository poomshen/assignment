package ANNOTATION_Base;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AspectAdvice {
	
	@Pointcut("execution(* ANNOTATION_Base.*.*(..))")
	private void tracetest(){
		
		
	}

	@Around("tracetest()")
	public Object trace(ProceedingJoinPoint joinPoint) throws Throwable{
		
		System.out.println("Annotation 구현 , joinPoint.proceed()의 before 입니다.");
		
		Object result = joinPoint.proceed();
		
		System.out.println("Annotation 구현 , joinPoint.proceed()의 after 입니다.");
		
		return result;
	}
}
