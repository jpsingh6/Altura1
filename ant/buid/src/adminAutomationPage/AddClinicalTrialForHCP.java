package adminAutomationPage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import jxl.read.biff.BiffException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import util.Setup;
import util.SetupForExcel;
import alturaAdminPom.ClinicalTrial;
import alturaPom.LoginPP;

public class AddClinicalTrialForHCP extends SetupForExcel{

	@BeforeTest
	public void baseSetup()
	{
		browser("Chrome");
		driver.manage().window().maximize();
		driver.get(URL2);
		LoginPP loginpage=new LoginPP(driver) ;
		loginpage.login1("Admin", "altura123");
	}
	@DataProvider(name="ClinicalTrail1")
	public Object[][] loginData() throws BiffException, IOException {
		Object[][] arrayObject = excelRead("AddclinicalTrial");
		return arrayObject;
	}
	//@Test(dataProvider="ClinicalTrail1")
	public void test(String StudyTitle,
								 String date1,
								 String amount,
								 String AppTitle,
								 String Discription,
								 String background,
								 String TargetPopulation,
								 String PatientCareInformation,
								 String interventionsnvolved, 
								 String footnote) throws InterruptedException
	{
		System.out.println(StudyTitle+""+date1+""+amount+""+AppTitle+""+Discription+" "+background+""+TargetPopulation+""+PatientCareInformation+""+interventionsnvolved+""+footnote);
	}
	
	@Test(dataProvider="ClinicalTrail1")
	public void HCPclinicalTrial(String StudyTitle,
								 String date1,
								 String amount,
								 String AppTitle,
								 String Discription,
								 String background,
								 String TargetPopulation,
								 String PatientCareInformation,
								 String interventionsnvolved, 
								 String footnote) throws InterruptedException
	{
		Thread.sleep(5000);
		ClinicalTrial page=new ClinicalTrial(driver);
		Actions action = new Actions(driver);
		action.moveToElement(page.studies);
		action.click().build().perform();
		Thread.sleep(8000);
		for(String h:driver.getWindowHandles())
		{
			driver.switchTo().window(h);
		}
		action.moveToElement(page.addClinicalTrial);
		action.click().build().perform();
		Thread.sleep(5000);
		for(String h:driver.getWindowHandles())
		{
			driver.switchTo().window(h);
		}
		page.studyTitle(StudyTitle, date1);
		page.StudyDetail(1,amount,1);
		page.appTitle(AppTitle, 
					 Discription, 
					 background);
		for(String h:driver.getWindowHandles())
		{
			driver.switchTo().window(h);
		}
		driver.switchTo().frame(page.targatePopulation);
        page.body1.sendKeys(TargetPopulation);
        
		for(String h:driver.getWindowHandles())
		{
			driver.switchTo().window(h);
		}
		driver.switchTo().frame(page.patientCareInformation);
		page.body1.sendKeys(PatientCareInformation);
       
		for(String h:driver.getWindowHandles())
		{
			driver.switchTo().window(h);
		}
		driver.switchTo().frame(page.interventionsnvolved);
		page.body1.sendKeys(interventionsnvolved);
		
		for(String h:driver.getWindowHandles())
		{
			driver.switchTo().window(h);
		}
		driver.switchTo().frame(page.footnote);
		page.body1.sendKeys(footnote);
		/*page.appOverView("Tpopulation", 
						 "PcareInformation", 
						 "Iinvolvment", 
						 "footnote1");*/
		Thread.sleep(3000);
		for(String h:driver.getWindowHandles())
		{
			driver.switchTo().window(h);
		}
		Actions action1=new Actions(driver);
		action1.moveToElement(page.submitCT);
		action1.click().build().perform();
		Thread.sleep(8000);
		((JavascriptExecutor)driver).executeScript("window.scrollTo(0,250)", page.EvalForm);
		//page.EvalForm.click();
		page.ClickEvalForm.click();
		////
		//
		((JavascriptExecutor)driver).executeScript("window.scrollTo(0,250)", page.StudySites);
		Actions action2=new Actions(driver);
		action2.moveToElement(page.StudySites);
		//action2.click().build().perform();
		//page.StudySites.

		
	}
}
