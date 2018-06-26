package alturaAdminPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class profilePage {
	
	public profilePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//SetUp Menu
	@FindBy(xpath="//span[text()='Welcome Singh Jitendra (Admin)']")
	public WebElement welcome; 
	
	
	@FindBy(id="lnkMyProfile")
	public WebElement MyProfileLink;
	

	@FindBy(xpath="//a[@class='btn btn-success pull-right']")
	public WebElement changePassword1;
	
	@FindBy(id="OldPassword")
	public WebElement oldpassword;
	
	@FindBy(id="NewPassword")
	public WebElement newpassword;
	
	@FindBy(id="ConfirmPassword")
	public WebElement comfirmpassword;
	
	public void ChangePassword2(String OldPwd, String NewPwd, String Confirmpwd)
	{
		oldpassword.sendKeys(OldPwd);
		newpassword.sendKeys(NewPwd);
		comfirmpassword.sendKeys(Confirmpwd);
		
	}
	
	

}
