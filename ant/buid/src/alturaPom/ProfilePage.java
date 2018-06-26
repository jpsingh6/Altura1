package alturaPom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ProfilePage {

public ProfilePage(WebDriver driver){
		
		
		
		PageFactory.initElements(driver, this);
	}

 	//The @FindBy annotation is used in Page Objects in 
 	//Selenium tests to specify the object location strategy for a 
	//WebElement or a list of WebElements. Using the PageFactory, 
	//these WebElements are usually initialized when a Page Object is created
	
	//Click on admin link
		@FindBy(xpath="//img[@src='/assets/images/ui/setting.png']")
		public WebElement adminpage;
		//click on My profile page
		@FindBy(xpath="//a[@href='/system/myprofile']")
		public WebElement Myprofile;
		
		//click on First Name
			@FindBy(id="ProviderFirstName")
			public WebElement Fname;
			
			//click on First Name
					@FindBy(id="ProviderLastName")
					public WebElement Lname;

					//click on Mobile Number
					@FindBy(id="Mobile")
					public WebElement MobileNumber;
					
					//click on my profile page
					@FindBy(xpath="//a[@href='/system/myprofile']")
					public WebElement myProfile;
					
					//submit updated record of first name last name mobile number
					public void enterProfileRecord(String FirstName, String LastName, String Mobile)
					{
						Fname.clear();
						Fname.sendKeys(FirstName);
						Lname.clear();
						Lname.sendKeys(LastName);
						MobileNumber.clear();
						MobileNumber.sendKeys(Mobile);
					}
					
					//click on save button
					@FindBy(xpath="//button[@value='save']")
					public WebElement saveProfile;
					
					//Select DesignationID
					@FindBy(id="DesignationID")
					public WebElement Designation;
					
					//Select Specitaity
					@FindBy(id="SpecialityID1")
					public WebElement speciality1;
					
					public void specialty_selection(String speciality)
					{
						Select s=new Select(speciality1);
						s.selectByVisibleText(speciality);
					}
					public int dropdownSize(WebElement option)
					{
					Select dropDown = new Select(option);
			        List <WebElement> elementCount = dropDown.getOptions();
			        int itemSize = elementCount.size();
			       /* for(int i = 0; i < itemSize ; i++){
			            String optionsValue = elementCount.get(i).getText();
			            System.out.println(optionsValue);*/
			      //  }
			        return itemSize;
					}
					public String dropdownValue(WebElement option)
					{
					Select dropDown = new Select(option);
			        List <WebElement> elementCount = dropDown.getOptions();
			        int itemSize = elementCount.size();
			        String optionsValue=null;
			        for(int i = 0; i < itemSize ; i++){
			            optionsValue = elementCount.get(i).getText();
			            System.out.println(optionsValue);
			        }
			        return optionsValue;
					}
					public void designation_Selection(String designation1)
					{
						Select select=new Select(Designation);
						select.selectByVisibleText(designation1);
					}
					
					//Change password
					//click on change password link
					@FindBy(xpath="//a[@href='/system/changepassword']")
					public WebElement changePassword;
					
					//Enter Old Password
					@FindBy(id="OldPassword")
					public WebElement password_Old;
					
					//Enter new password
					@FindBy(id="NewPassword")
					public WebElement password_new;
					
					//Enter Confirm password
					@FindBy(id="ConfirmPassword")
					public WebElement Password_Confirm;
					
					//method for change password
					public void passwordUpdate(String old_Password, String New_Password, String Confirm_Password)
					{
						password_Old.clear();
						password_Old.sendKeys(old_Password);
						password_new.clear();
						password_new.sendKeys(New_Password);
						Password_Confirm.clear();
						Password_Confirm.sendKeys(Confirm_Password);
					}
					//click on change password
					@FindBy(xpath="//button[@type='submit']")
					public WebElement submitTochange;
					
					//Fee Schedule
					@FindBy(xpath="//a[@href='/system/feeschedule']")
					public WebElement feeSchedule;

					//Click on click on terms and privacy
					@FindBy(xpath="//a[@href='/system/termsandprivacy']")
					public WebElement termsAndPrivacy;
					
					//click on help and FAQ
					@FindBy(xpath="//a[@href='/common/helpfaq']")
					public WebElement HelpFAQ;
					
					//Click on contact altura
					@FindBy(xpath="//a[@href='/common/contactaltura']")
					public WebElement contectAltura;
					
					//click on linkText of altura contect
					@FindBy(linkText="www.alturastudies.com")
					public WebElement alturaStudies;
					
					
        }
	
					

