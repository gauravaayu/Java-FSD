package ExceptionHandling;

public class ExceptionHandlingExample5 {
	
	static void check(int age)
	{
		if(age<18)
			throw new ArithmeticException("Not a Valid Age Exeception");
		else
			System.out.println("Valid Age for Voting");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 try {
			 check(6);
		} catch (ArithmeticException e) {
			// TODO: handle exception
			
			System.out.println("Error: "+e);
		}
		 
		 //handled using try and catch

	}

}
