package PracticeProject1;

public class ExplicitTypeCasting {

	public static void main(String[] args) {
		
        int a= 23;
		
		double b=(double) a;
		long c = (long) a;
		
		System.out.println("Converted int "+a+" to double "+b);
		System.out.println("Converted int "+a+" to long "+c);

	}

}
