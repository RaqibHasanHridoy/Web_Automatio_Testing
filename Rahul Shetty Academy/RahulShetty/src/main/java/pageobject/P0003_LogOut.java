package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P0003_LogOut {
	WebDriver driver = null;

	public P0003_LogOut(WebDriver driver) {

		this.driver = driver;

	}
	
	By logoutbutton=By.className("logout-btn");
	 public void logoutbutton () {
			driver.findElement(logoutbutton).click();
		}
	
	
	
	
	
	
	
	
	
	
	
}
