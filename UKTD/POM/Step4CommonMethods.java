/**
 * 
 */
package POM;

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
public class Step4CommonMethods {
	WebDriver driver;

	public Step4CommonMethods(WebDriver driver) {
		this.driver =driver;
	}

	
	//Additional Income	
		@FindBy (xpath= "//*[@name='familyTaxCreditIncome']")
		WebElement FamilyTaxCredit;
		
		@FindBy (xpath= "//*[@name='housingBenefitIncome']")
		WebElement HousingBenifit;
		
		@FindBy (xpath= "//*[@name='incomeSupportIncome']")
		WebElement IncomeSupport;
		
		@FindBy (xpath= "//*[@name='disabiliyLivingAllowanceIncome']")
		WebElement Disabilityincome;
		
		@FindBy (xpath= "//*[@name='otherIncome']")
		WebElement otherIncome;

		@FindBy (xpath= "//*[@name='otherIncomeDescription']")
		WebElement Description;

		public void add_income() {
			FamilyTaxCredit.sendKeys("100");
			HousingBenifit.sendKeys("200");
			IncomeSupport.sendKeys("300");
			Disabilityincome.sendKeys("400");
			otherIncome.sendKeys("500");
			Description.sendKeys("Pension");
		}
	
	
	
}
