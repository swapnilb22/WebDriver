package POM;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VerifyUser {
	WebDriver driver;
	
	
	@BeforeMethod
		public void setup() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\swapnil\\eclipse-workspace\\WebDriver\\test\\scripts\\resources\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.navigate().to("http://88.208.208.58:1033/public/app/#");
	
		driver.manage().window().maximize();
		
		Login_Page TestLogin = PageFactory.initElements(driver,Login_Page.class);
		

		TestLogin.authentication("swapnilbhaskar@benchmarkitsolutions.com", "12345678");	
		}

	
	
	
	@AfterMethod
		public void tearDown() throws Exception {
		driver.quit();
		}

	
	@Test //Verify Applicant is selected in dropdown
		public void verifyapplicant() {
		Open_Application OpenAPP = PageFactory.initElements(driver,Open_Application.class);
		OpenAPP.acceptGDPR();
		OpenAPP.AddApplicant();
		
		applicationQuickStep2 QS2 = PageFactory.initElements(driver, applicationQuickStep2.class);
		String Selected_value = QS2.getValue();
		//System.out.println(Selected_value);
		assertEquals("Applicant", Selected_value);
		}
	
	
	@Test	//Verify Guarantor is selected in dropdown
		public void verifyguarantor() {
		Open_Application OpenAPP = PageFactory.initElements(driver,Open_Application.class);
		OpenAPP.acceptGDPR();
		OpenAPP.AddGuarantor();
		
		applicationQuickStep2 QS2 = PageFactory.initElements(driver, applicationQuickStep2.class);
		String Selected_value = QS2.getValue();
		//System.out.println(Selected_value);
		assertEquals("Guarantor", Selected_value);	
}
}