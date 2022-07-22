package ExceptionHandling;

public class ExceptionHandlingExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=0,b=0;
		//int c=a/b;
		 try {
			 
				int c=a/b;
			 
			 System.out.println("the value of "+c);
		 }
		 
		 catch (ArithmeticException e) {
			// TODO: handle exception
			 System.out.println("error"+e);
		}

	}

}
