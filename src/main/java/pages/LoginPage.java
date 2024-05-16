package pages;

import java.io.IOException;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Seleniumapi.SeleniumBase;
import base.ProjectSpecificMethods;

public class LoginPage extends SeleniumBase {
	ExtentTest tc = ProjectSpecificMethods.startTest();

	public LoginPage enterEmailId(String emailId) throws IOException {
		enterText(readFromXpath("EnterEmailId"),emailId);
		tc.log(Status.PASS, "Email id is entered successfully");
		return this;
	}

	public LoginPage enterPassword(String password) throws IOException {
		enterText(readFromXpath("EnterPassword"),password);
		tc.log(Status.PASS, "password id is entered successfully");
		return this;
	}

	public AccountPage clickLogin() throws IOException {
		click(readFromXpath("ClickButtonLogin"));
		tc.log(Status.PASS, "Login button is clicked successfully successfully");
		return new AccountPage();
	}

}
