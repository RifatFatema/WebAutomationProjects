package bd.com.TestAutomation2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class TC09_ByeProduct extends DriveSet{
	public static String baseURL = "https://www.flipkart.com";
	@Test // TestNG Annotation
	public static void ByeProduct () throws InterruptedException {
	driver.get(baseURL); // Get base url and run on browser
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize(); // maximize the browser window

	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click(); // click is a method used for click perform
	Thread.sleep(1000);
	// handle new tab
	String ParentWindowHandle=driver.getWindowHandle();
	System.out.println("ParentWindowHandle"+ParentWindowHandle);
	driver.findElement(By.xpath("//div[contains(text(),'Mobiles')]")).click(); // click is a method used for click perform
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//body/div[@id='container']/div[1]/div[3]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]/p[1]")).click(); // click is a method used for click perform
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//div[contains(text(),'POCO C3 (Arctic Blue, 32 GB)')]")).click(); // click is a method used for click perform
	Thread.sleep(1000);
	System.out.println(driver.getTitle());
	for(String childTab :driver.getWindowHandles())
	{
		driver.switchTo().window(childTab);
		
	}
	Thread.sleep(1000);
	System.out.println(driver.getTitle());
     driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA ihZ75k _3AWRsL']")).click();
 	driver.findElement(By.xpath("//input[@class=('_2IX_2- _17N0em')]")).sendKeys("1741892586"); // click is a method used for click perform
 	Thread.sleep(1000);
 	driver.findElement(By.xpath("//button[@class='_2KpZ6l _20xBvF _3AWRsL']")).sendKeys("1741892586"); // click is a method used for click perform
 	Thread.sleep(1000);
 	
    }
}