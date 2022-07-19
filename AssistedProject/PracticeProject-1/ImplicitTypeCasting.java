package PracticeProject1;

public class ImplicitTypeCasting {

	public static void main(String[] args) {
		byte a1=20;
		System.out.println("Byte: "+a1);
		
		short b1=a1;
		System.out.println("Byte to Short Conversion: "+b1);
		
		int c1 =b1;
		System.out.println("Short to Int Conversion: "+c1);
		
		int d1=a1;
		System.out.println("Byte to Int Conversion: "+d1);
		
		float e1=d1;
		System.out.println("Int to Float Conversion: "+e1);
		
		double f1=e1;
		System.out.println("Float to double Conversion: "+f1);
		
		double g1=d1;
		System.out.println("Int to double Conversion: "+g1);

	}

}
