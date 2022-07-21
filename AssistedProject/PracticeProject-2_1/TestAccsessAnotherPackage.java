package PracticeProject2_1;
import PracticeProject2.AccessModifier1;

public class TestAccsessAnotherPackage {

	public static void main(String[] args) {
        AccessModifier1 am= new  AccessModifier1();
		
		
		///public method is a globally accessible to all classes and packages
		//am.methodDefault();
		//am.methodPrivate();
		//am.methodProtected();
		am.methodPublic();

	}

}
