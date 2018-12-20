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
public class CreateApplication {
	WebDriver driver;
	public CreateApplication(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(xpath = "//*[@name='officeName']")
	WebElement Office;
	
	@FindBy(xpath = "//*[@name='applicationType']")
	WebElement ApplicationType;
	
	@FindBy(xpath = "//*[@name='reportPurchaseMethod']")
	WebElement PurchaseMethod;
	
	@FindBy(xpath = "//*[@name='toCompleteApplication']")
	WebElement FillBy;
	
	@FindBy(xpath = "//*[@name='propertyAddress']")
	WebElement PropertyAddress;
	
	@FindBy (xpath = "//button[contains(text(),'Find')][@aria-controls='find']")
	WebElement Find;
	
	@FindBy(xpath = "//*[@id='addressList']")
	WebElement AddList;
	
	@FindBy(xpath = "//*[@name='date']")
	WebElement MoveInDate;
	
	@FindBy(xpath = "//*[@name='tenancyPeriod']")
	WebElement TenancyPeriod;
	
	@FindBy(xpath = "//*[@name='totalMonthlyRent']")
	WebElement MonthlyRent;
	
	@FindBy(xpath = "//*[@name='rentShareAllocation']")
	WebElement RentShareAllocation;
	
	@FindBy(xpath = "//*[@id='linksendYes']")
	WebElement LLDashEnable;
	
	@FindBy(xpath = "//*[@id='linksendNo']")
	WebElement LLDashDisable;
	
	@FindBy(xpath = "//*[@ng-model='createApplication.landlordTitle']")
	WebElement LLTitle;
	
	@FindBy(xpath = "//*[@name='landLordForeName']")
	WebElement LLForeName;
	
	@FindBy(xpath = "//*[@name='landLordSurname']")
	WebElement LLSurename;
	
	@FindBy(xpath = "//*[@name='landLordPostalCode']")
	WebElement LLPostalCode;
	
	@FindBy(xpath = "//*[@name='landLordPhoneNo']")
	WebElement LLPhone;
	
	@FindBy(xpath = "//*[@name='landLordMobileNo']")
	WebElement LLMobileNo;

	@FindBy(xpath = "//*[@name='landLordEmail']")
	WebElement LLEmail;

	@FindBy(xpath = "//*[contains(text(),'Next Step')]")
	WebElement Nextbutton;

	/*@FindBy(xpath = "//*[@class='monthselect']")
	WebElement month;

	@FindBy(xpath = "//*[@class='yearselect']")
	WebElement Year;
	*/
	@FindBy(xpath = "html/body/section/section/div/div/ng-view/div/div/div/form/div[1]")
	WebElement Date;

	@FindBy(xpath = "//*[@name='depositAmount']")
	WebElement DepositAmount;
	
	@FindBy(xpath = "//*[@name='263']")
	WebElement EnableHoldingDeposit;
	
	@FindBy(xpath = "//*[@name='264']")
	WebElement DisableHoldingDeposit;
	
	@FindBy(xpath = "//*[@name='additionalFund']")
	WebElement AdditionalFunds;
	
	@FindBy(xpath = "//*[@name='paymentReference']")
	WebElement PaymentRef;
	
	

	//Create Full report Application and Agent Fill
	public void CreateApplication_FullReport_AgentPurchase_Agent_Fill() 
	{
	WebDriverWait wait = new WebDriverWait (driver,100); 
	Select officedrp = new Select(Office);
	officedrp.selectByVisibleText("Mumbai");
	
	wait.until(ExpectedConditions.visibilityOf(ApplicationType));
	Select AppType = new Select(ApplicationType);
	AppType.selectByVisibleText("Full Profile");

	wait.until(ExpectedConditions.visibilityOf(PurchaseMethod));
	Select PurType = new Select(PurchaseMethod);
	PurType.selectByVisibleText("Agent to Purchase");
	
	Select Filling = new Select(FillBy);
	Filling.selectByVisibleText("I want to enter the full details of applicant now");
	
	
	PropertyAddress.sendKeys("L118LZ");
	Find.click();
	wait.until(ExpectedConditions.visibilityOf(AddList));
	Select List = new Select(AddList);
	List.selectByVisibleText("30 Broad Lane Norris Green Liverpool");
	
	MoveInDate.sendKeys("31/07/2018");
	MoveInDate.click();
	
	Date.click();
	wait.until(ExpectedConditions.visibilityOf(TenancyPeriod));
	Select Period = new Select(TenancyPeriod);
	Period.selectByVisibleText("36 months");
	
	MonthlyRent.sendKeys("1500");
	
	//JavascriptExecutor js2 = (JavascriptExecutor)driver;
	//js2.executeScript("arguments[0].click();",DisableHoldingDeposit);
	
	//AdditionalFunds.sendKeys("1450");
	
	
	//LLDashDisable.sendKeys(Keys.RETURN);
	JavascriptExecutor js1 = (JavascriptExecutor)driver;
	js1.executeScript("arguments[0].click();",LLDashDisable);
	Nextbutton.sendKeys(Keys.RETURN);
	}

////Create Full report Application and Tenat to Purchase 
	public void CreateApplication_FullReport_TeanatPurchase_Agent_Fill() 
	{
	WebDriverWait wait = new WebDriverWait (driver,100); 
	Select officedrp = new Select(Office);
	officedrp.selectByVisibleText("Mumbai");
	
	wait.until(ExpectedConditions.visibilityOf(ApplicationType));
	Select AppType = new Select(ApplicationType);
	AppType.selectByVisibleText("Full Profile");

	wait.until(ExpectedConditions.visibilityOf(PurchaseMethod));
	Select PurType = new Select(PurchaseMethod);
	PurType.selectByVisibleText("Tenant to Purchase");
	
	Select Filling = new Select(FillBy);
	Filling.selectByVisibleText("Applicant to complete their own application online");
	
	
	PropertyAddress.sendKeys("L118LZ");
	Find.click();
	wait.until(ExpectedConditions.visibilityOf(AddList));
	Select List = new Select(AddList);
	List.selectByVisibleText("30 Broad Lane Norris Green Liverpool");
	
	MoveInDate.sendKeys("31/07/2018");
	MoveInDate.click();
	
	Date.click();
	wait.until(ExpectedConditions.visibilityOf(TenancyPeriod));
	Select Period = new Select(TenancyPeriod);
	Period.selectByVisibleText("36 months");
	
	MonthlyRent.sendKeys("1500");
	
	//JavascriptExecutor js2 = (JavascriptExecutor)driver;
	//js2.executeScript("arguments[0].click();",DisableHoldingDeposit);
	
	//AdditionalFunds.sendKeys("1450");
	
	
	//LLDashDisable.sendKeys(Keys.RETURN);
	JavascriptExecutor js1 = (JavascriptExecutor)driver;
	js1.executeScript("arguments[0].click();",LLDashDisable);
	Nextbutton.sendKeys(Keys.RETURN);
	}




//Create Credit report Application and Agent Fill
	public void CreateApplication_CreditReport_AgentPurchase_Agent_Fill() 
	{
		JavascriptExecutor js1 = (JavascriptExecutor)driver;
		WebDriverWait wait = new WebDriverWait (driver,100); 
		Select officedrp = new Select(Office);
		officedrp.selectByVisibleText("Mumbai");
		
		wait.until(ExpectedConditions.visibilityOf(ApplicationType));
		Select AppType = new Select(ApplicationType);
		AppType.selectByVisibleText("Credit Report Only");

		wait.until(ExpectedConditions.visibilityOf(PurchaseMethod));
		Select PurType = new Select(PurchaseMethod);
		PurType.selectByVisibleText("Agent to Purchase");
		
		Select Filling = new Select(FillBy);
		Filling.selectByVisibleText("I want to enter the full details of applicant now");
		
		
		PropertyAddress.sendKeys("L118LZ");
		wait.until(ExpectedConditions.elementToBeClickable(Find));
		js1.executeScript("arguments[0].click();",Find);
		//Find.click();
		wait.until(ExpectedConditions.visibilityOf(AddList));
		Select List = new Select(AddList);
		List.selectByVisibleText("30 Broad Lane Norris Green Liverpool");
		
		MoveInDate.sendKeys("31/07/2018");
		MoveInDate.click();
		
		Date.click();
		wait.until(ExpectedConditions.visibilityOf(TenancyPeriod));
		Select Period = new Select(TenancyPeriod);
		Period.selectByVisibleText("36 months");
		
		MonthlyRent.sendKeys("1500");
		js1.executeScript("arguments[0].click();",LLDashDisable);
		Nextbutton.sendKeys(Keys.RETURN);
	}
}
