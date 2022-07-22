package ExceptionHandling;

public class ExceptionHandlingExample4 {
	
	static void check(int age) throws Exception
	{
		if(age<18)
			System.out.println("Not Valid Age For  Voting");
		else
			System.out.println("Valid Age for Voting");
	}
	
	static void test() throws Exception
	{
		check(18);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 try {
				test();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
			 //handled using try and catch

	}

}
