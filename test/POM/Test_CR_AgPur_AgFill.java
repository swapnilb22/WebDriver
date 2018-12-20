package POM;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;

public class Test_CR_AgPur_AgFill 
{
	WebDriver driver;
  @Test
  public void CR_AgPur_AgFill() throws Exception 
  {
	  Open_Application OpenAPP = PageFactory.initElements(driver,Open_Application.class);
		// OpenAPP.acceptGDPR();	
		OpenAPP.newApplication();	
	
		CreateApplication Application_One =  PageFactory.initElements(driver,CreateApplication.class);
		Application_One.CreateApplication_CreditReport_AgentPurchase_Agent_Fill();
		applicantQuickStep1 QS1 = PageFactory.initElements(driver,applicantQuickStep1.class);
		QS1.FillStep1CR();
		CommonMethods CM1 = PageFactory.initElements(driver, CommonMethods.class);
		CM1.finishApplication();
  }
  	
  	@BeforeMethod
	public void setUp() 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\swapnilb\\workspace\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.navigate().to("http://88.208.208.58:1011/public/app/#");
		driver.manage().window().maximize();
	
		Login_Page TestLogin = PageFactory.initElements(driver,Login_Page.class);
		TestLogin.authentication("swapnilbhaskar@benchmarkitsolutions.com", "bits1234");	
	}

	@AfterMethod
	public void tearDown() 
	{
		driver.quit();
	}

}
