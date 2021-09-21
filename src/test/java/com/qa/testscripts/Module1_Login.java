package com.qa.testscripts;

/*1)Verify the login screen contains elements as email,password,login button,Forgot password link.
2)Verify whether all the text boxes have a minimum and maximum length.
3)Verify the username and password.
4)Verify that user is redirected to appropriate page after successful login
5)Verify that the user is redirected to the forgot password page
when clicking on the forgot password link.*/

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Module1_Login extends TestBase {
	
	
	SoftAssert sa = new SoftAssert();
	
	/*1)Verify the login screen contains elements as email,password,login button,
	  Forgot password link*/
	
	@Test
	public void test1() {
		
		
		boolean emailBox = login.getEmail().isDisplayed();
		boolean pswdBox = login.getPassword().isDisplayed();
		boolean lgnBtn = login.getLgnBtn().isDisplayed();
		boolean forgotPswdLink = login.getForgotPswd().isDisplayed();
		
		if(emailBox == true && pswdBox == true && lgnBtn == true && forgotPswdLink == true) {
			sa.assertTrue(emailBox, "Email text box is avalable");
			sa.assertTrue(pswdBox, "password text box is avalable");
			sa.assertTrue(lgnBtn, "Login button is avalable");
			sa.assertTrue(forgotPswdLink, "Forget password link is avalable");
		}
		else {
			sa.assertTrue(emailBox, "Email text box is not avalable");
			sa.assertTrue(pswdBox, "password text box is not avalable");
			sa.assertTrue(lgnBtn, "Login button is not avalable");
			sa.assertTrue(forgotPswdLink, "Forget password link is not avalable");
		}
	}
	
	//2)Verify whether all the text boxes have a minimum and maximum length.

	@Test
	public void test2() {
		int em_height = login.getEmail().getSize().getHeight();
		int em_width = login.getEmail().getSize().getWidth();
		
		int pwd_height = login.getPassword().getSize().getHeight();
		int pwd_width = login.getPassword().getSize().getWidth();
		
		if (em_height == pwd_height && em_width == pwd_width)
			sa.assertTrue(true,"Height & Width of Username & Password text box are same");
		else
			sa.assertTrue(false,"Height & Width of Username & Password text box are not same");

	}
	
	//3)Verify the username and password.
	
	@Test
	public void login() throws InterruptedException {

	login.getLogin().click();
	Thread.sleep(50000);
	
	login.getEmail().sendKeys("shivakrishna9250@gmail.com");
	login.getPassword().sendKeys("nagarajlatha");
	login.getLgnBtn().click();
	}
	
	//4)Verify that user is redirected to appropriate page after successful login
	
	@Test
	public void test4() {
		String title = "Online Courses - Learn Anything, On Your Schedule | Udemy";
		String loginPageTitle = driver.getTitle();
		if(loginPageTitle.equals(title)) {
			System.out.println("user is redirected to appropriate page after successful login");
			sa.assertTrue(true,"user is redirected to appropriate page after successful login");
		}
		else
			System.out.println("user is not redirected to appropriate page after successful login");
	}
	
	/*5)Verify that the user is redirected to the forgot password page
	when clicking on the forgot password link*/
	
	@Test
	public void test5() {
		login.getForgotPswd().click();
		String forgetPswd = "Forgot Password | Udemy";
		String forgetPswdTitle = driver.getTitle();
		if(forgetPswd.equals(forgetPswdTitle)) {
			System.out.println("user is redirected to the forgot password page");
		}
		else
			System.out.println("user is not redirected to the forgot password page");
	}
}
