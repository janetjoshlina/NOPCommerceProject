package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.HomePage;

public class TC004_PlacingOrder extends ProjectSpecificMethods {

	@BeforeTest
	public void setValues() {
		excelFileName = "NOPCommerce";
		excelSheetName = "TC004_PlacingOrder";
	} 

	@Test(dataProvider = "provideData")
	public void run(String mailId,String password, String productName, String verifyProductDetails, String country
			, String city, String address, String postalcode, String phoneNumber) throws InterruptedException, IOException {
		new HomePage().clickLogin().enterEmailId(mailId).enterPassword(password)
		.clickLogin().enterProductName(productName).clickSearch()
		.clickAddToCart().clickAddToCartProduct().clickShoppingCart()
		.verifyCartProductDetails(verifyProductDetails).clickTernOfService().clickCheckOut()
		.selectCountry(country).enterCity(city).enterAddress(address).enterPostalCode(postalcode)
		.enterPhoneNumber(phoneNumber).clickContinue().clickShippingContinue()
		.clickPaymentContinue().clickPaymentInformationContinue()
		.clickOrderConfirm().clickOrderContinue();
}
}
