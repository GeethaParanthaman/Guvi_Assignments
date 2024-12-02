package assignment20;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SignUpGuvi {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		signUp();
	}

	public static void signUp() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.navigate().to("https://www.guvi.in");
		// signup button
		driver.findElement(By.xpath("//a[text()='Sign up']")).click();
		
		driver.findElement(By.id("name")).sendKeys("SaranGeer");
		driver.findElement(By.id("email")).sendKeys("geesaraaa3@test.com");
		driver.findElement(By.id("password")).sendKeys("Guvi@2024");
		driver.findElement(By.id("mobileNumber")).sendKeys("7777777777");
		setImplicitWait(2);
		// driver.findElement(By.xpath("//a[@id='signup-btn']"));
		driver.findElement(By.linkText("Sign Up")).click();
		setImplicitWait(2);
		WebElement currentProfileDropDown = driver
				.findElement(By.xpath("//div[@class='form-group']//select[@id='profileDrpDwn']"));
		Select selectObj = new Select(currentProfileDropDown);
		selectObj.selectByValue("Student");
		setImplicitWait(2);
		WebElement degreeSelection=driver.findElement(By.xpath("//div[@class='form-group']//select[@id='degreeDrpDwn']"));
		Select selectDegreeDropdownObj = new Select(degreeSelection);
		selectDegreeDropdownObj.selectByValue("B.Com. / M.Com.");
		setImplicitWait(2);
		driver.findElement(By.id("year")).sendKeys("2024");
		setImplicitWait(2);
		driver.findElement(By.id("details-btn")).click();
		setImplicitWait(3);
		String screenTitle = driver.getTitle();
		System.out.println("Scren title is:" + screenTitle);
		// content in screen after signup process
		String messageDisplay = driver.findElement(By.xpath("//div[@class='left-head']")).getText();
		System.out.println("Signup process is completed!!\n" + messageDisplay);

		// navigate to guvi initial screen to click on login button
		driver.navigate().back();
		setImplicitWait(4);
		driver.findElement(By.id("login-btn")).click();
		setImplicitWait(2);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("geethasarangaraj@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Akshiakshara@1807");
		setImplicitWait(3);
		driver.findElement(By.xpath("//a[@id='login-btn']")).click();
		setImplicitWait(3);
		String aftrLoginTitle = driver.getTitle();
		System.out.println("login screen title:" + aftrLoginTitle);
		driver.close();
	}

	public static void setImplicitWait(long seconds) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
	}

}
