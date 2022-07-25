package DiamondProblem;

public class TestDemo implements FirstDemo1, SecondDemo2 {
	
	public void Disp() {
		
		FirstDemo1.super.Disp();
		SecondDemo2.super.Disp();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestDemo t = new TestDemo();
		t.Disp();

	}

}
