package AOP_Java_02;

import java.lang.reflect.Proxy;

public class Program {

	public static void main(String[] args) {
		Calc calc = new NewCalc();
		//System.out.println(calc.ADD(10, 20)); 주업무 함수 바로 호출
		
	 Calc cal =(Calc)Proxy.newProxyInstance(
			 				   calc.getClass().getClassLoader(), //실제 클래스 메타 정보
				               calc.getClass().getInterfaces() , //행위정보(인터페이스)
				               new LogPringHandler(calc)         //핸들러(보조관심) : 실객체의 주소넘김 
			 				   );
	 
	 
	 
	 
	 
	 
	 int result = cal.SUB(100, 200); // LogPringHandler > invoke 호출
	 System.out.println("main : " + result);

	}

}
