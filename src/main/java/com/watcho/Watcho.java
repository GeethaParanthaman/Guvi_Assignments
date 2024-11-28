package com.watcho;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Watcho {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		watcho();


	}
	public static void watcho()
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com");
		WebElement searchbox=driver.findElement(By.className("gLFyf"));
		searchbox.sendKeys("watcho plans");
		searchbox.sendKeys(Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//*[contains(text(),'plans-offers.watcho.com')])[1]")).click();
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	

}
