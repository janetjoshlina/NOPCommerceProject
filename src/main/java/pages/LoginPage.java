package pages;

import java.io.IOException;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Seleniumapi.SeleniumBase;
import base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods {

	public LoginPage enterEmailId(String emailId) throws IOException {
		enterText(readFromXpath("EnterEmailId"),emailId);
		return this;
	}

	public LoginPage enterPassword(String password) throws IOException {
		enterText(readFromXpath("EnterPassword"),password);
		return this;
	}

	public AccountPage clickLogin() throws IOException {
		click(readFromXpath("ClickButtonLogin"));
		return new AccountPage();
	}

}
