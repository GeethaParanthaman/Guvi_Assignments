package multipleelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.annotations.VisibleForTesting;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MutipleElements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		gafSite();

	}
	public static void gafSite() throws InterruptedException
	{
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://www.gaf.com");
	/*List<WebElement> element=driver.findElements(By.xpath("//a[@href='/en-us/plan-design']"));
	for(int i=0;i<=element.size()-1;i++)
	{
		String text=element.get(i).getText();
		System.out.println(text);
	}*/
	Thread.sleep(2000);
	WebElement element1=driver.findElement(By.xpath("//span[text()='Homeowners']"));
	element1.click();
	Thread.sleep(2000);
	String url=driver.getCurrentUrl();
	String PageText=driver.findElement(By.xpath("//h1")).getText();
	System.out.println(PageText);
	if(PageText.equalsIgnoreCase(PageText));
	
}
}
