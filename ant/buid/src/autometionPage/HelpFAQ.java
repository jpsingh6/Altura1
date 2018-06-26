package autometionPage;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import util.Setup;
import alturaPom.LoginPP;
import alturaPom.ProfilePage;
public class HelpFAQ extends Setup{
		
		//@BeforeTest
		public void baseSetup()
		{
			browser("Chrome");
			driver.manage().window().maximize();
			driver.get(URL);
			LoginPP loginpage=new LoginPP(driver) ;
			loginpage.login("panalink-134@yopmail.com", "panalink1");
		}
		
		@Test
		public void HelpAndFAQ() throws Exception
		{
			ProfilePage page=new ProfilePage(driver);
			Thread.sleep(5000);
			for(String h:driver.getWindowHandles())
			{
				driver.switchTo().window(h);
			}

			Actions action=new Actions(driver);
			Thread.sleep(3000);
			action.moveToElement(page.HelpFAQ);
			action.click().build().perform();
			Thread.sleep(3000);
			getscreenshot("E:\\HelpAndFAQ.png");
			
			
			
		}

}
