package com.ExtraaazDemo.testLayer;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ExtraaazDemo.pageLayer.LoginPage;
import com.ExtraaazDemo.testBase.TestBase;

public class LoginTest extends TestBase{
	@Test
	public void loginwithValidCred()
	{
		String expected_output = "https://stg.extraaazpos.com/admin";
		LoginPage login_obj = new LoginPage(driver);
		login_obj.launchLoginUrl();
		login_obj.clickonLoginLink();
		login_obj.enterUsername("admin@gmail.com");
		login_obj.enterPassword("Admin@123");
		login_obj.clickOnLoginButton();
		
		Assert.assertEquals(login_obj.getCurl(), expected_output);
	}
	
	@Test
	public void loginwithInValidCred()
	{
		String expected_output = "https://stg.extraaazpos.com/login";
		LoginPage login_obj = new LoginPage(driver);
		login_obj.launchLoginUrl();
		login_obj.clickonLoginLink();
		login_obj.enterUsername("wsgh");
		login_obj.enterPassword("123");
		login_obj.clickOnLoginButton();
		
		Assert.assertEquals(login_obj.getCurl(), expected_output);
	}
}

