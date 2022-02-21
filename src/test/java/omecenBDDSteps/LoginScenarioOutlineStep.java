package omecenBDDSteps;

import org.openqa.selenium.WebDriver;
import static org.junit.Assert.*;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import omecenBDDPages.LoginPage;
import omecenBDDWebDriverManager.BrowserFactory;
import omecenBDDWebDriverManager.FileReadManager;
import omecenBDDWebDriverManager.PageObjectManager;


public class LoginScenarioOutlineStep {
	WebDriver driver;
	BrowserFactory browserFactory;
	FileReadManager fileReadManager;
	PageObjectManager pageObjectManager;
	LoginPage loginPage;

@Given("validator open application")
public void validator_open_application() {
	browserFactory=new BrowserFactory();
    driver=browserFactory.getDriver();
}

@When("validator enter {string} and enter {string} in the app")
public void validator_enter_and_enter_in_the_app(String userName, String password) {
	pageObjectManager = new PageObjectManager(driver);
	loginPage=pageObjectManager.getLoginPage();
	loginPage.userName(userName);
	loginPage.ugetPassWord(password);
}

@Then("validator click login button")
public void validator_click_login_button() {
	pageObjectManager = new PageObjectManager(driver);
	loginPage=pageObjectManager.getLoginPage();
	loginPage.getLogin();
}

@Then("validate successfully login message")
public void validate_successfully_login_message() {
	String actualURL="https://login.salesforce.com/";
	String expected=driver.getCurrentUrl();
	System.out.println("Url is "+expected);
	assertEquals(actualURL, expected);
	driver.quit();
}

}
