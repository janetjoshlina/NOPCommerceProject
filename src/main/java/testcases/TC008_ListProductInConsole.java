package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.HomePage;

public class TC008_ListProductInConsole extends ProjectSpecificMethods {

	@BeforeTest
	public void setValues() {
		excelFileName = "NOPCommerce";
		excelSheetName = "TC008_ListProductInConsole";
	} 

	@Test(dataProvider = "provideData")
	public void run(String MailId, String Password, String ProductName) throws InterruptedException, IOException {
		new HomePage().clickLogin().enterEmailId(MailId).enterPassword(Password).clickLogin()
				.enterProductName(ProductName).clickSearch().listProductNames();

	}
}