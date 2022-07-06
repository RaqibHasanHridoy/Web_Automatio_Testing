package testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.driversetup;
import pageobject.P0001_SignIn;
import pageobject.P0002_SignInRightData;

@Test

public class TC0002_SignInWithRightPassword extends driversetup{
	static String baseurl = "https://rahulshettyacademy.com/locatorspractice/";


	public void testlocation() throws InterruptedException {
		driver.get(baseurl);
		driver.manage().window().maximize();
		
		P0001_SignIn signobject=new P0001_SignIn(driver);
		signobject.inputUsername();
		signobject.inputPassword();
		signobject.signInButton();
		Thread.sleep(2000);
		
		P0002_SignInRightData signdataobject= new P0002_SignInRightData(driver);
		signdataobject.forgotpassword();
		Thread.sleep(2000);
		signdataobject.nameinput();
		Thread.sleep(2000);
		signdataobject.inputemail();
		Thread.sleep(2000);
		signdataobject.mobileno();
		Thread.sleep(2000);
		signdataobject.resetbutton();
		Thread.sleep(2000);
		signdataobject.button1();
		Thread.sleep(2000);
		signdataobject.inputusername();
		Thread.sleep(2000);
		signdataobject.rightpassword();
		Thread.sleep(2000);
		signdataobject.submitbutton();
		Thread.sleep(5000);

}
}
