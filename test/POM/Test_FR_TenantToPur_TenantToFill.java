package POM;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;

public class Test_FR_TenantToPur_TenantToFill {
	
	WebDriver driver;
	@Test
	public void FR_TenantToPur_TenantToFill() 
	{
		Open_Application OpenAPP = PageFactory.initElements(driver,Open_Application.class);
		// OpenAPP.acceptGDPR();	
		OpenAPP.newApplication();	
	
		CreateApplication Application_One =  PageFactory.initElements(driver,CreateApplication.class);
		Application_One.CreateApplication_FullReport_TeanatPurchase_Agent_Fill();
		
		applicationQuickStep  QS = PageFactory.initElements(driver, applicationQuickStep.class);
		QS.FillQuictStep();
		
		OrderConfirmation OC = PageFactory.initElements(driver, OrderConfirmation.class);
		OC.finishApplication();
		
		String URL = OpenAPP.getApplicantFillURL();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to(URL);
		
		applicantQuickStep1 QS1 = PageFactory.initElements(driver, applicantQuickStep1.class);
		QS1.Tenat_Fill_Step1_FR();
		
		applicantStep2 Step2 = PageFactory.initElements(driver, applicantStep2.class);
		Step2.appStep2(2);
		
		applicantStep3 Step3 = PageFactory.initElements(driver, applicantStep3.class);
		Step3.fillstep3();
  

		applicantStep4 Step4 = PageFactory.initElements(driver, applicantStep4.class);
		Step4.Student();
		
		
		
		PaymentPage Pay = PageFactory.initElements(driver, PaymentPage.class);
		Pay.MakePayment();
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
		//driver.quit();
	}


}
