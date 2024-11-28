package seleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		wikipedia();

	}

	public static void wikipedia() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.wikipedia.org");
		driver.manage().window().maximize();
		WebElement searchInput = driver.findElement(By.id("searchInput"));
		searchInput.sendKeys("Artificial Intelligence");
		waitForTime(2000);

		driver.findElement(By.xpath("(//div[@class='suggestion-text'])[1]")).click();
		waitForTime(2000);
		driver.findElement(By.linkText("History")).click();
		waitForTime(1000);
		String currentpageTitle=driver.getTitle();
		System.out.println("The current page title is:"+currentpageTitle);

	}

	public static void waitForTime(int time) throws InterruptedException {
		Thread.sleep(time);
	}

}
