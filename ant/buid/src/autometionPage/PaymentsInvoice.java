package autometionPage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import util.Setup;
import alturaPom.LoginPP;
import alturaPom.Payment;

public class PaymentsInvoice extends Setup{

	//@BeforeTest
	public void baseSetup()
	{
		browser("Chrome");
		//System.setProperty("webdriver.chrome.driver", "E:\\software\\chrome\\chromedriver.exe");
		//driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
		LoginPP page1=new LoginPP(driver);
		page1.login("panalink-134@yopmail.com", "panalink1");
	}
		
	
	@Test
	public void invoiceDetail() throws InterruptedException
	{
		Payment page=new Payment(driver);
		Thread.sleep(5000);
		for(String h:driver.getWindowHandles())
		{
			driver.switchTo().window(h);
		}

		Actions action=new Actions(driver);
		for(String s:driver.getWindowHandles() )
        {
        	driver.switchTo().window(s);
        }
		action.moveToElement(page.Payment1);
		action.click().build().perform();
		Thread.sleep(3000);
		for(String h:driver.getWindowHandles())
		{
			driver.switchTo().window(h);
		}
		action.moveToElement(page.invoice);
		action.click().build().perform();
		
		Thread.sleep(5000);
		for(String h:driver.getWindowHandles())
		{
			driver.switchTo().window(h);
		}
		
		String s=page.totalAmount.getText();
		//String y=s.replaceAll("\\$", "");
		if(s.equals("$0.00"))
		{
		System.out.println("Total Amount: " +s+ "  Can not be submitted because no invoice amount");
		
		}
		else
			
		{
			int flag=0;
			for(int i=0;i<2;i++){
			
			System.out.println("Total Amount: " +s);
			page.submitInvoic.click();
			Thread.sleep(5000);
			Alert alert =driver.switchTo().alert();
			if(flag==0)
			{
			alert.dismiss();
			}
			else{
				alert.accept();
			}
			Thread.sleep(5000);
			for(String h:driver.getWindowHandles())
			{
				driver.switchTo().window(h);
			}
			String message=page.SubmissionMessage.getText();
			if(message.contains("submitted successfully"))
			{
			System.out.println(page.SubmissionMessage.getText());
			}
			else
			{
				System.out.println("Your invoice has cancelled");
			}
			flag++;
			}
		}
	}
	
}
