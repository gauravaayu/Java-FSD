package KthElement;

public class KthSmallestElement {
	
	public void sortArr(int arr[]) {
		
		int size = arr.length;
		for(int i = 0; i < size; i++)  
		{  
		int temp = i;  
		for(int j = i + 1; j < size; j++)  
		{  
		if(arr[temp] > arr[j])  
		{  
		temp = j;  
		}  	  
		  
		}  
		  
		  
		if(temp != i)  
		{  
		int t = arr[i];  
		arr[i] = arr[temp];  
		arr[temp] = t;   
		}  
		}   
		  
	}
	
	public int findKthSmallest(int arr[], int k)  
	{  
	sortArr(arr);  
	  
	// as an array is always a zero indexing  
	// therefore, the kth smallest element lies  
	// at the k - 1 index  
	return arr[k - 1];  
	}  
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KthSmallestElement element = new KthSmallestElement();
		int arr[]= {1,12,45,18,16,15};
		int size = arr.length;
		int k =4;
		
		System.out.println("the given array is : ");  
		for(int i = 0; i < size; i++)  
		{  
		System.out.print(arr[i] + " ");  
		}  
		
		System.out.println();  
		System.out.println("The " + k + "th smallest element of the array is: " +element.findKthSmallest(arr,k) );  
		System.out.println("\n");  

	}

}
