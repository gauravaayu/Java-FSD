package TryCatchDemo;

public class TryCatchExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int a = 50;
			//int b=0;
			//System.out.println("the value is :" +b);
		}
		
		catch (ArithmeticException e) {
			// TODO: handle exception
			
			System.out.println("some error in program" +e);
		}
		
		System.out.println("error");

	}

}
