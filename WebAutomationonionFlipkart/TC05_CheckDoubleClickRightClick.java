package bd.com.TestAutomation2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TC05_CheckDoubleClickRightClick extends DriveSet {
	public static String baseURL = "https://www.flipkart.com";
	@Test // TestNG Annotation
	public static void selectDoubleClickRightClick() throws InterruptedException {
	driver.get(baseURL); // Get base url and run on browser
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize(); // maximize the browser window
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click(); // click is a method used for click perform
	Thread.sleep(1000);
	Actions a = new Actions(driver);
	
	WebElement doubleClickText = driver.findElement(By.xpath("//body/div[@id='container']/div[1]/div[3]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/a[1]/div[4]"));
	a.doubleClick(doubleClickText).build().perform();
	Thread.sleep(3000);

	
	WebElement rightClick = driver.findElement(By.xpath("//a[contains(text(),'Login')]"));
	a.contextClick(rightClick).build().perform();
	
	Thread.sleep(3000);
}
}