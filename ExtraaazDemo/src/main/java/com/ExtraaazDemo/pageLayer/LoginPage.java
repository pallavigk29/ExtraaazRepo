package com.ExtraaazDemo.pageLayer;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.time.Duration;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//object repo
	@FindBy(xpath="//a[contains(text(),'LOGIN')]")
	private WebElement Login_link;
	@FindBy(xpath="//input[@id='email']")
	private WebElement emailid_txtbox;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement password_txtbox;
	
	@FindBy(xpath="//button[contains(text(),'Login')]")
	private WebElement login_btn;
	
	//action methods
	public void clickonLoginLink()
	{
		Login_link.click();
	}
	public void enterUsername(String username)
	{
		emailid_txtbox.sendKeys(username);
	}
	
	public void enterPassword(String password)
	{
		password_txtbox.sendKeys(password);
	}
	
	public void clickOnLoginButton()
	{
		login_btn.click();
	}
	
	public String getCurl()
	{
		String url = driver.getCurrentUrl();
		return url;
	}
	public void launchLoginUrl()
	{
		driver.get("https://stg.extraaazpos.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}


}
