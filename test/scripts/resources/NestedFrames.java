package scripts.resources;

import static org.junit.Assert.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrames {
	WebDriver driver;
	@Before
	public void setUp() throws Exception {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\swapnil\\eclipse-workspace\\WebDriver\\test\\scripts\\resources\\chromedriver.exe");
		 driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.navigate().to("https://the-internet.herokuapp.com/nested_frames");

		driver.manage().window().maximize();
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() {
	List <WebElement> frames = driver.findElements(By.tagName("frame"));	
	//System.out.println(frames.size());
	for (WebElement mainframe : frames ) {
		driver.switchTo().frame(mainframe);
		if(driver.getPageSource().contains("frame-top")) {
		
			break;
		}
		driver.switchTo().frame("frame-middle");
		WebElement text = driver.findElement(By.id("content"));
		System.out.println("Element found");
		assertEquals("MIDDLE",text.getText());
		}
	}	
	
	}
	
		
	
	


	