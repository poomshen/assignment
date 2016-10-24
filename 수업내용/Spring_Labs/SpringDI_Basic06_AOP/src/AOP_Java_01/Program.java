package AOP_Java_01;

public class Program {

	public static void main(String[] args) {
		Cal cal = new Cal();
		int result = cal.Add(10000, 123456);
		System.out.println("ADD Result : " + result);
		
		result = cal.Mul(100, 200);
		System.out.println("MUL Result : " + result);
		
	}

}
