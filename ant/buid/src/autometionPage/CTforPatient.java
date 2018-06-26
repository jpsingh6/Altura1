package autometionPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import util.Setup;

import alturaPom.LoginPP;
import alturaPom.Studies;

public class CTforPatient extends Setup{
	//@BeforeTest
	public void baseSetup()
	{
		//System.setProperty("webdriver.chrome.driver", "E:\\software\\chrome\\chromedriver.exe");
		//driver=new ChromeDriver();
		browser("Chrome");
		driver.manage().window().maximize();
		driver.get(URL);
		LoginPP loginpage=new LoginPP(driver) ;
		loginpage.login("stag243@yopmail.com", "panalink1");
	}
	
	@Test(priority=1)
	public void CTServerForm() throws InterruptedException
	{
	
     	Thread.sleep(5000);

		Studies stdpage=new Studies(driver);
		Thread.sleep(3000);
		for(String h:driver.getWindowHandles())
		{
			driver.switchTo().window(h);
		}
		
		Actions action=new Actions(driver);
		for(String s:driver.getWindowHandles() )
        {
        	driver.switchTo().window(s);
        }
		action.moveToElement(stdpage.StartEvaluation);
		action.click().build().perform();
		
		Thread.sleep(8000);
		for(String s:driver.getWindowHandles() )
        {
        	driver.switchTo().window(s);
        }
		stdpage.check1.click();
		
		stdpage.check2.click();
		//stdpage.check3.click();
		//stdpage.check4.click();
		stdpage.patientDetail("honi", "Singh");
		Thread.sleep(2000);
		stdpage.phone.sendKeys("9415524870");
		Thread.sleep(3000);
		for(String s:driver.getWindowHandles() )
        {
        	driver.switchTo().window(s);
        }
		stdpage.comment.sendKeys("patiend detail");
		Thread.sleep(2000);
		stdpage.authorizCheck.click();
		Thread.sleep(3000);
		Actions action1=new Actions(driver);
		action1.moveToElement(stdpage.submitDetail);
		action1.click().build().perform();
		action1.click().build().perform();
		Thread.sleep(2000);
		stdpage.alert.click();
		String s="http://staging-alturastudiesapp.azurewebsites.net/studies/home";
		
		if(s.contains("net/studies/home"))
		{
			System.out.println("Patient Submition successful");
		}
		}
		
	@Test(priority=2)
	public void PCPatient() throws InterruptedException
	{
		Studies stdpage=new Studies(driver);
		Thread.sleep(3000);
		for(String h:driver.getWindowHandles())
		{
			driver.switchTo().window(h);
		}
		
		Actions action=new Actions(driver);
		for(String s:driver.getWindowHandles() )
        {
        	driver.switchTo().window(s);
        }
		action.moveToElement(stdpage.PCpatient);
		action.click().build().perform();
		Thread.sleep(3000);
		for(String s:driver.getWindowHandles() )
        {
        	driver.switchTo().window(s);
        }
		stdpage.submitpatient1("Rok", "4174215478");
		Thread.sleep(3000);
		stdpage.comment1.sendKeys("Hello all");
		Thread.sleep(2000);
		stdpage.submitPatient.click();
		Thread.sleep(3000);
		
	}
	@Test(priority=3)
	public void RequestCallBack() throws InterruptedException
	{
		Studies stdpage=new Studies(driver);
		Thread.sleep(4000);
		for(String h:driver.getWindowHandles())
		{
			driver.switchTo().window(h);
		}
		Thread.sleep(5000);
		for(String s:driver.getWindowHandles())
        {
        	driver.switchTo().window(s);
        }
		Actions action=new Actions(driver);
		for(String s:driver.getWindowHandles() )
        {
        	driver.switchTo().window(s);
        }
		action.moveToElement(stdpage.RequestCallBack1);
		action.click().build().perform();
		Thread.sleep(3000);
		for(String s:driver.getWindowHandles() )
        {
        	driver.switchTo().window(s);
        }
		stdpage.popupclose.click();
		
	}
	
	@Test(priority=4)
	public void CStudyTeam() throws InterruptedException
	{
		Studies stdpage=new Studies(driver);
		Thread.sleep(9000);
		for(String h:driver.getWindowHandles())
		{
			driver.switchTo().window(h);
		}
		Thread.sleep(5000);
		for(String s:driver.getWindowHandles())
        {
        	driver.switchTo().window(s);
        }
		Actions action=new Actions(driver);
		for(String s:driver.getWindowHandles() )
        {
        	driver.switchTo().window(s);
        }
		action.moveToElement(stdpage.CallStudyTeam1);
		action.click().build().perform();
		Thread.sleep(3000);
		for(String s:driver.getWindowHandles() )
        {
        	driver.switchTo().window(s);
        }
		stdpage.closle1.click();
		
	}
	
	//@Test(priority=5)
	public void StudiesForHC() throws InterruptedException
	{
		Studies stdpage=new Studies(driver);
		Thread.sleep(5000);
		for(String h:driver.getWindowHandles())
		{
			driver.switchTo().window(h);
		}
		Thread.sleep(5000);
		for(String s:driver.getWindowHandles())
        {
        	driver.switchTo().window(s);
        }
		Actions action=new Actions(driver);
		for(String s:driver.getWindowHandles() )
        {
        	driver.switchTo().window(s);
        }
		action.moveToElement(stdpage.StudiesForHP1);
		action.click().build().perform();
		Thread.sleep(3000);
		for(String s:driver.getWindowHandles() )
        {
        	driver.switchTo().window(s);
        }
		Actions action1=new Actions(driver);
		for(String s:driver.getWindowHandles() )
        {
        	driver.switchTo().window(s);
        }
		action1.moveToElement(stdpage.StartSurvey1);
		action1.click().build().perform();
		Thread.sleep(3000);
		for(String s:driver.getWindowHandles() )
        {
        	driver.switchTo().window(s);
        }
		//stdpage.Select2.click();
		stdpage.SubmitSurvery.click();
		Thread.sleep(3000);
		for(String s:driver.getWindowHandles() )
        {
        	driver.switchTo().window(s);
        }
		stdpage.SubmitOk.click();
		
	}
	//@Test(priority=3)
	public void logOut() throws InterruptedException
	{
		Studies stdpage=new Studies(driver);
		LoginPP page=new LoginPP(driver);
		Thread.sleep(5000);
		for(String h:driver.getWindowHandles())
		{
			driver.switchTo().window(h);
		}

		Actions action=new Actions(driver);
		for(String s:driver.getWindowHandles() )
        {
        	driver.switchTo().window(s);
        }
		action.moveToElement(page.admin);
		action.click().build().perform();
		//Actions action1=new Actions(driver);
		for(String s:driver.getWindowHandles() )
        {
        	driver.switchTo().window(s);
        }
		Thread.sleep(3000);
		action.moveToElement(stdpage.logout);
		action.click().build().perform();
		Thread.sleep(5000);
		}
//	@AfterTest
	public void tearDown()
	{
		driver.close();
	}

}
