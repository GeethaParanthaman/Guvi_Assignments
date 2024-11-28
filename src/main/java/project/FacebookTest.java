package project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookTest extends CommonFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		browserIntialization();

		urlNavigation("https://www.flipkart.com");
		FacebookPage pageObject = new FacebookPage(driver);
		pageObject.grocery();

	}

}
