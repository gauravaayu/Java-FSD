package PracticeProject5;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		//linked list is a part of the collection framework present in jav.utilpackage
				//it is linear datastructure where elements are not stored in contiguous memory location
				//every element is sepaaet object with datapart and address
				//this elements are linked using pointer and addresss
				// each ealement is called node
				//due to dynamicallay insertion and deleteion they are much more preffered than arrays
				
				LinkedList<Integer> list= new LinkedList<Integer>();
				
				list.add(11);
				list.add(20);
				list.add(80);
				list.add(13);
				
				System.out.println("Size: "+list.size());
				System.out.println(list);
				
				list.remove(2);
				
				System.out.println(list);
				
				System.out.println("Element 2: "+list.get(2));
				list.add(3,0);
				
				System.out.println(list);
				
				System.out.println("First Element: "+list.getFirst());
				
				System.out.println("Last Element: "+list.getLast());
				
				
				//you can iterate using for loop
				//you can iterate using iterator
				

	}

}
