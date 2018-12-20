package scripts.resources;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableAssignmentOne extends WebTable {

	int row_no =1;
	int col_no;
public WebTableAssignmentOne(WebElement webTable) {
		super(webTable);
		// TODO Auto-generated constructor stub
		}
 		WebDriver driver;
 
public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\swapnil\\eclipse-workspace\\WebDriver\\test\\scripts\\resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.navigate().to("http://the-internet.herokuapp.com/tables");
		driver.manage().window().maximize();
		WebElement tableOne = driver.findElement(By.xpath("//table[@id='table1']"));
		 
	
		 WebTableAssignmentOne WB1 = new WebTableAssignmentOne(tableOne);		
		 int RowCount = WB1.getRowCount();
		 System.out.println("Total Row = "+RowCount);
		 
		 System.out.println("Total Column = "+WB1.getColumnCount());
		 
		 System.out.println("Total Data row = "+WB1.getDataRowCount());
	
		 System.out.println("Data at Cell 3,1 = "+WB1.getCellData(3, 1));
		 System.out.println("Data at Cell 3,2 = "+WB1.getCellData(3, 2));
		 System.out.println("Data at Cell 3,3 = "+WB1.getCellData(3, 3));
		 System.out.println("Data at Cell 3,4 = "+WB1.getCellData(3, 4));
		 System.out.println("Data at Cell 3,5 = "+WB1.getCellData(3, 5));
		 
		 
		 //WB1.getCellEditor(3,6,1).click();
		 //System.out.println("Delete Action happened");
System.out.println("All Table Data");

				
List<WebElement> tr_collection=tableOne.findElements(By.xpath("id('table1')/tbody/tr"));

int row_num,col_num;
row_num=1;

for(WebElement trElement : tr_collection)
{
    List<WebElement> td_collection=trElement.findElements(By.xpath("td"));

    col_num=1;
    for(WebElement tdElement : td_collection)
    {
/*    	to written cell position and data of particular cell
    String Exp =tdElement.getText();  >>> 
    	if(Exp.equals("Doe")) {*/
        System.out.println("row # "+row_num+", col # "+col_num+ " text="+tdElement.getText());
        col_num++;
    }
    row_num++;
}    } 
}


		 
		 



