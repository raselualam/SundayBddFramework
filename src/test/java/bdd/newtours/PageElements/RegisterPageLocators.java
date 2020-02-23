package bdd.newtours.PageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPageLocators {
	
		//First Name locators
		@FindBy(xpath="//input[@name='firstName']")
	    public WebElement FirstName;
		
		//Last Name locators
		@FindBy(xpath="//input[@name='lastName']")
	    public WebElement LastName;
	
		//Phone locators
		@FindBy(xpath="//input[@name='phone']")
	    public WebElement phone;
		
		//Email locators
		@FindBy(xpath="//input[@id='userName']")
	    public WebElement email;

		//WebElement AddressLine1
		@FindBy(xpath="//input[@name='address1']")
	    public WebElement AddressLine1;
		
		//WebElement AddressLine2
		@FindBy(xpath="//input[@name='address2']")
	    public WebElement AddressLine2;
		
		//WebElement City
		@FindBy(xpath="//input[@name='city']")
	    public WebElement City;
		
		//WebElement State
		@FindBy(xpath="//input[@name='state']")
	    public WebElement State;
		
		//WebElement Postal
		@FindBy(xpath="//input[@name='postalCode']")
	    public WebElement Postal;
		
		//WebElement Country
		@FindBy(xpath="//select[@name='country']")
	    public WebElement Country;
		
		//WebElement UserName
		@FindBy(xpath="//input[@id='email']")
	    public WebElement UserName;
		
		//WebElement Password
		@FindBy(xpath="//input[@name='password']")
	    public WebElement Password;
		
		//WebElement confirmPassword
		@FindBy(xpath="//input[@name='confirmPassword']")
	    public WebElement confirmPassword;
		
		//WebElement Submit
		@FindBy(xpath="//input[@name='register']")
	    public WebElement SubmitButton;
}
