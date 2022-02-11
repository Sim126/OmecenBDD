package omecenBDDSteps;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import omecenBDDPages.LoginPage;
import omecenBDDWebDriverManager.BrowserFactory;
import omecenBDDWebDriverManager.FileReadManager;
import omecenBDDWebDriverManager.PageObjectManager;


public class LoginStep {
	WebDriver driver;
	BrowserFactory browserFactory;
	FileReadManager fileReadManager;
	PageObjectManager pageObjectManager;
	LoginPage loginPage;
	

	

@Given("open omecen application")
public void open_omecen_application() {
    System.out.println("hello");

    browserFactory=new BrowserFactory();
    driver=browserFactory.getDriver();
}

@When("I enter username and password")
public void i_enter_username_and_password() {
	pageObjectManager = new PageObjectManager(driver);
	loginPage=pageObjectManager.getLoginPage();
	loginPage.userName("admin");
	}

@Then("I validate the outcomes")
public void i_validate_the_outcomes() {
   
}

	
}
