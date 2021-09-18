package bd.com.TestAutomation2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TC12_OrderBags extends DriveSet{
	public static String baseURL = "https://www.flipkart.com";
	@Test // TestNG Annotation
	public static void FindingElements() throws InterruptedException {
	driver.get(baseURL); // Get base url and run on browser
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize(); // maximize the browser window
	Thread.sleep(1000); // used for  waiting 
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click(); // click is a method used for click perform
	Thread.sleep(1000);
	// handle new tab
	String ParentWindowHandle=driver.getWindowHandle();
	System.out.println("ParentWindowHandle"+ParentWindowHandle);
	driver.findElement(By.xpath("//div[contains(text(),'Sling Bags')]")).click(); // click is a method used for click perform
	Thread.sleep(1000);
	driver.findElement(By.xpath("//a[contains(text(),'Blue Women Sling Bag - Extra Spacious')]")).click(); // click is a method used for click perform
	Thread.sleep(1000);
	System.out.println(driver.getTitle());
	for(String childTab :driver.getWindowHandles())
	{
		driver.switchTo().window(childTab);
		
	}
	Thread.sleep(1000);
	System.out.println(driver.getTitle());
     driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA ihZ75k _3AWRsL']")).click();
 	driver.findElement(By.xpath("//input[@class=('_2IX_2- _17N0em')]")).sendKeys("+919090407378"); // click is a method used for click perform
 	Thread.sleep(1000);
 	driver.findElement(By.xpath("//button[@class='_2KpZ6l _20xBvF _3AWRsL']")). click();// click is a method used for click perform
 	Thread.sleep(1000);
 	
}
}