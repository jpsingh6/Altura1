package alturaPom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Studies {

		
		public Studies(WebDriver driver){
				
				PageFactory.initElements(driver, this);
			}
			//login to Altura
			//Enter user name
			@FindBy(xpath=".//*[@id='tblClinicalTrials']/tbody/tr[1]/td/div/div[3]/a[4]")
			public WebElement StartEvaluation;
			
			//Required
			@FindBy(id="f2ad4d89-8edf-46ea-a999-2a719f4aebb7")
			public WebElement check1;
			
			@FindBy(id="84d1f212-7cf5-4bcb-9420-b2be5b2892a8")
			public WebElement check2;
			
			//extended
			@FindBy(id="0a11c866-c233-4069-b463-8432c87b7039")
			public WebElement check3;
			
			@FindBy(id="1a34fa9b-9659-4795-84d9-b946b7829a38")
			public WebElement check4;
			
			//patient Info
			//first Name
			@FindBy(id="FirstName")
			public WebElement firstName;
			
			//Last Name
			@FindBy(id="LastName")
			public WebElement lastName;
			
			//Phone Number
			@FindBy(id="PatientPhoneNumber")
			public WebElement phone;
			
			//Comment
			@FindBy(id="Comments")
			public WebElement comment;
			
			public void patientDetail(String Fname, String Lname)
			{
				firstName.sendKeys(Fname);
				lastName.sendKeys(Lname);
			}
			//check confirmation
			@FindBy(id="chkConfirmation")
			public WebElement authorizCheck;

			//submit detail
			
			@FindBy(id="btnClinicalSave")
			public WebElement submitDetail;
			//
			@FindBy(id="formSubmitted")
			public WebElement alert;
			
			
			//please call patient
			
			@FindBy(xpath=".//*[@id='tblClinicalTrials']/tbody/tr[1]/td/div/div[3]/a[3]")
			public WebElement PCpatient;
			
			//patient name
			@FindBy(id="PatientFullName")
			public WebElement PName;
			
			//patient phone number
			@FindBy(id="PatientPhoneNumber")
			public WebElement PPhone;
			
			//comment
			@FindBy(id="Comments")
			public WebElement comment1;
			
			//submit button
			@FindBy(xpath="//button[@value='save']")
			public WebElement submitPatient;
			
			//method for submit patient
			public void submitpatient1(String patient_name, String phoneN )
			
			{
				PName.sendKeys(patient_name);
				PPhone.sendKeys(phoneN);
			}
			
			//call Study Team
			@FindBy(xpath=".//*[@id='tblClinicalTrials']/tbody/tr[1]/td/div/div[3]/a[1]")
			public WebElement RequestCallBack1;

			//close popup
			@FindBy(xpath="//button[@value='save']")
			public WebElement popupclose;
			
			@FindBy(xpath=".//*[@id='tblClinicalTrials']/tbody/tr[1]/td/div/div[3]/a[2]")
			public WebElement CallStudyTeam1;
			
			@FindBy(xpath="//button[@class='btn btn-default']")
			public WebElement closle1;
			
			
			
			//Studies for provider
			@FindBy(xpath="//li[2]/a[@href='#bordered-tab2']")
			public WebElement StudiesforHC;
			//patient
			@FindBy(xpath="//a[@href='#bordered-tab2']")
			public WebElement StudiesForHP1;
			
			//Studies for provider
			@FindBy(xpath=".//*[@id='tblOutcomeStudies']/tbody/tr/td/div/div[4]/a")
			public WebElement StartSurvey1;
			//Select question
			
			@FindBy(id="5eb51e03-6406-495e-853f-f993839ab878")
			public WebElement Question2;
			
			//submit ok
		
			@FindBy(xpath="//button[@type='submit']")
			public WebElement SubmitSurvery1;
			
			@FindBy(id="html/body/div[7]/div[2]/button[2]")
			public WebElement SubmitOk1;
			
			
			//Studies for provider
			@FindBy(xpath=".//*[@id='tblOutcomeStudies']/tbody/tr/td/div/div[4]/a")
			public WebElement StartSurvey;
			
			//Select question
			@FindBy(id="5694137c-386c-4cef-ae40-6bb833e9bcb5")
			public WebElement Select1;
			
			//submit survey
			@FindBy(xpath="//button[@value='redirect']")
			public WebElement SubmitSurvery;
			
			//submit ok
			@FindBy(id="formSubmitted")
			public WebElement SubmitOk;
			
			@FindBy(xpath="//a[@href='/account/logout']")
			public WebElement logout;
		
}
