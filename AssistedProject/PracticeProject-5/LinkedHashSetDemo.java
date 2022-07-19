package PracticeProject5;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		//linked hashset is an ordered version of hashset
				//whenever iteration order is needed to be maintained this class is used
				//while iterating elements are fetched as per they were inserted
				//do not allows duplicate values
				LinkedHashSet<String> linkedset= new LinkedHashSet<String>();
				
				linkedset.add("A");
				linkedset.add("B");
				linkedset.add("C");
				linkedset.add("D");
				
				//note: do not allows duplicate values, so 'A' will not be added but 'E' will be added
				linkedset.add("A");
				linkedset.add("E");
				linkedset.add(null);
				
				System.out.println("Size: "+linkedset.size());
				
				System.out.println(linkedset);
				
				
				System.out.println("Contains E: "+linkedset.contains("E"));
				System.out.println("Contains G: "+linkedset.contains("G"));
				
				linkedset.remove(null);
				
				System.out.println("After Remove: "+linkedset);
				
				// you can iterate using for loop
				
				// you can iterate using iterator

	}

}
