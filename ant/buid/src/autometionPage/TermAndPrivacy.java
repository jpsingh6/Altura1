package autometionPage;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import util.Setup;

import alturaPom.LoginPP;
import alturaPom.ProfilePage;

public class TermAndPrivacy extends Setup{

	//@BeforeTest
	public void baseSetup()
	{
		browser("Chrome");
		driver.manage().window().maximize();
		driver.get(URL);
		LoginPP page=new LoginPP(driver);
		page.login1("panalink-134@yopmail.com", "panalink1");
		
	}
	@Test
	public void logout() throws Exception
	{

		Thread.sleep(3000);
		ProfilePage page=new ProfilePage(driver);
		Actions action=new Actions(driver);
		Thread.sleep(5000);
		for(String h:driver.getWindowHandles())
		{
			driver.switchTo().window(h);
		}
		action.moveToElement(page.adminpage);
		action.click().build().perform();
		Thread.sleep(3000);
		action.moveToElement(page.termsAndPrivacy);
		action.click().build().perform();
		for(String h:driver.getWindowHandles())
		{
			driver.switchTo().window(h);
		}
		Thread.sleep(3000);
		getscreenshot("E:\\Screenshot.png");
		
	}

}
