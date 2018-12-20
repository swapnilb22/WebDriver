/**
 * 
 */
package pom_practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * @author swapnil
 *
 */
public class VerifyLogin {

	@Test
	public void checkAuthorization() {
		WebDriver driver = Utility.browserStart("chrome", "http://209.51.194.186:1131/#/");
		
		Login TestLogin = PageFactory.initElements(driver,Login.class);
		
		TestLogin.loginattempt("sb@agent.com", "swa2018$$");
		
	}
}
