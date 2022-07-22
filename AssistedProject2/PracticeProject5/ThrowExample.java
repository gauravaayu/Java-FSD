package ExceptionHandling;

public class ThrowExample {
	
	public static void check(int n) {
		if(n<1) {
			throw new ArithmeticException("can not calculate bechause it is negative");
		}
		else {
			int s= n*n;
			System.out.println("the square is :"+s);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowExample t = new ThrowExample();
		t.check(-1);
		System.out.println("running resrt of code");

	}

}
