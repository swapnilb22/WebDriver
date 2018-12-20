package scripts.resources;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.DriverFactory;

public class Alert_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\swapnil\\eclipse-workspace\\WebDriver\\test\\scripts\\resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
		driver.navigate().to("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
	
		//1st Button
		
		driver.findElement(By.xpath("//*[@id='content']/div/ul/li[1]/button")).click();
		try
		{
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		alert.accept();
		System.out.println(alertText);
		} 
		catch(NoAlertPresentException e) 
		{
		e.printStackTrace();
		}
		
		
		//2nd Button
		
		driver.findElement(By.xpath(".//*[@id='content']/div/ul/li[2]/button")).click();
		try {
		
			Alert alert = driver.switchTo().alert();
			System.out.println(alert.getText());
			alert.dismiss();
			
			}
		catch(NoAlertPresentException e) {
			e.printStackTrace();
		}
		
		//3rd Button
		driver.findElement(By.xpath(".//*[@id='content']/div/ul/li[3]/button")).click();
		try {
		
			Alert alert = driver.switchTo().alert();
	//		System.out.println(alert.getText());
			//driver.switchTo().alert().sendKeys("Helllo");
			alert.sendKeys("Swapnil");
			alert.accept();
			}
		catch(NoAlertPresentException e) {
			e.printStackTrace();
		}
		
		}

}
	