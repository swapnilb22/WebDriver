package scripts.resources;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLinks {
WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\swapnil\\eclipse-workspace\\WebDriver\\test\\scripts\\resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		
		List<WebElement> allGoogleLinks = driver.findElements(By.tagName("a"));
		System.out.println("no of links are" + allGoogleLinks.size());
		for (WebElement w :allGoogleLinks) {
System.out.println(w.getText() + "-" + w.getAttribute("href"));			
		}
	}

}
