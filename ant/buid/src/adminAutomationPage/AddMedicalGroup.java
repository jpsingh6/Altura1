package adminAutomationPage;

import java.io.IOException;

import jxl.read.biff.BiffException;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import util.SetupForExcel;

import alturaAdminPom.MedicalGroupPage;
import alturaPom.LoginPP;

public class AddMedicalGroup extends SetupForExcel{

	@BeforeTest
	public void baseSetup()
	{
		//System.setProperty("webdriver.chrome.driver", "E:\\software\\chrome\\chromedriver.exe");
		//driver=new ChromeDriver();
		browser("Chrome");
		driver.manage().window().maximize();
		driver.get(URL2);
		LoginPP loginpage=new LoginPP(driver) ;
		loginpage.login1("Admin", "altura123");
	}
	//(dataProvider="addProvider")
	@DataProvider(name="AddMedical")
	public Object[][] loginData() throws BiffException, IOException {
		Object[][] arrayObject = excelRead("AddMedicalGroup");
		return arrayObject;
	}
	@Test(dataProvider="AddMedical")
	public void addProvider(String GroupName,
							String StreetAddress,
							String City,
							String CountryCode,
							String StateCode,
							String zipCode,
							String phone,
							String PrimaryContactName,
							String PrimaryContactPhone,
							String PrimaryContactEmail,
							String SecondaryContactName,
							String SecondaryContactPhone,
							String SecondaryContactEmail
							
							) throws InterruptedException
	{
		System.out.println(GroupName+""+StreetAddress+""
							+City+""+StateCode+""+CountryCode+""+zipCode+""+phone+""
							+PrimaryContactName+""
							+PrimaryContactPhone+""
							+PrimaryContactEmail+""
							+SecondaryContactName+""
							+SecondaryContactPhone+""
							+SecondaryContactEmail);
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
		Actions action1=new Actions(driver);
		action.moveToElement(page.addMedocalGroup);
		action.click().build().perform();
		for(String h:driver.getWindowHandles())
		{
			driver.switchTo().window(h);
		}
		Thread.sleep(5000);
		page.MedicalGroupName.sendKeys(GroupName);
		page.selectPayeeType("Medical Group");
		page.MoblieNumber.sendKeys(phone);
		page.AddressTxt.sendKeys(StreetAddress);
		page.CityName.sendKeys(City);
		page.ZipCode.sendKeys(zipCode);
		page.SelectCountry(CountryCode);
		Thread.sleep(3000);
		page.SelectState(StateCode);
		
		page.PrimaryName.sendKeys(PrimaryContactName);
		page.PrimayPhone.clear();
		page.PrimayPhone.sendKeys(PrimaryContactPhone);
		page.PrimaryEmail.sendKeys(PrimaryContactEmail);
		page.SecondaryName.sendKeys(SecondaryContactName);
		page.SecondaryPhone.sendKeys(SecondaryContactPhone);
		page.SecondaryEmail.sendKeys(SecondaryContactEmail);
		action1.moveToElement(page.SubmitMedicalGroup);
		action1.click().build().perform();
	}

}
