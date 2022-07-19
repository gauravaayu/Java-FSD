package PracticeProject3;

public class MethodOverload {
	int add(int a, int b) {
		return a+b;
	}
	int add(int a, int b,int c) {
		return a+b+c;
	}
	float add(float a, float b) {
		return a+b;
	}
	
	double add(double a, double b) {
		return a+b;
	}

	public static void main(String[] args) {
		MethodOverload obj= new MethodOverload();
		System.out.println("Addition of 23 and 4 :"+obj.add(23, 4));
		System.out.println("Addition of 23.0 and 9.78 :"+obj.add(23.0f,9.78f));
		System.out.println("Addition of 2 double :"+obj.add(2.3, 6.7));
		System.out.println("Addition of 3 int: "+obj.add(4, 6, 9));

	}

}
