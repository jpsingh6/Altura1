package autometionPage;

import java.io.IOException;

import jxl.read.biff.BiffException;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import alturaPom.LoginPP;
import alturaPom.ProfilePage;


import util.SetupForExcel;

public class ChangePassword extends SetupForExcel{
	
	
	@BeforeTest
	public void baseSetup()
	{
		browser("Chrome");
		driver.manage().window().maximize();
		driver.get(URL);
		LoginPP page=new LoginPP(driver);
		page.login1("panalink-134@yopmail.com", "panalink1");
		
	}
	@DataProvider(name="ChangePassword")
	public Object[][] loginData() throws BiffException, IOException {
		Object[][] arrayObject = excelReadFromStart("Change Password");
		return arrayObject;
	}
	//@Test(dataProvider="ChangePassword")
	public void test1(String a, String b, String c) throws InterruptedException
	{
		System.out.println(a+""+b+""+c);
	}
	@Test(dataProvider="ChangePassword")
	public void ChangeUserPasswod(String oldPassword, String NewPassword, String ConfirmPassword) throws InterruptedException
	{
		
		Thread.sleep(3000);
		//LoginPP page1=new LoginPP(driver);
		//page1.login1("panalink-134@yopmail.com", "panalink1");
		ProfilePage page=new ProfilePage(driver);
		Actions action=new Actions(driver);
		Thread.sleep(5000);
		/*for(String h:driver.getWindowHandles())
		{
			driver.switchTo().window(h);
		}*/
		//action.moveToElement(page.adminpage);
		//action.click().build().perform();
		Thread.sleep(5000);
		action.moveToElement(page.adminpage);
		action.click().build().perform();
		action.moveToElement(page.changePassword);
		action.click().build().perform();
		for(String h:driver.getWindowHandles())
		{
			driver.switchTo().window(h);
		}
		Thread.sleep(3000);
		page.passwordUpdate(oldPassword, NewPassword, ConfirmPassword);
		page.submitTochange.click();
		
		
	}


}
