package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LoginPage {

	RemoteWebDriver driver;
	public LoginPage (RemoteWebDriver driver) {
		this.driver = driver;
	}
	
	By inputValidUser=By.name("username");
	By inputValidPassword=By.name("password");
	By inputInValidUser=By.name("username");
	By inputnValidPassword=By.name("password");
	By buttonLogin=By.xpath("//button[@id='js-login-btn']");
	
	public void login(String username, String password) {
		driver.findElement(inputValidUser).sendKeys("anushka.malunjkar15@gmail.com");
		driver.findElement(inputValidPassword).sendKeys("Qwerty@12");
	}
	
	public void login1(String username1, String password1) {
		driver.findElement(inputInValidUser).sendKeys("anushkamalunjkar15@gmail.com");
		driver.findElement(inputnValidPassword).sendKeys("Qwerty");
		driver.findElement(inputnValidPassword).sendKeys("Qwerty");
	}
	
	public void login2(String username2, String password2) {
		driver.findElement(inputInValidUser).sendKeys("anushkamalunjkar15@gmail.com");
		driver.findElement(inputnValidPassword).sendKeys("Qwerty");
		driver.findElement(By.name("username")).clear();
		driver.findElement(By.name("password")).clear();
//		driver.findElement(inputValidUser).sendKeys("anushka.malunjkar15@gmail.com");
//		driver.findElement(inputValidPassword).sendKeys("Qwerty@12");
	}
	
	public void clickOnLoginButton() {
		driver.findElement(buttonLogin).click();
	}

	public boolean iserrorMessageDisplayed() {
		// TODO Auto-generated method stub
		return true;
	}
	
	
}
