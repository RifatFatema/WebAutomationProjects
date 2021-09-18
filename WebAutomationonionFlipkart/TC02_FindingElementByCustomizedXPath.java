package bd.com.TestAutomation2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TC02_FindingElementByCustomizedXPath  extends DriveSet {
	public static String baseURL = "https://www.flipkart.com";
	@Test // TestNG Annotation
	public static void FindingElements() throws InterruptedException {
	driver.get(baseURL); // Get base url and run on browser
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize(); // maximize the browser window
	Thread.sleep(1000); // used for  waiting 

	//driver.findElement(By.xpath("//div[contains(text(),'Mobiles')]")).click(); // click is a method used for click perform
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click(); // click is a method used for click perform
	Thread.sleep(1000);
	
	//driver.findElement(By.xpath("//div[contains(text(),'Travel')]")).click(); // click is a method used for click perform
	Thread.sleep(1000);
	
	//driver.findElement(By.xpath("//body/div[@id='container']")).click(); // click is a method used for click perform
	Thread.sleep(1000);
	
	//driver.findElement(By.xpath("//body/div[@id='container']/div[1]/div[2]/div[1]/div[1]/div[3]/a[1]/div[1]/div[1]/img[1]")).click(); // click is a method used for click perform
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//body/div[@id='container']/div[1]/div[2]/div[1]/div[1]/div[2]/a[1]/div[1]/div[1]/img[1]")).click(); // click is a method used for click perform
	Thread.sleep(1000);
	
	//driver.findElement(By.xpath("//span[contains(text(),'Cart')]")).click(); // click is a method used for click perform
	Thread.sleep(1000);

}
	
}