package bdd.google.PageActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import bdd.google.PageElements.GoogleSearchPageLocators;
import bdd.newtours.utilities.SetupDrivers;

public class GoogleHomePageAction {
	
	GoogleSearchPageLocators googleSearchPageLocators;
	
	public GoogleHomePageAction(){
		googleSearchPageLocators = new GoogleSearchPageLocators();
		PageFactory.initElements(SetupDrivers.driver, googleSearchPageLocators);
	}
	
	public void launchGoogleHomepage() throws Exception{
		SetupDrivers.driver.manage().window().maximize();
		SetupDrivers.driver.get("https://www.google.com/");
		SetupDrivers.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	public void searchByKeyword(String keyWord) throws Exception{
		Thread.sleep(5000);
		googleSearchPageLocators.txtBxSearch.sendKeys(keyWord);
		googleSearchPageLocators.btnSearch.click();
	}
	
	public void signIn(){
		googleSearchPageLocators.btnSignIn.click();
	}
}
