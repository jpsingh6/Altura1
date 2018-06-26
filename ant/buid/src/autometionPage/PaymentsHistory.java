package autometionPage;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import util.Setup;

import alturaPom.LoginPP;
import alturaPom.Payment;

public class PaymentsHistory extends Setup{


	//@BeforeTest
	public void baseSetup()
	{
		browser("Chrome");
		driver.manage().window().maximize();
		driver.get(URL);
		LoginPP page1=new LoginPP(driver);
		page1.login("panalink-134@yopmail.com", "panalink1");
		
	}
	@Test
	public void history() throws Exception
	{
		Payment page=new Payment(driver);
		Thread.sleep(5000);
		for(String h:driver.getWindowHandles())
		{
			driver.switchTo().window(h);
		}

		Actions action=new Actions(driver);
		for(String s:driver.getWindowHandles() )
        {
        	driver.switchTo().window(s);
        }
		action.moveToElement(page.Payment1);
		action.click().build().perform();
		Thread.sleep(3000);
		for(String h:driver.getWindowHandles())
		{
			driver.switchTo().window(h);
		}
		action.moveToElement(page.history);
		action.click().build().perform();
		for(String h:driver.getWindowHandles())
		{
			driver.switchTo().window(h);
		}
		Thread.sleep(3000);
		getscreenshot("E:\\abc.png");
		
	}

}
