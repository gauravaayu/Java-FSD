package LongestSubsequenceExample;
import java.util.Scanner;

public class LongestSubsequenceDemo {
	
	static int longestSequence(int a[],int n) {
		
		int lis[] = new int[n];
        int i, j, max = 0;
        
        for (i = 0; i < n; i++)
            lis[i] = 1;
        
        for (i = 1; i < n; i++)
            for (j = 0; j < i; j++)
                if (a[i] > a[j] && lis[i] < lis[j] + 1)
                    lis[i] = lis[j] + 1;
        
        for (i = 0; i < n; i++)
            if (max < lis[i])
                max = lis[i];
        return max;
        
	}

	public static void main(String[] args) {
		System.out.println("enter the size of array :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[]= new int[n];
		
		System.out.println("enter the element :");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("longest subsequence is :"+longestSequence(a,n));
	}

}
