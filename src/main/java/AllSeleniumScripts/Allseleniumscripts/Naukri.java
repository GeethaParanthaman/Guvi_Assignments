package AllSeleniumScripts.Allseleniumscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Naukri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		naukri();

	}
	public static void naukri()
	{

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.naukri.com");
		driver.manage().window().maximize();
		String value=driver.findElement(By.xpath("//div[@id='naukri-desktop-awareness-wdgt']")).getCssValue("background");
		System.out.println(value);
	}
	

}
