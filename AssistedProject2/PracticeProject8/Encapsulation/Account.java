package Encapsulation;



public class Account  {
	private long accno;
	private String name,email;
	private float amount;
	
	
	public long getaccno() {
		return accno;
	}
	
	public void setaccno(long accno) {
		this.accno=accno;
	}
	
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name=name;
	}
	
	public String getemail() {
		return email;
		
	}
	public void setemail(String email) {
		this.email=email;
	}
	

	public float getamount() {
		return amount;
	}

	public void setamount(float amount) {
		this.amount = amount;
	}

	
}
