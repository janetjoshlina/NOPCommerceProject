package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.HomePage;

public class TC006_ProductPresentOrNot extends ProjectSpecificMethods {

	@BeforeTest
	public void setValues() {
		excelFileName = "NOPCommerce";
		excelSheetName = "TC006_ProductPresentOrNot";
	} 

	@Test(dataProvider = "provideData")
	public void run(String mailId, String password, String productName, String verifyProductAvailability) throws InterruptedException, IOException {
		new HomePage().clickLogin().enterEmailId(mailId).enterPassword(password).clickLogin()
		.enterProductName(productName).clickSearch()
		.verifyProductAvailability(verifyProductAvailability);
	}
}