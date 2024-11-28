package task17.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Snapdeal {

	public static void main(String[] args) {
		snapDeal();
		// TODO Auto-generated method stub

	}
	public static void snapDeal()
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.snapdeal.com/");
		Actions action=new Actions(driver);
		WebElement signInButton=driver.findElement(By.className("accountInner"));
		action.moveToElement(signInButton).build().perform();
	}

}
