package PracticeProject2_1;
import PracticeProject2.AccessModifier1;

public class Child extends AccessModifier1{

	public static void main(String[] args) {
		Child c= new Child();
		
		//default and private method outside the class and outside 
		//the package(another package) is not permissible
		//c.methodDefault();
		//c.methodPrivate();
		c.methodProtected();
		c.methodPublic();

	}

}
