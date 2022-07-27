package BinarySearchExample;

import java.util.Scanner;

public class BinarySearchDemo {

	public static void main(String[] args) {
		    Scanner sc= new Scanner(System.in);
	        System.out.println("enter the number of array :");
	        int b = sc.nextInt();
	        int arr []= new int[b];
	        System.out.println("enter the element into array :");
	        for(int i=0;i<arr.length;i++) {
	        	arr[i]=sc.nextInt();
	        }
	        System.out.println("enter the key :");
	        
	        
	        int key=sc.nextInt();
	        
	        int arrLength=arr.length;
	        
	        try {
	            binarySearch(arr,0,key,arrLength);
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Error: "+e);
	        }
	        
	    }
	    private static void binarySearch(int[] arr, int lb, int key, int ub) {
	        
	        int midValue= (lb+ub)/2;
	        
	        while(lb<=ub) {
	            
	            if(arr[midValue]<key)
	            {
	                lb= midValue+1;
	            }
	            else if(arr[midValue]==key)
	            {
	                System.out.println("Element found at index: "+midValue);
	                break;
	            }
	            else {
	                ub=midValue-1;
	            }
	            midValue=(lb+ub)/2;
	        }
	        if(lb>ub) {
	            System.out.println("Element Not Found");
	        }
	        
	    }


	}


