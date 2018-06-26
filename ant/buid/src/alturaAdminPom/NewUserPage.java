package alturaAdminPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class NewUserPage {
	
	

	public NewUserPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}	
	//click on admin
		@FindBy(xpath=".//*[@id='navbar-demo']/ul/li[5]/a")
		public WebElement moveToAdmin;
		
	//click on fee schedule
		@FindBy(xpath="//a[@href='/admin/admin/users']")
		public WebElement Usre;
		
	//click on add user
		@FindBy(xpath="//a[@href='/admin/admin/adduser']")
		public WebElement addUser;
		
		//Enter First name
			@FindBy(id="txtFirstName")
			public WebElement Fname;
		
		//Enter last name
				@FindBy(id="txtLastName")
				public WebElement Lname;
				
		//Select Role 
				@FindBy(id="ddlRole")
				public WebElement Role;
				
		//Enter Login id
				@FindBy(id="txtLoginID")
				public WebElement LoginId;
				
		//Enter EMailID 
				@FindBy(id="EmailID")
				public WebElement EmailID;
		//Enter password
				@FindBy(id="Password")
				public WebElement password;
		//Enter password
				@FindBy(id="ConfirmPassword")
				public WebElement Confirmpassword;
		//click on save button.
				@FindBy(xpath="//button[@value='save']")
				public WebElement submitDetail;
		//Method for entry all detail
				public void userDetail(String FirstName, String LastName, String roll)
				{
					Fname.clear();
					Fname.sendKeys(FirstName);
					Lname.clear();
					Lname.sendKeys(LastName);
					Select roleid=new Select(Role);
					roleid.selectByVisibleText(roll);
				}
				public void loginDetail(String loginid1, String Emailid1)
				{
					LoginId.clear();
					LoginId.sendKeys(loginid1);
					EmailID.clear();
					EmailID.sendKeys(Emailid1);
					
				}
				public void passwordfield(String pwd, String newPWD)
				{
					password.clear();
					password.sendKeys(pwd);
					Confirmpassword.clear();
					Confirmpassword.sendKeys(newPWD);
				}
}
