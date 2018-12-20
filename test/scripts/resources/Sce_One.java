package scripts.resources;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sce_One {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver;
	
System.setProperty("webdriver.chrome.driver","C:\\Users\\swapnil\\eclipse-workspace\\WebDriver\\test\\scripts\\resources\\chromedriver.exe");
driver=new ChromeDriver();

WebDriverWait wait = new WebDriverWait(driver,30); 
			
driver.navigate().to("http://the-internet.herokuapp.com/dynamic_loading/1");

driver.manage().window().maximize();
WebElement startButton = driver.findElement(By.xpath("//*[@id='start']/button"));
wait.until(ExpectedConditions.visibilityOf(startButton));
startButton.click();
System.out.println("Clicked");



WebElement finish =driver.findElement(By.xpath("//*[@id='finish']/h4"));
wait.until(ExpectedConditions.visibilityOf(finish));
String Text = finish.getText();
//assertEquals("Hello World!",Text);
System.out.println(Text);

	
	}
}
