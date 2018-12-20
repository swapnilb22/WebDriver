package scripts.resources;

import static org.junit.Assert.*;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows_Handel {

	WebDriver driver;
	@Before
	public void setUp() throws Exception {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\swapnil\\eclipse-workspace\\WebDriver\\test\\scripts\\resources\\chromedriver.exe");
		 driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
		driver.navigate().to("http://cookbook.seleniumacademy.com/Config.html");

		
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void testWindowPopup() {
	//	fail("Not yet implemented");
	String parentWindowID = driver.getWindowHandle();
	driver.findElement(By.id("helpbutton")).click();
	try {
	driver.switchTo().window("HelpWindow");
	}
	catch(NoSuchWindowException e) {
		e.printStackTrace();
	System.out.println("Window not present");
	}
assertEquals("Help",driver.getTitle());

driver.switchTo().window(parentWindowID);
assertEquals("Build my Car - Configuration", driver.getTitle());	
	}
	
	
	@Test
	public void testWindowPop2(){
		String parentWindowID = driver.getWindowHandle();
		driver.findElement(By.id("visitbutton")).click();
		try {
			
			driver.switchTo().window("VisitUsWindow");
			}
		catch(NoSuchWindowException e) {
			e.printStackTrace();
	System.out.println("Windows not present");
		}
	assertEquals("Visit Us",driver.getTitle());
	driver.switchTo().window(parentWindowID);
	assertEquals("Build my Car - Configuration", driver.getTitle());
}
	@Test
	public void testWindowsUsingTitle() {
		String parentWindowID = driver.getWindowHandle();
		driver.findElement(By.id("visitbutton")).click();
		Set<String> allWindows = driver.getWindowHandles();
		if(!allWindows.isEmpty()) {
		for(String windowID : allWindows) {
			try {
				
				if(driver.switchTo().window(windowID).getTitle().equals("Visit Us")) {
					String visitUsWindowHandel =driver.getWindowHandle();
							driver.close();
					break;
				}
			}
			catch(NoSuchWindowException e) {
				e.printStackTrace();
			}
			
		}
	}
		driver.switchTo().window(parentWindowID);
		assertEquals("Build my Car - Configuration", driver.getTitle());
}

	@Test
	public void testWindowsHandleByPageSource() {
		String parentWindowId = driver.getWindowHandle();
		driver.findElement(By.id("chatbutton")).click();
		Set<String> allWindow = driver.getWindowHandles();
		if(!allWindow.isEmpty()) {
			for(String windowID : allWindow) {
				if(driver.switchTo().window(windowID).getPageSource().contains("Build my Car - Configuration - Online Chat")) {
				//if(driver.getPageSource().contains("Build my Car - Configuration - Online Chat")) {
				try {
					
					driver.findElement(By.id("closebutton")).click();
					break;
					
				}
				catch(NoSuchWindowException e) {
					e.printStackTrace();
				}
				
			}
			}
		}
		driver.switchTo().window(parentWindowId);
		assertEquals("Build my Car - Configuration", driver.getTitle());
	
	}
}
