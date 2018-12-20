package scripts.resources;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToolsQAPracticeForm {
WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\swapnil\\eclipse-workspace\\WebDriver\\test\\scripts\\resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.navigate().to("http://toolsqa.com/automation-practice-form/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys("Swapnil");
		driver.findElement(By.xpath("//*[@name='lastname']")).sendKeys("Bhaskar");
		
		driver.findElement(By.xpath("//*[@id='sex-0']")).click();
		
		driver.findElement(By.xpath("//*[@id='exp-2']")).click();
		
		driver.findElement(By.id("datepicker")).sendKeys("28/01/1994");;
	
		WebElement ManualTester = driver.findElement(By.id("profession-0"));
		if(!ManualTester.isSelected()) {
		ManualTester.click();
		}
		
		
		WebElement QTP = driver.findElement(By.id("tool-0"));
		WebElement IDE = driver.findElement(By.id("tool-1"));
		WebElement WebDr = driver.findElement(By.id("tool-2"));
	
		
		
		if(!QTP.isSelected()) {
			QTP.click();
		}
	
		if(!IDE.isSelected()) {
			IDE.click();
		}
	
		if(!WebDr.isSelected()) {
			WebDr.click();
		}
	
		
		
		
		WebElement continent = driver.findElement(By.id("continents"));

		List <WebElement> allOptions = continent.findElements(By.tagName("option"));

		int no_of_elements = allOptions.size();
		System.out.println(no_of_elements);
		
		for(int i=0; i<no_of_elements; i++) {
			System.out.println(allOptions.get(i).getText());
		}
			Select DropDown =new Select(continent);
			DropDown.selectByVisibleText("Africa");
		
		
			
			if(DropDown.isMultiple()){
				System.out.println("This is multiselect");
			}
			else {
				System.out.println("This is dropdown");
			}
			
		
			
		WebElement commands =driver.findElement(By.xpath("//*[@id='selenium_commands']"));
		Select multiselect = new Select(commands);
		List <WebElement> alloptions1 = multiselect.getOptions();
		int totalOptions = alloptions1.size();
		System.out.println(totalOptions);
		
		for (int j=0; j<totalOptions; j++) {
			System.out.println(alloptions1.get(j).getText());
			}
			
		multiselect.selectByVisibleText("Navigation Commands");
		multiselect.selectByVisibleText("Wait Commands");
		
		WebElement selected = multiselect.getFirstSelectedOption();
		System.out.println(selected.getText());
		driver.findElement(By.id("submit")).click();

		
		
		if(multiselect.isMultiple()){
			System.out.println("This is multiselect");
		}
		else {
			System.out.println("This is dropdown");
		}
		
		
		driver.close();
		}
	}
		
	


