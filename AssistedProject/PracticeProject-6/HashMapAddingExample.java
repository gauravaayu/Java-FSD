package PracticeProject_10;
import java.util.*;

public class HashMapAddingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Default Initialization of a
        // Map
        Map<Integer, String> hm1 = new HashMap<>();
  
        // Initialization of a Map
        // using Generics
        Map<Integer, String> hm2
            = new HashMap<Integer, String>();
  
        // Inserting the Elements
        hm1.put(1, "gaurav");
        hm1.put(2, "aayushi");
        hm1.put(3, "pappu");
  
        hm2.put(new Integer(1), "alok");
        hm2.put(new Integer(2), "suddhu");
        hm2.put(new Integer(3), "somu");
  
        System.out.println(hm1);
        System.out.println(hm2);

	}

}
