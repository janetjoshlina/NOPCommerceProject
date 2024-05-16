package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.HomePage;

public class TC004_PlacingOrderDetailsDelete extends ProjectSpecificMethods {

	@BeforeTest
	public void setValues() {
		excelFileName = "NOPCommerce";
		excelSheetName = "TC004_PlacingOrderDetailsDelete";
	} 

	@Test(dataProvider = "provideData")
	public void run(String mailId, String password, String productName, String verifyProductDetails) throws InterruptedException, IOException {
		new HomePage().clickLogin().enterEmailId(mailId).enterPassword(password)
		.clickLogin().enterProductName(productName).clickSearch()
		.clickAddToCart().clickAddToCartProduct().clickShoppingCart()
		.verifyCartProductDetails(verifyProductDetails).clickTernOfService().clickCheckOut().deleteAddress();
		
}
}
