package com.ExtraaazDemo.pageLayer;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.time.Duration;

public class RegistrationForm {
	WebDriver driver;
	public RegistrationForm(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//object repo
	@FindBy(xpath="//input[@id='username']")
	private WebElement name_txtbox;
	
	@FindBy(xpath="//input[@id='useremail']")
	private WebElement emailid_txtbox;
	
	@FindBy(xpath="//input[@id='password-input']")
	private WebElement password_txtbox;
	
	@FindBy(xpath="//input[@id='password-confirmation-input']")
	private WebElement confirmpassword_txtbox;
	
	@FindBy(xpath="//body/div[@id='']/main[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/form[1]/div[5]/div[1]/div[1]/input[1]")
	private WebElement phoneNumber_txtbox;
	
	@FindBy(xpath="//button[contains(text(),'Register')]")
	private WebElement Register_btn;
	
	//action methods
	public void enterName(String username)
	{
		name_txtbox.sendKeys(username);
	}
	public void enteremailid(String emailid)
	{
		emailid_txtbox.sendKeys(emailid);
	}
	
	public void enterPassword(String password)
	{
		password_txtbox.sendKeys(password);
	}
	public void reenterPassword(String password1)
	{
		confirmpassword_txtbox.sendKeys(password1);
	}
	public void enternumber(String number)
	{
		phoneNumber_txtbox.sendKeys(number);
	}
	
	public void clickOnRegisterButton()
	{
		Register_btn.click();
	}
	
	public String getCurl()
	{
		String url = driver.getCurrentUrl();
		return url;
	}
	public void launchUrl()
	{
		driver.get("https://stg.extraaazpos.com/register");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}


}
