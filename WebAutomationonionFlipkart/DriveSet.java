package bd.com.TestAutomation2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;

public class DriveSet {
	public static WebDriver driver;

	@BeforeSuite // TestNG Annotation
	public static void setDriver() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//chromedriver.exe");
		driver = new ChromeDriver();   //Chrome driver object create
	}
	@AfterTest
	public void terminaleBrowser() {
	driver.close();   
		
	}
}
