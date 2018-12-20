package scripts.resources;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GmailLogin {
	 
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\swapnil\\eclipse-workspace\\WebDriver\\test\\scripts\\resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
	driver.navigate().to("https://www.google.com/");
		
	/*try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}*/
	
	WebDriverWait wait = new WebDriverWait(driver, 20000);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Gmail')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Gmail')]")).click();
	
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(text(),'Sign In')]")).click();
		
		//String URL= driver.getCurrentUrl();
		//System.out.println(URL);
		
		/*driver.navigate().back();
		String URL2 =driver.getCurrentUrl();
		System.out.println(URL2);
		
		driver.navigate().forward();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.navigate().refresh();
		driver.close();
	
		}
	*/	
		
		//driver.navigate().to("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		//driver.findElement(By.linkText("Sign In")).click();
		/*
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		*/
		//WebDriverWait wait3 = new WebDriverWait(driver, 20000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='identifier']")));
			//System.out.println("Exe upto here");
			driver.findElement(By.xpath("//input[@name='identifier']")).click();
			//System.out.println("Field found");
			driver.findElement(By.xpath("//input[@name='identifier']")).sendKeys("bhaskarswapnil22");
		
		driver.findElement(By.xpath("//*[@id='identifierNext']/content/span")).click();
	
		System.out.println("Exe upto here");
		/*try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		//WebDriverWait wait4 = new WebDriverWait(driver, 20000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='password']")));
		
		driver.findElement(By.xpath("//input[@name='password']")).click();
		System.out.println("Field found");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("9226853595");
		
		driver.findElement(By.xpath("//*[@id='passwordNext']/content/span")).click();
		
		//WebDriverWait wait1 = new WebDriverWait(driver, 20000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'COMPOSE')]")));	
		
		driver.findElement(By.xpath("//*[contains(text(),'COMPOSE')]")).click();
		
		//WebDriverWait wait = new WebDriverWait(driver, 20000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='to']")));	
		driver.findElement(By.xpath("//*[@name='to']")).click();
		System.out.println("Focused on to");
		driver.findElement(By.xpath("//*[@name='to']")).sendKeys("bhaskarswapnil22@gmail.com");
		driver.findElement(By.xpath("//*[@name='subjectbox']")).sendKeys("Automation Script Test");
		driver.findElement(By.xpath("//*[@role='textbox']")).sendKeys("Hi this is swapnil. This Email is send through Selenium script");
		driver.findElement(By.xpath("//*[contains(text(),'Send') and @role='button']")).click();
	}

	}

