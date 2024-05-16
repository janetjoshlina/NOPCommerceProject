package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.HomePage;

public class TC005_VerifyOrderDetails extends ProjectSpecificMethods {

	@BeforeTest
	public void setValues() {
		excelFileName = "NOPCommerce";
		excelSheetName = "TC005_VerifyOrderDetails";
	} 

	@Test(dataProvider = "provideData")
	public void run(String mailId, String password, String verifyOrderDetails) throws InterruptedException, IOException {
		new HomePage().clickLogin().enterEmailId(mailId).enterPassword(password).clickLogin()
		.clickMyAccount().clickOrders().verifyOrderDetails(verifyOrderDetails);
	}
}