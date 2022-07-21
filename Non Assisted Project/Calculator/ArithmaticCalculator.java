package Calculator;
import java.util.Scanner;

public class ArithmaticCalculator {

	public static void main(String[] args) {
		int n1,n2;
		char op;
		double cal=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		n1 = sc.nextInt();
		
		System.out.println("Enter second number: ");
		n2 = sc.nextInt();
		
		System.out.println("Choose Arithmatic operator(+,-,*,/)");
		op = sc.next().charAt(0);
		
		switch(op) {
		case '+':
			cal =n1+n2;
			break;
		case '-':
			cal =n1-n2;
			break;
		case '*':
			cal =n1*n2;
			break;
		case '/':
			cal =n1/n2;
			break;
		default:
			System.out.println("please enter the correct input!!");
			break;	
		}
		
		System.out.println("calculation is : ");
		System.out.println(n1+" "+op+" "+n2+" = "+cal);

	}

}
