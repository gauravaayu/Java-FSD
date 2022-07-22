package CustomeException;

public class UserHandler {
	
static void check(int age) throws AgeNotValidExecption {
		
		if(age<18) {
			throw new AgeNotValidExecption("User Can not Vote Before 18");
		}
		else {
			System.out.println("User can Vote");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			check(16);
		} 
		catch (AgeNotValidExecption e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			
			System.out.println(e);
		}

	}

}
