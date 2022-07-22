package Uncheckedexception;

public class Demo4 {
	
	//runtime: NullPointerException:

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name= null;
		Scanner sc=  new Scanner(System.in);
		System.out.println("Enter Email");
		String email=sc.next();
		
		if(name.equals(email))
			System.out.println("User Authenticated");
		else
			System.out.println("Not a Valid User");

	}

}
