package autometionPage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import util.Setup;
import alturaPom.LoginPP;
import alturaPom.Patient;

public class PatientDetail extends Setup{

	//@BeforeTest
	public void baseSetup()
	{
		//System.setProperty("webdriver.chrome.driver", "E:\\software\\chrome\\chromedriver.exe");
		//driver=new ChromeDriver();
		browser("Chrome");
		driver.manage().window().maximize();
		driver.get(URL);
		LoginPP loginpage=new LoginPP(driver) ;
		loginpage.login("panalink-134@yopmail.com", "panalink1");
	}
	@Test
	public void patientDetail1() throws InterruptedException
	{
		Thread.sleep(9000);
		Patient page=new Patient(driver);
		for(String h:driver.getWindowHandles())
		{
			driver.switchTo().window(h);
		}

		Actions action=new Actions(driver);
		action.moveToElement(page.Patient5);
		action.click().build().perform();
		
		for(String h:driver.getWindowHandles())
		{
			driver.switchTo().window(h);
		}
		
		/*JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", page.InProcess);*/
		Actions action1 = new Actions(driver);
		action1.moveToElement(page.InProcess);
		action1.click().build().perform();
		Thread.sleep(2000);
		action1.moveToElement(page.History);
		action1.click().build().perform();
		Thread.sleep(2000);
		action1.moveToElement(page.InStudy);
		action1.click().build().perform();
		}
}
