package PracticeProject3;

public class CallByValue {
	int n=20;
	void operation(int n) {
		this.n=n*n;
		//if parameter is not passed it will take default value, but once the parameter
		// is passed it will take the value of parameter
	}

	public static void main(String[] args) {
        CallByValue ob= new CallByValue();
		
		System.out.println("Value of num before function call: "+ob.n);
		
		ob.operation(50);
		System.out.println("Value of num after function call: "+ob.n);

	}

}
