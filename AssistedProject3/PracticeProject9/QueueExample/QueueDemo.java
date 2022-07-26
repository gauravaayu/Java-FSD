package QueueExample;
import java.util.LinkedList;
import java.util.Queue;



public class QueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Queue<String> locationQueue= new LinkedList<String>();
		
		locationQueue.add("nikhil");
		locationQueue.add("gaurav");
		locationQueue.add("aayushi");
		locationQueue.add("shubh");
		locationQueue.add("alok");
		locationQueue.add("somu");
		
		System.out.println("Queue is : "+locationQueue);
		
		
		//find head of queue
		System.out.println("Head of Queue: "+locationQueue.peek());
		
		locationQueue.remove();
		
		System.out.println("After Removing Head: "+locationQueue);

	}

}
