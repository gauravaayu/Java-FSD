package PracticeProject9;
import java.util.Scanner;

public class ArrayInputExample {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of element you want to stote :");
		n=sc.nextInt();
		int[] array = new int[10]; 
		System.out.println("Enter the elements of the array: ");  
		for(int i=0; i<n; i++)  {
			array[i]=sc.nextInt();  
		}
		System.out.println("Array elements are: ");  
		for (int i=0; i<n; i++) {
			System.out.println(array[i]);  
		}
		
		

	}

}
