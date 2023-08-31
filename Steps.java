package StepDefination;

import org.openqa.selenium.remote.RemoteWebDriver;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.MultivariatePage;
import Utilities.BrowserUtlities;
import dev.failsafe.internal.util.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
	RemoteWebDriver driver;
	
	@Given("user opens the browser")
	public void user_opens_the_browser() throws Exception {
	    driver = BrowserUtlities.getDriver();
	}

	@When("user navigates to login url")
	public void user_navigates_to_login_url() {
	   driver.get("https://app.vwo.com");
	}

	@When("user inputs valid {string} and {string}")
	public void user_inputs_valid_and(String username, String password) {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login(username, password);
	}

	@When("clicks on sign in button")
	public void clicks_on_sign_in_button() {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.clickOnLoginButton();
	}

	@Then("home page is displayed")
	public void home_page_is_displayed() {
		HomePage homePage=new HomePage(driver);
		boolean flag = homePage.isheadingDisplayed();
		System.out.println(homePage + "Homepage is displayed");
	}
	
	@Then("clicks on testing button")
	public void clicks_on_testing_button() {
		HomePage button1 = new HomePage(driver);
		button1.clickOnTestingButton();
	}
	
	@Then("clicks on multivariate in dropdown")
	public void clicks_on_multivariate_in_dropdown() {
	    HomePage button2 = new HomePage(driver);
	    button2.clickOnMultivariateButton();
	}

	@Then("Multivariate Tests page is displayed")
	public void multivariate_tests_page_is_displayed() {
		System.out.println("Redirectedto multivariate page");
	}
	
	@Then("click on help button")
	public void click_on_help_button() {
		MultivariatePage help = new MultivariatePage(driver);
		help.clickOnHelpButton();
		System.out.println("Clicked on help button");
	}
	
	@Given("user inputs invalid {string} and {string}")
	public void user_inputs_invalid_and(String username1, String password1) {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login1(username1, password1);
	}
	
	@Then("error message is displayed")
	public void error_message_is_displayed() {
		LoginPage loginPage=new LoginPage(driver);
		boolean flag = loginPage.iserrorMessageDisplayed();
	}
	
	@Then("clear text of username")
	public void clear_text_of_username() {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login2(null, null);
	}

	@Then("clear text of password")
	public void clear_text_of_password() {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login2(null, null);
	}
	
	@Then("closse the browser")
	public void closse_the_browser() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}


	
	








}
