package scripts.resources;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

public class Add_Agent extends LoadableComponent <Add_Agent>{

	@FindBy (xpath="//*[@id=\"adminMenu\"]/li[3]/a/text()")
	public WebElement agent_mgmt;
	
	@FindBy (xpath = "/html/body/app-root/div/div/app-agent-managment/div[1]/div[1]/div[2]/a[2]")
	public WebElement add_agent_button;
	
	WebDriver driver;

	String title ="Propi - Anti Money Laundering";
public Add_Agent(WebDriver driver) {
	this.driver =driver;
	PageFactory.initElements(driver, this);
	driver.get();
}

 	load(){
	
}

 	isLoaded(){
 	assertTrue(driver.getTitle().equals(title));
 	}

public void addone();
agent_mgmt.
}
