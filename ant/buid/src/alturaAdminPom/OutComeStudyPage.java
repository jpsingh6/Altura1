package alturaAdminPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OutComeStudyPage {


	public OutComeStudyPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//Click on add outcome study
	@FindBy(xpath="//a[@href='/admin/studies/addoutcomestudy']")
	public WebElement addOutcomeStudy;
	
	
	@FindBy(xpath=".//*[@id='liOutcomeStudy']/a[@href='#bordered-tab2']")
	public WebElement outComeStudy;
	
	//Study Title/Purpose:
	@FindBy(id="StudyTitle")
	public WebElement studyTitle;
	
	//Enter due date
	@FindBy(id="txtDueDate")
	public WebElement dueDate;
	//Enter due date
		@FindBy(id="SponsorID")
		public WebElement Sponsor;
		//Fee Amount
		@FindBy(id="txtFeeAmount")
		public WebElement Fee;
		//Total No. Required
		@FindBy(id="txtTotalNoRequired")
		public WebElement totalNoRequired;
		//No. Required/Provider
		@FindBy(id="txtNoRequiredPerProvider")
		public WebElement noRequiredPerProvider;
		//note
		@FindBy(id="Notes")
		public WebElement notes;
		//App Title:
		@FindBy(id="AppTitle")
		public WebElement appTitle;
		
		@FindBy(id="AppDescription")
		public WebElement appDescription;
		
		//Background
		@FindBy(xpath=".//iframe[@title='Rich Text Editor, Background']")
		public WebElement background;
		//body 
		@FindBy(css="body")
		public WebElement body1;
		
		//Patient Care TargetPopulation
		@FindBy(xpath=".//iframe[@title='Rich Text Editor, TargetPopulation']")
		public WebElement TargetPopulation;
		
		//Footnotes:
		@FindBy(id="Footnotes")
		public WebElement footnote;
		
		//click on save button
		@FindBy(xpath="//button[@value='save']")
		public WebElement Save;
		
		//click on participant
		@FindBy(xpath=".//*[@id='liTab2']/a")
		public WebElement participants;
		
		//click on droft/active or other
		@FindBy(id="btnStatusOS")
		public WebElement droft;
		
		//click on droft/active or other
				@FindBy(xpath="//ul[@id='ulStatusListOS']/li[2]/a[contains(text(),'Active')]")
				public WebElement active;
				@FindBy(xpath="//a[@class='select2-search-choice-close']")
				public WebElement ClearData;
				//Search participant by designation
				@FindBy(id="s2id_autogen3")
				public WebElement searchByDegination;
				//click on search button
				@FindBy(xpath="//button[@value='search']")
				public WebElement search;
				//click on default search 
				@FindBy(xpath="//button[@title='Search and set as default search']")
				public WebElement searchDefault;
				//Assign to particular user
				@FindBy(xpath=".//*[@id='tblParticipantsSearchResult_filter']/label/input")
				public WebElement assignTouser;
				
				//click on that user
				@FindBy(id="chkSelectAllPSR")
				public WebElement checkuser;
				
				//click on add button
				@FindBy(xpath=".//*[@id='divSearchResults']/button")
				public WebElement addParticipant;
				
				
				//For survey designer form
				@FindBy(xpath=".//a[@class='btn btn-info']")
				public WebElement SurveyDesiner;
				
				//click on text button
				
				@FindBy(xpath="//button[@class='btn bt']/div[text()='Text']")
				public WebElement text;
				//insert value in text
				@FindBy(id="QuestionText")
				public WebElement textMatter;
				
				//click on multiple choice question
				
				@FindBy(xpath="//button[@class='btn bt']/div[text()='Yes/No']")
				public WebElement yes_no;
				
				//insert value in text
				@FindBy(id="QuestionText")
				public WebElement yesNoType;
				
				//save matte
				@FindBy(xpath="//button[@value='save']")
				public WebElement saveMatter;
				
				//save and exit from survey
				@FindBy(xpath="//div[@class='btn btn-primary pull-right mb-5']")
				public WebElement SaveAndExitSurvey;
				
				//////update outcome study 
				
			//Click on search button
				@FindBy(xpath=".//*[@id='tblOutcomeStudies_filter']/label/input")
				public WebElement searchOutcomeStudy;
				
				//Click on Edit button
				@FindBy(xpath=".//td[text()='Survey form for testion purpose']//following-sibling::td[4]/div/a[3]")
				public WebElement updateClick;
				
				
		
}
