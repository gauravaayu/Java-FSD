package PracticeProject4;


public class ConstructorType_Employee {
	int empId;
	String empName;
	String department;
	float salary;
	String Address;
    public ConstructorType_Employee(){
		
		empId=1;
		empName="Emp01";
		department="Devlopment";
		salary=35000;
		Address= "Prayagraj";
		
	}
    
    public ConstructorType_Employee (int empId, String empname, String department, float salary, String Address) {
		
		this.empId= empId;
		this.empName=empname;
		this.department=department;
		this.salary=salary;
		this.Address=Address;
		
	}
    public void display(){
		 System.out.println("Id: "+empId);
			System.out.println("Name: "+empName);
			System.out.println("Department: "+department);
			System.out.println("Salary: "+salary);
			System.out.println("Address: "+Address);
	 }

	public static void main(String[] args) {
		
		ConstructorType_Employee e = new ConstructorType_Employee();
		ConstructorType_Employee e1 = new ConstructorType_Employee(101,"Gaurav", "Dev",35000, "Praygaraj");
		ConstructorType_Employee e2 = new ConstructorType_Employee(102, "Aayushi", "Dev", 63000, "Delhi");
		
		e.display();
		
		e1.display();
		e2.display();
		

	}

}
