package POM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PaymentPage 
{
	WebDriver driver;
	
	public PaymentPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	@FindBy(xpath = "//*[@name='cardName']")
	WebElement NameOnCard;
	
	
	@FindBy(xpath = "//*[@name='cardNumber']")
	WebElement NumbrOnCard;
	
	@FindBy(xpath = "//*[@name='cardtype']")
	WebElement CardType;
	
	@FindBy(xpath = "//*[@name='issueDate']")
	WebElement IssueDate;
	
	@FindBy(xpath = "//*[@name='issueYear']")
	WebElement IssueYear;
	
	@FindBy(xpath = "//*[@name='expiryDate']")
	WebElement ExpiryDate;
	
	@FindBy(xpath = "//*[@name='expiryYear']")
	WebElement ExpiryYear;
	
	@FindBy(xpath = "//*[@name='cvvNo']")
	WebElement CVVNo;
	
	@FindBy(xpath = "//*[@name='billingAddress']")
	WebElement BillingAddress;
	
	@FindBy(xpath = "//*[contains(text(),'Find')]")
	WebElement FindButton;
	
	@FindBy (xpath = "//*[@id='billingAddressList']")
	WebElement AddressList;
	
	@FindBy (xpath = "//*[contains(text(),'Pay')]")
	WebElement PayButton;
	
	@FindBy (xpath = "//*[@id='progressing']")
	WebElement loader;
	
	public void MakePayment()
	{
		WebDriverWait wait = new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.invisibilityOf(loader));
		NameOnCard.sendKeys("Swapnil Bhaskar");
		NumbrOnCard.sendKeys("4929000000006");
		
		Select DrpCardType = new Select(CardType);
		DrpCardType.selectByVisibleText("Visa Card");
		
		Select DrpIssueDate = new Select(IssueDate);
		DrpIssueDate.selectByVisibleText("2");
		
		Select DrpIssueYear = new Select(IssueYear);
		DrpIssueYear.selectByVisibleText("2018");
		
		
		Select DrpExpDate = new Select(ExpiryDate);
		DrpExpDate.selectByVisibleText("2");
		
		
		Select DrpExpYear = new Select(ExpiryYear);
		DrpExpYear.selectByVisibleText("2022");
		
		CVVNo.sendKeys("123");
		
		BillingAddress.sendKeys("m36gb");
		wait.until(ExpectedConditions.elementToBeClickable(FindButton));
		JavascriptExecutor js1 = (JavascriptExecutor)driver;
		js1.executeScript("arguments[0].click();",FindButton);
		
		wait.until(ExpectedConditions.visibilityOf(AddressList));
		Select select2 =new Select(AddressList);
		select2.selectByVisibleText("Apartment 2 Block B Alto Sillavan Way Salford");
		
		js1.executeScript("window.scrollBy(0,500)");
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		js1.executeScript("arguments[0].click();",PayButton);
		
	}
	
}
