package scripts.resources;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Handling {
WebDriver driver;
	@Before
	public void setUp() throws Exception {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\swapnil\\eclipse-workspace\\WebDriver\\test\\scripts\\resources\\chromedriver.exe");
		 driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
		
	
	}

	@After
	public void tearDown() throws Exception {
	driver.quit();
	}

	@Test
	public void test() {
		driver.navigate().to("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='content']/div/ul/li[2]/button")).click();
		
		try {
		
			Alert alert = driver.switchTo().alert();
			String a = alert.getText();
			System.out.println(a);
			assertEquals("I am a JS Confirm",a);
			alert.dismiss();
				
			}
		
		catch(NoAlertPresentException e) {
			e.printStackTrace();
		}
		
	
	
	}

}
