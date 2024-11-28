package assignment_19_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsSelenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		seleniumLocators();
	
	}
		public static void seleniumLocators() throws InterruptedException {
			
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.guvi.in/");
		driver.findElement(By.linkText("Courses"));
		//wait(1000);
		driver.findElement(By.id("solutionslink"));
		driver.findElement(By.xpath("//p[@id='practiceslink']"));
		driver.findElement(By.className("bg-base-100"));
		driver.findElement(By.tagName("img"));
		driver.findElement(By.cssSelector("#resourceslink"));
	}
		public static void wait(int time) throws InterruptedException
		{
			Thread.sleep(time);
		}
}
