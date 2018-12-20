package scripts.resources;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionClassAssignmet {

	WebDriver driver;
	@Before
	public void setUp() throws Exception {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\swapnil\\eclipse-workspace\\WebDriver\\test\\scripts\\resources\\chromedriver.exe");
		 driver=new ChromeDriver();
		
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.navigate().to("http://only-testing-blog.blogspot.in/2014/09/selectable.html");

		driver.manage().window().maximize();
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() {
	WebDriverWait wait = new WebDriverWait(driver,3000);
	WebElement button = driver.findElement(By.xpath("//button"));
	
	//applying wait
	wait.until(ExpectedConditions.visibilityOf(button));
	
	//Action class calling
	Actions builder = new Actions(driver);
	builder.doubleClick(button).build().perform();

	//Handle the alert box
	Alert alert = driver.switchTo().alert();
	String alertText = alert.getText();
	
	//TestCase Statement
	assertEquals(alertText,"You double clicked me.. Thank You..");
	alert.accept();
	
		
	}

}
