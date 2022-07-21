package PracticeProject8;

public class StringToStringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str1 = "hii ";
		 
	        // create StringBuffer object
	        StringBuffer sb = new StringBuffer();
	 
	        // 1. convert String to StringBuffer
	        // using append() method
	        sb.append(str1);
	 
	        // String - 2
	        String str2 = "i,m gaurav mishra";
	 
	        // 2. again, convert String-2 to StringBuffer
	        // using append() method
	        sb.append(str2);
	 
	        // String - 3
	        String str3 = "Bye";
	 
	        // 3. third time, convert String-3 and
	        // add newline '\n' using + operator
	        sb.append("\n" + str3);
	 
	        // print to console
	        System.out.println("Ex: String to StringBuffer"
	                + " using append() method : \n\n" + sb);

	}

}
