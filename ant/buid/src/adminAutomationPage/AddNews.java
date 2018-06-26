 package adminAutomationPage;

import java.io.IOException;

import jxl.read.biff.BiffException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import util.SetupForExcel;
import alturaAdminPom.NewsPage;
import alturaPom.LoginPP;

public class AddNews extends SetupForExcel{
	
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
	@DataProvider(name="news")
	public Object[][] loginData() throws BiffException, IOException {
		Object[][] arrayObject = excelRead("NewsDetail");
		return arrayObject;
	}
	//@Test(dataProvider="news")
	public void testprovider(String a, String b)
	{
		System.out.println("  "+ a+ "  " + b);
	}
	
	@Test(dataProvider="news")
	public void addNews(String title1, String news1) throws InterruptedException
	{
		Thread.sleep(5000);	
		NewsPage page=new NewsPage(driver);
		Actions action=new Actions(driver);
		action.moveToElement(page.moveToAdmin);
		action.build().perform();
		action.moveToElement(page.clickOnNews);
		action.click().build().perform();
		//Thread.sleep(8000);
		for(String h:driver.getWindowHandles())
		{
			driver.switchTo().window(h);
		}
		Thread.sleep(8000);
		action.moveToElement(page.addNews);
		action.click().build().perform();
		Thread.sleep(5000);
		page.EnterTille.sendKeys(title1);
		//click of Speciality 
		Actions action2=new Actions(driver);
		action2.moveToElement(page.SelectSpecialty);
		action2.click().build().perform();
		action2.moveToElement(page.specialty1).click().build().perform();
		action2.moveToElement(page.specialty2).click().build().perform();
		action2.sendKeys(Keys.TAB).sendKeys(Keys.TAB).build().perform();
		//check the area of interest
		action2.moveToElement(page.areaOfInterest);
		action2.click().build().perform();
		action2.moveToElement(page.interst1).click().build().perform();
		action2.moveToElement(page.interst2).click().build().perform();
		//check the publish button
		page.publish.click();
		for(String h:driver.getWindowHandles())
		{
			driver.switchTo().window(h);
		}
		driver.switchTo().frame(page.NewsContains);
		page.body1.sendKeys(news1);
		
		for(String h:driver.getWindowHandles())
		{
			driver.switchTo().window(h);
		}
		//click on save and back
		///page.submitNews.click();

		
	}
}
