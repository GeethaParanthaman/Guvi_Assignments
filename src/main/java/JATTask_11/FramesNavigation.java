package JATTask_11;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesNavigation {
	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		framesNavigation();

	}
	public static void framesNavigation()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://the-internet.herokuapp.com/nested_frames");
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		//List<WebElement> frames=wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//frame")));
		//Verify that there are three frames on the page.

		WebElement topFrame=driver.findElement(By.xpath("//frame[@name='frame-top']"));
		driver.switchTo().frame(topFrame);
		List<WebElement> frames=driver.findElements(By.xpath("//frame"));
		int TopFramesCount=frames.size();
	   System.out.println("Number of frames available in the screen: "+TopFramesCount);
	   if(TopFramesCount==3)
	   {
		   System.out.println("Correct:There are 3 frames are in the page");
	   }
	   else
	   {
		   System.out.println("Wrong:There is no 3 frames in top layer");
	   }
	   //Switch to the left frame.

	   WebElement leftFrame=driver.findElement(By.xpath("//frame[@name='frame-left']"));
       driver.switchTo().frame(leftFrame);
       //Verify that the left frame has a text "LEFT".
      String leftFrameText= driver.findElement(By.xpath("//body")).getText();
      System.out.println("Textof left frame:"+leftFrameText);
      if(leftFrameText.equalsIgnoreCase("LEFT"))
    	  
      {
    	  System.out.println("Correct:Expected text is LEFT");
	   
      }
      else
      {
    	  System.out.println("Not working as expected");
      }
      //switch back to top frame
     
      
     driver.switchTo().parentFrame();
      //Switch to the middle frame.
      WebElement middleFrame=driver.findElement(By.xpath("//frame[@name='frame-middle']"));
      driver.switchTo().frame(middleFrame);
    //Verify that the left frame has a text "LEFT".
      String middleFrameText= driver.findElement(By.xpath("//body")).getText();
      System.out.println("Text of middle frame:"+middleFrameText);
      if(middleFrameText.equalsIgnoreCase("MIDDLE"))
    	  
      {
    	  System.out.println("Correct:Expected text is MIDDLE");
	   
      }
      else
      {
    	  System.out.println("Not working as expected");
      }
      
    //switch back to top frame
      driver.switchTo().parentFrame();
      //Switch to the right frame.
      WebElement rightFrame=driver.findElement(By.xpath("//frame[@name='frame-right']"));
      driver.switchTo().frame(rightFrame);
    //Verify that the left frame has a text "LEFT".
      String rightFrameText= driver.findElement(By.xpath("//body")).getText();
      System.out.println("Text of right frame:"+rightFrameText);
      if(rightFrameText.equalsIgnoreCase("RIGHT"))
    	  
      {
    	  System.out.println("Correct:Expected text is RIGHT");
	   
      }
      else
      {
    	  System.out.println("Not working as expected");
      }
      //switch to top frame
      driver.switchTo().parentFrame();
   // Go back to the main page
      driver.switchTo().defaultContent(); 
    //Switch to the bottom frame.
      WebElement bottomFrame=driver.findElement(By.xpath("//frame[@name='frame-bottom']"));
      driver.switchTo().frame(bottomFrame);
    //Verify that the left frame has a text "LEFT".
      String bottomFrameText= driver.findElement(By.xpath("//body")).getText();
      System.out.println("Text of right frame:"+bottomFrameText);
      if(bottomFrameText.equalsIgnoreCase("BOTTOM"))
    	  
      {
    	  System.out.println("Correct:Expected text is BOTTOM");
	   
      }
      else
      {
    	  System.out.println("Not working as expected");
      }

	
	

}
}
