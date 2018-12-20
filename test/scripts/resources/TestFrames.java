package scripts.resources;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestFrames {
WebDriver driver;
	@Before
	public void setUp() throws Exception {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\swapnil\\eclipse-workspace\\WebDriver\\test\\scripts\\resources\\chromedriver.exe");
		 driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.navigate().to("http://www.cookbook.seleniumacademy.com/Frames.html");

		driver.manage().window().maximize();
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	
	
	@Test
	public void testFramesWithIDorName() {
		driver.switchTo().frame("left");
		
		WebElement leftmsg = driver.findElement(By.tagName("p"));
		assertEquals("This is Left Frame",leftmsg.getText());
	}

	
	
	@Test
	public void testFramesWithIndex() {
		
		driver.switchTo().frame(1);
		WebElement msg = driver.findElement(By.tagName("p"));
		assertEquals("This Frame doesn't have id or name",msg.getText());
	}

	
	
	@Test
	public void testFramesWithContents() {
	
	List<WebElement> frames = driver.findElements(By.tagName("frame"));		
	
	for(WebElement testframe : frames) {
		driver.switchTo().frame(testframe);
	if	(driver.getPageSource().contains("This Frame doesn't have id or name")) {
		assertTrue(true);
		break;
		} else
		
		driver.switchTo().defaultContent();	
		}
	}
	
	
	@Test
	public void testiFrames() {
		
		driver.switchTo().frame("right");
		WebElement twitterFrame = driver.findElement(By.tagName("iframe"));
	
		driver.switchTo().frame(twitterFrame);
		

		WebElement button = driver.findElement(By.id("follow-button"));
		button.click();
		
		String parentWindow = driver.getWindowHandle();
		
		Set<String> allWindows = driver.getWindowHandles();
		
		if(!allWindows.isEmpty()) {
			
			for(String windowID : allWindows) {
				
			driver.switchTo().window(windowID);
		
			if(driver.getTitle().equals("Unmesh Gundecha (@upgundecha) on Twitter")) {
				assertTrue("Twitter Login Popup Window Found",true);
				driver.close();
				break;
			}
			
			}
			
		}
			driver.switchTo().window(parentWindow);
			driver.switchTo().defaultContent();
	}
}
