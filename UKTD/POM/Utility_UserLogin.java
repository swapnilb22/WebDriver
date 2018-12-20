package POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Utility_UserLogin {
	
	@Test
	public void user_login() { 
	System.setProperty("webdriver.chrome.driver","C:\\Users\\swapnil\\eclipse-workspace\\WebDriver\\test\\scripts\\resources\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	driver.navigate().to("http://88.208.208.58:1033/public/app/#");

	driver.manage().window().maximize();
	
	Login_Page TestLogin = PageFactory.initElements(driver,Login_Page.class);
	TestLogin.authentication("swapnilbhaskar@benchmarkitsolutions.com", "12345678");	

}
}