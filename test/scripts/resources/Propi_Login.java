package scripts.resources;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Propi_Login extends LoadableComponent <Propi_Login>{

	@FindBy (name = "username")
	public WebElement email_field;
	
	@FindBy (name = "password")
	public WebElement password_field;
	
	@FindBy (xpath ="//button[@type='submit']")
	public WebElement submit_button;
	
	
	private WebDriver driver;
	private String url = "http://209.51.194.186:1131/#/login";
	private String title = "Propi - Anti Money Laundering";
	private WebDriverWait wait;
	public Propi_Login() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\swapnil\\eclipse-workspace\\WebDriver\\test\\scripts\\resources\\chromedriver.exe");
		 driver=new ChromeDriver();
		 wait = new WebDriverWait(driver,30);
		 PageFactory.initElements(driver, this);
		 driver.manage().window().maximize();
	}
			
	@Override
	public void load() {
		driver.get(url);
	}
	
	@Override
	public void isLoaded() {
		assertEquals("Home Page Not loaded Properely",title, driver.getTitle());
	}
	
	public void login(String id, String pass ) {
		email_field.sendKeys(id);
		password_field.sendKeys(pass);
		submit_button.click();
		}
}


