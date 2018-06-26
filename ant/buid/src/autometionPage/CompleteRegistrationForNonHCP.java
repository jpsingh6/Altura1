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

public class CompleteRegistrationForNonHCP extends Setup{
	
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
	@Test(dataProvider="RequestAccess", priority=3)
	public void RegistrationForNonHCP(String Emailid,
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
		action3.moveToElement(page.agree);
		Thread.sleep(2000);
		action3.click().build().perform();

		Reporter.log("Your request for access has been sent to Altura administrator. If you are eligible for access they will get back to you.");
		Thread.sleep(5000);
		for(String h:driver.getWindowHandles())
		{
			driver.switchTo().window(h);
		}
		page.SelectDesignation("CRC");
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(0, 250);");
		page.EnterFname.sendKeys("Stag428");
		page.EnterLastName.sendKeys("User");
		page.EnterCellPhoneNumber.sendKeys("9415235647");
		Thread.sleep(2000);
		page.EnterAddress.sendKeys("Hello Irvine");
		page.EnterCity.sendKeys("Irvine");
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
		page.submitNonHCP.click();
		
	}

		
}
