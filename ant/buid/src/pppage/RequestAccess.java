package pppage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RequestAccess {
	public RequestAccess(WebDriver driver)
	{		
		PageFactory.initElements(driver, this);
	}
	
	//forget password
	@FindBy(xpath="//a[@href='/account/forgotpassword']")
	public WebElement forgetPassword;
	
	//Enter Email Id
	@FindBy(id="EmailID")
	public WebElement enterEmailId;

	//press continue
	@FindBy(xpath="//button[@value='save']")
	public WebElement Submit;

	//Request Access
	@FindBy(xpath="//a[@class='btn btn-light-green-brdr marg-top3']")
	public WebElement RequestAccsee;
	//provider email id
	@FindBy(id="EmailID")
	public WebElement EmailID1;
	//Password
	@FindBy(id="Password")
	public WebElement NewPassword1;
	//confirm passord
	@FindBy(id="ConfirmPassword")
	public WebElement ConfirmPassword;
	//Organization name
	@FindBy(id="OrganizationName")
	public WebElement organization;
	//select country
	@FindBy(id="ppddlStateCodeOA")
	public WebElement selectCounty10;
	
	public void selectCountry11(String country0)
	{
		Select country13=new Select(selectCounty10);
		country13.selectByValue(country0);
		
	}
	// submit the provider detail //button[@class='btn btn-light-green']
	@FindBy(xpath="//button[@value='save']")
	public WebElement SubmitProvider;
	
	//Accept the term and condition
	@FindBy(xpath=".//button[@value='save']")
	public WebElement agree;
	//discart the terms and condtion 
	@FindBy(xpath="html/body/div[4]/div/div/div[2]/div[3]/button[2]")
	public WebElement discart;
	
	//Enter First name
	@FindBy(id="ProviderFirstName")
	public WebElement EnterFname;
	
	//Enter last name
	@FindBy(id="ProviderLastName")
	public WebElement EnterLastName;
	
	//Enter cell phone
	@FindBy(id="txtCellPhone")
	public WebElement EnterCellPhoneNumber;
	
	//Select Designation 
	@FindBy(id="ddlDesignation")
	public WebElement designation;
	
	public void SelectDesignation(String DesignationName)
	{
		Select select=new Select(designation);
		select.selectByVisibleText(DesignationName);
	}
	//Enter Address name
	@FindBy(id="txtOfficeAddress")
	public WebElement EnterAddress;
	
	//Enter Office address
	@FindBy(id="txtCity")
	public WebElement EnterCity;
	
	//Select State 
	@FindBy(id="ppddlStateCodeOA")
	public WebElement stageName;
	
	public void SelectState(String EnterStateName)
	{
		Select select=new Select(stageName);
		select.selectByVisibleText(EnterStateName);
	}
	
	//Enter Zip cone
	@FindBy(id="txtZip")
	public WebElement EnterZipCod;
	
	//Enter office phone 
	@FindBy(id="txtOfficePhone")
	public WebElement EnterOfficePhone;

	//click on next
	@FindBy(xpath=".//*[@id='formSetupProfile-step-0']/div[4]/a")
	public WebElement clickOnNext1;
	
	//click on same as in offic address
	@FindBy(id="IsOfficeAddressSame")
	public WebElement checkSameOfficeAddress;
	
	//For non HCP user
	@FindBy(xpath="//button[@type='submit']")
	public WebElement submitNonHCP;
	
	//click on next
	@FindBy(xpath=".//*[@id='formSetupProfile-step-1']/div[3]/a[2]")
	public WebElement clickOnNext2;
	//Select specialtiy  
	@FindBy(id="SpecialityID1")
	public WebElement Specialityname;
	
	public void SelectSpeciality1(String selectSpeciality1)
	{
		Select select=new Select(Specialityname);
		select.selectByVisibleText(selectSpeciality1);
	}
	
	//click on next
	@FindBy(xpath=".//*[@id='formSetupProfile-step-2']/div[2]/a[2]")
	public WebElement clickOnNext3;
	
	//Add Assistant
	@FindBy(id="sweet_info")
	public WebElement AddNoAssistant;
	
	//Add Assistant
	@FindBy(xpath="html/body/div[7]/div[2]/button[2]")
	public WebElement ClickOnOk;
}
