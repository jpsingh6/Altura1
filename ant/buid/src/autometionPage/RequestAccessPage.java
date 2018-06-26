package autometionPage;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import jxl.read.biff.BiffException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pppage.RequestAccess;
import util.Setup;

public class RequestAccessPage extends Setup{
	
	//@BeforeTest
	public void baseSetup()
	{
		browser("Chrome");
		driver.manage().window().maximize();
		driver.get(URL);
		//driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		/*LoginPP loginpage=new LoginPP(driver) ;
		loginpage.login("panalink-134@yopmail.com", "panalink1");*/
	}
	@DataProvider(name="RequestAccess")
	public Object[][] loginData() throws BiffException, IOException {
		Object[][] arrayObject = readExcel3("Registration");
		return arrayObject;
	}
	//@Test(priority=1)
	public void Forgetpassword()
	{
		RequestAccess page=new RequestAccess(driver);
		try {
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			Thread.sleep(3000);
			Actions action=new Actions(driver);
			action.moveToElement(page.forgetPassword);
			action.click().build().perform();
			Thread.sleep(3000);
			page.enterEmailId.sendKeys("panalink-123@yopmail.com");
			page.Submit.click();
			Thread.sleep(5000);
			Reporter.log("Please enter the new password sent to your email 'panalink-123@yopmail.com'.");
			for(String h:driver.getWindowHandles())
			{
				driver.switchTo().window(h);
			}
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//@Test(dataProvider="RequestAccess", priority=2)
	public void requestAccess(String Emailid,
							  String newpassword3,
							  String confirmPassword, 
							  String Organization,
							  String country2
			) throws InterruptedException
	{
		RequestAccess page=new RequestAccess(driver);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(5000);
		Actions action2=new Actions(driver);
		action2.moveToElement(page.RequestAccsee);
		action2.click().build().perform();
		Thread.sleep(5000);
		for(String h:driver.getWindowHandles())
		{
			driver.switchTo().window(h);
		}

		page.EmailID1.sendKeys(Emailid);
		page.EmailID1.sendKeys(Keys.TAB);
		action2.moveToElement(page.NewPassword1);
		action2.sendKeys(newpassword3).build().perform();
		page.ConfirmPassword.sendKeys(confirmPassword);
		page.organization.sendKeys("xyz organization");
		page.selectCountry11(country2);
		for(String h:driver.getWindowHandles())
		{
			driver.switchTo().window(h);
		}
		Thread.sleep(3000);
		action2.moveToElement(page.SubmitProvider);
		action2.click().build().perform();
		for(String h:driver.getWindowHandles())
		{
			driver.switchTo().window(h);
		}
		Thread.sleep(3000);
		//action2.moveToElement(page.discart);
		Actions action3=new Actions(driver);
		action3.moveToElement(page.discart);
		Thread.sleep(2000);
		action3.click().build().perform();

		Reporter.log("Your request for access has been sent to Altura administrator. If you are eligible for access they will get back to you.");
//		Thread.sleep(8000);
	}
	
	@Test(dataProvider="RequestAccess", priority=3)
	public void CompleteRegistrationForHCP(String Emailid,
							  String newpassword3,
							  String confirmPassword, 
							  String Organization,
							  String country2
			) throws InterruptedException
	{
		RequestAccess page=new RequestAccess(driver);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(5000);
		Actions action2=new Actions(driver);
		action2.moveToElement(page.RequestAccsee);
		action2.click().build().perform();
		Thread.sleep(5000);
		for(String h:driver.getWindowHandles())
		{
			driver.switchTo().window(h);
		}

		page.EmailID1.sendKeys(Emailid);
		Thread.sleep(3000);
		page.EmailID1.sendKeys(Keys.TAB);
		action2.moveToElement(page.NewPassword1);
		action2.sendKeys(newpassword3).build().perform();
		page.ConfirmPassword.sendKeys(confirmPassword);
		page.organization.sendKeys("xyz organization");
		page.selectCountry11(country2);
		for(String h:driver.getWindowHandles())
		{
			driver.switchTo().window(h);
		}
		Thread.sleep(3000);
		action2.moveToElement(page.SubmitProvider);
		action2.click().build().perform();
		for(String h:driver.getWindowHandles())
		{
			driver.switchTo().window(h);
		}
		Thread.sleep(3000);
		//action2.moveToElement(page.discart);
		Actions action3=new Actions(driver);
		action3.moveToElement(page.agree);
		Thread.sleep(2000);
		action3.click().build().perform();

		Reporter.log("Your request for access has been sent to Altura administrator. If you are eligible for access they will get back to you.");
		Thread.sleep(5000);
		for(String h:driver.getWindowHandles())
		{
			driver.switchTo().window(h);
		}
		page.EnterFname.sendKeys("Stag506");
		page.EnterLastName.sendKeys("User");
		page.EnterCellPhoneNumber.sendKeys("9415235647");
		page.SelectDesignation("MD, DO");
		Thread.sleep(2000);
		page.EnterAddress.sendKeys("Hello Address");
		page.EnterCity.sendKeys("Hello City");
		page.SelectState("California");
		Thread.sleep(2000);		
		page.EnterZipCod.sendKeys("92620");
		Thread.sleep(2000);
		page.EnterOfficePhone.sendKeys("9415632541");
		page.clickOnNext1.click();
		
		for(String h:driver.getWindowHandles())
		{
			driver.switchTo().window(h);
		}
		Thread.sleep(2000);
		page.checkSameOfficeAddress.click();
		page.clickOnNext2.click();
		for(String h:driver.getWindowHandles())
		{
			driver.switchTo().window(h);
		}
		page.SelectSpeciality1("Dermatology");
		page.clickOnNext3.click();
		for(String h:driver.getWindowHandles())
		{
			driver.switchTo().window(h);
		}
		page.AddNoAssistant.click();
		
		for(String h:driver.getWindowHandles())
		{
			driver.switchTo().window(h);
		}
		Thread.sleep(2000);
		page.ClickOnOk.click();
	}

		
}
