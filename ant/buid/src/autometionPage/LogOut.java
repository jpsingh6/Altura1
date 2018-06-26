package autometionPage;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import alturaPom.LoginPP;

import util.Setup;

public class LogOut extends Setup{

		//@BeforeTest
		public void baseSetup()
		{
			browser("Chrome");
			driver.manage().window().maximize();
			driver.get(URL);
			
		}
		@Test
		public void logout() throws InterruptedException
		{
			LoginPP page=new LoginPP(driver);
			//page.login1("panalink-134@yopmail.com", "panalink1");
			Actions action=new Actions(driver);
			Thread.sleep(3000);
			for(String h:driver.getWindowHandles())
			{
				driver.switchTo().window(h);
			}
			action.moveToElement(page.adminpage);
			action.click().build().perform();
			Thread.sleep(3000);
			action.moveToElement(page.logout);
			action.click().build().perform();
		}
		@AfterTest
		public void closeDriver()
		{
			driver.close();
		}
}
