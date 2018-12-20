package pom_practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Propi_Login {

	WebDriver driver;
	
	By username = By.name("username");
	By password = By.name("password");
	By submit = By.xpath("//button[@type='submit']");
	
public Propi_Login(WebDriver driver) {
	this.driver =driver;
}	

public void login(String email, String pass) {
	driver.findElement(username).sendKeys(email);
	driver.findElement(password).sendKeys(pass);
	driver.findElement(submit).click();
}
}
