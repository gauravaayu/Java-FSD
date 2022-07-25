package Polymorphism;

public class MethodOverloading {
	
	public int sum(int x , int y, int z) {
		return x+y+y;
	}
	
	public int sum(int x,int y) {
		
		return x+y;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading m = new MethodOverloading();
		int result1=m.sum(20, 10, 6);
		int result2=m.sum(2, 6);
		System.out.println("the results are both methods:" +result1+ " "+result2);

	}

}
