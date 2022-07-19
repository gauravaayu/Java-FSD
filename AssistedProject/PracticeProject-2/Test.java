package PracticeProject2;


public class Test {

	public static void main(String[] args) {
        AccessModifier1 obj= new  AccessModifier1();
		
		obj.methodDefault();
		//obj.methodPrivate(); //private method we can't access out side of class, its scope is within the class
		obj.methodProtected();
		obj.methodPublic();

	}

}
