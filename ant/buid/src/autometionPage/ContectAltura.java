package autometionPage;

import java.util.Set;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import util.Setup;

import alturaPom.LoginPP;
import alturaPom.ProfilePage;

public class ContectAltura extends Setup{

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
	public void contectToAltura() throws Exception
	{
		ProfilePage page=new ProfilePage(driver);
		Thread.sleep(5000);
		for(String h:driver.getWindowHandles())
		{
			driver.switchTo().window(h);
		}

		Actions action=new Actions(driver);
		Thread.sleep(3000);
		action.moveToElement(page.contectAltura);
		action.click().build().perform();
		Thread.sleep(3000);
		String parentWindow=driver.getWindowHandle();
		System.out.println("Parent Window" +parentWindow);
		getscreenshot("E:\\ContactAltura.png");
		for(String h:driver.getWindowHandles())
		{
			driver.switchTo().window(h);
		}
		page.alturaStudies.click();
		for(String h:driver.getWindowHandles())
		{
			if(!h.equals(parentWindow))
			{
				System.out.println("Child Window is "+h);
				driver.switchTo().window(h).close();
				driver.switchTo().window(parentWindow);
				
				//driver.switchTo().window(h);
				Thread.sleep(3000);
				getscreenshot("E:\\ContactAltura1.png");
			}
			
		}
		
	}

}
