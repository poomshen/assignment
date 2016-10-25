package ANNOTATION_Base;

public class MainFunction {
	
	public int operatorSum(int x, int y){
		System.out.println("주기능 [sum] 함수 호출");
		int sum = x+y;
		System.out.println("결과 값 : " + sum);
		return sum;
	}
	
	public int operatorMul(int x, int y){
		System.out.println("주기능 [mul] 함수 호출");
		int mul = x * y;
		System.out.println("결과 값 : " + mul);
		return mul;
	}
}
