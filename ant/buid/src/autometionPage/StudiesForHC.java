package autometionPage;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import util.Setup;

import alturaPom.LoginPP;
import alturaPom.Studies;

public class StudiesForHC extends Setup{
	
	//@BeforeTest
	public void baseSetup()
	{
		//System.setProperty("webdriver.chrome.driver", "E:\\software\\chrome\\chromedriver.exe");
		//driver=new ChromeDriver();
		browser("Chrome");
		driver.get(URL);
		driver.manage().window().maximize();
		LoginPP page=new LoginPP(driver);
		page.UserId.clear();
		page.Password.clear();
		page.login("Stag243@yopmail.com", "panalink1");
		
		driver.manage().window().maximize();
		
		
	}
	@Test
	public void CTServerForm() throws InterruptedException
	{
			Studies stdpage=new Studies(driver);
			Thread.sleep(8000);
			for(String h:driver.getWindowHandles())
			{
				driver.switchTo().window(h);
			}
			Thread.sleep(5000);
			for(String s:driver.getWindowHandles())
	        {
	        	driver.switchTo().window(s);
	        }
			Actions action=new Actions(driver);
			for(String s:driver.getWindowHandles() )
	        {
	        	driver.switchTo().window(s);
	        }
			action.moveToElement(stdpage.StudiesForHP1);
			action.click().build().perform();
			Thread.sleep(3000);
			for(String s:driver.getWindowHandles() )
	        {
	        	driver.switchTo().window(s);
	        }
			Actions action1=new Actions(driver);
			for(String s:driver.getWindowHandles() )
	        {
	        	driver.switchTo().window(s);
	        }
			action1.moveToElement(stdpage.StartSurvey1);
			action1.click().build().perform();
			Thread.sleep(7000);
			Actions action2=new Actions(driver);
			for(String s:driver.getWindowHandles() )
	        {
	        	driver.switchTo().window(s);
	        }
			for(String s:driver.getWindowHandles() )
	        {
	        	driver.switchTo().window(s);
	        }
			action2.moveToElement(stdpage.Question2);
			action2.click().build().perform();
			//stdpage.Select2.click();
			Thread.sleep(5000);
			action2.moveToElement(stdpage.SubmitSurvery);
			action2.click().build().perform();
			//stdpage.SubmitSurvery.click();
			Thread.sleep(3000);
			for(String s:driver.getWindowHandles() )
	        {
	        	driver.switchTo().window(s);
	        }
			stdpage.SubmitOk.click();
		}
}
