package alturaAdminPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FeeSchedulePage {

	
	public FeeSchedulePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	

	public static String FeeScheduleURL="http://staging-alturastudiesapp.azurewebsites.net/admin/admin/feeschedule";
	
	//click on admin
		@FindBy(xpath=".//*[@id='navbar-demo']/ul/li[5]/a")
		public WebElement moveToAdmin;
		
	//click on fee schedule
		@FindBy(xpath="//a[@href='/admin/admin/feeschedule']")
		public WebElement feeSchedule;
		
	//add Fee schedule
		@FindBy(xpath=".//*[@id='buttonsCT']/a")
		public WebElement addFeeSchedule;
		
	//Delete Fee schedule.
	
	
}
