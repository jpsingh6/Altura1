package alturaAdminPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ValidationAndPaymentPage {
	public ValidationAndPaymentPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//SetUp Menu
		@FindBy(xpath=".//*[@id='navbar-demo']/ul/li[2]/a")
		public WebElement ValidationPayment; //a[@href='/admin/setup/providers']
		
		//Click on Validation Required
		@FindBy(xpath="//a[@href='/admin/payments/validationrequired']")
		public WebElement ValidationRequired;
		
		
		//click on Patients
		@FindBy(xpath="//a[@href='/admin/payments/patients']")
		public WebElement patientDetail;
		
		//click on invoice to process
				@FindBy(xpath="//a[@href='/admin/payments/invoicestoprocess']")
				public WebElement invoiceToBeProcess;
				
				//click on to be invoiced 
				@FindBy(xpath="//a[@href='/admin/payments/tobeinvoiced']")
				public WebElement toBeInvoiced;
				
				//click on invoice History
				@FindBy(xpath="//a[@href='/admin/payments/invoicehistory']")
				public WebElement invoiceHistory;
}
