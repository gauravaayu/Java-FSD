package PracticeProject3;

public class ReturnAndWithouReturn {
	
	public void Display() {
		System.out.println("Display method called");
	 }
    public int add() {
		 
		 int a=5,b=6,c;
		 c=a+b;
		 return c;
	 }

	public static void main(String[] args) {
		ReturnAndWithouReturn ob = new ReturnAndWithouReturn();
		ob.Display();
		System.out.println("result is :"+ob.add());
		
		
		

	}

}
