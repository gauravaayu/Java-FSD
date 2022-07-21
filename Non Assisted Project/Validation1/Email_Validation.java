package Validation;    
import java.util.Scanner;

public class Email_Validation {

	public static void main(String[] args) {
		int count =0;
		String[] array = new String[6];
		array[0] ="mishrabhonu0143@gmail.com";
		array[1] ="aayushiupadhyay@gmail.com";
		array[2] ="alokpandey@gmail.com";
		array[3] ="sachinmishra123@gmail.com";
		array[4] ="rajumishra101@gmail.com";
		array[5] ="gauravmishra@gmail.com";
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your Email: ");
		String Email = s.nextLine();
		for(int i=0;i<5;i++) {
			if(array[i].equals(Email)) {
				count = 1;
			}
		}
		if(count==1) {
			System.out.println("this is valid emailId");
		}
		else {
			System.out.println("this is invalid emailId");
		}		
	}
}
