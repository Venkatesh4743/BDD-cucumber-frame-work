package stepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Snippet {
	@Given("user navigates to the facebook website")
	public void user_navigates_to_the_facebook_website() {
		
		System.out.println("@Given--user navigates to the facbook website");
	}
	
	@When("user validates the homepage titles")
	public void user_validates_the_homepage_titles() {
		System.out.println("@When--user validates the homepage titles");

		
	}
	
	@Then("user enters {string} username")
	public void user_enters_username(String username) {
		
		System.out.println("@Then--user enters "+username+" username");

	}
	
	@Then("user enters {string} password")
	public void user_enters_password(String password) {
		
		System.out.println("@Then--user enters "+password+" password");

	}
	
	@Then("user clicks on sign-in button")
	public void user_clicks_on_sign_in_button() {
		
		System.out.println("@Then--user clicks on sign-in buttonuser navigates to the facbook website");

	}
	
	
	
}

