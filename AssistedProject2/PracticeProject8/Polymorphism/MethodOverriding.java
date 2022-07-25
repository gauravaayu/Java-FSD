package Polymorphism;

 class Gaurav{
	public void Disp() {
		System.out.println("my name is gaurav");
	}
	
}

 class Aayu extends Gaurav{
	public void Disp() {
		super.Disp();
		
		System.out.println("my name is aayu");
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gaurav g =new Gaurav();
		g.Disp();
		
		Aayu a= new Aayu();
		a.Disp();
		Gaurav g1 = new Aayu();
		g1.Disp();
		
		

	}

}
