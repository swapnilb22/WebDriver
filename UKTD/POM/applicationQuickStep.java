package POM;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class applicationQuickStep 

{
WebDriver driver;
	
	public applicationQuickStep (WebDriver driver) 
	{
		this.driver = driver;
	}
	
	
	@FindBy (xpath = "//*[@name='applicantType']")
	WebElement AppType;
	@FindBy (xpath = "//*[@name='rentPercentage']")
	WebElement Rentshare;
	
	@FindBy (xpath = "//*[@name= 'personalTitle']")
	WebElement Title;
	
	@FindBy (xpath = "//*[@name= 'personalFirstName']")
	WebElement FirstName;
	
	@FindBy (xpath = "//*[@name= 'personalSurName']")
	WebElement Surname;
	
	@FindBy (xpath = "//*[@name='applicantMobile']")
	WebElement Mobile;
	
	@FindBy (xpath = "//*[@id='applicantEmailID']")
	WebElement Email;
	
	@FindBy (xpath = "//*[@name='applicantConfirmEmail']")
	WebElement ConfirmEmail;
	
	@FindBy (xpath ="//*[@ng-click='submitAppliactionQuickStep()']")
	WebElement NextButton;
	
	public void FillQuictStep() //throws Exception
	{
		WebDriverWait wait = new WebDriverWait(driver, 100);
		Rentshare.clear();
		Rentshare.sendKeys("100");
		Select select = new Select(Title);
		select.selectByVisibleText("Mr");
		FirstName.sendKeys("Swapnil");
		Surname.sendKeys("Bhaksar");
		Mobile.sendKeys("+91-9604328562");
		Email.sendKeys("swapnilbhaskar@benchmarkitsolutions.com");
		ConfirmEmail.sendKeys("swapnilbhaskar@benchmarkitsolutions.com");
		NextButton.sendKeys(Keys.RETURN);
}
}