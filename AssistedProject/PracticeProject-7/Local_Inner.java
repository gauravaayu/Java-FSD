package PracticeProject7;

public class Local_Inner {
	void my_Method() {
		int num =87;
	class MethodInner_place {
		
	public void print() {
		System.out.println ("method for inner classes "+num);
	}
	}
	MethodInner_place inner = new MethodInner_place();
	inner.print();
	}

	public static void main(String[] args) {
		Local_Inner ob = new Local_Inner();
		ob.my_Method();

	}

}
