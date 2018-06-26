package autometionPage;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import util.Setup;
import alturaPom.LoginPP;



public class Login extends Setup{
	
	//public static WebDriver driver;*/
	LoginPP page;
	
	//@BeforeTest
	public void baseSetup()
	{
		browser("chrome");
		driver.manage().window().maximize();
		driver.get(URL);
	}
	
	@Test(dataProvider="loginTestdata")
	public void loginToPP(String username, String pwd)throws InterruptedException
	{
		page=new LoginPP(driver);
		page.UserId.clear();
		page.Password.clear();
		page.login(username, pwd);
		Thread.sleep(3000);
		//String home="http://staging-alturastudiesapp.azurewebsites.net/studies/home";
		String s2=driver.getCurrentUrl();
		if(s2.contains("/studies/home"))
		{
			System.out.println("User Login: Pass");
		
			/*Thread.sleep(5000);
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
			Actions action1=new Actions(driver);
			for(String s:driver.getWindowHandles() )
			{
				driver.switchTo().window(s);
			}
			Thread.sleep(3000);
			action1.moveToElement(page.logout);
			action1.click().build().perform();
			Thread.sleep(5000);*/		}
		else
		{
			String text=page.invalid.getText();
			System.out.println(text);
			System.out.println("User Login: Fail");
		}
		}

/*		for(String h:driver.getWindowHandles())
		{
			driver.switchTo().window(h);
		}

		Actions action =new Actions(driver);
		for(String s:driver.getWindowHandles() )
        {
        	driver.switchTo().window(s);
        }
		WebElement news=driver.findElement(By.linkText("News"));
		action.moveToElement(news).click().build().perform();
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		Actions action1 =new Actions(driver);
		 for(String s:driver.getWindowHandles() )
	        {
	        	driver.switchTo().window(s);
	        }
		
		 WebElement x=driver.findElement(By.xpath("//div[@class='media-heading col-text1']/b[contains(text(),'How caffeine')]"));
		 action1.moveToElement(x).click().build().perform();
*/		 
		/* js.executeScript("scroll(250, 0)");
		 
			WebElement element=driver.findElement(By.linkText("Contact Altura"));
			// js.executeScript("window.scrollTo(0,'element.getLocation().x+')");
		   // element.click();
			action1.moveToElement(element).click().build().perform();
		 //driver.findElement(By.linkText("payments")).click();
		Thread.sleep(3000);
		for(String s:driver.getWindowHandles() )
        {
        	driver.switchTo().window(s);
        }
		WebElement invoice=driver.findElement(By.linkText("Invoice"));
		action.moveToElement(invoice).click().build().perform();
		Thread.sleep(3000);
		*/

}
