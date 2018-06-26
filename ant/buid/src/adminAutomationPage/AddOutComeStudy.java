package adminAutomationPage;

import java.io.IOException;

import jxl.read.biff.BiffException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import util.SetupForExcel;

import alturaAdminPom.OutComeStudyPage;
import alturaPom.LoginPP;

public class AddOutComeStudy extends SetupForExcel{
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
	@DataProvider(name="OutComeStudy")
	public Object[][] loginData() throws BiffException, IOException {
		Object[][] arrayObject = excelRead("Outcome Study");
		return arrayObject;
	}
	@Test(dataProvider="OutComeStudy")
	public void OutComeStudy(String StudyTitle1,
							 String DueDate1,
							 String Sponsor2,
							 String fee1,
							 String Total_NoRequired,
							 String noRequirperProvider,
							 String notes1,
							 String AppTitle1,
							 String AppDiscription1,
							 String BackGround1,
							 String TargatPopulation1,
							 String footNots1,
							 String searchBy,
							 String userid) throws InterruptedException
	{
		Thread.sleep(5000);
		OutComeStudyPage page=new OutComeStudyPage(driver);
		Actions action=new Actions(driver);
		action.moveToElement(page.outComeStudy);
		action.click().build().perform();
		Thread.sleep(3000);
		action.moveToElement(page.addOutcomeStudy);
		action.click().build().perform();
		Thread.sleep(6000);
		
		page.studyTitle.sendKeys(StudyTitle1);
		//action2.moveToElement(page.dueDate);
		//action2.sendKeys(DueDate1).build().perform();
		page.dueDate.clear();
		page.dueDate.sendKeys(DueDate1);
		//page.studyTitle(StudyTitle1, DueDate1);
		Select Sponsor1=new Select(page.Sponsor);
		Sponsor1.selectByVisibleText(Sponsor2);
		page.Fee.sendKeys(fee1);
		page.totalNoRequired.sendKeys(Total_NoRequired);
		page.noRequiredPerProvider.sendKeys(noRequirperProvider);
		page.notes.sendKeys(notes1);
		page.appTitle.sendKeys(AppTitle1);
		page.appDescription.sendKeys(AppDiscription1);
		//Thread.sleep(5000);
		for(String h:driver.getWindowHandles())
		{
			driver.switchTo().window(h);
		}
		driver.switchTo().frame(page.background);
        page.body1.sendKeys(BackGround1);
        
		for(String h:driver.getWindowHandles())
		{
			driver.switchTo().window(h);
		}
		driver.switchTo().frame(page.TargetPopulation);
		page.body1.sendKeys(TargatPopulation1);
		for(String h:driver.getWindowHandles())
		{
			driver.switchTo().window(h);
		}
		page.footnote.sendKeys(footNots1);
		page.Save.click();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(0, -250);");
		
		
		Thread.sleep(9000);
		Actions action2=new Actions(driver);
		action2.moveToElement(page.droft);
		action2.click().build().perform();
		action2.moveToElement(page.active);
		action2.click().build().perform();
		Thread.sleep(3000);
		Alert alert;
		alert =driver.switchTo().alert();
		alert.accept();
		action2.moveToElement(page.participants);
		action2.click().build().perform();
		Thread.sleep(3000);
		for(String h:driver.getWindowHandles())
		{
			driver.switchTo().window(h);
		}
		page.searchByDegination.sendKeys(searchBy);
		page.searchByDegination.sendKeys(Keys.ENTER);
		
		page.searchDefault.click();
		Thread.sleep(5000);
		page.assignTouser.sendKeys(userid);
		Thread.sleep(5000);
		page.checkuser.click();
		page.addParticipant.click();
	}
	@DataProvider(name="surveyForm")
	public Object[][] serverDesign() throws BiffException, IOException {
		Object[][] arrayObject = excelRead("Outcome Study");
		return arrayObject;
	}
	@Test
	public void surveyFormDesing() throws InterruptedException
	{
		Thread.sleep(5000);
		OutComeStudyPage page=new OutComeStudyPage(driver);
		Actions action=new Actions(driver);
		action.moveToElement(page.SurveyDesiner);
		action.click().build().perform();
		Thread.sleep(7000);
		for(String h: driver.getWindowHandles())
		{
			driver.switchTo().window(h);
		}
		for(int i=0;i<=2;i++){
		action.moveToElement(page.text);
		action.click().build().perform();
		Thread.sleep(5000);
		for(String h: driver.getWindowHandles())
		{
			driver.switchTo().window(h);
		}
		
		
		page.textMatter.sendKeys("this is test version 'write some thing about altura group'");
		page.Save.click();
		
		Thread.sleep(3000);
		for(String h: driver.getWindowHandles())
		{
			driver.switchTo().window(h);
		}
		action.moveToElement(page.yes_no);
		action.click().build().perform();
		Thread.sleep(3000);
		for(String h: driver.getWindowHandles())
		{
			driver.switchTo().window(h);
		}
		page.yesNoType.sendKeys("yes no type question Modi is the PM of india");
		page.saveMatter.click();
		Thread.sleep(3000);
		}
		action.moveToElement(page.SaveAndExitSurvey);
		action.click().build().perform();
		Alert alert=driver.switchTo().alert();
		alert.accept();
		
	}
}
