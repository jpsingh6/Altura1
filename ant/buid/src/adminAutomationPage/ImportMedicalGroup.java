package adminAutomationPage;

import java.io.IOException;

import jxl.read.biff.BiffException;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import util.Setup;

import alturaAdminPom.MedicalGroupPage;
import alturaPom.LoginPP;

public class ImportMedicalGroup extends Setup{
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
	//(dataProvider="addProvider")
	/*@DataProvider(name="AddMedical")
	public Object[][] loginData() throws BiffException, IOException {
		Object[][] arrayObject = excelRead("AddMedicalGroup");
		return arrayObject;
	}*/
	@Test
	public void importMedicalGroupBy() throws InterruptedException
	{
		Thread.sleep(5000);
		MedicalGroupPage page=new MedicalGroupPage(driver);
		Actions action=new Actions(driver);
		action.moveToElement(page.setUp);
		action.build().perform();
		action.moveToElement(page.medicalGroup);
		action.click().build().perform();
		for(String h:driver.getWindowHandles())
		{
			driver.switchTo().window(h);
		}
		Thread.sleep(3000);
		action.moveToElement(page.importMedical);
		action.click().build().perform();
		Thread.sleep(3000);
		for(String h:driver.getWindowHandles())
		{
			driver.switchTo().window(h);
		}
	}

}
