package Multithreading;

public class ThreadDemo3 implements Runnable {
public  void run() {
		
		for(int i=1; i<5; i++) {
			
			System.out.println(i+ " "+Thread.currentThread().getName());
		
			 try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//1000milliseconds=1second
			
		}
		
		
		 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreadDemo3 tt1 = new ThreadDemo3();
		ThreadDemo3 tt2 = new ThreadDemo3();
		
		
		
		Thread t1 = new Thread(tt1);
		Thread t2 = new Thread(tt1);
		
		t1.setName("first");
		t2.setName("second");
		
		t1.start();
		t2.start();
		
		
		

	}

}
