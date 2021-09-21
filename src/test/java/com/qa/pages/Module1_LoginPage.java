package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Module1_LoginPage {

	WebDriver driver;
	
	@FindBy(xpath="//span[contains(text(),'Log in')]")
	WebElement Login;
	
	@FindBy(id=("email--1"))
    WebElement Email;
	
	@FindBy(id=("id_password"))
	WebElement password;
	
	@FindBy(id=("submit-id-submit"))
	WebElement lgnBtn;
	
	@FindBy(xpath="//a[contains(text(),'Forgot Password')]")
	WebElement forgotPswd;
	
	
	public WebElement getEmail() {
		return Email;
	}


	public WebElement getPassword() {
		return password;
	}


	public WebElement getLgnBtn() {
		return lgnBtn;
	}


	public WebElement getForgotPswd() {
		return forgotPswd;
	}


	public WebElement getLogin() {
		return Login;
	}


	public Module1_LoginPage(WebDriver driver) {
		this.driver=driver;
    	PageFactory.initElements(driver, this);  
      }


	
}
