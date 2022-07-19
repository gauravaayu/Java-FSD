package PracticeProject_10;
import java.util.*;

public class HashmapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Creating an empty HashMap
        Map<String, Integer> map = new HashMap<>();
  
        // Inserting entries in the Map
        // using put() method
        map.put("gaurav", 10);
        map.put("aayushi", 30);
        map.put("pappu", 20);
  
        // Iterating over Map
        for (Map.Entry<String, Integer> e : map.entrySet())
  
            // Printing key-value pairs
            System.out.println(e.getKey() + " "
                               + e.getValue());

	}

}
