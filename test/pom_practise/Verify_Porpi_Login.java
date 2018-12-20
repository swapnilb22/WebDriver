/**
 * 
 */
package pom_practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * @author swapnil
 *
 */
public class Verify_Porpi_Login {

	@Test
	public void verifyLogin()
	{

		System.setProperty("webdriver.chrome.driver","C:\\Users\\swapnil\\eclipse-workspace\\WebDriver\\test\\scripts\\resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.navigate().to("http://209.51.194.186:1131/#/login");

		driver.manage().window().maximize();

		Propi_Login login =new Propi_Login(driver);
		login.login("sb@agent.com", "swa2018$$");
		
	}
	
}
