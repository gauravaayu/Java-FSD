package PracticeProject2;

public class AccessModifier1 {
	public void methodPublic() {
		System.out.println("This is public method");
	}
	
	private void methodPrivate() {
		System.out.println("This is private method");
	}
	
	void methodDefault() {
		System.out.println("This is default method");
	}
	
	protected void methodProtected() {
		System.out.println("This is protected method");
	}
	

	public static void main(String[] args) {
     AccessModifier1 am= new  AccessModifier1();
		
		am.methodDefault();
		am.methodPrivate();
		am.methodProtected();
		am.methodPublic();
		

	}

}
