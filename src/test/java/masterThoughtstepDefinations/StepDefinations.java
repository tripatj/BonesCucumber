package masterThoughtstepDefinations;

import org.openqa.selenium.WebDriver;
import PageClasses.PageOne;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinations {

	WebDriver driver;
	
	@Given("^Launch application \"([^\"]*)\"$")
    public void launch_application(String url) throws Throwable {
		
		PageOne googlenews = new PageOne(driver);
		googlenews.readGnews();
		googlenews.readHeadLines();
		
    }

    @When("^Enter userName \"([^\"]*)\"$")
    public void enter_username_something(String username ) throws Throwable {
        
    }

    @Then("^Enter pwdName \"([^\"]*)\"$")
    public void enter_pwdname_something(String password) throws Throwable {
        
    }

}
