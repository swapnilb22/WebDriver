/**
 * 
 */
package POM;

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
public class applicantStep4 {
WebDriver driver;

public applicantStep4(WebDriver driver) {
	this.driver =driver;
}
@FindBy (xpath = "//*[@name='employmentType']")
WebElement EmpType;

@FindBy (xpath = "//*[@name='nationalInsuranceNo']")
WebElement InsuranceNo;

@FindBy (xpath = "//*[@id='progressing']")
WebElement loader;

@FindBy(xpath ="//*[contains(text(),'Update')][@ng-click='validateStep4()']")
WebElement UpdateButton;

@FindBy (xpath = "//*[@name='companyName']")
WebElement CompanyName;

@FindBy (xpath = "//*[@name='department']")
WebElement Department;

@FindBy (xpath = "//*[@name='postCode']")
WebElement CompanyPostCode;

@FindBy (xpath = "//*[contains(text(),'Find')]")
WebElement FindButton;

@FindBy (xpath = "//*[@id='addressList']")
WebElement AddressList;

@FindBy (xpath = "//*[@name='phone']")
WebElement CompanyPhone;

@FindBy (xpath = "//*[@name='fax']")
WebElement fax;

@FindBy (xpath = "//*[@name='contactTitle']")
WebElement ContactTitle;

@FindBy (xpath = "//*[@name='contactFirstName']")
WebElement ContactFirstName;

@FindBy (xpath = "//*[@name='contactSurname']")
WebElement ContactSurname;

@FindBy (xpath = "//*[@name='contactMobile']")
WebElement ContactMobile;

@FindBy (xpath = "//*[@name='contactEmail']")
WebElement ContactEmail;

@FindBy (xpath = "//*[@name='jobTitle']")
WebElement JobTitle;

@FindBy (xpath = "//*[@name='jobStartDate']")
WebElement JobStartDate;

@FindBy (xpath = "//*[@name='annualSalary']")
WebElement AnnualSalary;

@FindBy (xpath = "//*[@name='jobAnnualBonus']")
WebElement AnnualBonus;

@FindBy (xpath = "//*[@name='workingHours']")
WebElement WorkingHrs;

@FindBy (xpath = "//*[@name='workingContract']")
WebElement WorkingContract;

@FindBy (xpath = "//*[@name='workingContract']")
WebElement lengthContract;


//Student
public void Student() {
	WebDriverWait wait = new WebDriverWait(driver,200);
	wait.until(ExpectedConditions.invisibilityOf(loader));
	wait.until(ExpectedConditions.visibilityOf(EmpType));
	
	
	
	InsuranceNo.sendKeys("IND2018");
	Step4CommonMethods CM = PageFactory.initElements(driver,Step4CommonMethods.class);
	CM.add_income();
	
	if(EmpType.isEnabled())
	{ 
	Select EmpTypeDrp =new Select(EmpType);
	EmpTypeDrp.selectByVisibleText("Student");
	}
	
	UpdateButton.sendKeys(Keys.RETURN);
	}


//Employed
public void Employed() {
	WebDriverWait wait = new WebDriverWait(driver,100);
	wait.until(ExpectedConditions.invisibilityOf(loader));
	
	Select EmpTypeDrp =new Select(EmpType);
	EmpTypeDrp.selectByVisibleText("Employed");

	InsuranceNo.sendKeys("IND2018");
	
	CompanyName.sendKeys("Bemchmark IT Solutions India Pvt Ltd");
	Department.sendKeys("QA");
	CompanyPostCode.sendKeys("M36GB");
	FindButton.click();
	wait.until(ExpectedConditions.visibilityOf(AddressList));
	Select list =new Select(AddressList);
	list.selectByVisibleText("Apartment 3 Block B Alto Sillavan Way Salford");
	CompanyPhone.sendKeys("02022556698");
	fax.sendKeys("000000000");
	
	Select list1 =new Select(ContactTitle);
	list1.selectByVisibleText("Miss");
	ContactFirstName.sendKeys("Tripti");
	ContactSurname.sendKeys("Poddar");
	ContactMobile.sendKeys("02312545006");
	ContactEmail.sendKeys("tp@bits.com");
	JobTitle.sendKeys("QA");
	JobStartDate.sendKeys("17/04/2017");
	AnnualSalary.sendKeys("280000");
	AnnualBonus.sendKeys("1500");
	
	Step4CommonMethods CM = PageFactory.initElements(driver,Step4CommonMethods.class);
	CM.add_income();
	UpdateButton.sendKeys(Keys.RETURN);
	}


//SelfEm[loyed

@FindBy (xpath = "//*[@name='businessName']")
WebElement BusinessName;

@FindBy (xpath = "//*[@name='numberOfYearsTrading']")
WebElement NOYTrading;

@FindBy (xpath = "//*[@name='businessType']")
WebElement BusinessType;

@FindBy (xpath = "//*[@name='jobTitle']")
WebElement Job_Title;

@FindBy (xpath = "//*[@name='jobStartDate']")
WebElement Job_Start_Date;

@FindBy (xpath = "//*[@name='annualIncome']")
WebElement AnnualIncome;

@FindBy (xpath = "//*[@name='annualBonus']")
WebElement Annual_Bonus;

@FindBy (xpath = "//*[@name='accountantTitle']")
WebElement AccTitle;

@FindBy (xpath = "//*[@name='forename']")
WebElement AccForeName;

@FindBy (xpath = "//*[@name='surname']")
WebElement AccSurname;

@FindBy (xpath = "//*[@name='accountantPractiseName']")
WebElement AccPracticeName;

@FindBy (xpath = "//*[@name='accountantPostCode']")
WebElement AccpostCode;

@FindBy (xpath = "//*[contains(text(),'Find')]")
WebElement PostFindButton;

@FindBy (xpath = "//*[@id='accountantAddressList']")
WebElement AccAddress;

@FindBy (xpath = "//*[@name='Email']")
WebElement AccEmail;

@FindBy (xpath = "//*[@name='accountantPhone']")
WebElement AccPhone;

@FindBy (xpath = "//*[@name='accountantMobile']")
WebElement AccMobile;

@FindBy (xpath = "//*[@name='fax']")
WebElement Fax;

public void Self_Emp(){
	WebDriverWait wait = new WebDriverWait(driver,100);
	wait.until(ExpectedConditions.invisibilityOf(loader));
	
	Select EmpTypeDrp =new Select(EmpType);
	EmpTypeDrp.selectByVisibleText("Self-Employed / Director of own company");

	InsuranceNo.sendKeys("IND2018");
	
	BusinessName.sendKeys("WallMart");
	NOYTrading.sendKeys("120");
	BusinessType.sendKeys("Shopping Center");
	Job_Title.sendKeys("Owner");
	Job_Start_Date.sendKeys("17/04/2017");
	AnnualIncome.sendKeys("280000");
	Annual_Bonus.sendKeys("1200");
	Select list2 = new Select(AccTitle);
	list2.selectByVisibleText("Mr");
	AccForeName.sendKeys("Aniket");
	AccSurname.sendKeys("Kulkarni");
	AccPracticeName.sendKeys("AniKet Sir");
	AccpostCode.sendKeys("l118lz");
	PostFindButton.click();
	wait.until(ExpectedConditions.visibilityOf(AccAddress));
	Select list3 =new Select(AccAddress);
	list3.selectByVisibleText("28 Broad Lane Norris Green Liverpool");
	AccEmail.sendKeys("ak@bits.com");
	AccPhone.sendKeys("123456878");
	AccMobile.sendKeys("789548798978");
	Fax.sendKeys("887787788787");

	Step4CommonMethods CM = PageFactory.initElements(driver,Step4CommonMethods.class);
	CM.add_income();
	UpdateButton.sendKeys(Keys.RETURN);
	}

//UnEmployed
public void unemployed() {
	WebDriverWait wait = new WebDriverWait(driver,100);
	wait.until(ExpectedConditions.invisibilityOf(loader));
	
	Select EmpTypeDrp =new Select(EmpType);
	EmpTypeDrp.selectByVisibleText("Unemployed");

	InsuranceNo.sendKeys("IND2018");

	Step4CommonMethods CM = PageFactory.initElements(driver,Step4CommonMethods.class);
	CM.add_income();
	UpdateButton.sendKeys(Keys.RETURN);
	}

//Own_Means

@FindBy (xpath = "//*[@name='statePension']")
WebElement StatePension;

@FindBy (xpath = "//*[@name='privatePension']")
WebElement PrivatePension;

@FindBy (xpath = "//*[@name='investmentIncome']")
WebElement InvestMentIncome;

@FindBy (xpath = "//*[@name='interestReceived']")
WebElement Intrest;


public void own_means() {
	WebDriverWait wait = new WebDriverWait(driver,100);
	wait.until(ExpectedConditions.invisibilityOf(loader));
	
	Select EmpTypeDrp =new Select(EmpType);
	EmpTypeDrp.selectByVisibleText("Own means");

	InsuranceNo.sendKeys("IND2018");
	StatePension.sendKeys("1500");
	PrivatePension.sendKeys("2500");
	InvestMentIncome.sendKeys("3500");
	Intrest.sendKeys("500");
	
	
	
	Step4CommonMethods CM = PageFactory.initElements(driver,Step4CommonMethods.class);
	CM.add_income();
	UpdateButton.sendKeys(Keys.RETURN);
}
}
