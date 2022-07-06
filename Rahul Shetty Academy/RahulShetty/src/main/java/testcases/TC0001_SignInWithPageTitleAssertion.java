package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.driversetup;
import pageobject.P0001_SignIn;

@Test(priority=1)
public class TC0001_SignInWithPageTitleAssertion extends driversetup {
	static String baseurl = "https://rahulshettyacademy.com/locatorspractice/";

	public void testlocation() throws InterruptedException {
		driver.get(baseurl);
		driver.manage().window().maximize();
		
		
		P0001_SignIn SignInObject= new P0001_SignIn(driver);
		SignInObject.inputUsername();
		Thread.sleep(3000);
		SignInObject.inputPassword();
		Thread.sleep(3000);
		SignInObject.signInButton();
		Thread.sleep(3000); 

}
	@Test(priority=2)
	public void verifyPageTitle_shouldPass() {
		driver.get(baseurl);
		new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		SoftAssert softly = new SoftAssert();
		softly.assertEquals(driver.getTitle(), "Rahul Shetty Academy - Login page");
		
		softly.assertAll();
	}
}
