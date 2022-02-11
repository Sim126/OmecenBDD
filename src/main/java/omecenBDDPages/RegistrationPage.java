package omecenBDDPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {
	WebDriver driver;

	public RegistrationPage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	   
		
		@FindBy(how=How.ID, using="signup_link") private WebElement sgnUpLik;
		public WebElement getSignUpLink() {
			sgnUpLik.click();
			return sgnUpLik;
		}

		@FindBy(how=How.XPATH, using="//input[starts-with(@id,'UserFirstName')]") private WebElement userFirstN;
		public WebElement getFirstName(String firstName) {
			userFirstN.sendKeys(firstName);
			return userFirstN; 
		}
		
		@FindBy(how=How.XPATH, using="//input[starts-with(@id,'UserLastName')]") private WebElement userLastN;
		public WebElement getLastName(String lastName) {
			userLastN.sendKeys(lastName);
			return userLastN; 
		}
		
		@FindBy(how=How.XPATH, using="//input[starts-with(@id,'UserTitle')]") private WebElement jobTitle;
		public WebElement getJobTitle(String job) {
			jobTitle.sendKeys(job);
			return jobTitle; 
		}
		
		@FindBy(how=How.XPATH, using="//input[starts-with(@id,'UserEmail')]") private WebElement emailId;
		public WebElement getEmail(String email) {
			emailId.sendKeys(email);
			return emailId; 
		}
		@FindBy(how=How.XPATH, using="//input[starts-with(@id,'UserPhone')]") private WebElement phone;
		public WebElement getPhone(String phoneN) {
			phone.sendKeys(phoneN);
			return phone; 
		}
		@FindBy(how=How.XPATH, using="//select[@name='CompanyEmployees']") private WebElement employees;
		public WebElement getEmployees() {
			employees.click();
			return employees; 
		}
		@FindBy(how=How.XPATH, using="//select[@name='CompanyEmployees']/option[3]") private WebElement userEmployeeOption;
		public WebElement getOption() {
			userEmployeeOption.click();
			return userEmployeeOption; 
		}
		@FindBy(how=How.XPATH, using="//input[@name='CompanyName']") private WebElement abcCompany;
		public WebElement getCompanyN(String companyN) {
			abcCompany.sendKeys(companyN);
			return abcCompany; 
		}
		@FindBy(how=How.XPATH, using = "//select[starts-with(@id,'CompanyCountry')]/option[2]")private WebElement userCompCountry;
	    public WebElement getCompcountry() {
	        userCompCountry.click();
	        return userCompCountry;
	    }
	    @FindBy(how=How.XPATH, using="(//*[starts-with(@class,'checkbox')] )[1]") private WebElement userAgreement;
		public WebElement getAgreement() {
			userAgreement.click();
			return userAgreement; 
		} 
		/*@FindBy(how=How.XPATH, using="(//*[starts-with(@class,'submit')])") private WebElement startFreeTrial;
		public WebElement getFreeTrial() {
			startFreeTrial.click();
			return startFreeTrial; 
		}*/
}
