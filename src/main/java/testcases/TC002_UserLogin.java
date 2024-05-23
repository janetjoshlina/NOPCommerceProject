package testcases;

import java.io.IOException;
import org.testng.ITestContext;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import base.ProjectSpecificMethods;
import pages.HomePage;

public class TC002_UserLogin extends ProjectSpecificMethods {

	@BeforeTest
	public void setValues() { 
		name = "TC002_UserLogin";
		desc = "login";
		author = "Janet Joshlina";
		category = "Functional";
		excelFileName = "NOPCommerce";
		excelSheetName = "TC002_UserLogin";
	} 
	
	@Test(dataProvider = "provideData")
	public void run(String mailId, String password) throws IOException {
		new HomePage().clickLogin().enterEmailId(mailId).enterPassword(password).clickLogin();

	}
}
