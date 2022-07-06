package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class driversetup {

	public static WebDriver driver;

	@BeforeSuite
	public static void setdriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}

	@AfterSuite
	public static void teardown() {
		//driver.close();
		driver.quit();
	}
}
