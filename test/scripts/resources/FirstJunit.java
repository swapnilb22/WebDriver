package scripts.resources;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstJunit {
	static WebDriver driver;
	@Before
	public void setUp() throws Exception {
		
	}
	@BeforeClass
	public static void beforeClass() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\swapnil\\eclipse-workspace\\WebDriver\\test\\scripts\\resources\\geckodriver64bit.exe");
		driver = new FirefoxDriver();

	}
	@AfterClass
	public static void afterClass(){
		driver.quit();
	}
	
	
	@After
	public void tearDown() throws Exception {
		
	}
	
	@Test
	public void testA() {
	//	fail("Not yet implemented");
		driver.get("http://www.wikipedia.org");

		try {
			Thread.sleep(5000);

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.findElement(By.id("js-link-box-en")).click();


		try {
			Thread.sleep(5000);

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.findElement(By.id("searchInput")).sendKeys("Selenium");
		driver.findElement(By.id("searchButton")).click();
		String pageTitle =  driver.getTitle();
		String pageHeader = driver.findElement(By.id("firstHeading")).getText();
		assertEquals("Selenium - Wikipedia", pageTitle);
		assertEquals("Selenium", pageHeader);
	}
	
	@Test
	public void testB() {

	driver.get("http://www.google.com");
	String secondTitle = driver.getTitle();
	assertEquals("Google", secondTitle);
	}

	
}