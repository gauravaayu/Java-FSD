package Serialization;
import java.io.Serializable;

public class Student implements Serializable {
	
	private int id;
	private String name;
	private transient String email; //don't serialize this value
	private String password;
	private String add;
	
	public Student(int id,String name, String email, String password, String add) {
		this.id=id;
		this.name=name;
		this.email=email;
		this.password=password;
		this.add=add;
		
	}
	
	public void display() {
		System.out.println(id+ " "+name+" "+email+ " "+password+ " "+add);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student  s1=new Student(1, "gaurav", "gaurav@gmail.com", "test@1234", "prayagraj");
		s1.display();

	}

}
