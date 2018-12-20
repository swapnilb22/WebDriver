/**
 * 
 */
package POM;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author swapnil
 *
 */
public class applicationQuickStep2 {
WebDriver driver;
	
	public applicationQuickStep2(WebDriver driver) 
	{
		this.driver = driver;
	}
	
	@FindBy (xpath ="//*[@name='applicantType']")
	WebElement Applicant_Type;
	
	@FindBy (xpath ="//*[@name='applicationType']")
	WebElement Application_Type;
	
	@FindBy (xpath = "//*[@name='applicantToPurchaseOrAgent']")
	WebElement  Purchase_Method;
	
	@FindBy (xpath = "//*[@name='toCompleteApplication']")
	WebElement Fillng_By;
	
	@FindBy (xpath = "//button[contains(text(),'Next Step')]")
	WebElement Next_Button;
	
	
	
	public String getValue() {
		Select select = new Select(Applicant_Type);
		WebElement option = select.getFirstSelectedOption();
		String Value = option.getText();
		return Value;
	}

	public void create_Application_CreditReport() {
	Select select = new Select(Application_Type);
	select.selectByValue("0");
	
	WebDriverWait wait = new WebDriverWait(driver, 100);
	wait.until(ExpectedConditions.visibilityOf(Purchase_Method));
	Select select1 = new Select(Purchase_Method);
	select1.selectByVisibleText("Agent to Purchase");
	
	Select select2 = new Select(Fillng_By);
	select2.selectByVisibleText("I want to enter the full details of applicant now");
	
	Next_Button.sendKeys(Keys.RETURN);
	
		
	}


}
