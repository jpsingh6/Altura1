package adminAutomationPage;

import java.io.IOException;

import jxl.read.biff.BiffException;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import util.SetupForExcel;

import alturaAdminPom.profilePage;
import alturaPom.LoginPP;

public class AdminLogin extends SetupForExcel{
	@BeforeTest
	public void baseSetup()
	{
		//System.setProperty("webdriver.chrome.driver", "E:\\software\\chrome\\chromedriver.exe");
		//driver=new ChromeDriver();
		browser("Chrome");
		driver.manage().window().maximize();
		driver.navigate().to("http://staging-alturastudiesapp.azurewebsites.net/admin/");
		/*LoginPP loginpage=new LoginPP(driver) ;
		loginpage.login1("jsingh", "altura123");*/
	}
	@DataProvider(name="changePassword")
	public Object[][] loginData() throws BiffException, IOException {
		Object[][] arrayObject = adminlogin("login");
		return arrayObject;
	}
	
	//@Test(dataProvider="changePassword")
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
		System.out.println(OldPassword+""+newPassword+""+ConfirmPassword+"");
		page.ChangePassword2(OldPassword, newPassword, ConfirmPassword);
		//page.MyProfileLink.click();
		//action.moveToElement(page.submitDetail);
		//action.click().build().perform();

	}
	@DataProvider(name="login")
	public Object[][] loginAdmin() throws BiffException, IOException {
		Object[][] arrayObject = adminlogin("login");
		return arrayObject;
	}
	@Test(dataProvider="login")
	public void adminlogin2(String userId, String password 
			) throws InterruptedException
{
		LoginPP loginpage=new LoginPP(driver) ;
		loginpage.login1(userId, password);
		
		
		
		

}
	
	@Test
	public void adminlogin3() throws InterruptedException
{
		
		Thread.sleep(5000);
		LoginPP loginpage=new LoginPP(driver) ;
		//loginpage.cancel.click();
				for(String h: driver.getWindowHandles())
				{
					driver.switchTo().window(h);
				}
				//Thread.sleep(3000);
				Actions action=new Actions(driver);
				
				//loginpage.loginId.sendKeys("jsingh");
				//loginpage.forgotPassword.click();
				//action.moveToElement(loginpage.forgotPassword);
				//action.click().build().perform();
				loginpage.login1("jsingh", "panalink1");
				//loginpage.cancel.click();

}
	

}
