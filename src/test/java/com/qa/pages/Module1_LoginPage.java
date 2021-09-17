package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Module1_LoginPage {

	WebDriver driver;
	
	@FindBy(xpath="//span[contains(text(),'Log in')]")
	WebElement Login;
	
	
	public WebElement getLogin() {
		return Login;
	}


	public Module1_LoginPage(WebDriver driver) {
		this.driver=driver;
    	PageFactory.initElements(driver, this);  
      }
}
