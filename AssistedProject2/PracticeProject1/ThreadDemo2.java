package Multithreading;

public class ThreadDemo2 implements Runnable {
	public void run() {
		
		System.out.println("thread is running");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadDemo2 td1 = new ThreadDemo2();
		Thread t1 = new Thread(td1);
		t1.start();
		
		

	}

}
