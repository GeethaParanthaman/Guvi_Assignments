package task10_seleniumwebcomponent;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		dragAndDrop();
		}
	public static void dragAndDrop() throws InterruptedException
	{
	
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://jqueryui.com/droppable");
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	
	WebElement iframe=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//iframe")));
	driver.switchTo().frame(iframe);
	//<iframe src="/resources/demos/droppable/default.html" ></iframe>
	
	WebElement draggableElement=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='draggable']")));
	WebElement droppableElement=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='droppable']")));
	Actions actionObject=new Actions(driver);
	
	actionObject.dragAndDrop(draggableElement, droppableElement).build().perform();
	String droppedText=droppableElement.getText();
	System.out.println(droppedText);
	if(droppedText=="Dropped!")
	{
		System.out.println("dropped successfully");
	}
	String backgroundColor=droppableElement.getCssValue("background-color");
	System.out.println("background color"+backgroundColor);
	String hexColor = rgbaToHex(backgroundColor);
    System.out.println("Hexadecimal Color: " + hexColor);
}
	
	public static String rgbaToHex(String rgba) {
        // Extract RGB values from the CSS value
        String[] values = rgba.replace("rgba(", "").replace("rgb(", "").replace(")", "").split(",");
        int r = Integer.parseInt(values[0].trim());
        int g = Integer.parseInt(values[1].trim());
        int b = Integer.parseInt(values[2].trim());

        // Convert RGB to Hex
        return String.format("#%02x%02x%02x", r, g, b).toUpperCase();
	}
}