package autometionPage;

import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import util.Setup;

public class Verification extends Setup{
	
	@BeforeTest
	public void baseSetup()
	{
		browser("Chrome");
		driver.manage().window().maximize();
		
	}
	@Test(priority=1)
	public void lunchBrowser()
	{
		driver.get(URL);
		String title=driver.getTitle();
		System.out.println("Current title is"+title);
		Reporter.log("Browser lunch successful");
	}
	@Test(priority=2)
	public void verifiedTitle()
	{
		String title=driver.getTitle();
		System.out.println("Current title is"+title);
		Reporter.log("Current title is:  "+title);
	}
}
