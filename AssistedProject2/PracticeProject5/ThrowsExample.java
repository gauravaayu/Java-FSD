package ExceptionHandling;

public class ThrowsExample {
	
	 public static int divideNum(int m, int n) throws ArithmeticException {  
	        int div = m / n;  
	        return div;  
	    }  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowsExample t1= new ThrowsExample();
		
		 try {  
	            System.out.println(t1.divideNum(45, 0));  
	        }  
	        catch (ArithmeticException e){  
	            System.out.println("\nNumber cannot be divided by 0");  
	        }  
	          
	        System.out.println("Rest of the code..");  

	}

}
