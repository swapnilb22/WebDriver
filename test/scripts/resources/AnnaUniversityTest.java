package scripts.resources;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AnnaUniversityTest {

	WebDriver driver;
	@Before
	public void setUp() throws Exception {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\swapnil\\eclipse-workspace\\WebDriver\\test\\scripts\\resources\\chromedriver.exe");
		 driver=new ChromeDriver();
		
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.navigate().to("http://annauniv.edu/");

		driver.manage().window().maximize();
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}


	@Test
	public void test() {
	WebDriverWait wait = new WebDriverWait(driver, 300);
	
	//Clicking on Department	
	WebElement department = driver.findElement(By.xpath("//a[contains(text(),'Departments')]"));	
	wait.until(ExpectedConditions.visibilityOf(department));
	department.click();
	
	//Selecting option of ocean mgmt from Civil department
	WebElement civilDepartment = driver.findElement(By.xpath("//a[@name='link13']"));
	WebElement ocean_mgmt = driver.findElement(By.xpath("//*[@id='menuItemHilite33']"));

	Actions builder = new Actions(driver);
	builder.moveToElement(civilDepartment).click(ocean_mgmt).build().perform();
	
	//Getting page Titile
	wait.until(ExpectedConditions.titleContains("Institute For Ocean Management - Anna University offers M.Tech in Coastal Management. ENVIS Center for Coastal Zone Management and Coastal Shelterbelts"));
	assertEquals("Institute For Ocean Management - Anna University offers M.Tech in Coastal Management. ENVIS Center for Coastal Zone Management and Coastal Shelterbelts",driver.getTitle());
	
	//Clicking on Coastal Pollution Monitoring and Hazards from Research themes
	
	WebElement researchThemes = driver.findElement(By.xpath(".//a[@id='link3']"));
	WebElement costalPollution = driver.findElement(By.xpath("//*[@id='menuItemText13']"));
	
	builder.moveToElement(researchThemes).click(costalPollution).build().perform();
	
	//Getting page title
//	wait.until(ExpectedConditions.titleContains(":: IOM - Institute For Ocean Management -  Anna University ::"));
	assertEquals(":: IOM - Institute For Ocean Management - Anna University ::",driver.getTitle());
	//System.out.println(driver.getTitle());
	}

}
