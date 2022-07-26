package RangeQuery;

public class RangeOfSum {
	
	public int sum(int a[],int L , int R) {
		int sum =0;
		for (int i =L; i<= R; i++) {
			sum= sum+a[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RangeOfSum r= new RangeOfSum();
		int a[]= {12,14,2,4,5,6};
		System.out.println("the sum is :"+r.sum(a, 0, 2));
		System.out.println("the sum is :"+r.sum(a, 2, 4));

	}

}
