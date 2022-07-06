package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P0001_SignIn {
	WebDriver driver = null;

	public P0001_SignIn(WebDriver driver) {

		this.driver = driver;

	}
	 By inputUsername=By.id("inputUsername");
	 By inputPassword=By.name("inputPassword");
	 By signInButton= By.className("signInBtn");
	 
	 public void inputUsername () {
			driver.findElement(inputUsername).sendKeys("Hridoy");
		}
	 public void inputPassword () {
			driver.findElement(inputPassword).sendKeys("great");
		}
	 public void signInButton () {
			driver.findElement(signInButton).click();
		}

}
