package bdd.google.PageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleSearchPageLocators {

			//Search TextBox
			@FindBy(xpath="//*[@title='Search']")
		    public WebElement txtBxSearch;
	
			
			//Search Button
			@FindBy(xpath="//input[@value='Google Search']")
		    public WebElement btnSearch;
			
			
			//SignIn Button
			@FindBy(xpath="//*[contains(text(),'Sign in')]")
		    public WebElement btnSignIn;
}
