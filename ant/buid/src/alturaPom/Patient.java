package alturaPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Patient {


	public Patient(WebDriver driver){
			
			PageFactory.initElements(driver, this);
		}
		//login to Altura
		//Enter user name
		@FindBy(xpath="//a[@href='/patients/patients']")
		public WebElement Patient5;

		//In Process
		
		@FindBy(xpath=".//*[@id='liTab2']/a")
		public WebElement InProcess;
		
		//History#in-history

		@FindBy(xpath=".//*[@id='liTab3']/a")
		public WebElement History;
		
		//InStudy
		@FindBy(xpath=".//*[@id='liTab1']/a")
		public WebElement InStudy;
}
