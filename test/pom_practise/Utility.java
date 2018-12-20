/**
 * 
 */
package pom_practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author swapnil
 *
 */
public class Utility {
static WebDriver driver;

public static WebDriver browserStart(String browserName, String url) 
	{
	
	if(browserName.equalsIgnoreCase("chrome")) 
	
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\swapnil\\eclipse-workspace\\WebDriver\\test\\scripts\\resources\\chromedriver.exe");
	 driver=new ChromeDriver();
	
	}else
		{
		
		System.out.println("Use Chrome Browser");
		
		}
	
driver.get(url);
driver.manage().window().maximize();

return driver;
}


}
