package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.HomePage;

public class TC009_Screenshot extends ProjectSpecificMethods {

	@BeforeTest
	public void setValues() {
		excelFileName = "NOPCommerce";
		excelSheetName = "TC009_Screenshot";
	} 

	@Test(dataProvider = "provideData")
	public void run(String mailId, String password, String productName) throws InterruptedException, IOException {
		new HomePage().clickLogin().enterEmailId(mailId).enterPassword(password).clickLogin()
		.enterProductName(productName).clickSearch().productScreenshot();
		
	}
}