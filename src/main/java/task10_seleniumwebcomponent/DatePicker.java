package task10_seleniumwebcomponent;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePicker {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		datepicker();

	}

	public static void datepicker() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://jqueryui.com/datepicker");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement iframe = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//iframe")));
		driver.switchTo().frame(iframe);
		setImplicitWait(1);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='datepicker']"))).click();

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@data-handler='next']"))).click();

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@data-date='22']"))).click();

		String selectedDate = driver.findElement(By.xpath("//input[@id='datepicker']")).getAttribute("value");
		System.out.println(selectedDate);
		driver.quit();

	}

	public static void setImplicitWait(long seconds) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
	}

}
