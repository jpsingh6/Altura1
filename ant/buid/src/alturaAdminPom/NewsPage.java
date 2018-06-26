package alturaAdminPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class NewsPage {
	
	public NewsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//click on admin
	@FindBy(xpath=".//*[@id='navbar-demo']/ul/li[5]/a")
	public WebElement moveToAdmin;
	
	//click on news link
	@FindBy(xpath="//a[@href='/admin/admin/news']")
	public WebElement clickOnNews;
	
	//click on add news link
	@FindBy(xpath="//a[@href='/admin/admin/addnews']")
	public WebElement addNews;
	
	//Enter news title detail
	@FindBy(id="txtSubject")
	public WebElement EnterTille;
	
	//select specialty
	@FindBy(xpath=".//*[@id='formAddEditNews']/div[2]/div[1]/div[2]/div/div[1]/button")
	public WebElement SelectSpecialty;
	
	//click on specialtites
	@FindBy(xpath="//input[@value='0ebe9156-63b4-e511-8d7c-1c6f6527a54f']")
	public WebElement specialty1;
	
	//select area of interest 
	@FindBy(xpath=".//*[@id='formAddEditNews']/div[2]/div[1]/div[3]/div/div[1]/button")
	public WebElement areaOfInterest;
	
	//area of interest 1
	@FindBy(xpath="//input[@value='05dcda95-6cb4-e511-8d7c-1c6f6527a54f']")
	public WebElement interst1;
	
	//area of interest 2
	@FindBy(xpath="//input[@value='07dcda95-6cb4-e511-8d7c-1c6f6527a54f']")
	public WebElement interst2;
	
	//For publish news
	@FindBy(id="IsPublished")
	public WebElement publish;
	
	//selece specialty 2
	@FindBy(xpath="//input[@value='11be9156-63b4-e511-8d7c-1c6f6527a54f']")
	public WebElement specialty2;
	
	//Select Area of interest
	
	//
	
	@FindBy(xpath=".//iframe[@title='Rich Text Editor, txtNewsContent']")
	public WebElement NewsContains;
	
	//submit news and back home
	@FindBy(id="btnRedirect")
	public WebElement submitNews;
	
	@FindBy(css="body")
	public WebElement body1;
	
	public void NewTitleSpecialty(String TitleName, String newscontain)
	{
		EnterTille.sendKeys(TitleName);
		//Select c=new Select(specialty1);
		body1.sendKeys(newscontain);
		
	}
	

}
