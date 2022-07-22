package ExceptionHandling;

public class ExceptionHandlingExample3 {
	
static void waitFor() {
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		waitFor();

	}

}
