package adminAutomationPage;

import java.io.IOException;

import jxl.read.biff.BiffException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import util.Setup;
import util.SetupForExcel;

import alturaAdminPom.ClinicalTrial;
import alturaPom.LoginPP;

public class UpdateClinicalTrailForHCP extends SetupForExcel{

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
		//action.moveToElement(page.studies);
		//action.click().build().perform();
		Thread.sleep(8000);
		for(String h:driver.getWindowHandles())
		{
			driver.switchTo().window(h);
		}
		page.searchClinicalTrial.sendKeys("StudyTitle");
		Thread.sleep(5000);
		page.EditCT.click();
		/*action.moveToElement(page.addClinicalTrial);
		action.click().build().perform();*/
		Thread.sleep(5000);
		for(String h:driver.getWindowHandles())
		{
			driver.switchTo().window(h);
		}
		page.studyTitle(StudyTitle, date1);
		page.StudyDetail(1, amount,1);
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
		Thread.sleep(2000);
		for(String h:driver.getWindowHandles())
		{
			driver.switchTo().window(h);
		}
		Actions action1=new Actions(driver);
		action1.moveToElement(page.submitCT);
		action1.click().build().perform();
		Actions action2=new Actions(driver);
		Thread.sleep(8000);
		((JavascriptExecutor)driver).executeScript("window.scrollTo(0,250)", page.EvalForm);
		page.EvalForm.click();
		////click on Eval Form button
		action2.moveToElement(page.AddEvalForm);
		action2.click().build().perform();
		for(String h:driver.getWindowHandles())
		{
			driver.switchTo().window(h);
		}
		Thread.sleep(5000);
		page.evalFormDetail("AutometionTrail", "Physician Specialist");
		
		////for the evail form
		//
		((JavascriptExecutor)driver).executeScript("window.scrollTo(0,250)", page.StudySites);
		Thread.sleep(3000);
		action2.moveToElement(page.StudySites);
		action2.click().build().perform();
		action2.moveToElement(page.SelectStudySite);
		action2.click().build().perform();
		Thread.sleep(3000);
		for(String h:driver.getWindowHandles())
		{
			driver.switchTo().window(h);
		}
		action2.moveToElement(page.LosAngeles);
		action2.click().build().perform();
		
		action2.moveToElement(page.SubmitSite);
		action2.click().build().perform();
		for(String h:driver.getWindowHandles())
		{
			driver.switchTo().window(h);
		}
		Thread.sleep(3000);
		action2.moveToElement(page.participants);
		action2.click().build().perform();
		Thread.sleep(5000);
		page.designation.sendKeys("MD, DO");
		page.designation.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		action2.moveToElement(page.searchProvider);
		action2.click().build().perform();
		Thread.sleep(5000);
		page.searchByEmailid.sendKeys("panalink-160@");
		Thread.sleep(3000);
		action2.moveToElement(page.ClickOnProvider);
		action2.click().build().perform();
		Thread.sleep(5000);
		action2.moveToElement(page.addProvicer);
		action2.click().build().perform();
		
		//page.StudySites.
	
	}
}
