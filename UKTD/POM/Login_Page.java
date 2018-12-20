package POM;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_Page {

	WebDriver driver;
	
	public Login_Page(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy (xpath = "//*[@name ='email']")
	WebElement username;
	
	@FindBy (xpath = "//*[@name ='password']")
	WebElement password;
	
	@FindBy (xpath = "//*[@id='loginForm']/fieldset/button[1]")
	WebElement submit;
	
	public void authentication(String mail, String Passw) {
		username.sendKeys(mail);
		password.sendKeys(Passw);
		submit.sendKeys(Keys.RETURN);
	} 
}
