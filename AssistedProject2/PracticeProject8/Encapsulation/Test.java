package Encapsulation;

import java.io.Serializable;

public class Test implements Serializable  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a = new Account();
		a.setaccno(101);
		a.setname("gaurav");
		a.setemail("mishra@gmail.com");
		a.setamount(29283);
		System.out.println(a.getaccno()+ " "+a.getemail()+ " "+a.getname()+ " "+a.getamount());
		
		Employee e1= new Employee();
		e1.setId(1);
		e1.setName("Nikunj");
		e1.setEmail("nikunj@gmail.com");
		e1.setPassword("12345");
		e1.setMobile("9876543210");
		e1.setDesignation("Trainer");
		
		System.out.println(e1);
	}

}
