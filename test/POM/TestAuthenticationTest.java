package POM;

import java.io.ObjectInput;
import java.util.concurrent.TimeUnit;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pom_practise.Login;
import pom_practise.Utility;
import scripts.resources.DataProvider;

public class TestAuthenticationTest {
	
	
	
  @Test(dataProvider = "LoginData",dataProviderClass="")
  public void checkAuthentication() {
	  
  WebDriver driver = Utility.browserStart("Chrome","http://88.208.208.58:1033/Public/app/#/");
  driver.manage()
  		.timeouts()
  		.implicitlyWait(30, TimeUnit.SECONDS);
  LoginToSystem LS1 = PageFactory.initElements(driver,LoginToSystem.class);
  
  LS1.authentication("swapnilbhaskar@benchmarkitsolutions.com", "12345678");
  
  
  }
 
  
    

@DataProvider(name="")
public Object[][] passdata(){
	ReadExcel RE =new ReadExcel("\\WebDriver\\UKTD\\resources\\UKTD Login Credentials.xlsx","Datapool");
}
