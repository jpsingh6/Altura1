package util;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Setup extends ReadExcel{
public static WebDriver driver=null;
public static String URL="http://staging-alturastudiesapp.azurewebsites.net/";
public static String URL1="http://staging-alturastudiesapp.azurewebsites.net/admin/";

	
	
	public static WebDriver browser(String browser)
	{
		try{
		if(browser.equalsIgnoreCase("FireFox"))
		{
			System.setProperty("webdriver.gecko.driver", "E:\\software\\FireFox\\geckodriver.exe");
			driver=new FirefoxDriver();		}
		else if(browser.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "E:\\software\\chrome\\chromedriver.exe");
			driver=new ChromeDriver();
			///write your browser
		}
		else if(browser.equalsIgnoreCase("IE"))
		{
			System.setProperty("webdriver.ie.driver", "E:\\software\\IE\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			///write your browser
		}
		else if(browser.equalsIgnoreCase("Edge"))
		{
			System.setProperty("webdriver.edge.driver", "E:\\software\\Edge\\MicrosoftWebDriver.exe");
			driver = new EdgeDriver();
		}
		}catch(Exception e)
		{
		return null;
		}
		return driver;
		
	}
	 public void getscreenshot(String path) throws Exception 
     {
             File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
          //The below method will save the screen shot in d drive with name "screenshot.png"
             FileUtils.copyFile(scrFile, new File(path));
           
     }

}
