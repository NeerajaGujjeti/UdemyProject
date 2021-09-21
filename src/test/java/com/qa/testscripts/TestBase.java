package com.qa.testscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.qa.pages.Module1_LoginPage;
import com.qa.pages.Module2_SignUpPage;

public class TestBase {
   public static WebDriver driver;
   Module1_LoginPage login;
   Module2_SignUpPage signUp;
	
	@BeforeClass
	@Parameters("url")
	public void setUp(String Url) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Raana\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get(Url);
		Thread.sleep(5000);
		if (driver.getCurrentUrl().contains("www.udemy.com"))
			Reporter.log("URL Launched Sucessfully", true);
		else
			Reporter.log("URL Launch Failed ", true);
		login = new Module1_LoginPage(driver);
		signUp = new Module2_SignUpPage(driver);
		
	}
		@AfterClass
		public void tearDown() {
			// close browser
			driver.close();
		
        }
}
