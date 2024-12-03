package JATTask_11;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerificationWindow {
	public static WebDriver driver;


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		windowVerification();

	}
	public static void windowVerification() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://the-internet.herokuapp.com/windows");
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Click Here"))).click();
		Set<String> windowHandles = driver.getWindowHandles();
		Iterator<String> iterator=windowHandles.iterator();
		String parentWindow=iterator.next();
		String nextWindow=iterator.next();
		driver.switchTo().window(nextWindow);
		WebElement newWindowText=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3")));
		String Text=newWindowText.getText();
		
		if(Text=="New Window")
		{
		System.out.println("New Window is present on the page");	
		}
		else 
			System.out.println("New window text is not available in the screen");
		driver.close();
		driver.switchTo().window(parentWindow);
		if(driver.findElement(By.xpath("//h3")).getText() != null)
		{
		System.out.println("Original window is Active");
		}
		else
		{
			System.out.println("Original window is not Active");
		}
		driver.close();
		System.out.println("All browser instances are closed");
}

	}