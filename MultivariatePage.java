package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class MultivariatePage {

	RemoteWebDriver driver;
	
	public MultivariatePage(RemoteWebDriver driver) {
		this.driver=driver;
	}
	
	By help = By.xpath("//div[@aria-label='Open Intercom Messenger']");
	
	
	public void clickOnHelpButton() {
		driver.findElement(help).click();
	}
}
