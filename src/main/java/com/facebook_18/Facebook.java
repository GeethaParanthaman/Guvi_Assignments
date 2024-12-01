package com.facebook_18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		facebook();

	}
	public static void facebook() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com");
		driver.findElement(By.xpath("//div[@class='_6ltg']//a")).click();
		wait(1000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Geetha");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Motonew");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("newtest@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Test@123");
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		
		WebElement dayElement=driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select select=new Select(dayElement);
		wait(1000);
		select.selectByIndex(11);
		WebElement elementmonth= driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select selectMonth=new Select(elementmonth);
		wait(1000);
		selectMonth.selectByVisibleText("May");
		WebElement elementYear=driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select selectYear=new Select(elementYear);
		wait(1000);
		selectYear.selectByValue("1985");
		driver.findElement(By.xpath("//button[@type='submit' and text()='Sign Up']")).click();
		wait(1000);
	
	}
public static void wait(int time) throws InterruptedException
{
	Thread.sleep(time);
}
}
