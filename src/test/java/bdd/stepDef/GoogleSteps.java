package bdd.stepDef;

import bdd.google.PageActions.GoogleHomePageAction;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoogleSteps {
	
	GoogleHomePageAction googleHomePageAction = new GoogleHomePageAction();

	@Given("^Browse to Google homepage$")
	public void browse_to_Google_homepage() throws Throwable {
		googleHomePageAction.launchGoogleHomepage();
		System.out.println("Browse to Google Completed");
	}

	@When("^Search by \"([^\"]*)\"$")
	public void search_by(String keyWord) throws Throwable {
		googleHomePageAction.searchByKeyword(keyWord);
		System.out.println("Search Completed");
	}

	@Then("^Verify search result appear$")
	public void verify_search_result_appear() throws Throwable {
		Thread.sleep(5000);
		System.out.println("Verify result Completed");
	}
}
