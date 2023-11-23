package com.ExtraaazDemo.testLayer;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ExtraaazDemo.pageLayer.LoginPage;
import com.ExtraaazDemo.pageLayer.RegistrationForm;
import com.ExtraaazDemo.testBase.TestBase;

public class RegistrationTest  extends TestBase{
	@Test
	public void registerUsingCredientials() throws InterruptedException
	{
		String expected_output = "https://stg.extraaazpos.com/login";
		RegistrationForm reg_obj = new RegistrationForm(driver);
		reg_obj.launchUrl();
		reg_obj.enterName("Pallavi");
		reg_obj.enteremailid("pallubhumkar29@gmail.com");
		reg_obj.enterPassword("Pallavi123");
		reg_obj.reenterPassword("Pallavi123");
		reg_obj.enternumber("7219222017");
        Thread.sleep(1000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(906,1000)");
		Thread.sleep(1000);
		reg_obj.clickOnRegisterButton();
		Assert.assertEquals(reg_obj.getCurl(), expected_output);
	}
}
