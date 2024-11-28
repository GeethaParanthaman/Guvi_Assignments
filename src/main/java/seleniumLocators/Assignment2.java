package seleniumLocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		websiteTitle();

	}
	public static void websiteTitle()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.demoblaze.com");
		driver.manage().window().maximize();
		String currentWebsiteUrl=driver.getTitle();
		System.out.println("Page titel is:"+currentWebsiteUrl);
		if(currentWebsiteUrl.contentEquals("STORE"))
		{
			System.out.println("Page landed on correct website");
		}
		else
		{
			System.out.println("Page not landed on correct website");
		}
		
	}

}
