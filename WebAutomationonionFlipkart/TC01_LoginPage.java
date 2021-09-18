package bd.com.TestAutomation2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TC01_LoginPage extends DriveSet {
public static String baseURL = "https://www.flipkart.com";

	@Test // TestNG Annotation
	public static void login() throws InterruptedException {
	driver.get(baseURL); // Get base url and run on browser
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize(); // maximize the browser window
	Thread.sleep(1000); // used for  waiting 

	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click(); // click is a method used for click perform
	Thread.sleep(1000);

    driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click(); // click is a method used for click perform
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//input[@class=('_2IX_2- VJZDxU')]")).sendKeys("1741892586"); // click is a method used for click perform
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//input[@class=('_2IX_2- _3mctLh VJZDxU')]")).sendKeys("123456"); // click is a method used for click perform
	Thread.sleep(1000);
	


}
}
