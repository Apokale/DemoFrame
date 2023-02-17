package Base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Utility.ReadData;
import io.github.bonigarcia.wdm.WebDriverManager;
//This	class	will	be	extended	to	all	page	classes	and	test	classes
public class TestBase {
		public static WebDriver driver;
	public void initialization() throws Exception 
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(ReadData.readPropertyFile("url"));
	}
}
