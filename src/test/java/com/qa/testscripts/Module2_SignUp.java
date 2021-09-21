package com.qa.testscripts;

import org.testng.annotations.Test;

public class Module2_SignUp extends TestBase{
	
	//Module2_SignUpPage signUp = new Module2_SignUpPage(driver);
	
	@Test
	public void test1() {
		signUp.getSignUp().click();
	}
}
