package project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookPage extends CommonFunctions {
	

	public FacebookPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Grocery")
	
	
	WebElement groceryelement;
	
	public void grocery()
	{
		groceryelement.click();
		
	}
}
