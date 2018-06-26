package adminAutomationPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import util.Setup;

import alturaAdminPom.MedicalGroupPage;
import alturaAdminPom.ProviderPage;
import alturaPom.LoginPP;

public class UpdateMedicalGroup extends Setup{
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
	
	@Test
	public void addProvider() throws InterruptedException
	{
		Thread.sleep(5000);
		MedicalGroupPage page=new MedicalGroupPage(driver);
		Actions action=new Actions(driver);
		action.moveToElement(page.setUp);
		action.build().perform();
		action.moveToElement(page.medicalGroup);
		action.click().build().perform();
	}

}
