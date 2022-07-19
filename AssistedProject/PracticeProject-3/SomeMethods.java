package PracticeProject3;

public class SomeMethods {
	public void print() {
		int a=5;
		System.out.println("without return type and without parameter, value of a :"+a);
	}
    public void display(String name) {
		
		System.out.println("My name is "+name);
	}
    public int square(int n) {
		
		return n*n;
	}

	public static void main(String[] args) {
		 SomeMethods m = new  SomeMethods();
		 m.print();
		 m.display("gaurav");
		 System.out.println("Square is :"+m.square(6));
		

	}

}
