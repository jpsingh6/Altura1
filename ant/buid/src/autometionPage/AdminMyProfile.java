package autometionPage;

import java.io.IOException;

import jxl.read.biff.BiffException;

import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import util.Setup;
import util.SetupForExcel;

import alturaPom.LoginPP;
import alturaPom.ProfilePage;

public class AdminMyProfile extends SetupForExcel{
	
	//@BeforeTest
	public void baseSetup()
	{
		browser("Chrome");
		driver.manage().window().maximize();
		driver.get(URL);
		LoginPP page1=new LoginPP(driver);
		page1.login1("panalink-134@yopmail.com", "panalink1");
		
	}
	@DataProvider(name="updateUser")
	public Object[][] loginData() throws BiffException, IOException {
		Object[][] arrayObject = excelRead("UpdateUser");
		return arrayObject;
	}
	@Test(dataProvider="updateUser")
	public void updateProfile(
			String Fname,
			String Lname,
			String MobileNumber
			) throws InterruptedException
	{
		
		ProfilePage page2=new ProfilePage(driver);
		Actions action=new Actions(driver);
		Thread.sleep(5000);
		for(String h:driver.getWindowHandles())
		{
			driver.switchTo().window(h);
		}
		action.moveToElement(page2.adminpage);
		action.click().build().perform();
		action.moveToElement(page2.myProfile);
		Reporter.log("open profile page successfully");
		action.click().build().perform();
		Reporter.log("Total Number Of designation:" + page2.dropdownSize(page2.Designation));
		System.out.println("Desingnation name");
		System.out.println(page2.dropdownValue(page2.Designation));
		Thread.sleep(3000);
		for(String h:driver.getWindowHandles())
		{
			driver.switchTo().window(h);
		}
		page2.enterProfileRecord(Fname, Lname, MobileNumber);
		for(String h:driver.getWindowHandles())
		{
			driver.switchTo().window(h);
		}
		page2.designation_Selection("MD, DO");
		for(String h:driver.getWindowHandles())
		{
			driver.switchTo().window(h);
		}
		page2.specialty_selection("Any");
		page2.saveProfile.click();
		Reporter.log("Update profile Successfully");
		Thread.sleep(3000);
	}

}
