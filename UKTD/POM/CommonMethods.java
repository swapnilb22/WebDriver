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
	public class CommonMethods {
	WebDriver driver;
	public CommonMethods() {
		
	}
	
	public CommonMethods(WebDriver driver) {
		this.driver = driver;
	}
//BankInfo
	@FindBy (xpath = "//*[@id='bankShortCode1']")
	WebElement SortCode;
	
	@FindBy (xpath = "//*[@id='bankAccNo']")
	WebElement AccNo;
	
//CurrentAcc	
	@FindBy (xpath = "//*[@name='currentAccomPostalCode']")
	WebElement CurrentAdd;
	
	@FindBy (xpath = "//*[contains(text(),'Find')]")
	WebElement FindButton;
	
	@FindBy (xpath = "//*[@id='currentAccomaddressList']")
	WebElement AddressList;
	
	@FindBy (xpath = "//*[@name='currentAccomProposedMoveDate']")
	WebElement CurrentAddMoveIn;
	
	@FindBy(xpath = "html/body/section/section/div/div/ng-view/div/div/div/form/div[1]")
	WebElement Date;


	@FindBy (xpath = "//*[@id='progressing']")
	WebElement loader;

	
//FinishStep
	@FindBy (xpath = "//button[contains(text(),'Finish')]")
	WebElement FinishButton;
	
	@FindBy(xpath = "//button[contains(text(),'Add')]")
	WebElement AddAnother;
	
	@FindBy(xpath = "//button[@type='button'][contains(text(),'Finish')][1]")
	WebElement PopupFinish;
	
	@FindBy(xpath = "html/body/div[6]/div/div/div[3]/button[1]")
	WebElement PopupCancel;
	
	
	//PrevAccomodationBlock	

		@FindBy (xpath = "//*[@name='prevAccomPostalCode']")
		WebElement PrevAccPostCode;

		@FindBy (xpath = "//button[contains(text(),'Find')][@aria-controls='find3']")
		WebElement PrevAccPostCodeFind;

		@FindBy (xpath = "//*[@id='prevAccomAddressList']")
		WebElement PrevAccAddList;

		@FindBy (xpath = "//*[@name='prevAccomProposedMoveDate']")
		WebElement PrevAccProposeMoveIn;
		
		//AccommodationDetails
	
		@FindBy (xpath = "//*[@name='accomMonthlyRent']")
		WebElement MonthlyRent;

		@FindBy (xpath = "//*[@name='rentPayMethod']")
		WebElement RentPayment;
			
		
		//Letting Agent	
		
		@FindBy (xpath = "//*[@name='lettingAgentName']")
		WebElement LettingAgentName;
		

		@FindBy (xpath = "//*[@name='lettingAgentPostCode']")
		WebElement LettingAgentPostCode;
		
		@FindBy (xpath = "//button[contains(text(),'Find')][@aria-controls='find4']")
		WebElement LAFindButton;
		
		@FindBy (xpath = "//*[@id='lettingAgentAddressList']")
		WebElement LettingAgentAddList;	
		
		@FindBy (xpath = "//*[@placeholder='Enter Fax']")
		WebElement Fax;
		
		@FindBy (xpath = "//*[@name='lettingAgentTitle']")
		WebElement LettingAgentTitle;
		
		@FindBy (xpath = "//*[@name='lettingAgentFirstName']")
		WebElement AgentFirstName;
		
		@FindBy (xpath = "//*[@name='lettingAgentSurName']")
		WebElement AgentSurName;

		@FindBy (xpath = "//*[@name='lettingAgentPhone']")
		WebElement AgentPhone;

		@FindBy (xpath = "//*[@name='lettingAgentMobile']")
		WebElement AgentMobile;

		@FindBy (xpath = "//*[@name='lettingAgentEmailID']")
		WebElement AgentEmail;

		//LandLord	

		@FindBy (xpath = "//*[@name='landLordPostalCode']")
		WebElement LLpostcode;
		
		@FindBy (xpath = "//button[contains(text(),'Find')][@aria-controls='find5']")
		WebElement LLpostcodeFind;
		
		@FindBy (xpath = "//*[@id='landlordAddressList']")
		WebElement LLAddlist;
		
		@FindBy (xpath = "//*[@name='landLordTitle']")
		WebElement LLTitle;
		
		@FindBy (xpath = "//*[@name='landLordFirstName']")
		WebElement LLFirstName;
		
		@FindBy (xpath = "//*[@name='landLordSurname']")
		WebElement LLSurname;
		
		@FindBy (xpath = "//*[@name='landLordPhone']")
		WebElement LLPhone;
		
		@FindBy (xpath = "//*[@name='landLordMobile']")
		WebElement LLMobile;
		
		@FindBy (xpath = "//*[@name='landLordEmailID']")
		WebElement LLEmail;
		
		@FindBy (xpath = "//*[@id='lettingPay']")
		WebElement lettingAgent;
		
		//Address Renting	
		
		@FindBy (xpath = "//*[@name='prevMovedIn']")
		WebElement PrevMoveInDate;
		
		@FindBy (xpath = "//*[@name='prevMovedOut']")
		WebElement PrevMoveOutDate;
		
		@FindBy (xpath = "//*[@name='prevMovedPostCode']")
		WebElement PrevAddPostCode;
		
		@FindBy (xpath = "//button[contains(text(),'Find')][@aria-controls='find2']")
		WebElement PrevAddPostCodeFind;
		
		@FindBy (xpath = "//*[@id='prevMovedAddressList']")
		WebElement PrevAddList;
		
		
		
	
	public void landlord_section() {
		WebDriverWait wait = new WebDriverWait(driver, 100);
		LLpostcode.sendKeys("L118LZ");
		LLpostcodeFind.click();
		wait.until(ExpectedConditions.visibilityOf(LLAddlist));
		//wait.until(ExpectedConditions.invisibilityOf(loader));
		Select LLList = new Select(LLAddlist);
		LLList.selectByVisibleText("30 Broad Lane Norris Green Liverpool");
		Fax.sendKeys("123456789");
		Select LLTitleList = new Select(LLTitle);
		LLTitleList.selectByVisibleText("Mrs");
		LLFirstName.sendKeys("Lucy");
		LLSurname.sendKeys("Petrus");
		LLPhone.sendKeys("9604328562");
		LLMobile.sendKeys("8855699878");
		LLEmail.sendKeys("amitbaghel@benchmarkitsolutions.com");
	} 
		
		

	public void letting_agent_section() 
	{
		WebDriverWait wait = new WebDriverWait(driver, 100);
		LettingAgentName.sendKeys("X1 Lettings");
		LettingAgentPostCode.sendKeys("AB117UE");
		LAFindButton.click();
		wait.until(ExpectedConditions.visibilityOf(LettingAgentAddList));
	Select LAList = new Select(LettingAgentAddList);
	LAList.selectByVisibleText("6 Deemount Gardens Aberdeen");
	Fax.sendKeys("0000000000");
	Select LATitle = new Select(LettingAgentTitle);
	LATitle.selectByVisibleText("Miss");
	AgentFirstName.sendKeys("Priyanka");
	AgentSurName.sendKeys("Gaikwad");
	AgentPhone.sendKeys("020555478");
	AgentMobile.sendKeys("9503999099");
	AgentEmail.sendKeys("priyankagaikwad@benchmarkitsoluions.com");
	
	}	
		
	
		
	public void enter_accommodation_details() {
		MonthlyRent.sendKeys("1000");
		Select type =new Select(RentPayment);
		type.selectByVisibleText("Direct Debit");
		}	
		
		
	
	public void enter_bank_info() {
		SortCode.sendKeys("232323");
		AccNo.sendKeys("00000000");
	}
	
	
	
	public void enter_current_address_info() {
		WebDriverWait wait = new WebDriverWait(driver, 100);
		CurrentAdd.sendKeys("M36GB");
		//FindButton.click();
		JavascriptExecutor js1 = (JavascriptExecutor)driver;		
		js1.executeScript("arguments[0].click();",FindButton);
		wait.until(ExpectedConditions.visibilityOf(AddressList));
		Select select2 =new Select(AddressList);
		select2.selectByVisibleText("Apartment 2 Block B Alto Sillavan Way Salford");
		wait.until(ExpectedConditions.invisibilityOf(loader));
		CurrentAddMoveIn.clear();
		CurrentAddMoveIn.sendKeys("01/01/2011");
		//Date.click();
	}
	
	
	
	

	
	public void finishApplication() {
		WebDriverWait wait = new WebDriverWait(driver, 100);

		FinishButton.sendKeys(Keys.RETURN);
		wait.until(ExpectedConditions.visibilityOf(PopupFinish));
		PopupFinish.sendKeys(Keys.RETURN);
		}
	
	
	public void previousAccBlock() {
	WebDriverWait wait = new WebDriverWait(driver, 100);
	PrevAccPostCode.sendKeys("M36GB");
	PrevAccPostCodeFind.click();
	wait.until(ExpectedConditions.visibilityOf(PrevAccAddList));
	Select select3 =new Select(PrevAccAddList);
	select3.selectByVisibleText("Apartment 2 Block B Alto Sillavan Way Salford");
	PrevAccProposeMoveIn.clear();
	PrevAccProposeMoveIn.sendKeys("01/01/2011");
	Date.click();
	}
	
	public void address_you_were_renting() {
		WebDriverWait wait = new WebDriverWait(driver, 100);
		PrevMoveInDate.clear();
		PrevMoveInDate.sendKeys("20/01/2010");
		//Date.click();
		PrevMoveOutDate.clear();
		PrevMoveOutDate.sendKeys("01/07/2018");
		//Date.click();
		PrevAddPostCode.sendKeys("M36GB");
		JavascriptExecutor js1 = (JavascriptExecutor)driver;
		js1.executeScript("arguments[0].click();",PrevAddPostCodeFind);

		//PrevAddPostCodeFind.click();
		wait.until(ExpectedConditions.visibilityOf(PrevAddList));
		Select List1 = new Select(PrevAddList);
		List1.selectByVisibleText("Apartment 45 Block B Alto Sillavan Way Salford");
	
	}
	
	
	}
	
