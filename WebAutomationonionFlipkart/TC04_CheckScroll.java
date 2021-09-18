package bd.com.TestAutomation2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TC04_CheckScroll extends DriveSet{
	public static String baseURL = "https://www.flipkart.com";
	@Test // TestNG Annotation
	public static void selectScroll() throws InterruptedException {
	driver.get(baseURL); // Get base url and run on browser
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize(); // maximize the browser window
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click(); // click is a method used for click perform
	Thread.sleep(1000);
	 JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//Scroll to Bottom
		 Thread.sleep(5000);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		Thread.sleep(5000);
		//Scroll to Top
		js.executeScript("window.scrollTo(document.body.scrollHeight,0);");
		Thread.sleep(5000);
		//Scroll to specific Element
		WebElement e=driver.findElement(By.xpath("//body/div[@id='container']/div[1]/div[3]/div[4]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/a[1]/div[1]/div[1]/img[1]"));
		js.executeScript("arguments[0].scrollIntoView();",e);
		
		Thread.sleep(5000);
}
}