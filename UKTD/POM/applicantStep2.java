/**
 * 
 */
package POM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author swapnil
 *
 */
public class applicantStep2 //extends CommonMethods
{
	WebDriver driver;
	//int i;
	public applicantStep2(WebDriver driver)
	{
		this.driver=driver;
	}	
//Common
	
	@FindBy(xpath ="//*[@name='currentAccmStatus']")
	WebElement AccStatus;
	
	@FindBy(xpath ="//*[@id='yesRented']")
	WebElement RentedLast6MonthYes;
	
	@FindBy(xpath ="//*[@id='notRented']")
	WebElement RentedLast6MonthNo;
	
	@FindBy (xpath = "//*[contains(text(),'Update')][@ng-click='submitApplicationStep2Form();']")
	WebElement UpdateButton;
	
	@FindBy (xpath = "//*[@id='progressing']")
	WebElement loader;
	
	@FindBy(xpath = "html/body/section/section/div/div/ng-view/div/div/div/form/div[1]")
	WebElement Date;
	
	@FindBy (xpath = "//*[@id='lettingPay']")
	WebElement LettingAgent;
	
	@FindBy (xpath = "//*[@id='landLordPay']")
	WebElement landlord;
	
	

	//F&F
	
	@FindBy (xpath = "//*[@name='familyContactTitle']")
	WebElement ContactTitle;

	@FindBy (xpath = "//*[@name='friendFirstName']")
	WebElement ContactName;

	@FindBy (xpath = "//*[@name='friendSurName']")
	WebElement ContactSurName;

	@FindBy (xpath = "//*[@name='friendPhoneNum']")
	WebElement ContactPhone;

	@FindBy (xpath = "//*[@name='friendMobileNum']")
	WebElement ContactMobile;

	@FindBy (xpath = "//*[@name='friendEmail']")
	WebElement ContactEmail;
	
	
	
		public void HomeownerNo() {
		WebDriverWait wait = new WebDriverWait(driver,100);
		wait.until(ExpectedConditions.invisibilityOf(loader));
		wait.until(ExpectedConditions.visibilityOf(AccStatus));
		Select statusdrp =new Select(AccStatus);
		statusdrp.selectByVisibleText("Currently a Homeowner");
		
		JavascriptExecutor js1 = (JavascriptExecutor)driver;
		js1.executeScript("arguments[0].click();",RentedLast6MonthNo);
		
		CommonMethods CM = PageFactory.initElements(driver,CommonMethods.class);
		
		CM.enter_current_address_info();
		
		CM.enter_bank_info();
		UpdateButton.sendKeys(Keys.RETURN);
	
}
		
	public void FandF_Yes_LA(){
		WebDriverWait wait = new WebDriverWait(driver,100);
		
		wait.until(ExpectedConditions.invisibilityOf(loader));
		wait.until(ExpectedConditions.visibilityOf(AccStatus));
		Select statusdrp =new Select(AccStatus);
		statusdrp.selectByVisibleText("Currently Living with friends or family");
		
		wait.until(ExpectedConditions.visibilityOf(RentedLast6MonthYes));
		
		JavascriptExecutor js1 = (JavascriptExecutor)driver;
		js1.executeScript("arguments[0].click();",RentedLast6MonthYes);
		
		wait.until(ExpectedConditions.visibilityOf(LettingAgent));
		js1.executeScript("arguments[0].click();",LettingAgent);


		CommonMethods CM = PageFactory.initElements(driver,CommonMethods.class);
		CM.enter_current_address_info();
		CM.address_you_were_renting();
		CM.letting_agent_section();
		CM.enter_accommodation_details();
		CM.enter_bank_info();
		UpdateButton.sendKeys(Keys.RETURN);
	}
	
	
	public void FandF_Yes_LL() {
		WebDriverWait wait = new WebDriverWait(driver,100);
		
		wait.until(ExpectedConditions.invisibilityOf(loader));
		wait.until(ExpectedConditions.visibilityOf(AccStatus));
		Select statusdrp =new Select(AccStatus);
		statusdrp.selectByVisibleText("Currently Living with friends or family");
		
		wait.until(ExpectedConditions.visibilityOf(RentedLast6MonthYes));
		
		JavascriptExecutor js1 = (JavascriptExecutor)driver;
		js1.executeScript("arguments[0].click();",RentedLast6MonthYes);
		
		wait.until(ExpectedConditions.visibilityOf(LettingAgent));
		js1.executeScript("arguments[0].click();",landlord);


		CommonMethods CM = PageFactory.initElements(driver,CommonMethods.class);
		CM.enter_current_address_info();
		CM.address_you_were_renting();
		CM.landlord_section();
		CM.enter_accommodation_details();
		CM.enter_bank_info();
		UpdateButton.sendKeys(Keys.RETURN);
	}
	
	public void FandF_No() {
		WebDriverWait wait = new WebDriverWait(driver,100);
		
		wait.until(ExpectedConditions.invisibilityOf(loader));
		wait.until(ExpectedConditions.visibilityOf(AccStatus));
		Select statusdrp =new Select(AccStatus);
		statusdrp.selectByVisibleText("Currently Living with friends or family");
		
		wait.until(ExpectedConditions.visibilityOf(RentedLast6MonthNo));
		
		JavascriptExecutor js1 = (JavascriptExecutor)driver;
		js1.executeScript("arguments[0].click();",RentedLast6MonthNo);
		
		CommonMethods CM = PageFactory.initElements(driver,CommonMethods.class);
		CM.enter_current_address_info();
		
		Select FriendTitle = new Select(ContactTitle);
		FriendTitle.selectByVisibleText("Dr");
		ContactName.sendKeys("Rutuja");
		ContactSurName.sendKeys("Patil");
		ContactPhone.sendKeys("02422261071");
		ContactMobile.sendKeys("9604328562");
		ContactEmail.sendKeys("sb@bits.com");
		
		CM.enter_bank_info();
		UpdateButton.sendKeys(Keys.RETURN);
		}
	
	public void Currently_Renting_LA() {
		WebDriverWait wait = new WebDriverWait(driver,100);
		
		wait.until(ExpectedConditions.invisibilityOf(loader));
		wait.until(ExpectedConditions.visibilityOf(AccStatus));
		Select statusdrp =new Select(AccStatus);
		statusdrp.selectByVisibleText("Currently Renting");
		
		JavascriptExecutor js1 = (JavascriptExecutor)driver;		
		wait.until(ExpectedConditions.visibilityOf(LettingAgent));
		js1.executeScript("arguments[0].click();",LettingAgent);


		CommonMethods CM = PageFactory.initElements(driver,CommonMethods.class);
		CM.enter_current_address_info();
		CM.letting_agent_section();
		CM.enter_accommodation_details();
		CM.enter_bank_info();
		UpdateButton.sendKeys(Keys.RETURN);
		}
	
	public void Currently_Renting_LL() {
		WebDriverWait wait = new WebDriverWait(driver,100);
		
		wait.until(ExpectedConditions.invisibilityOf(loader));
		wait.until(ExpectedConditions.visibilityOf(AccStatus));
		Select statusdrp =new Select(AccStatus);
		statusdrp.selectByVisibleText("Currently Renting");
		
		JavascriptExecutor js1 = (JavascriptExecutor)driver;		
		wait.until(ExpectedConditions.visibilityOf(landlord));
		js1.executeScript("arguments[0].click();",landlord);

		CommonMethods CM = PageFactory.initElements(driver,CommonMethods.class);
		CM.enter_current_address_info();
		CM.landlord_section();
		CM.enter_accommodation_details();
		CM.enter_bank_info();
		UpdateButton.sendKeys(Keys.RETURN);
		}
	
	public void Homeowner_Yes_LA() {
		WebDriverWait wait = new WebDriverWait(driver,100);
		wait.until(ExpectedConditions.invisibilityOf(loader));
		wait.until(ExpectedConditions.visibilityOf(AccStatus));
		Select statusdrp =new Select(AccStatus);
		statusdrp.selectByVisibleText("Currently a Homeowner");
		
		JavascriptExecutor js1 = (JavascriptExecutor)driver;
		js1.executeScript("arguments[0].click();",RentedLast6MonthYes);
		wait.until(ExpectedConditions.visibilityOf(LettingAgent));
		js1.executeScript("arguments[0].click();",LettingAgent);
		
		CommonMethods CM = PageFactory.initElements(driver,CommonMethods.class);
		
		CM.enter_current_address_info();
		CM.address_you_were_renting();
		CM.letting_agent_section();
		CM.enter_accommodation_details();
		CM.enter_bank_info();
		UpdateButton.sendKeys(Keys.RETURN);
		}

	public void Homeowner_Yes_LL() {
		WebDriverWait wait = new WebDriverWait(driver,100);
		wait.until(ExpectedConditions.invisibilityOf(loader));
		wait.until(ExpectedConditions.visibilityOf(AccStatus));
		Select statusdrp =new Select(AccStatus);
		statusdrp.selectByVisibleText("Currently a Homeowner");
		
		JavascriptExecutor js1 = (JavascriptExecutor)driver;
		js1.executeScript("arguments[0].click();",RentedLast6MonthYes);
		wait.until(ExpectedConditions.visibilityOf(landlord));
		js1.executeScript("arguments[0].click();",landlord);
		
		CommonMethods CM = PageFactory.initElements(driver,CommonMethods.class);
		
		CM.enter_current_address_info();
		CM.address_you_were_renting();
		CM.landlord_section();
		CM.enter_accommodation_details();
		CM.enter_bank_info();
		UpdateButton.sendKeys(Keys.RETURN);
		}

	
	
public  void appStep2(int i) { 	

	WebDriverWait wait = new WebDriverWait(driver,100);

	
	if(i==1) //CRLA
{	
	wait.until(ExpectedConditions.invisibilityOf(loader));
	wait.until(ExpectedConditions.visibilityOf(AccStatus));
	Select statusdrp =new Select(AccStatus);
	statusdrp.selectByVisibleText("Currently Renting");
	
	JavascriptExecutor js1 = (JavascriptExecutor)driver;		
	wait.until(ExpectedConditions.visibilityOf(LettingAgent));
	js1.executeScript("arguments[0].click();",LettingAgent);


	CommonMethods CM = PageFactory.initElements(driver,CommonMethods.class);
	CM.enter_current_address_info();
	CM.letting_agent_section();
	CM.enter_accommodation_details();
	CM.enter_bank_info();
	UpdateButton.sendKeys(Keys.RETURN);
}



if(i==2) //CRLL 
{
	wait.until(ExpectedConditions.invisibilityOf(loader));
	wait.until(ExpectedConditions.visibilityOf(AccStatus));
	Select statusdrp =new Select(AccStatus);
	statusdrp.selectByVisibleText("Currently Renting");
	
	JavascriptExecutor js1 = (JavascriptExecutor)driver;		
	wait.until(ExpectedConditions.visibilityOf(landlord));
	js1.executeScript("arguments[0].click();",landlord);

	CommonMethods CM = PageFactory.initElements(driver,CommonMethods.class);
	CM.enter_current_address_info();
	CM.landlord_section();
	CM.enter_accommodation_details();
	CM.enter_bank_info();
	UpdateButton.sendKeys(Keys.RETURN);
	
}



if(i==3) //HO-Yes-LA
{
	wait.until(ExpectedConditions.invisibilityOf(loader));
	wait.until(ExpectedConditions.visibilityOf(AccStatus));
	Select statusdrp =new Select(AccStatus);
	statusdrp.selectByVisibleText("Currently a Homeowner");
	
	JavascriptExecutor js1 = (JavascriptExecutor)driver;
	js1.executeScript("arguments[0].click();",RentedLast6MonthYes);
	wait.until(ExpectedConditions.visibilityOf(LettingAgent));
	js1.executeScript("arguments[0].click();",LettingAgent);
	
	CommonMethods CM = PageFactory.initElements(driver,CommonMethods.class);
	
	CM.enter_current_address_info();
	CM.address_you_were_renting();
	CM.letting_agent_section();
	CM.enter_accommodation_details();
	CM.enter_bank_info();
	UpdateButton.sendKeys(Keys.RETURN);

}



if(i==4)//HO-Yes-LL 
	{
	wait.until(ExpectedConditions.invisibilityOf(loader));
	wait.until(ExpectedConditions.visibilityOf(AccStatus));
	Select statusdrp =new Select(AccStatus);
	statusdrp.selectByVisibleText("Currently a Homeowner");
	
	JavascriptExecutor js1 = (JavascriptExecutor)driver;
	js1.executeScript("arguments[0].click();",RentedLast6MonthYes);
	wait.until(ExpectedConditions.visibilityOf(landlord));
	js1.executeScript("arguments[0].click();",landlord);
	
	CommonMethods CM = PageFactory.initElements(driver,CommonMethods.class);
	
	CM.enter_current_address_info();
	CM.address_you_were_renting();
	CM.landlord_section();
	CM.enter_accommodation_details();
	CM.enter_bank_info();
	UpdateButton.sendKeys(Keys.RETURN);	
}



if(i==5) //HO-No
{
	wait.until(ExpectedConditions.invisibilityOf(loader));
	wait.until(ExpectedConditions.visibilityOf(AccStatus));
	Select statusdrp =new Select(AccStatus);
	statusdrp.selectByVisibleText("Currently a Homeowner");
	
	JavascriptExecutor js1 = (JavascriptExecutor)driver;
	js1.executeScript("arguments[0].click();",RentedLast6MonthNo);
	
	CommonMethods CM = PageFactory.initElements(driver,CommonMethods.class);
	
	CM.enter_current_address_info();
	
	CM.enter_bank_info();
	UpdateButton.sendKeys(Keys.RETURN);	
}



if(i==6) //F&F-Yes-LA
{
	wait.until(ExpectedConditions.invisibilityOf(loader));
	wait.until(ExpectedConditions.visibilityOf(AccStatus));
	Select statusdrp =new Select(AccStatus);
	statusdrp.selectByVisibleText("Currently Living with friends or family");
	
	wait.until(ExpectedConditions.visibilityOf(RentedLast6MonthYes));
	
	JavascriptExecutor js1 = (JavascriptExecutor)driver;
	js1.executeScript("arguments[0].click();",RentedLast6MonthYes);
	
	wait.until(ExpectedConditions.visibilityOf(LettingAgent));
	js1.executeScript("arguments[0].click();",LettingAgent);


	CommonMethods CM = PageFactory.initElements(driver,CommonMethods.class);
	CM.enter_current_address_info();
	CM.address_you_were_renting();
	CM.letting_agent_section();
	CM.enter_accommodation_details();
	CM.enter_bank_info();
	UpdateButton.sendKeys(Keys.RETURN);
		
}



 if(i==7) //F&F-Yes-LL
 {
		wait.until(ExpectedConditions.invisibilityOf(loader));
		wait.until(ExpectedConditions.visibilityOf(AccStatus));
		Select statusdrp =new Select(AccStatus);
		statusdrp.selectByVisibleText("Currently Living with friends or family");
		
		wait.until(ExpectedConditions.visibilityOf(RentedLast6MonthYes));
		
		JavascriptExecutor js1 = (JavascriptExecutor)driver;
		js1.executeScript("arguments[0].click();",RentedLast6MonthYes);
		
		wait.until(ExpectedConditions.visibilityOf(LettingAgent));
		js1.executeScript("arguments[0].click();",landlord);


		CommonMethods CM = PageFactory.initElements(driver,CommonMethods.class);
		CM.enter_current_address_info();
		CM.address_you_were_renting();
		CM.landlord_section();
		CM.enter_accommodation_details();
		CM.enter_bank_info();
		UpdateButton.sendKeys(Keys.RETURN);	 
 }

 
 
 if(i==8) //F&F-No
 {
	 wait.until(ExpectedConditions.invisibilityOf(loader));
		wait.until(ExpectedConditions.visibilityOf(AccStatus));
		Select statusdrp =new Select(AccStatus);
		statusdrp.selectByVisibleText("Currently Living with friends or family");
		
		wait.until(ExpectedConditions.visibilityOf(RentedLast6MonthNo));
		
		JavascriptExecutor js1 = (JavascriptExecutor)driver;
		js1.executeScript("arguments[0].click();",RentedLast6MonthNo);
		
		CommonMethods CM = PageFactory.initElements(driver,CommonMethods.class);
		CM.enter_current_address_info();
		
		Select FriendTitle = new Select(ContactTitle);
		FriendTitle.selectByVisibleText("Dr");
		ContactName.sendKeys("Rutuja");
		ContactSurName.sendKeys("Patil");
		ContactPhone.sendKeys("02422261071");
		ContactMobile.sendKeys("9604328562");
		ContactEmail.sendKeys("sb@bits.com");
		
		CM.enter_bank_info();
		UpdateButton.sendKeys(Keys.RETURN);
		
 }
}
	
	
}

