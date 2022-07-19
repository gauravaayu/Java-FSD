package PracticeProject9;
import java.util.Scanner;

public class OneDimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		//n=sc.nextInt();
		System.out.println("enter the number :");
		n=sc.nextInt();
		
		
		
		int arr[]= new int[10];
		int sum=0;
		System.out.println("Enter the elements of the array: ");
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt(); 
		}
		
		
		for(int i=0; i<arr.length; i++) {
			sum+=arr[i];
		}
		System.out.println("sum of array is :"+sum);

	}

}
