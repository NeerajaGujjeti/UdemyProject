package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Module2_SignUpPage{
    WebDriver driver;
    
	@FindBy(xpath="//span[contains(text(),'Sign up')]")
     WebElement signUp;

	public WebElement getSignUp() {
		return signUp;
	}
	
	public Module2_SignUpPage(WebDriver driver) {
		this.driver=driver;
    	PageFactory.initElements(driver, this);  
      }
	
}
