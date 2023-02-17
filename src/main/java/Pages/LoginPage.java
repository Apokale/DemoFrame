package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;
import Utility.ReadData;	
public class LoginPage extends TestBase{
//TC1 Verify Title 
//TC2 Verify URL
//TC3 Verify loginLogo
//TC4 Verify BotLogo
//TC5 login To Application
	
		//Object Repo
	@FindBy(xpath = "//div[@class='login_logo']") private WebElement loginLogo;
	@FindBy(xpath = "//div[@class='bot_column']") private WebElement botLogo;
	@FindBy(xpath = "//input[@id='user-name']") private WebElement username;
	@FindBy(xpath = "//input[@id='password']") private WebElement password;
	@FindBy(xpath = "//input[@id='login-button']") private WebElement loginBtn;
	@FindBy(xpath = "//span[@class='title']") private WebElement productLable;
	//Constructor	to	initialize	the	elements	of	page
	public LoginPage() {
		PageFactory.initElements(driver,this);
	}
	//Methods
	//Method to Verify LoginLogo
	public boolean verifyLoginLogo() 
	{
		return loginLogo.isDisplayed();
	}
	
	//Method to verify BotLogo
	public boolean verifyBotLogo() 
	{
		return botLogo.isDisplayed();
	}
	//Method to Verify Title
	public String verifyTitle() 
	{
		return driver.getTitle();
	}
	//Method to Verify URL
	public String verifyURL() 
	{
		return driver.getCurrentUrl();
	}
	
	//Method to Login
	public String LoginToApp1() throws Exception 
	{
		username.sendKeys(ReadData.readPropertyFile("username"));
		password.sendKeys(ReadData.readPropertyFile("password"));
		loginBtn.click();
		return productLable.getText();
	}	
	
	public String LoginToApp2() throws Exception
	{
		LoginToApp1();
		return driver.getCurrentUrl();		
	}
}
