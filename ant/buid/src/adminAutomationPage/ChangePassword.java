package adminAutomationPage;

import java.io.IOException;

import jxl.read.biff.BiffException;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import util.SetupForExcel;

import alturaAdminPom.NewUserPage;
import alturaAdminPom.profilePage;
import alturaPom.LoginPP;

public class ChangePassword extends SetupForExcel{
	@BeforeTest
	public void baseSetup()
	{
		//System.setProperty("webdriver.chrome.driver", "E:\\software\\chrome\\chromedriver.exe");
		//driver=new ChromeDriver();
		browser("Chrome");
		driver.manage().window().maximize();
		driver.get(URL2);
		LoginPP loginpage=new LoginPP(driver) ;
		loginpage.login1("jsingh", "jsingh123");
	}
	@DataProvider(name="changePassword")
	public Object[][] loginData() throws BiffException, IOException {
		Object[][] arrayObject = excelRead("Change Password");
		return arrayObject;
	}
	
	@Test(dataProvider="changePassword")
	public void addNews(String OldPassword, 
						String newPassword, 
						String ConfirmPassword) throws InterruptedException
	{
		Thread.sleep(6000);	
		profilePage page=new profilePage(driver);
		Actions action=new Actions(driver);
		action.moveToElement(page.welcome).build().perform();
		Thread.sleep(3000);
		action.moveToElement(page.MyProfileLink).click().build().perform();
		//page.MyProfileLink.click();
		//action.moveToElement(page.submitDetail);
		//action.click().build().perform();

	}

}
