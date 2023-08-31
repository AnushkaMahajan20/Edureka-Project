package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class HomePage {

	RemoteWebDriver driver;
	
	public HomePage(RemoteWebDriver driver) {
		this.driver=driver;
	}
	
	By heading = By.className("page-heading");
	By errorMessage = By.className("notification-box-description");
	By button1 = By.xpath("//span[normalize-space()='Testing']");
	By button2 = By.xpath("//span[normalize-space()='Multivariate']");
	By multivariate = By.xpath("//h1[normalize-space()='Multivariate Tests']");
	
	
	public boolean isheadingDisplayed() {
		return driver.findElement(heading).isDisplayed();
	}
	
	public boolean iserrorMessageDisplayed() {
		return driver.findElement(errorMessage).isDisplayed();
	}


	public void clickOnTestingButton() {
		driver.findElement(button1).click();
	}
	
	public void clickOnMultivariateButton() {
		driver.findElement(button2).click();
	}
	
	public boolean ismultivariateDisplayed() {
		return driver.findElement(multivariate).isDisplayed();
	}
	

	
	
	
	
	
}
