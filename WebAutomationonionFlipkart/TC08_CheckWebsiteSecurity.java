package bd.com.TestAutomation2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TC08_CheckWebsiteSecurity extends DriveSet{
	public static String baseURL = "https://www.flipkart.com";
	@Test // TestNG Annotation
	public static void CheckWebsiteSecurity() throws InterruptedException {
	driver.get(baseURL); // Get base url and run on browser
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize(); // maximize the browser window
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click(); // click is a method used for click perform
	Thread.sleep(1000);
	}
	public static void isWebsiteSecured() 
	{
		String myUrl=driver.getCurrentUrl();
		
		if(myUrl.contains("https")) 
		{
			System.out.println("Site is secured");
		}else 
		{
			System.out.println("Site is not secured");
		}
}
}
