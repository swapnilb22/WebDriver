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

public class GooglelinksTestCopy {
WebDriver driver;
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\swapnil\\eclipse-workspace\\WebDriver\\test\\scripts\\resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

	
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		//fail("Not yet implemented");
		driver.get("http://www.google.com");
		List <WebElement> allGoogleLinks = driver.findElements(By.tagName("a"));

		System.out.println("Total no of links on page is "+ allGoogleLinks.size());
		for (WebElement w : allGoogleLinks) {
			System.out.println(w.getText() + "-" + w.getAttribute("href"));
		}

	}

}
