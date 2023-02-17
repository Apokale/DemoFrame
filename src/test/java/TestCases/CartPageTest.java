package TestCases;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.CartPage;
import Pages.InventoryPage;
import Pages.LoginPage;
import Utility.CaptureScreenshot;

public class CartPageTest extends TestBase{
	LoginPage login;
	InventoryPage inventory;
	CartPage cart;
	@BeforeMethod
	public void setup() throws Exception 
	{
		initialization();
		login = new LoginPage();
		inventory = new InventoryPage();
		cart = new CartPage();
	}
	
	@Test
	public void verifyUrlTest() throws Exception 
	{
		login.LoginToApp1();
		inventory.add6Product();
		inventory.remove2Product();
		cart.loginToCartPage();
		String url = cart.verifyUrl();
		Assert.assertEquals(url,"https://www.saucedemo.com/cart.html");
	}
	
	@Test
	public void verifyLableTest() throws Exception
	{
		login.LoginToApp1();
		inventory.add6Product();
		inventory.remove2Product();
		cart.loginToCartPage();
		String result = cart.verifyLable();
		Assert.assertEquals(result, "YOUR CART");
	}
	
	@Test
	public void verifyProductCountTest() throws Exception
	{
		login.LoginToApp1();
		inventory.add6Product();
		inventory.remove2Product();
		cart.loginToCartPage();
		String result = cart.verifyProductCount();
		Assert.assertEquals(result, "4");
	}
	
	@Test 
	public void verifyMainLogoTest() throws Exception {
		login.LoginToApp1();
		inventory.add6Product();
		inventory.remove2Product();
		cart.loginToCartPage();
		boolean result = inventory.verifyMainLogo();
		Assert.assertEquals(result, true);
	}
	
	@Test
	public void verifyBigBotLogoTest() throws Exception
	{
		login.LoginToApp1();
		inventory.add6Product();
		inventory.remove2Product();
		cart.loginToCartPage();
		boolean result = inventory.verifyBigBotLogo();
		Assert.assertEquals(result, true);
	}
	
	@Test
	public void verifyTwitterLogoTest() throws Exception
	{
		login.LoginToApp1();
		inventory.add6Product();
		inventory.remove2Product();
		cart.loginToCartPage();
		boolean result = inventory.verifyTwitterLogo();
		Assert.assertEquals(result, true);
	}
	
	@Test
	public void verifyFacebookLogoTest() throws Exception
	{
		login.LoginToApp1();
		inventory.add6Product();
		inventory.remove2Product();
		cart.loginToCartPage();
		boolean result = inventory.verifyFacebookLogo();
		Assert.assertEquals(result, true);
	}
	
	@Test
	public void verifyLinkedinLogoTest() throws Exception
	{
		login.LoginToApp1();
		inventory.add6Product();
		inventory.remove2Product();
		cart.loginToCartPage();
		boolean result = inventory.verifyLinkedinLogo();
		Assert.assertEquals(result, true);
	}
	
	@AfterMethod
	public void closeBrowser(ITestResult it) throws Exception
	{
		if(ITestResult.FAILURE == it.getStatus())
		{
			CaptureScreenshot.screenshot(it.getName());
		}
		driver.close();
	}
}
