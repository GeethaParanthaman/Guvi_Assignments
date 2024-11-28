package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pages {
public static WebDriver driver;	
	public Pages(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Today's Deals")
	
	WebElement todayLinkelement;
	
	public void todayLink()
	{
		todayLinkelement.click();
		
	}
}
