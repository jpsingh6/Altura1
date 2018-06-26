package alturaPom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Newspage {
	

	
	public Newspage(WebDriver driver){
			
			
			
			PageFactory.initElements(driver, this);
		}
		//login to Altura
		//Enter user name
		@FindBy(linkText="News")
		public WebElement newspp;
		
		//search field
		@FindBy(xpath="//input[@class='ui-autocomplete-input']")
		public WebElement search;
		
		//method for search
		public void searchtext(String EnterText)
		{
			search.sendKeys(EnterText);
		}
		
		@FindBy(xpath="//div[@class='media-heading col-text1']/b[contains(text(), 'Medical news')]")
		public WebElement searchLink;
		
		@FindBy(xpath=".//*[@id='popupContent']/div[3]/button")
		public WebElement close1;
		

}
