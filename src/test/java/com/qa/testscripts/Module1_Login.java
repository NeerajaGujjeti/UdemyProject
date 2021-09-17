package com.qa.testscripts;

import org.testng.annotations.Test;

public class Module1_Login extends TestBase {

	@Test
	public void login() {
	login.getLogin().click();
	}
}
