package assignment20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePicker{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		datepicker();
		

	}
	public static void datepicker() throws InterruptedException
	{
	
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://jqueryui.com/datepicker");
	WebElement iframe=driver.findElement(By.xpath("//iframe"));
	driver.switchTo().frame(iframe);
	waitTime(1000);
	driver.findElement(By.xpath("//input[@id='datepicker']")).click();
	waitTime(2000);
	driver.findElement(By.xpath("//a[@data-handler='next']")).click();
	waitTime(3000);
	driver.findElement(By.xpath("//a[@data-date='22']")).click();
	waitTime(3000);
	String selectedDate=driver.findElement(By.xpath("//input[@id='datepicker']")).getAttribute("value");
	System.out.println(selectedDate);
	driver.quit();
	
}
	public static void waitTime(int time) throws InterruptedException
	{
		Thread.sleep(time);
	}
	
}
