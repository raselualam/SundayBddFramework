package bdd.newtours.PageActions;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;

import bdd.newtours.PageElements.RegisterPageLocators;
import bdd.newtours.utilities.ReadExcelSheetData;

public class RegisterPageAction {
	
	RegisterPageLocators newtoursRegisterPageLocators = new RegisterPageLocators();
	
	public void fillUpContactInfo() throws Exception{
		newtoursRegisterPageLocators.FirstName.sendKeys(ReadExcelSheetData.getMapData("FirstName"));
		newtoursRegisterPageLocators.LastName.sendKeys("Alam");
		newtoursRegisterPageLocators.phone.sendKeys("9736818296");
		newtoursRegisterPageLocators.email.sendKeys("raselualam@gmail.com");
	}
	
	public void fillUpMailingInfo(){
		newtoursRegisterPageLocators.AddressLine1.sendKeys("123 mail st");
		newtoursRegisterPageLocators.AddressLine2.sendKeys("Apt#2");
		newtoursRegisterPageLocators.City.sendKeys("New York");
		newtoursRegisterPageLocators.State.sendKeys("NY");
		newtoursRegisterPageLocators.Postal.sendKeys("01001");
		
		Select mydrpdwn = new Select(newtoursRegisterPageLocators.Country);
		mydrpdwn.selectByVisibleText("UNITED STATES");
	}
	
	public void fillUpUserInfo(String Username){
		newtoursRegisterPageLocators.UserName.sendKeys(Username);
		newtoursRegisterPageLocators.Password.sendKeys("12345");
		newtoursRegisterPageLocators.confirmPassword.sendKeys("12345");
	}
	
	public void submitForm(){
		newtoursRegisterPageLocators.SubmitButton.click();
	}
}
