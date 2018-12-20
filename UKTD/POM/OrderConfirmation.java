/**
 * 
 */
package POM;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author swapnil
 *
 */
public class OrderConfirmation {
WebDriver driver;
	
	public OrderConfirmation (WebDriver driver) {
		this.driver = driver;
	}

	@FindBy (xpath = "//button[contains(text(),'Finish')]")
	WebElement FinishButton;
	
	@FindBy(xpath = "//button[contains(text(),'Add')]")
	WebElement AddAnother;
	
	@FindBy(xpath = "//button[@type='button'][contains(text(),'Finish')][1]")
	WebElement PopupFinish;
	
	@FindBy(xpath = "html/body/div[6]/div/div/div[3]/button[1]")
	WebElement PopupCancel;
	
	@FindBy(xpath = "//*[@href='#/openapplications']")
	WebElement Openapplication;
	
	@FindBy (xpath = "//div[@class='sidebar-nav']")
	WebElement SideMenu;
	
	@FindBy (xpath = "//*[@id='progressing']")
	WebElement loader;
			
	public void finishApplication() {
	WebDriverWait wait = new WebDriverWait(driver, 100);

	FinishButton.sendKeys(Keys.RETURN);
	wait.until(ExpectedConditions.visibilityOf(PopupFinish));
	PopupFinish.sendKeys(Keys.RETURN);
	
	wait.until(ExpectedConditions.invisibilityOf(loader));
	SideMenu.click();
	wait.until(ExpectedConditions.visibilityOf(Openapplication));
	Openapplication.click();
	}
	
}
