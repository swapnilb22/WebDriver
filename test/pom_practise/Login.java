/**
 * 
 */
package pom_practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author swapnil
 *
 */
public class Login {

	WebDriver driver;
	
	public Login(WebDriver driver) {
		this.driver=driver;
	}

@FindBy (how=How.NAME, using="username")
WebElement Email;

@FindBy (how=How.NAME, using="password")
WebElement pass;

@FindBy(xpath ="//button[@type='submit']")
WebElement submit;

public void loginattempt(String username, String password) {
	Email.sendKeys(username);
	pass.sendKeys(password);
	submit.click();
}


}
