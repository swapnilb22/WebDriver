package scripts.resources;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolsQATable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\swapnil\\eclipse-workspace\\WebDriver\\test\\scripts\\resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.navigate().to("http://toolsqa.com/automation-practice-table/");
		driver.manage().window().maximize();
	WebElement table2 =	driver.findElement(By.xpath("//*[@id='content']/table"));
	System.out.println("Element found");
	
	
List<WebElement> tr_collection=table2.findElements(By.xpath("//*[@id='content']/table/tbody/tr"));

int row_num,col_num;
row_num=1;

for(WebElement trElement : tr_collection)
{
List<WebElement> td_collection=trElement.findElements(By.xpath("td"));

col_num=1;
for(WebElement tdElement : td_collection)
{

String Exp =tdElement.getText();   
if(Exp.equals("2004")) {
	System.out.println("2004 found");

}
//System.out.println("row # "+row_num+", col # "+col_num+ " text="+tdElement.getText());
col_num++;
}
row_num++;
}     

	
	}

}
