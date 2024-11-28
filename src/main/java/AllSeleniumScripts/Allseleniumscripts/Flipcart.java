package AllSeleniumScripts.Allseleniumscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipcart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//flipCart();
		assignment3();

		
	}
public static void flipCart() throws InterruptedException
{
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.navigate().to("https://www.google.com/");
	driver.navigate().back();
	waitForTime(3000);
	int imageText=driver.findElements(By.xpath("//span[@class='_1XjE3T']")).size();
	System.out.println(imageText);
	int imgCount=driver.findElements(By.xpath("//div[@class='_2GaeWJ']/img")).size();
	System.out.println(imgCount);
	int totalcount=imageText+imgCount;
	System.out.println(totalcount);
	
	
}
public static void assignment3() throws InterruptedException
{
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.navigate().to("https://www.google.com/");
		driver.navigate().back();
		waitForTime(3000);
		int imageText=driver.findElements(By.xpath("//span[@class='_1XjE3T']")).size();
		List<WebElement> textElements=driver.findElements(By.xpath("//span[@class='_1XjE3T']"));
		for(int i=1;i<=imageText;i++)
		{
			System.out.println(textElements.get(i-1).getText());
		}
}
public static void waitForTime(int time) throws InterruptedException
{
	Thread.sleep(time);
}


	}


