package PracticeProject8;

public class StringToStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hello";
		System.out.println("String s = " + s);
		String s1 = new String("i,m");
		System.out.println("String s1 = " + s1);
		String s2 = new String("gaurav");
		System.out.println("String s2 = " + s2);
		
		StringBuilder sb = new StringBuilder();
		sb.append(s);
	    sb.append(" "+s1);
	    sb.append(" "+s2);
	    System.out.println(sb.toString());
		
		

	}

}
