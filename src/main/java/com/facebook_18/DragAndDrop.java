package com.facebook_18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		dragAndDrop();
		

	}
	public static void dragAndDrop() throws InterruptedException
	{
	
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://jqueryui.com/droppable");
	waitTime(3000);
	WebElement iframe=driver.findElement(By.xpath("//iframe"));
	driver.switchTo().frame(iframe);
	//<iframe src="/resources/demos/droppable/default.html" ></iframe>
	waitTime(1000);
	WebElement draggableElement=driver.findElement(By.xpath("//div[@id='draggable']"));
	WebElement droppableElement=driver.findElement(By.xpath("//div[@id='droppable']"));
	Actions actionObject=new Actions(driver);
	
	actionObject.dragAndDrop(draggableElement, droppableElement).build().perform();
	waitTime(2000);
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
	public static void waitTime(int time) throws InterruptedException
	{
		Thread.sleep(time);
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