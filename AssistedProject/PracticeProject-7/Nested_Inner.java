package PracticeProject7;
class Outer_place {
	int num;
private class Inner_place {
	public void print() {
		System.out.println("It is an inner class");
	}
}
void display_Inner() {
	Inner_place inner = new Inner_place();
	inner.print();

}
}
public class Nested_Inner {

	public static void main(String[] args) {
		Outer_place outer = new Outer_place();
		outer.display_Inner();

	}

}
