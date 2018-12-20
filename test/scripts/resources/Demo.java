package scripts.resources;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver;

System.setProperty("webdriver.gecko.driver", "C:\\Users\\swapnil\\eclipse-workspace\\WebDriver\\test\\scripts\\resources\\geckodriver64bit.exe");
driver = new FirefoxDriver();
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

if (pageTitle.equals("Selenium - Wikipedia"))
System.out.println("Page Title Test case passed");
else
	System.out.println("Page Title Test case failed");
	
if (pageHeader.equals("Selenium"))
System.out.println("Page Header Test case passed");
else
	System.out.println("Page Header Test case failed");	
	
	}

}
