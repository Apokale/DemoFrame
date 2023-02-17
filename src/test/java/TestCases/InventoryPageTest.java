package TestCases;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.InventoryPage;
import Pages.LoginPage;
import Utility.CaptureScreenshot;

public class InventoryPageTest extends TestBase{
	LoginPage login;
	InventoryPage inventory;
	@BeforeMethod
	public void setup() throws Exception 
	{
		initialization();
		login = new LoginPage();
		inventory = new InventoryPage();
	}
	
	@Test 
	public void verifyMainLogoTest() throws Exception 
	{
		login.LoginToApp1();
		boolean result = inventory.verifyMainLogo();
		Assert.assertEquals(result, true);
	}
	
	@Test
	public void verifySmallBotLogoTest() throws Exception
	{
		login.LoginToApp1();
		boolean result = inventory.verifySmallBotLogo();
		Assert.assertEquals(result, true);
	}
	
	@Test
	public void verifyBigBotLogoTest() throws Exception
	{
		login.LoginToApp1();
		boolean result = inventory.verifyBigBotLogo();
		Assert.assertEquals(result, true);
	}
	
	@Test
	public void verifyTwitterLogoTest() throws Exception
	{
		login.LoginToApp1(); 
		boolean result = inventory.verifyTwitterLogo();
		Assert.assertEquals(result, true);
	}
	
	@Test
	public void verifyFacebookLogoTest() throws Exception
	{
		login.LoginToApp1();
		boolean result = inventory.verifyFacebookLogo();
		Assert.assertEquals(result, true);
	}
	
	@Test
	public void verifyLinkedinLogoTest() throws Exception
	{
		login.LoginToApp1();
		boolean result = inventory.verifyLinkedinLogo();
		Assert.assertEquals(result, true);
	}
	
	@Test
	public void add6ProductTest() throws Exception
	{
		login.LoginToApp1();
		String count = inventory.add6Product();
		Assert.assertEquals(count, "6");
	}
	
	@Test
	public void remove2ProductTest() throws Exception
	{
		login.LoginToApp1();
		inventory.add6Product();
		String count = inventory.remove2Product();
		Assert.assertEquals(count, "4");
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
