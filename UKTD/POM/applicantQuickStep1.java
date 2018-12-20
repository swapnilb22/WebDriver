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
public class applicantQuickStep1 

{
WebDriver driver;
	
	public applicantQuickStep1 (WebDriver driver) 
	
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
	
	@FindBy (xpath = "//*[@name= 'personalMiddleName']")
	WebElement MiddleName;
	
	@FindBy (xpath = "//*[@name= 'personalSurName']")
	WebElement Surname;
	
	@FindBy (xpath = "//*[@id='maleRadio']")
	WebElement MaleGender;
	
	@FindBy (xpath = "//*[@id='femaleRadio']")
	WebElement FemaleGender;
	
	@FindBy (xpath = "//*[@name='personalMaidenName']")
	WebElement MaidenName;
	
	@FindBy (xpath = "//*[@name='personalDateOfBirth']")
	WebElement DOB;
	
	@FindBy (xpath = "//*[@name='personalMaritalStatus']")
	WebElement MaritalStatus;
	
	@FindBy (xpath = "//*[@placeholder = 'Applicant Home Phone']")
	WebElement HomePhone;
	
	@FindBy (xpath = "//*[@placeholder = 'Applicant Work Phone']")
	WebElement WorkPhone;
	
	@FindBy (xpath = "//*[@name='applicantMobile']")
	WebElement Mobile;
	
	@FindBy (xpath = "//*[@id='applicantEmailID']")
	WebElement Email;
	
	@FindBy (xpath = "//*[@name='applicantConfirmEmail']")
	WebElement ConfirmEmail;
	
	@FindBy (xpath = "//*[@name='applicantProofID']")
	WebElement ApplicantProof;
	
	@FindBy (xpath = "//*[@id='bankShortCode1']")
	WebElement SortCode;
	
	@FindBy (xpath = "//*[@id='bankAccNo']")
	WebElement AccNo;
	
	@FindBy (xpath = "//*[@name='currentPostalCode']")
	WebElement CurrentAdd;
	
	@FindBy (xpath = "//*[contains(text(),'Find')]")
	WebElement FindButton;
	
	@FindBy (xpath = "//*[@id='addressList']")
	WebElement AddressList;
	
	@FindBy (xpath = "//*[@name='currentAccomProposedMoveDate']")
	WebElement CurrentAddMoveIn;

	@FindBy (xpath = "//*[@id='smoker']")
	WebElement Smoker;
	
	@FindBy (xpath = "//*[@id='nonSmoker']")
	WebElement NonSmoker;
	
	@FindBy (xpath = "//*[@id='pets']")
	WebElement NoPets;

	@FindBy (xpath = "//*[@id='noPets']")
	WebElement HasPets;

	@FindBy (xpath = "//*[@id='criminal']")
	WebElement HasAdversData;

	@FindBy (xpath = "//*[@id='noCriminal']")
	WebElement NoAdverseData;

	@FindBy (xpath = "//*[@id='comment']")
	WebElement AdversDetails;
	
	@FindBy (xpath = "//*[@name='noOfChildern']")
	WebElement NoOfChild;
	
	@FindBy (xpath = "//*[@name='childernOver18']")
	WebElement ChildOver18;
	
	@FindBy (xpath = "//*[contains(text(),'View and Agree Terms and Conditions')]")
	WebElement TandC;
	
	@FindBy (xpath = "//button[contains(text(),'Agree to Terms & Conditions')]")
	WebElement CheckAll;
	
	@FindBy (xpath ="//button[contains(text(),'Agree & Continue to Application')]")
	WebElement AcceptTandC;
	
	@FindBy (xpath ="//*[@id='btnsubmit']")
	WebElement NextButton;
	
	@FindBy(xpath ="//*[contains(text(),'Previous Accommodation Information' )]")
	WebElement PrevAccBlock;
	
	@FindBy(xpath = "html/body/section/section/div/div/ng-view/div/div/div/form/div[1]")
	WebElement Date;
	
	public void FillStep1CR() throws Exception{
		WebDriverWait wait = new WebDriverWait(driver, 100);
	//	Rentshare.sendKeys("100");
		Select select = new Select(Title);
		select.selectByVisibleText("Prof");
		
		FirstName.sendKeys("Swapnil");
		MiddleName.sendKeys("Sunil");
		Surname.sendKeys("Bhaksar");
		MaleGender.click();
		MaidenName.sendKeys("NA");
		DOB.sendKeys("28/01/1994");
		Date.click();
		Select select1 = new Select(MaritalStatus);
		select1.selectByVisibleText("Married");
		
		HomePhone.sendKeys("02425261552");
		WorkPhone.sendKeys("0202255889");
		Mobile.sendKeys("+91-9604328562");
		Email.sendKeys("bhaskarswapnil22@gmail.com");
		ConfirmEmail.sendKeys("bhaskarswapnil22@gmail.com");
		ApplicantProof.sendKeys("Passport");
		SortCode.sendKeys("232323");
		AccNo.sendKeys("00000000");
		
		CurrentAdd.sendKeys("M36GB");
		FindButton.click();
		wait.until(ExpectedConditions.visibilityOf(AddressList));
		Select select2 =new Select(AddressList);
		select2.selectByVisibleText("Apartment 2 Block B Alto Sillavan Way Salford");
		CurrentAddMoveIn.clear();
		CurrentAddMoveIn.sendKeys("01/01/2011");
		Date.click();
		//wait.until(ExpectedConditions.invisibilityOf(PrevAccBlock));
		//AppType.click();
	
		JavascriptExecutor js1 = (JavascriptExecutor)driver;
		js1.executeScript("arguments[0].click();",NonSmoker);
		js1.executeScript("arguments[0].click();",HasPets);
		js1.executeScript("arguments[0].click();",NoAdverseData);
		
		//wait.until(ExpectedConditions.invisibilityOf(PrevAccBlock));
//		wait.until(ExpectedConditions.visibilityOf(NonSmoker));
		//NonSmoker.sendKeys(Keys.RETURN);
		//HasPets.sendKeys(Keys.RETURN);
		
		
		//NoAdverseData.sendKeys(Keys.RETURN);
		NoOfChild.sendKeys("2");
		ChildOver18.sendKeys("1");
		TandC.click();
		wait.until(ExpectedConditions.visibilityOf(CheckAll));
		//CheckAll.click();
		js1.executeScript("arguments[0].click();",CheckAll);
		AcceptTandC.click();
		NextButton.sendKeys(Keys.RETURN);
	
	}

	public void FillStep1FR() //throws Exception
	{
		WebDriverWait wait = new WebDriverWait(driver, 100);
		Rentshare.clear();
		Rentshare.sendKeys("100");
		Select select = new Select(Title);
		select.selectByVisibleText("Prof");
		
		FirstName.sendKeys("Swapnil");
		MiddleName.sendKeys("Sunil");
		Surname.sendKeys("Bhaksar");
		MaleGender.click();
		MaidenName.sendKeys("NA");
		DOB.sendKeys("28/01/1994");
		//Date.click();
		
		Select select1 = new Select(MaritalStatus);
		select1.selectByVisibleText("Married");
		
		HomePhone.sendKeys("02425261552");
		WorkPhone.sendKeys("0202255889");
		Mobile.sendKeys("+91-9604328562");
		Email.sendKeys("bhaskarswapnil22@gmail.com");
		ConfirmEmail.sendKeys("bhaskarswapnil22@gmail.com");
		ApplicantProof.sendKeys("Passport");
		/*SortCode.sendKeys("232323");
		AccNo.sendKeys("00000000");
		
		CurrentAdd.sendKeys("M36GB");
		FindButton.click();
		wait.until(ExpectedConditions.visibilityOf(AddressList));
		Select select2 =new Select(AddressList);
		select2.selectByVisibleText("Apartment 2 Block B Alto Sillavan Way Salford");
		CurrentAddMoveIn.clear();
		CurrentAddMoveIn.sendKeys("01/01/2011");
	
		//wait.until(ExpectedConditions.invisibilityOf(PrevAccBlock));
		//AppType.click();*/
	
		JavascriptExecutor js1 = (JavascriptExecutor)driver;
		js1.executeScript("arguments[0].click();",NonSmoker);
		js1.executeScript("arguments[0].click();",HasPets);
		js1.executeScript("arguments[0].click();",NoAdverseData);
		
		//wait.until(ExpectedConditions.invisibilityOf(PrevAccBlock));
//		wait.until(ExpectedConditions.visibilityOf(NonSmoker));
		//NonSmoker.sendKeys(Keys.RETURN);
		//HasPets.sendKeys(Keys.RETURN);
		
		
		//NoAdverseData.sendKeys(Keys.RETURN);
		NoOfChild.sendKeys("2");
		ChildOver18.sendKeys("1");
		TandC.click();
		wait.until(ExpectedConditions.visibilityOf(CheckAll));
		CheckAll.click();
		wait.until(ExpectedConditions.elementToBeClickable(AcceptTandC));
		AcceptTandC.click();
		NextButton.sendKeys(Keys.RETURN);

	}
	
	
	//Tenant Fill FR
	public void Tenat_Fill_Step1_FR()
	{
		WebDriverWait wait = new WebDriverWait(driver, 100);
		
		MiddleName.sendKeys("Sunil");
		wait.until(ExpectedConditions.elementToBeClickable(MaleGender));
		MaleGender.click();
		MaidenName.sendKeys("NA");
		DOB.sendKeys("28/01/1994");
		//Date.click();
		
		Select select1 = new Select(MaritalStatus);
		select1.selectByVisibleText("Married");
		
		HomePhone.sendKeys("02425261552");
		WorkPhone.sendKeys("0202255889");
		
		ApplicantProof.sendKeys("Passport");
			
		JavascriptExecutor js1 = (JavascriptExecutor)driver;
		js1.executeScript("arguments[0].click();",NonSmoker);
		js1.executeScript("arguments[0].click();",HasPets);
		js1.executeScript("arguments[0].click();",NoAdverseData);
		
		NoOfChild.sendKeys("2");
		ChildOver18.sendKeys("1");
		TandC.click();
		wait.until(ExpectedConditions.visibilityOf(CheckAll));
		//CheckAll.click();
		js1.executeScript("arguments[0].click();",CheckAll);
		js1.executeScript("arguments[0].click();",AcceptTandC);
		//AcceptTandC.click();
		NextButton.sendKeys(Keys.RETURN);
		
	}
	
}

