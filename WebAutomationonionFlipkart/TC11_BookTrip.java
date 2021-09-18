package bd.com.TestAutomation2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TC11_BookTrip  extends DriveSet{
	public static String baseURL = "https://www.flipkart.com";
	@Test // TestNG Annotation
	public static void PlaceOrder() throws InterruptedException {
	driver.get(baseURL); // Get base url and run on browser
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize(); // maximize the browser window

	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click(); // click is a method used for click perform
	Thread.sleep(1000);
	driver.findElement(By.xpath("//div[contains(text(),'Travel')]")).click(); // click is a method used for click perform
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@class=('_1w3ZZo _1YBGQV lZd1T6 _2vegSu _2mFmU7')]")).sendKeys("Mumbai, BOM - Chatrapati Shivaji International Airport"); // click is a method used for click perform
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@class=('_1w3ZZo _1YBGQV lZd1T6 _2dqBfU _2mFmU7')]")).sendKeys("Chennai, MAA - Chennai International Airport, India"); // click is a method used for click perform
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@class=('_1w3ZZo _2gKfhi _2mFmU7')]")).sendKeys("19 Sep, Sun"); // click is a method used for click perform
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@class=('_1w3ZZo _2gKfhi _2mFmU7')]")).sendKeys("21 Sep, Tue"); // click is a method used for click perform
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@class=('_1w3ZZo -Gn7o5 _2mFmU7')]")).sendKeys("1 Traveller | Economy "); // click is a method used for click perform
	Thread.sleep(1000);
	
}
}
