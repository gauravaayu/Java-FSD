package PracticeProject5;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
        ArrayList<String> list= new ArrayList<String>();
		
		System.out.println("Size:"+list.size());
		
		list.add("gaurav");
		list.add("aayushi");
		list.add("alok");
		list.add("suddhu");// duplicate value are allowed in list
		list.add(null);// list contains null value
		
		System.out.println("After Adding an name :"+list.size());
		System.out.println(list);
		
		System.out.println("Element at index 4: "+list.get(4));
		list.add("somu");
		
		System.out.println(list);
		
		System.out.println("List Contains gaurav? :"+list.contains("gaurav"));
		
		
		list.remove(0);
		list.remove(null);
		
		System.out.println(list);
		
		
		//print a list using for loop
		
		for(String s:list) {
			System.out.println("Using For Loop: "+s);
		}
		
		
		//iterate using iterator
		Iterator<String> itr= list.iterator();
		
		while(itr.hasNext()) {
			System.out.println("Using Iterator: "+itr.next());
		}

	}

}
