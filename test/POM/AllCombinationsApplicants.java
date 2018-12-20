package POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AllCombinationsApplicants {

WebDriver driver;
	
	
	@Test
	public void TryAllCombinations() throws Exception {
		
		int i;
		 for(i= 1; i<=8; i++) {
			
		try {
	  Open_Application OpenAPP = PageFactory.initElements(driver,Open_Application.class);
	  OpenAPP.acceptGDPR();	
	  OpenAPP.newApplication();	
		
	  CreateApplication Application_One =  PageFactory.initElements(driver,CreateApplication.class);
	  Application_One.CreateApplication_FullReport_AgentPurchase_Agent_Fill();
	  
	  applicantQuickStep1 QS1 = PageFactory.initElements(driver, applicantQuickStep1.class);
	  QS1.FillStep1FR();
	  
	  applicantStep2 Step2 = PageFactory.initElements(driver, applicantStep2.class);
	  Step2.appStep2(i);
	  
	  applicantStep3 Step3 = PageFactory.initElements(driver, applicantStep3.class);
	  Step3.fillstep3();
	  

	  applicantStep4 Step4 = PageFactory.initElements(driver, applicantStep4.class);
	  Step4.Student();
	  //Step4.Employed();
	  //Step4.Self_Emp();
	  //Step4.own_means();
	  //Step4.unemployed();
	  CommonMethods CM1 = PageFactory.initElements(driver, CommonMethods.class);
	  CM1.finishApplication();
  }catch (ArithmeticException e) { 
	  System.out.println(e);
  }
	}
	
	}
	
  @BeforeMethod
  public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\swapnil\\eclipse-workspace\\WebDriver\\test\\scripts\\resources\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.navigate().to("http://88.208.208.58:1033/public/app/#");
		driver.manage().window().maximize();
		Login_Page TestLogin = PageFactory.initElements(driver,Login_Page.class);
		TestLogin.authentication("swapnilbhaskar@benchmarkitsolutions.com", "12345678");	
   }

  @AfterMethod
  public void afterMethod() {
 // driver.quit();
  }
	}


	

