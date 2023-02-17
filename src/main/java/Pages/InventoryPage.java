package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Base.TestBase;

public class InventoryPage extends TestBase{
//TC1	- verify	the	visibility	of	small	logo
//TC2	- verify	the	visibility	of	big	logo
//TC3	- Add	6	product	in	cart
//TC4	- Remove	2	product	from	cart
//TC5	- verify	the	visibility	of	twitter	logo	(Assignment)
//TC6	- verify	the	visibility	of	fb	logo	(Assignment)
//TC7	- verify	the	visibility	of	linkedin	logo	(Assignment)
//TC8 	- verify the visibility of main logo
	
	//Object Repo
	@FindBy(xpath = "//div[@class='app_logo']") private WebElement mainLogo;
	@FindBy(xpath = "//div[@class='peek']") private WebElement smallBotLogo;
	@FindBy(xpath = "//img[@class='footer_robot']") private WebElement bigBotLogo;
	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']") private WebElement backpackProduct;
	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-bike-light']") private WebElement bikeLightProduct;
	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']") private WebElement tshirtProduct16;
	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-fleece-jacket']") private WebElement tshirtProduct50;
	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-onesie']") private WebElement tshirtProduct8;
	@FindBy(xpath = "//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']") private WebElement tshirtProductRed;
	@FindBy(xpath = "//select[@class='product_sort_container']") private WebElement filterBy;
	@FindBy(xpath = "//span[@class='shopping_cart_badge']") private WebElement productCount;
	@FindBy(xpath = "//a[@href='https://twitter.com/saucelabs']") private WebElement twitterLogo;
	@FindBy(xpath = "//a[@href='https://www.facebook.com/saucelabs']") private WebElement facebookLogo;
	@FindBy(xpath = "//a[@href='https://www.linkedin.com/company/sauce-labs/']") private WebElement linkedinLogo;
	@FindBy(xpath = "//button[@id='remove-sauce-labs-bolt-t-shirt']") private WebElement removeTshirtProduct16;
	@FindBy(xpath = "//button[@id='remove-sauce-labs-bike-light']") private WebElement	removeBikeLightProduct;
	//@FindBy(xpath = "//button[@id='remove-sauce-labs-onesie']") private WebElement removetshirtProductRed;
	//Constructor
	public InventoryPage() 
	{
		PageFactory.initElements(driver,this);
	}
	//Methods
	//Method to Verify Main Logo
	public boolean verifyMainLogo() 
	{
		return mainLogo.isDisplayed();
	}
	
	//Method to Verify Small Bot Logo
	public boolean verifySmallBotLogo() 
	{
		return smallBotLogo.isDisplayed();
	}
	
	//Method to Verify Big Bot Logo
	public boolean verifyBigBotLogo() 
	{
		
		return bigBotLogo.isDisplayed();
	}
	
	//Method to add 6 product in cart
	public String add6Product() 
	{
		Select s = new Select(filterBy);
		s.selectByVisibleText("Price (low to high)");
		backpackProduct.click();
		bikeLightProduct.click();
		tshirtProduct16.click();
		tshirtProduct50.click();
		tshirtProduct8.click();
		tshirtProductRed.click();
		String count = productCount.getText();
		return count;
	}
	
	//Method to remove 2 product in cart
	public String remove2Product() 
	{
		removeBikeLightProduct.click();
		removeTshirtProduct16.click();
		String count = productCount.getText();
		return count;
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