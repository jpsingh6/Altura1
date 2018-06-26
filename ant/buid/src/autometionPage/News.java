package autometionPage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import util.Setup;
import alturaPom.LoginPP;
import alturaPom.Newspage;

public class News extends Setup{
	
	@BeforeTest
	public void baseSetup()
	{
		//System.setProperty("webdriver.chrome.driver", "E:\\software\\chrome\\chromedriver.exe");
		//driver=new ChromeDriver();
		browser("Chrome");
		driver.manage().window().maximize();
		driver.get(URL);
	}
	
	@Test
	public void newsSeach() throws InterruptedException
	{
		Newspage page=new Newspage(driver);
/*		Thread.sleep(5000);
		LoginPP loginpage=new LoginPP(driver) ;
		loginpage.login("panalink-134@yopmail.com", "panalink1");*/
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
		action.moveToElement(page.newspp);
		action.click().build().perform();
		Thread.sleep(3000);
		for(String h:driver.getWindowHandles())
		{
			driver.switchTo().window(h);
		}
		page.searchtext("Medical news");
		page.search.sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		for(String h:driver.getWindowHandles())
		{
			driver.switchTo().window(h);
		}
		action.moveToElement(page.searchLink);
		action.click().build().perform();
		
		Thread.sleep(5000);
		for(String h:driver.getWindowHandles())
		{
			driver.switchTo().window(h);
		}
		
		((JavascriptExecutor)driver).executeScript("window.scrollTo(0,"+page.close1.getLocation().y+")");
		Actions action1=new Actions(driver);		
		//page.close1.click();		
		action1.moveToElement(page.close1);
		action1.click().build().perform();
		
		
	}

}
