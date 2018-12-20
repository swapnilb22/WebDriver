/**
 * 
 */
package POM;

import org.openqa.selenium.JavascriptExecutor;
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
public class applicantStep3 {
	WebDriver driver;
	
	public applicantStep3(WebDriver driver) {
		this.driver=driver;
	}

	@FindBy (xpath = "//*[@id ='titleid']")
	WebElement KinTitle;

	@FindBy (xpath = "//*[@name='firstName']")
	WebElement FirstName;

	@FindBy (xpath = "//*[@name='surname']")
	WebElement Surname;

	@FindBy (xpath = "//*[@name='postCode']")
	WebElement PostCode;

	@FindBy (xpath = "//*[contains(text(),'Find')]")
	WebElement FindButton;
	
	@FindBy (xpath = "//*[@id='addressList']")
	WebElement Addresslist;

	@FindBy (xpath = "//*[@name ='phone']")
	WebElement Phone;

	@FindBy (xpath = "//*[@name ='mobile']")
	WebElement Mobile;

	@FindBy (xpath = "//*[@name ='email']")
	WebElement Email;

	@FindBy (xpath = "//*[@name='relationship']")
	WebElement Relationship;

	@FindBy (xpath = "//*[@name='yearsKnown']")
	WebElement YearsKnown;
	
	@FindBy (xpath = "//*[@type='checkbox']")
	WebElement consentCheckbox;
	
	@FindBy(xpath="//*[@type='submit']")
	WebElement nextButton;
	
	@FindBy (xpath = "//*[@id='progressing']")
	WebElement loader;
	
	
	
	@FindBy(xpath = "html/body/section/section/div/div/ng-view/div/div/div/form/div[1]")
	WebElement Date;

	
public void fillstep3(){
	WebDriverWait wait = new WebDriverWait(driver,200);
//	wait.until(ExpectedConditions.visibilityOf(KinTitle));
	wait.until(ExpectedConditions.invisibilityOf(loader));
	
	wait.until(ExpectedConditions.visibilityOf(KinTitle));
	
/*	if(KinTitle.isEnabled())
	{
	Select titledrp = new Select(KinTitle);
	titledrp.selectByVisibleText("Mrs");
	}
	*/
	
	FirstName.sendKeys("FirstName");
	Surname.sendKeys("Khan");
	PostCode.sendKeys("pr56bl");
	JavascriptExecutor js1 = (JavascriptExecutor)driver;
	js1.executeScript("arguments[0].click();",FindButton);
	//FindButton.sendKeys(Keys.RETURN);
	wait.until(ExpectedConditions.visibilityOf(Addresslist));
	Select select2 =new Select(Addresslist);
	select2.selectByVisibleText("UK Tennant Data Unit 9-10 South Preston Office Village Cuerden Way Bamber Bridge Preston");
	Phone.sendKeys("02426261552");
	Mobile.sendKeys("9604328562");
	Email.sendKeys("vk@bits.com");
	Relationship.sendKeys("Friends");
	YearsKnown.clear();
	YearsKnown.sendKeys("4");

	if(!consentCheckbox.isSelected()) 
		{
		js1.executeScript("arguments[0].click();",consentCheckbox);	
	
		}
	if(KinTitle.isEnabled())
	{
	Select titledrp = new Select(KinTitle);
	titledrp.selectByVisibleText("Mrs");
	}
	
	
	nextButton.sendKeys(Keys.RETURN);
	
}


}
