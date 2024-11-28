package AllSeleniumScripts.Allseleniumscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IframeExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		iframeExample();
		

	}
	public static void iframeExample() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://yopmail.com");
		waitForTime(1000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@class='ycptinput']")).sendKeys("aswath123@yopmail.com");
		driver.findElement(By.xpath("//button[@title='Check Inbox @yopmail.com']")).click();
	}		
		
	public static void waitForTime(int time) throws InterruptedException
	{
		Thread.sleep(time);
	}


}
