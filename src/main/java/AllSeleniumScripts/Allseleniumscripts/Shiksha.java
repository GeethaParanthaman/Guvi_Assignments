package AllSeleniumScripts.Allseleniumscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Shiksha {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		shiksha();

	}
	public static void shiksha() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.shiksha.com/");
		driver.manage().window().maximize();
		//driver.navigate().to("https://www.google.com/");
		//driver.navigate().back();
		waitForTime(3000);
		//driver.findElement(By.id(//div[@class='n-headerP innerpage-header']));
		//WebElement element=driver.findElement(By.cssSelector("background-color"));
		//System.out.println(element);
		

}
	public static void waitForTime(int time) throws InterruptedException
	{
		Thread.sleep(time);
	}
	}