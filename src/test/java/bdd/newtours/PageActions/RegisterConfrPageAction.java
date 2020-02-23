package bdd.newtours.PageActions;

import bdd.newtours.PageElements.RegisterConfrPageLocators;
import junit.framework.Assert;

public class RegisterConfrPageAction {

	RegisterConfrPageLocators registerConfrPageLocatorsobj =new RegisterConfrPageLocators();
	
	public void verifyThankyouRegister(){
		String confMsg = registerConfrPageLocatorsobj.TxtThankYou.getText();
		Assert.assertEquals(confMsg, "Thank you for registering. You may now sign-in using the user name and password you've just entered.");
	}
}
