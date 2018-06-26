package adminAutomationPage;

import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import util.Setup;

import alturaAdminPom.ValidationAndPaymentPage;
import alturaPom.LoginPP;

public class ValidationAndPayment extends Setup{
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
	
	@Test(priority=1)
	public void ClickOnValidationRequired() throws InterruptedException
	{
		Thread.sleep(5000);
		ValidationAndPaymentPage page=new ValidationAndPaymentPage(driver);
		Actions action=new Actions(driver);
		action.moveToElement(page.ValidationPayment);
		action.build().perform();
		action.moveToElement(page.ValidationRequired);
		action.click().build().perform();
		Reporter.log("click on 'Validation Required' successfully");
	}
	
	@Test(priority=2)
	public void ClickOnPatient() throws InterruptedException
	{
		Thread.sleep(5000);
		ValidationAndPaymentPage page=new ValidationAndPaymentPage(driver);
		Actions action=new Actions(driver);
		action.moveToElement(page.ValidationPayment);
		action.build().perform();
		action.moveToElement(page.patientDetail);
		action.click().build().perform();
		Reporter.log("click on 'patient' successfully");
	}
	
	@Test(priority=3)
	public void invoiceToProcess() throws InterruptedException
	{
		Thread.sleep(5000);
		ValidationAndPaymentPage page=new ValidationAndPaymentPage(driver);
		Actions action=new Actions(driver);
		action.moveToElement(page.ValidationPayment);
		action.build().perform();
		action.moveToElement(page.invoiceToBeProcess);
		action.click().build().perform();
		Reporter.log("click on 'invoice to process' successfully");
	}
	@Test(priority=4)
	public void toInvoice() throws InterruptedException
	{
		Thread.sleep(5000);
		ValidationAndPaymentPage page=new ValidationAndPaymentPage(driver);
		Actions action=new Actions(driver);
		action.moveToElement(page.ValidationPayment);
		action.build().perform();
		action.moveToElement(page.toBeInvoiced);
		action.click().build().perform();
		Reporter.log("click on 'To be Invoice' successfully");
	}
	@Test(priority=5)
	public void historyDetail() throws InterruptedException
	{
		Thread.sleep(5000);
		ValidationAndPaymentPage page=new ValidationAndPaymentPage(driver);
		Actions action=new Actions(driver);
		action.moveToElement(page.ValidationPayment);
		action.build().perform();
		action.moveToElement(page.invoiceHistory);
		action.click().build().perform();
		Reporter.log("click on 'Invoice History' successfully");
	}


}
