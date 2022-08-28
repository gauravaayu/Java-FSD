package com.example;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class Authentication {
	
	private UserAuthentication user;
	@BeforeEach
	public void BeforeEach() {
		user =new UserAuthentication();
		System.out.println("UserAuthentication Initiated");
	}
	@AfterEach
	public void tearDown() {
		user=null;
		System.out.println("UserAuthentication stopped");
	}@Test
	public void Authenticate() {
		assertTrue(user.authentication("gaurav@gmail.com","@Aayu0143@"));
		assertFalse(user.authentication("rmisgfsg", "jhghjsu"));
		assertNotEquals(user.authentication("gaurav","gaurav"), user.authentication("gaurav@gmail.com", "@Aayu0143@"));
		assertEquals(user.authentication("gaurav@gmail.com","@Aayu0143@"), user.authentication("gaurav@gmail.com", "@Aayu0143@"));
	}
	@Test
    public void Authenticate1() {
				assertFalse(user.authentication("",""));
		}

}
