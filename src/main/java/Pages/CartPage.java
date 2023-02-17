package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class CartPage extends TestBase{
//TC1 - Verify Url
//TC2 - Verify Lable 
//TC3 -	Verify Product Count
//TC4 - Verify the visibility of main logo
//TC5 - Verify the visibility of big logo
//TC6 - Verify the visibility of twitter logo
//TC7 - Verify the visibility of fb	logo
//TC8 - Verify the visibility of linkedin logo
	
	//Object Repo
	@FindBy(xpath = "//a[@class='shopping_cart_link']") private WebElement cartBtn;
	@FindBy(xpath = "//span[@class='title']") private WebElement cartLabel;
	@FindBy(xpath = "//span[@class='shopping_cart_badge']") private WebElement productCount;
	@FindBy(xpath = "//div[@class='app_logo']") private WebElement mainLogo;
	@FindBy(xpath = "//img[contains(@src,'graphic.2e87acec.png')]") private WebElement bigBotLogo;
	@FindBy(xpath = "//a[@href='https://twitter.com/saucelabs']") private WebElement twitterLogo;
	@FindBy(xpath = "//a[@href='https://www.facebook.com/saucelabs']") private WebElement facebookLogo;
	@FindBy(xpath = "//a[@href='https://www.linkedin.com/company/sauce-labs/']") private WebElement linkedinLogo;
	//Constructor
	public CartPage() {
		PageFactory.initElements(driver,this);
	}
	//Methods
	//Method to move to cart page from inventory page
	public void loginToCartPage() 
	{
		cartBtn.click();
	}
	//Method to verify Url
	public String verifyUrl() {
		return driver.getCurrentUrl();
	}
	//Method to verify Lable
	public String verifyLable()
	{
		return cartLabel.getText();
	}
	//Method to verify Product Count
	public String verifyProductCount()
	{
		return productCount.getText();
	}
	
	//Method to Verify Main Logo
	public boolean verifyMainLogo() 
	{
		return mainLogo.isDisplayed();
	}
	
	//Method to Verify Big Bot Logo
	public boolean verifyBigBotLogo() 
	{
			
		return bigBotLogo.isDisplayed();
	}
		
	//Method to Verify twitter Logo
	public boolean verifyTwitterLogo() 
	{
		return twitterLogo.isDisplayed();
	}

	//Method to Verify facebook Logo
	public boolean verifyFacebookLogo() 
	{
		return facebookLogo.isDisplayed();
	}

	//Method to Verify linkedin Logo
	public boolean verifyLinkedinLogo() 
	{
		return linkedinLogo.isDisplayed();
	}
}
