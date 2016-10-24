package AOP_Spring_05;



public class NewCalc implements Calc {

	@Override
	public int ADD(int x, int y) {
		//보조관심사 (cross-cutting-concern)
		int sum = x + y;
		//보조관심사 (cross-cutting-concern)
		System.out.println("주관심 결과 : sum " + sum);
		return sum;
	}

	@Override
	public int MUL(int x, int y) {
		//보조관심사 (cross-cutting-concern)
		int mul = x * y;
		//보조관심사 (cross-cutting-concern)
		return mul;
	}

	@Override
	public int SUB(int x, int y) {
		//보조관심사 (cross-cutting-concern)
		int sub = x - y;
		//보조관심사 (cross-cutting-concern)
		return sub;
	}

}
