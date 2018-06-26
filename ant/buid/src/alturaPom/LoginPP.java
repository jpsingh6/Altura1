package alturaPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LoginPP {
public LoginPP(WebDriver driver){
		
		
		
		PageFactory.initElements(driver, this);
	}
	//login to Altura
	//Enter user name
	@FindBy(id="UserName")
	public WebElement UserId;
	
	//Enter user Password
	@FindBy(id="Password")
	public WebElement Password;

	//click on signid
	@FindBy(xpath="//button[@class='btn btn-light-green btn-block']")
	public WebElement SignIn;
	
	//login function
	public void login(String username, String userpwd)
	{
		UserId.sendKeys(username);
		Password.sendKeys(userpwd);
		SignIn.click();
		
	}
	@FindBy(xpath="//button[@type='submit']")
	public WebElement SignIn1;
	
	//cancel button
	
	@FindBy(xpath="//a[@href='/admin/']")
	public WebElement cancel;
	public void login1(String username, String userpwd)
	{
		UserId.clear();
		UserId.sendKeys(username);
		Password.clear();
		Password.clear();
		Password.sendKeys(userpwd);
		SignIn1.click();
		
	}
	
	@FindBy(linkText="Clinical Trials for Patients")
	public WebElement CTForPatient;
	
	@FindBy(xpath="//a[@class='has-ul']/span[contains(text(), 'Admin')]")
	public WebElement admin;
	
	@FindBy(xpath="//a[@href='/account/logout']")
	public WebElement logout;
	
	@FindBy(linkText="Studies for Healthcare Providers")
	public WebElement StudiesForHP;
	
	//invalid value and there x path 
	@FindBy(xpath="//div[@class='validation-summary-errors text-danger']/ul/li")
	public WebElement invalid;
	
	///// For logout
	//Click on admin link
	@FindBy(xpath="//img[@src='/assets/images/ui/setting.png']")
	public WebElement adminpage;
	
	//Enter the email id in 
	@FindBy(id="LoginID")
	public WebElement loginId;
	
	//click on forgot password 
	@FindBy(xpath="//button[@type='submit']")
	public WebElement forgotPassword;
	
	//click on My profile page
	
	
	
	
}

