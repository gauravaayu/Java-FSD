package Synchronization;

public class TestSynchronization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Sender sender = new  Sender();
		
		User t1= new User("gaurav", "Hello good morning....!", sender);
		User t2= new User("aayushi","Hii!! how  are you?",sender);
		
		t1.start();
		t2.start();

	}

}
