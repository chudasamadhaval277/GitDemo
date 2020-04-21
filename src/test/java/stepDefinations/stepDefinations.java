package stepDefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObject.LandingPage;
import pageObject.LoginPage;
import resource.Base;

public class stepDefinations extends Base {
	
	@Given("^Initialize the browser with \"([^\"]*)\"$")
	public void initialize_the_browser_with(String browser) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		driver = initializeDriver();
		System.out.println(browser);
		
	}
	@Given("^Navigate  to \"([^\"]*)\" site$")
	public void navigate_to_site(String URL) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		driver.get(URL);
	}

	@Given("^Click on login link in home page to land on sign in page$")
	public void click_on_login_link_in_home_page_to_land_on_sign_in_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		
		LandingPage l = new LandingPage(driver);
		l.getlogin().click();
	}
	
	@When("^User enter (.+) and (.+) and login in$")
    public void user_enter_and_and_login_in(String usename, String password) throws Throwable {
        //throw new PendingException();
		
		LoginPage lp = new LoginPage(driver);
		lp.Emailid().sendKeys(usename);
		lp.Password().sendKeys(password);
		lp.log_in().click();
    }
	
	

	

	

	/*@When("^User enter \"([^\"]*)\" and \"([^\"]*)\" and login in$")
	public void user_enter_and_and_login_in(String UserName, String Password) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		
		LoginPage lp = new LoginPage(driver);
		lp.Emailid().sendKeys(UserName);
		lp.Password().sendKeys(Password);
		lp.log_in().click();
	}*/

	@Then("^Verify the User is succefully login$")
	public void verify_the_User_is_succefully_login() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("Login succefulyy");
	}



}
