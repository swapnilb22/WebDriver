package POM;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Open_Application {
WebDriver driver;
	
	public Open_Application(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy (xpath = "//*[@id='gdprCompliance']/div/div/div[3]/button")
	WebElement closeButton;
	
	@FindBy (xpath = "//*[@id='store254244']/div[1]/div[7]/ul/li[4]/a/span")
	WebElement AddButton;
	
	@FindBy (xpath ="//*[@id='addApplicants']/div/div/div[2]/button[1]")
	WebElement AddApplicant;
	
	@FindBy (xpath = "//*[@id='addApplicants']/div/div/div[2]/button[2]")
	WebElement AddGuarantor;
	
	@FindBy (xpath = "//*[@id='addApplicants']/div/div/div[2]/button[3]")
	WebElement AddPO;
	
	@FindBy (xpath = "//div[@class='sidebar-nav']")
	WebElement SideMenu;
	
	@FindBy (xpath = "html/body/section/div/div/ul/li[2]/ul/li[1]/a")
	WebElement NewApplication;
	
	@FindBy (xpath = "//*[@id='progressing']")
	WebElement loader;
	
	
	@FindBy (xpath = "//*[@id='exp']")
	WebElement ExpandApplication;
	
	
	@FindBy (xpath = "//*[@id='no-more-tables']/table/tbody/tr[1]/td[13]/div/a/span")
	WebElement OpenMessagePopUp;
	
	@FindBy (xpath = "//*[@id='modal-body']/div[1]/div[2]/ul/li[4]/span[2]")
	WebElement ApplicantMailID;
	
	
	@FindBy (xpath = "//*[@id='ddlmsgtype']")
	WebElement MessageTypeDrp;
	
	@FindBy (xpath = "//*[@id='pnlLink']/div/div[1]/label")
	WebElement URL;
	
	@FindBy(xpath = "//*[@id='sendMessageModal']/div[4]/button[1]")
	WebElement PopUpClose;
	
	@FindBy(xpath = "//*[contains(text(),'LOGOUT')]")
	WebElement Logout;
	
	
	//Create New Application
	public void newApplication() 
	{
		WebDriverWait wait = new WebDriverWait(driver, 400);	
		wait.until(ExpectedConditions.invisibilityOf(loader));
		SideMenu.click();
		wait.until(ExpectedConditions.visibilityOf(NewApplication));
		NewApplication.click();
	}
	
	
	public void acceptGDPR() {
		WebDriverWait wait = new WebDriverWait(driver, 30);	
		try {
		//wait.until(ExpectedConditions.visibilityOf(closeButton));
		
		closeButton.sendKeys(Keys.RETURN);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		}
		
	//Add Applicant
	public void AddApplicant() {
		WebDriverWait wait = new WebDriverWait(driver, 300);	
		wait.until(ExpectedConditions.visibilityOf(AddButton));
		AddButton.click();
	
		wait.until(ExpectedConditions.visibilityOf(AddApplicant));
		
		AddApplicant.click();//sendKeys(Keys.RETURN);
	}
	
	//Add Guarantor
	public void AddGuarantor() {
		WebDriverWait wait = new WebDriverWait(driver, 300);	
		wait.until(ExpectedConditions.visibilityOf(AddButton));
		AddButton.click();
	
		wait.until(ExpectedConditions.visibilityOf(AddGuarantor));
		
		AddGuarantor.click();//sendKeys(Keys.RETURN);
		}
	
	public String getApplicantFillURL()
	{
		WebDriverWait wait = new WebDriverWait(driver, 400);	
		wait.until(ExpectedConditions.invisibilityOf(loader));
		ExpandApplication.click();
		OpenMessagePopUp.click();
		wait.until(ExpectedConditions.invisibilityOf(loader));
		ApplicantMailID.click();
		wait.until(ExpectedConditions.invisibilityOf(loader));
		
		Select EmailType =new Select(MessageTypeDrp);
		EmailType.selectByVisibleText("Resend Application Completion Link");
		
		String U_R_L = URL.getText();
		PopUpClose.click();
		wait.until(ExpectedConditions.invisibilityOf(Logout));
		Logout.sendKeys(Keys.RETURN);
		return U_R_L;
		
	}
}

