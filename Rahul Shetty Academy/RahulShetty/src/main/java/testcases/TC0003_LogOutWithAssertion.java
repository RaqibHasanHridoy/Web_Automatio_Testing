package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.driversetup;
import pageobject.P0001_SignIn;
import pageobject.P0002_SignInRightData;
import pageobject.P0003_LogOut;

public class TC0003_LogOutWithAssertion extends driversetup {
	static String baseurl = "https://rahulshettyacademy.com/locatorspractice/";

@Test(priority=1)
	public void testlocation() throws InterruptedException {
		driver.get(baseurl);
		driver.manage().window().maximize();
		
		P0001_SignIn signinobject=new P0001_SignIn(driver);
		signinobject.inputUsername();
		P0002_SignInRightData dataobject=new P0002_SignInRightData(driver);
		dataobject.rightpassword();
		signinobject.signInButton();
		Thread.sleep(2000);
		P0003_LogOut logout=new P0003_LogOut(driver);
		logout.logoutbutton();
		Thread.sleep(2000);
		

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
