package alturaAdminPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class MedicalGroupPage {
	public MedicalGroupPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}	
	
	//SetUp Menu //
		@FindBy(xpath="//li[4]/a[@class='dropdown-toggle']")
		public WebElement setUp; //a[@href='/admin/setup/providers']
		
		//Click on medical group
		@FindBy(xpath="//a[@href='/admin/setup/medicalgroups']")
		public WebElement medicalGroup;
		
		//Click on Add Medical Group
		@FindBy(xpath="//a[@href='/admin/setup/addmedicalgroup']")
		public WebElement addMedocalGroup;
		//Medical Group name searchable 
		@FindBy(id="MedicalGroupName")
		public WebElement MedicalGroupName;

		//payee type
		@FindBy(id="PayeeTypeID")
		public WebElement PayeeType1;
		public void selectPayeeType(String PayeeType)
		{
			Select s=new Select(PayeeType1);
			s.selectByVisibleText(PayeeType);
			
		}
		//Enter phone number
		@FindBy(id="PrimaryAddress_Phone1")
		public WebElement MoblieNumber;

		//Enter Address detail
		@FindBy(id="txtAddressOA")
		public WebElement AddressTxt;
		
		//Enter City name
		@FindBy(id="txtCityOA")
		public WebElement CityName;
		
		//Enter Zip /postal code
		@FindBy(id="txtZipOA")
		public WebElement ZipCode;
		
		//Select Country
		@FindBy(id="ddlCountryOA")
		public WebElement countryName1;
		
		public void SelectCountry(String countryName)
		{
			Select s=new Select(countryName1);
			s.selectByVisibleText(countryName);
			
		}
		//select State
		@FindBy(id="ddlStateOA")
		public WebElement StateName11;
		public void SelectState(String StateName)
		{
			Select s=new Select(StateName11);
			s.selectByVisibleText(StateName);
			
		}
		///primary contact 
		//Enter primary Name
		@FindBy(id="PrimaryContact_ContactName")
		public WebElement PrimaryName;

		//Enter Primary phone number
		@FindBy(id="PrimaryContactMobileNo")
		public WebElement PrimayPhone;
		//Enter Primary phone Email
		@FindBy(id="PrimaryContact_EmailID")
		public WebElement PrimaryEmail;
		
		//Secondary Contact
		//Enter secondary Name
		@FindBy(id="SecondaryContact_ContactName")
		public WebElement SecondaryName;
		//Enter secondary phone
		@FindBy(id="SecondaryContactMobileNo")
		public WebElement SecondaryPhone;
		//Enter Seconday Email
		@FindBy(id="SecondaryContact_EmailID")
		public WebElement SecondaryEmail;
		
		
		//Enter Note
		@FindBy(id="Notes")
		public WebElement Notedetail;
		
		//Enter Note
		@FindBy(xpath="//button[@value='save']")
		public WebElement SubmitMedicalGroup;
		
		
		//Import Medical Group
		@FindBy(xpath=".//*[@id='buttonsCT']/a[1]")
		public WebElement importMedical;
		
		//Click on browser
		@FindBy(xpath=".//*[@id='buttonsCT']/a[1]")
		public WebElement browser;		
		
		//click on Import
		@FindBy(xpath="//button[@value='save']")
		public WebElement importFile;
		
		//click on 
		
}
