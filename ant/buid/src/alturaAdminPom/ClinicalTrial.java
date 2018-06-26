package alturaAdminPom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ClinicalTrial {
	
	public ClinicalTrial(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//click in studies button
	@FindBy(xpath="//a[@href='/admin/studies/home']")
	public WebElement studies;
	
	//click on add clinical trial
	@FindBy(xpath="//a[@href='/admin/studies/addclinicaltrial']")
	public WebElement addClinicalTrial;
	
	//Click on out come studies
	@FindBy(xpath="//a[@href='#bordered-tab2']")
	public WebElement OutcomStudies;
	
	//click on Add out come studies
	@FindBy(xpath="//a[@href='/admin/studies/addoutcomestudy']")
	public WebElement addOutComeStudies;
	
	//Enter Title in Study Title/Purpose field
	@FindBy(id="StudyTitle")
	public WebElement studyTitle1;
	
	// Enter End date
	@FindBy(id="txtEndDate")
	public WebElement endDate;
	
	
	// Enter End date
	@FindBy(id="SponsorID")
	public WebElement Sponsor;
	
	//Enter Maximum budget
	@FindBy(id="txtMaximumBudget")
	public WebElement maximumBudget;
	
	//Direct to call
	@FindBy(id="StudySiteCallToID")
	public WebElement directCallTo;
	
	//App OverView

	//Add App title
	@FindBy(id="AppTitle")
	public WebElement appTitle;
	
	//Add App Discription
	@FindBy(id="AppDescription")
	public WebElement appDiscription;
	
	//Add App background
	@FindBy(id="Background")
	public WebElement backGround;
	
	//Targate population
	@FindBy(xpath=".//iframe[@title='Rich Text Editor, TargetPopulation']")
	public WebElement targatePopulation;
	//body 
	@FindBy(css="body")
	public WebElement body1;
	//Patient Care Information
	@FindBy(xpath=".//iframe[@title='Rich Text Editor, PatientCareInformation']")
	public WebElement patientCareInformation;
	//Interventions Involved
	
	@FindBy(xpath=".//iframe[@title='Rich Text Editor, MedicationsInvolved']")
	public WebElement interventionsnvolved;

	//Footnotes:
	@FindBy(xpath=".//iframe[@title='Rich Text Editor, Footnotes']")
	public WebElement footnote;

	//click on Save button  
	@FindBy(xpath=".//button[@class='btn btn-primary']")
	public WebElement submitCT;
	
	//Eval Form
	@FindBy(id="liTab2")
	public WebElement EvalForm;
	@FindBy(xpath="//a[@href='#tab2']")
	public WebElement ClickEvalForm;
	//Click on Add Eval Form.
	@FindBy(xpath="//a[@class='btn btn-success pull-right text-white']")
	public WebElement AddEvalForm;
	
	//Enter Eval Form Name
	@FindBy(id="StudyFormName")
	public WebElement EvalFormName;
	
	//select for fee schedule
	@FindBy(id="FeeScheduleLevelID")
	public WebElement SelectFeeSchedule;
	
	//click on save button of fee schedule detail\
	@FindBy(xpath=".//*[@id='formEvalForm']/div[2]/button[1]")
	public WebElement submitFeeScheduleLevel;
	
	///method for both Eval form name and fee schedule level
	public void evalFormDetail(String FormName, String feeScheduleLevel)
	{
		EvalFormName.sendKeys(FormName);
		Select s=new Select(SelectFeeSchedule);
		s.selectByVisibleText(feeScheduleLevel);
		submitFeeScheduleLevel.click();
	}
	//Study Sides
	@FindBy(id="liTab3")
	public WebElement StudySites;
	
	//select study site
	@FindBy(xpath="//a[@onclick='SelectStudySitePopup()']")
	public WebElement SelectStudySite;
	
	//Select Site Name
	@FindBy(id="chkRow_ec951680-da22-464c-a72f-5698cb76679d")
	public WebElement LosAngeles;
	
	// click on select button
	@FindBy(xpath="//button[@onclick='SaveSelectedStudySites()']")
	public WebElement SubmitSite;
	
	//Select Participate for clinical trial
	@FindBy(id="liTab4")
	public WebElement participants;

	//Filter by designation.
	@FindBy(id="s2id_autogen7")
	public WebElement designation;
	
	//Search for provider
	@FindBy(xpath="//button[@class='btn btn-info']")
	public WebElement SearchDegination;
	
	//Search For clinical trial
	@FindBy(xpath=".//*[@id='divSearchParticipantsFilter']/div[2]/div/button[1]")
	public WebElement searchProvider;
	//select provider by email id;
	@FindBy(xpath=".//*[@id='tblParticipantsSearchResult_filter']/label/input")
	public WebElement searchByEmailid;
	
	//click on check box
	@FindBy(id="eb1077d0-972f-4a01-bf36-df4c734ac1a2")
	public WebElement ClickOnProvider;

	// Click on add participate
	@FindBy(xpath="//button[@onClick='SaveSelectedParticipants()']")
	public WebElement addProvicer;
	//search clinical trial
	@FindBy(xpath=".//*[@id='tblClinicalTrials_filter']/label/input")
	public WebElement searchClinicalTrial;
	
	//Edit clinical trial
	@FindBy(xpath="//i[@class='fa fa-edit']")
	public WebElement EditCT;
	
	public void studyTitle(String sTitle, String EndDate1)
	{
		studyTitle1.sendKeys(sTitle);
		endDate.clear();
		endDate.sendKeys(EndDate1);
	}
	
	public void StudyDetail(int Sponsor1, String Budget1, int Dtocall)
	{
		Select s= new Select(Sponsor);
		s.selectByIndex(Sponsor1);
		maximumBudget.sendKeys(Budget1);
		Select s1=new Select(directCallTo);
		s1.selectByIndex(Dtocall);
	}
	
	public void appTitle(String AppTitle1, 
						 String Description, 
						 String Background1)
	{
		appTitle.sendKeys(AppTitle1);
		appDiscription.sendKeys(Description);
		backGround.sendKeys(Background1);
	}
	
	public void appOverView(String Tpopulation, 
							String PcareInformation, 
							String Iinvolvment,
							String footnote1)
	{
		targatePopulation.sendKeys(Tpopulation);
		patientCareInformation.sendKeys(PcareInformation);
		interventionsnvolved.sendKeys(Iinvolvment);
		footnote.sendKeys(footnote1);
		
	}
	/*@FindBy(xpath="//button[@class='btn btn-primary']")
	WebElement SaveClinicalTrial;*/
	
}
