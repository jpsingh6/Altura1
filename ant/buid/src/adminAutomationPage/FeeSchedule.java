package adminAutomationPage;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import util.Setup;
import alturaAdminPom.FeeSchedulePage;
import alturaPom.LoginPP;

public class FeeSchedule extends Setup{


	@BeforeTest
	public void baseSetup()
	{
		//System.setProperty("webdriver.chrome.driver", "E:\\software\\chrome\\chromedriver.exe");
		//driver=new ChromeDriver();
		browser("Chrome");
		driver.manage().window().maximize();
		driver.get(URL1);
		LoginPP loginpage=new LoginPP(driver) ;
		loginpage.login1("Admin", "altura123");
	}
	
	@Test
	public void addNews() throws InterruptedException
	{
		Thread.sleep(5000);	
		FeeSchedulePage page=new FeeSchedulePage(driver);
		Actions action=new Actions(driver);
		action.moveToElement(page.moveToAdmin);
		action.build().perform();
		page.feeSchedule.click();
		for(String h:driver.getWindowHandles())
		{
			driver.switchTo().window(h);
		}
		Thread.sleep(5000);
		action.moveToElement(page.addFeeSchedule).click().build().perform();
		
	}
}
