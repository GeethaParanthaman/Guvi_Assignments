package project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonFunctions {
	public static WebDriver driver;
	
	
	
public static void browserIntialization()
{
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().window().maximize();

}
/*public static void urlNavigation(String URL)
{
driver.navigate().to(URL);

}*/
public static void urlNavigation(String url) {
    if (driver != null) {
        driver.get(url);
    } else {
        System.out.println("Driver is not initialized. Call browserInitialization() first.");
    }
}
}
