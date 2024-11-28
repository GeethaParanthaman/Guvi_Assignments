package seleniumLocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fireFoxBrowser();

	}

	public static void fireFoxBrowser() {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com");
		String currentUrl = driver.getCurrentUrl();
		System.out.println("The Current URL is: " + currentUrl);
		driver.navigate().refresh();
		driver.quit();
	}
}
