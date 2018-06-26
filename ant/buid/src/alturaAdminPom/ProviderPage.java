package alturaAdminPom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProviderPage {
	
	public ProviderPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//SetUp Menu
	@FindBy(xpath="//li[4]/a[@class='dropdown-toggle']")
	public WebElement setUp; //a[@href='/admin/setup/providers']
	
	
	//providers  
	@FindBy(xpath="//a[@href='/admin/setup/providers']")
	public WebElement providers;
	
	//click on add provider
	@FindBy(xpath="//a[@href='/admin/setup/addprovider']")
	public WebElement addNewProvider;
	
	//Only mandetory field
	
		//Enter the first name
		@FindBy(id="FirstName")
		public WebElement Fname;
	
		//Enter the Last Name
		@FindBy(id="LastName")
		public WebElement Lname;
		
		//Select provider designation Non-HCP provider
		@FindBy(id="DesignationID")
		public WebElement designation;
		
		//Enter primary Email id
		@FindBy(id="txtProviderEmailID")
		public WebElement primaryEmailId;
		
		//Enter primary Email id
		@FindBy(id="MedicalGroupID")
		public WebElement medicalGroup;
		

		//Click on save button
		@FindBy(xpath="//button[@value='save']")
		public WebElement submintDetail;;
				
				
				//Click on send mail button
				@FindBy(xpath="//a[@class='btn btn-primary pull-right']")
				public WebElement SendMail;
				
				
				//email already exist - validation message.
				@FindBy(xpath="//span[text()='Email ID already exists.']")
				public WebElement EmailValidationMessage;
				
				
	
}
