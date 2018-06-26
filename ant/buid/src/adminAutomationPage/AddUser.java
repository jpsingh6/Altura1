package adminAutomationPage;
import java.io.IOException;
import jxl.read.biff.BiffException;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import util.SetupForExcel;
import alturaAdminPom.NewUserPage;
import alturaPom.LoginPP;
public class AddUser extends SetupForExcel{


	@BeforeTest
	public void baseSetup()
	{
		//System.setProperty("webdriver.chrome.driver", "E:\\software\\chrome\\chromedriver.exe");
		//driver=new ChromeDriver();
		browser("chrome");
		driver.manage().window().maximize();
		driver.get(URL2);
		LoginPP loginpage=new LoginPP(driver) ;
		loginpage.login1("Admin", "altura123");
	}
	@DataProvider(name="AddNewUser")
	public Object[][] loginData() throws BiffException, IOException {
		Object[][] arrayObject = excelRead("NewAdminUser");
		return arrayObject;
	}

	@Test(dataProvider="AddNewUser")
	public void addNews(String FirstName, 
						String LastName, 
						String roll1,
						String loginid,
						String emailid, 
						String oldPwd, 
						String newPwd) throws InterruptedException
	{
		Thread.sleep(5000);	
		NewUserPage page=new NewUserPage(driver);
		Actions action=new Actions(driver);
		action.moveToElement(page.moveToAdmin);
		action.build().perform();
		action.moveToElement(page.Usre).click().build().perform();
		Thread.sleep(6000);
		action.moveToElement(page.addUser).click().build().perform();
		Thread.sleep(5000);                                   
		Thread.sleep(5000);
		page.userDetail(FirstName, LastName, roll1);
		page.loginDetail(loginid, emailid);
		page.passwordfield(oldPwd, newPwd);
		//action.moveToElement(page.submitDetail);
		//action.click().build().perform();
		
	}
}
