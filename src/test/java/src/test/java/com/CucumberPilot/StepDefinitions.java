package src.test.java.com.CucumberPilot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

class StepDefinitions {
	WebDriver driver = null;
	@Given("^set the system property for Firefox$")
	public void set_the_system_property_for_Firefox() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	System.setProperty("webdriver.gecko.driver", "./src/test/resources/geckodriver.exe");
	    throw new PendingException();
	}

	@When("^Intialize the firefox driver$")
	public void intialize_the_firefox_driver() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 driver = new FirefoxDriver();
		 System.out.println("driver intialized");
		
	    
	}

	@When("^Open google\\.com url$")
	public void open_google_com_url() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.get("http://google.com");
		System.out.println("Landed in google home page ");
	    
	}

	@Then("^validate google home page is coming successfully$")
	public void validate_google_home_page_is_coming_successfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("google home page is coming successfully");
	    
	}
	@Given("^I want to write a step with precondition$")
	public void i_want_to_write_a_step_with_precondition() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("test");
	}

	@Given("^some other precondition$")
	public void some_other_precondition() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("test");
	}

	@When("^I complete action$")
	public void i_complete_action() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("test");
	}

	@When("^some other action$")
	public void some_other_action() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("test");
	}

	@When("^yet another action$")
	public void yet_another_action() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("test");
	}

	@Then("^I validate the outcomes$")
	public void i_validate_the_outcomes() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("test");
	}

	@Then("^check more outcomes$")
	public void check_more_outcomes() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("test");
	}

	@Given("^I want to write a step with name(\\d+)$")
	public void i_want_to_write_a_step_with_name(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("test");
	}

	@When("^I check for the (\\d+) in step$")
	public void i_check_for_the_in_step(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("test");
	}

	@Then("^I verify the success in step$")
	public void i_verify_the_success_in_step() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("test");
	}

	@Then("^I verify the Fail in step$")
	public void i_verify_the_Fail_in_step() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("test");
	}


}
