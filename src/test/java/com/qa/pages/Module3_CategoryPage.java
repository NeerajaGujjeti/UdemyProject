package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Module3_CategoryPage {

	@FindBy(xpath="//span[contains(text(),'Categories')]")
	WebElement cat;
	
}
