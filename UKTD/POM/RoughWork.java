/**
 * 
 */
package POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * @author swapnil
 *
 */
public class RoughWork {
WebDriver driver;

@BeforeMethod
public void setup() {
System.setProperty("webdriver.chrome.driver","C:\\Users\\swapnil\\eclipse-workspace\\WebDriver\\test\\scripts\\resources\\chromedriver.exe");
driver=new ChromeDriver();

driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

driver.navigate().to("http://88.208.208.58:1011/public/app/#");

driver.manage().window().maximize();

Login_Page TestLogin = PageFactory.initElements(driver,Login_Page.class);


TestLogin.authentication("swapnilbhaskar@benchmarkitsolutions.com", "12345678");	


}
@Test
public void testwork() {
	 CreateApplication Application_One =  PageFactory.initElements(driver,CreateApplication.class);
	  Application_One.CreateApplication_FullReport_AgentPurchase_Agent_Fill();
	
}


}
