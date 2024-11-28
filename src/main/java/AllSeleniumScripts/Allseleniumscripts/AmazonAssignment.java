package AllSeleniumScripts.Allseleniumscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		amzonAssignment();
		
	}

		public static void amzonAssignment()
		{
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.navigate().to("https://www.amazon.com");
			driver.manage().window().maximize();
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Shoes");
			driver.findElement(By.id("nav-search-submit-button")).click();
			driver.findElement(By.xpath("(//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-4'])[1]")).click();
			//firstName.getText();
	}

}
