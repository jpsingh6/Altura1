package alturaPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment {
	
	public Payment( WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	//Enter user name
	//Enter user name
	@FindBy(xpath="//img[@alt='Payment']")
	public WebElement Payment1;
	
	//Invoice
	@FindBy(xpath="//a[@href='/payments/invoice']")
	public WebElement invoice;

	//Total invoice
	@FindBy(id="tdInvoiceTotalAmount")
	public WebElement totalAmount;
	
	//Submit Button
	@FindBy(xpath="//button[@data-target='#submit-invoice']")
	public WebElement submitInvoic;

	//success of submission
	@FindBy(id="SuccessMsg")
	public WebElement SubmissionMessage;
	
	//click on Pending invoice menu links
	@FindBy(xpath="//a[@href='/payments/pending']")
	public WebElement pendingInvoice;
	
	//Click on Payments History tab
	@FindBy(xpath="//a[@href='/payments/history']")
	public WebElement history;
}