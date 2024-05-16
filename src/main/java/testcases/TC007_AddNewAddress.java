package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.HomePage;

public class TC007_AddNewAddress extends ProjectSpecificMethods {

	@BeforeTest
	public void setValues() {
		excelFileName = "NOPCommerce";
		excelSheetName = "TC007_AddNewAddress";
	} 

	@Test(dataProvider = "provideData")
	public void run(String mailId, String password, String firstName, String lastName, String email, String country
			,String city, String address, String postalcode, String phoneNumber) throws InterruptedException, IOException {
		new HomePage().clickLogin().enterEmailId(mailId).enterPassword(password).clickLogin()
		.clickMyAccount().clickOrders().clickAddress().clickAddNew()
		.enterFirstName(firstName).enterLastName(lastName).enterEmail(email)
		.selectCountry(country).enterCity(city).enterAddress(address)
		.enterPostalZipCode(postalcode).enterPhoneNumber(phoneNumber).clickSave().deleteAddress();
	}
}