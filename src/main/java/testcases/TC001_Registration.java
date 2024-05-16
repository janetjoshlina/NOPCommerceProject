package testcases;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;

import base.ProjectSpecificMethods;
import pages.HomePage;

public class TC001_Registration extends ProjectSpecificMethods {

	@BeforeTest
	public void setValues() {
		
		excelFileName = "NOPCommerce";
		excelSheetName = "TC001_Registration";
	}

	@Test(dataProvider = "provideData")
	public void run(String firstName, String LastName, String day, String month, String year, String emailId,
			String company, String password, String confirmPassword, String validationRegister) throws IOException {
		new HomePage().clickRegister().selectGender().enterFirstName(firstName).enterLastName(LastName).selectDay(day)
				.selectMonth(month).selectYear(year).enterEmail(emailId).enterCompanyName(company)
				.enterPassword(password).enterConfirmPassword(confirmPassword).clickRegister()
				.validateRegistration(validationRegister).clickContinue();

	}

}
