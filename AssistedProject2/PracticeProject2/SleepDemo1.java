package Multithreading;

public class SleepDemo1  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			for(int i=0; i<5; i++) {
				
				Thread.sleep(1000);
				System.out.println("sleep demo is " +i);
			}
		}
		
		catch(Exception e) {
			
			System.out.println(e);
		}

	}

}
