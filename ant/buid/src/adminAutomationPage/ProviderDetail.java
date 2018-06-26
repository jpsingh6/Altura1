package adminAutomationPage;

import java.awt.Window;
import java.io.IOException;
import java.util.NoSuchElementException;

import jxl.read.biff.BiffException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import util.Setup;
import util.SetupForExcel;
import alturaAdminPom.ProviderPage;
import alturaPom.LoginPP;

public class ProviderDetail extends SetupForExcel{
		
		//@BeforeTest
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
		////Read excel from 3rd row
		@DataProvider(name="addProvider")
		public Object[][] loginData() throws BiffException, IOException {
			Object[][] arrayObject = excelReadFromStart("AddProvider");
			return arrayObject;
		}
		@Test(dataProvider="addProvider")
		public void test(String Fname1,
				String LName1,
				String Designation,
				String DesignationName,
				String EmailId,
				String MedicalGroup)
		{
			System.out.println(Fname1+""+LName1+""+Designation+""+DesignationName+""+EmailId+""+MedicalGroup);
		}

		//@Test(dataProvider="addProvider")
		public void addProvider(
				String Fname1,
				String LName1,
				String Designation,
				String DesignationName,
				String EmailId,
				String MedicalGroup
				) throws InterruptedException
		{
			Thread.sleep(5000);
			for(String h:driver.getWindowHandles())
			{
				driver.switchTo().window(h);
			}
			ProviderPage page=new ProviderPage(driver);
			Actions action=new Actions(driver);
			action.moveToElement(page.setUp).build().perform();
			//action.build().perform();
			//Thread.sleep(5000);
			action.moveToElement(page.providers).click().build().perform();
			//action.click().build().perform();
			for(String h:driver.getWindowHandles())
			{
				driver.switchTo().window(h);
			}
			Thread.sleep(9000);
			for(String h:driver.getWindowHandles())
			{
				driver.switchTo().window(h);
			}
			Actions action1=new Actions(driver);
			
			action1.moveToElement(page.addNewProvider);
			action1.click().build().perform();
			
			for(String h:driver.getWindowHandles())
			{
				driver.switchTo().window(h);
			}
			Actions action2=new Actions(driver);
			Thread.sleep(5000);
			page.Fname.sendKeys(Fname1);
			page.Lname.sendKeys(LName1);
			//if you want to add designation
			String desingation1="y";
			if(desingation1.equalsIgnoreCase(Designation)){
			Select s=new Select(page.designation);
			s.selectByVisibleText(DesignationName);
			}
			else{
				Reporter.log("skipp Designation");
				System.out.println("skipp Designation");
			}
			page.primaryEmailId.sendKeys(EmailId);
			Select s2=new Select(page.medicalGroup);
			s2.selectByVisibleText(MedicalGroup);
			//s2.selectByIndex(22);
			//action2.moveToElement(page.submintDetail);
			//action2.click().build().perform();
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("scroll(0, 250);");
			Thread.sleep(9000);
			
			for(String h:driver.getWindowHandles())
			{
				driver.switchTo().window(h);
			}
			
			jse.executeScript("window.scrollBy(0,-250)", "");
			page.submintDetail.click();
			Thread.sleep(6000);
			jse.executeScript("scroll(0, 550);");
			
			//boolean  text=driver.findElements(By.xpath("//span[text()='Email ID already exists.']")).size()>0;
			boolean present;
			/*try {
			   //page.EmailValidationMessage.toString();
				driver.findElement(By.xpath("//span[text()='Email ID already exists.']"));
			   present = true;
			} catch (NoSuchElementException e) {
			   present = false;
			}
			if(present=true)
			{
				Reporter.log("Message: "+page.EmailValidationMessage.getText());
			}
			else
			{*/
				page.SendMail.click();
				Alert alert=driver.switchTo().alert();
				alert.accept();
				Reporter.log("Your password is send to your mail");
				
			//}
			
		
		}
}
