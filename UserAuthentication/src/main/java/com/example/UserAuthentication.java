package com.example;

public class UserAuthentication {
	
public boolean authentication(String username,String password) {
		
		
		if((username==null)||(password==null)) {
			return false;
		}
	
		if(username.equalsIgnoreCase("gaurav@gmail.com")) {
			if(password.equals("@Aayu0143@")) {
				System.out.println("Logged In !!");
				return true;
			}
		}
		
		
		return false;
		
		
	}

}
