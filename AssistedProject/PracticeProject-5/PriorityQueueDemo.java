package PracticeProject5;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		//priority queue doesn't allow null values
				// we can't create  priority queue that are non comparable
				//que retirval operations are poll, remove,peek
				
				
				
				PriorityQueue<Integer> pQueue= new PriorityQueue<Integer>(); 
				
				pQueue.add(12);
				pQueue.add(47);
				pQueue.add(39);
				pQueue.add(13);
			 
				
				//print priority queue
				
				System.out.println(pQueue);
				
				
				//print the top element of priority queue
				System.out.println("Top Element: " + pQueue.peek());
				
				
				//printing the top element and removing it from the priority queue container
				System.out.println("Printing the top element and removing: "+pQueue.poll());
				System.out.println(pQueue);
				
				//print the top element of priority queue
				System.out.println("Top Element: " + pQueue.peek());
				
				
				//remove element from pqueue
				
				pQueue.remove(13);
			
				
				System.out.println("After Remove : "+pQueue);
				
						
				
				//you can iterate using for loop
				//you can iterate using iterator
		

	}

}
