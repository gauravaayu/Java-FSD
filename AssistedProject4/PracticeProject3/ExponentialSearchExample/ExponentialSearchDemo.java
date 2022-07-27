package ExponentialSearchExample;
import java.util.Arrays;

import java.util.Scanner;

public class ExponentialSearchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc= new Scanner(System.in);
	        System.out.println("enter the number of array :");
	        int b = sc.nextInt();
	        int arr []= new int[b];
	        System.out.println("enter the element into array :");
	        for(int i=0;i<arr.length;i++) {
	        	arr[i]=sc.nextInt();
	        }
	        System.out.println("enter the value for searching :");
	        int value =sc.nextInt();
		
		
		
         int outcome=exponentialSearch(arr,arr.length,value);
		
		if(outcome<0) {
			System.out.println("Element is not present in array");
		}
		else {
			System.out.println("Element found at index: "+outcome+", Key is: "+arr[outcome]);
		}
	}

	private static int exponentialSearch(int[] arr, int length, int value) {
		// TODO Auto-generated method stub
		
		//check if the element is available at  first index
		if(arr[0]==value) {
			return 0;
		}
		
		int i=1; //find out the range by repeated doubling
		
		while(i<length && arr[i]<=value) {
			i= i*2;
		}
		
		//call binary search
		
		
		return Arrays.binarySearch(arr,i/2,Math.min(i, length),value);

	}

}
