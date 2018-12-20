package scripts.resources;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class Googlelinks {
RemoteWebDriver  driver;
	@Before
	public void setUp() throws Exception {
	
			//System.setProperty("webdriver.gecko.driver", "C:\\Users\\swapnil\\eclipse-workspace\\WebDriver\\test\\scripts\\resources\\geckodriver64bit.exe");
			//driver = new FirefoxDriver();
		DesiredCapabilities capabilities = new DesiredCapabilities();	
		capabilities.setBrowserName("chrome");
		driver = null;
		try {
			driver =new RemoteWebDriver(new URL("http://192.168.0.105:4444/wd/hub"),capabilities);
			}catch(MalformedURLException e) {
				e.printStackTrace();
			}
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\swapnil\\eclipse-workspace\\WebDriver\\test\\scripts\\resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

		driver.get("http://www.google.com");
		List <WebElement> allGoogleLinks = driver.findElements(By.tagName("a"));

		System.out.println("Total no of links on page is "+ allGoogleLinks.size());
		for (WebElement w : allGoogleLinks) {
			System.out.println(w.getText() + "-" + w.getAttribute("href"));
		}

	}
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {

		}
		
	
	}


