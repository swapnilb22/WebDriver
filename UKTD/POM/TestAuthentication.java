package POM;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import pom_practise.Login;
import scripts.resources.Resource;
public class TestAuthentication {
	
	WebDriver driver;
	
	@BeforeTest
	public void setUp()
	{	
		Resource r = new Resource();
		String brwoserPath = r.getPath();
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\swapnilb\\workspace\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.navigate().to("http://88.208.208.58:1011/public/app/#");
	
		driver.manage().window().maximize();
	}
	
	
	
	@Test
	public void verifyAuthentication() throws Exception
	{
		Login_Page TestLogin = PageFactory.initElements(driver,Login_Page.class);
		TestLogin.authentication("swapnilbhaskar@benchmarkitsolutions.com", "bits1234");	
		
		Open_Application OpenAPP = PageFactory.initElements(driver,Open_Application.class);
		//OpenAPP.acceptGDPR();
		//OpenAPP.AddApplicant();
		
		assertEquals(driver.getTitle(),"UktenantData");
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
}