package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P0002_SignInRightData {
	WebDriver driver = null;

	public P0002_SignInRightData(WebDriver driver) {

		this.driver = driver;

	}
	
	By forgotpassword =By.linkText("Forgot your password?");
	By nameinput =By.xpath("//input[@placeholder='Name']");
	By inputemail=By.xpath("//input[@placeholder='Email']");
	By mobileno=By.xpath("//input[@type='text'][3]");
	By resetbutton=By.cssSelector("button.reset-pwd-btn");
	By button1=By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]");
	By inputusername=By.cssSelector("#inputUsername");
	By rightpassword = By.cssSelector("input[type*='pass']");
	By submitbutton =By.xpath("//button[contains(@class,'submit')]");
	
	 public void forgotpassword () {
			driver.findElement(forgotpassword).click();
		}
	 public void nameinput () {
			driver.findElement(nameinput).sendKeys("Hridoy");
		}
	 public void inputemail () {
			driver.findElement(inputemail).sendKeys("test@gmail.com");
		}
	 public void mobileno () {
			driver.findElement(mobileno).sendKeys("01670102216");
		}
	 public void resetbutton () {
			driver.findElement(resetbutton).click();
		}
	 public void button1 () {
			driver.findElement(button1).click();
		}
	 public void inputusername () {
			driver.findElement(inputusername).sendKeys("Hridoy");
		}
	 public void rightpassword () {
			driver.findElement(rightpassword).sendKeys("rahulshettyacademy");
		}
	 public void submitbutton () {
			driver.findElement(submitbutton).click();
		}
	 
	 
	 

}
