package pages;

import java.io.IOException;

import org.testng.Assert;

import Seleniumapi.SeleniumBase;
import base.ProjectSpecificMethods;

public class MyAccountPage extends SeleniumBase{
	
	public MyAccountPage clickOrders() throws IOException {
		click(readFromXpath("ClickOrder"));
		return this;
	}
	
	public MyAccountPage verifyOrderDetails(String actualText) throws IOException {
		boolean display = verifyExactText(readFromXpath("VerifyOrderDetails"), actualText);
		Assert.assertTrue(display);
		return this;
	}
	
	public MyAccountPage clickAddress() throws IOException {
		click(readFromXpath("ClickAddress"));
		return this;
	}
	
	public MyAccountPage clickAddNew() throws IOException {
		click(readFromXpath("ClickAddNew"));
		return this;
	}
	
	public MyAccountPage enterFirstName(String firstName) throws IOException {
		enterText(readFromXpath("EnterAddressFirstName"), firstName);
		return this;
	}
	
	public MyAccountPage enterLastName(String lastName) throws IOException {
		enterText(readFromXpath("EnterAddressLastName"), lastName);
		return this;
	}
	
	public MyAccountPage enterEmail(String emailId) throws IOException {
		enterText(readFromXpath("EnterAddressEmailId"), emailId);
		return this;
	}
	
	public MyAccountPage selectCountry(String code) throws IOException {
		selectDropDownUsingValue(readFromXpath("SelectCountry"), code);
		return this;
	}
	
	public MyAccountPage enterCity(String city) throws IOException {
		enterText(readFromXpath("EnterAddressCity"), city);
		return this;
	}
	
	public MyAccountPage enterAddress(String address) throws IOException {
		enterText(readFromXpath("EnterAddressAddress1"), address);
		return this;
	}
	
	public MyAccountPage enterPostalZipCode(String zip) throws IOException {
		enterText(readFromXpath("EnterPostalZipcode"), zip);
		return this;
	}
	
	public MyAccountPage enterPhoneNumber(String phoneNumber) throws IOException {
		enterText(readFromXpath("EnterAddressPhoneNumber"), phoneNumber);
		return this;
	}
	
	public MyAccountPage clickSave() throws IOException {
		click(readFromXpath("ClickSave"));
		return this;
	}
	
	public MyAccountPage deleteAddress() throws IOException {
		click(readFromXpath("DeleteAddress"));
		acceptAlert();
		return this;
	}
	

}
