package scripts.resources;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Scenario_One {
WebDriver driver;


	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\swapnil\\eclipse-workspace\\WebDriver\\test\\scripts\\resources\\chromedriver.exe");
		 driver=new ChromeDriver();

		
					
		// driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//		WebDriverWait wait = new WebDriverWait(driver,30); 
		driver.navigate().to("http://the-internet.herokuapp.com/dynamic_loading/2");

		driver.manage().window().maximize();
	
	
	}

	@After
	public void tearDown() throws Exception {
	driver.quit();	
	}

	@Test
	public void test() {
		WebDriverWait wait = new WebDriverWait(driver,30); 

		WebElement startButton = driver.findElement(By.xpath("//*[@id='start']/button"));
		wait.until(ExpectedConditions.visibilityOf(startButton));
		startButton.click();
		System.out.println("Clicked");
		
		
		
		WebElement finish =driver.findElement(By.xpath("//*[@id='finish']/h4"));
		wait.until(ExpectedConditions.visibilityOf(finish));
		String Text = finish.getText();
		assertEquals("Hello World!",Text);
	System.out.println("Textcase execution ends");
	}

}


