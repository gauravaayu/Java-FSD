package Uncheckedexception;
import java.util.Scanner;

public class Demo1 {
	
	////runtime  : Arithmatic Exception1

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int a = sc.nextInt();
		int b =sc.nextInt();
		
		int sum = a+b;
		System.out.println("the sum is :"+sum);
		

	}

}
