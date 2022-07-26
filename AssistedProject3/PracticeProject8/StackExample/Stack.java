package StackExample;
import java.util.Scanner;

public class Stack {
	
	static final int MAX=1000;
	int  top;
	int a[]= new int[MAX];
	
	boolean isEmpty() {
		
		return top<0;
		
	}
	
	public Stack() {
		//constructor
		top=-1;//default  stckas an empty;
	}
	
	//add an element to stack
	int push(int x) {
		if(top>=(MAX-1)) {
			System.out.println("Stackis Overflow");
			return 0;
		}
		else {
			a[++top]=x;
			//System.out.println(x+" Pushed insto stack");
			return x;
		}
	}
	
	//deletion of  elements

	int pop() {
		
		if(top<0) {
			System.out.println("Statck  is UNDERFLOW");
			return 0;
		}
		else {
			int x= a[top--];
			return x;
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack s=  new Stack();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of element you want to push :");
		int n =sc.nextInt();
		System.out.println("enter the element :");
		for(int i=0;i<n;i++) {
			System.out.println("pushed element are : "+s.push(sc.nextInt()));
			
		}
		
		System.out.println(s.pop()+ " : Poped Out from stack");

	}

}
