package TestCases;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;
import Utility.CaptureScreenshot;
import Utility.ReadData;
	
public class LoginPageTest extends TestBase {
	LoginPage login;
	@BeforeMethod
		public void setup() throws Exception 
	{
		initialization();
		login =	new	LoginPage();
	}
	
	@Test (enabled = true, priority = 1)
	public void verifyLoginLogoTest() 
	{
		boolean result = login.verifyLoginLogo();
		Assert.assertEquals(result,true);
	}
	
	@Test (enabled = true)
	public void verifyBotLogoTest() 
	{
		boolean result = login.verifyBotLogo();
		Assert.assertEquals(result,true);
	}
	
	@Test (enabled = true, priority = 0)
	public void verifyTitleTest() 
	{
		String title = login.verifyTitle();
		Assert.assertEquals(title, "Swag Labs");
	}
	
	@Test (enabled = true)
	public void verifyURLTest() throws Exception 
	{
		String url = login.verifyURL();
		Assert.assertEquals(url,ReadData.readExcelFile(1, 0));
	}
	@Test (enabled = true)
	public void LoginToApplicationTest() throws Exception 
	{
		String lable = login.LoginToApp1();
		Assert.assertEquals(lable,ReadData.readExcelFile(2, 0));
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
