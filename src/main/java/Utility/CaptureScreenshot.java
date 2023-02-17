package Utility;

import java.io.File;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import Base.TestBase;

public class CaptureScreenshot extends TestBase{
	
	public static String date() 
	{
		Date d = new Date();
		return d.toString().replace(":", "_").replace(" ", "_")+ ".png";
	}
	public static void screenshot(String name) throws Exception
	{
		File Source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Akshay\\eclipse-workspace\\Base\\Screenshots\\"+name+".png");
		FileHandler.copy(Source, dest);	
	}
}
