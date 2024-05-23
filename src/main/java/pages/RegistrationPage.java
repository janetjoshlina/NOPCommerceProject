package pages;

import java.io.IOException;

import org.openqa.selenium.By;

import Seleniumapi.SeleniumBase;
import base.ProjectSpecificMethods;

public class RegistrationPage extends ProjectSpecificMethods {

	public RegistrationPage selectGender() throws IOException {
		click(readFromXpath("SelectGender"));
		return this;
	}

	public RegistrationPage enterFirstName(String firstName) throws IOException {
		enterText(readFromXpath("EnterFirstName"), firstName);
		return this;
	}

	public RegistrationPage enterLastName(String lastName) throws IOException {
		enterText(readFromXpath("EnterLastName"), lastName);
		return this;
	}

	public RegistrationPage selectDay(String day) throws IOException {
		selectDropDownUsingValue(readFromXpath("EnterDay"), day);
		return this;
	}
	
	public RegistrationPage selectMonth(String month) throws IOException {
		selectDropDownUsingValue(readFromXpath("EnterMonth"), month);
		return this;
	}

	public RegistrationPage selectYear(String year) throws IOException {
		selectDropDownUsingValue(readFromXpath("EnterYear"),year );
		return this;
	}
	
	public RegistrationPage enterEmail(String email) throws IOException {
		enterText(readFromXpath("EnterEmailId"), email);
		return this;
	}

	public RegistrationPage enterCompanyName(String company) throws IOException {
		enterText(readFromXpath("EnterCompany"), company);
		return this;
	}

	public RegistrationPage enterPassword(String password) throws IOException {
		enterText(readFromXpath("EnterPassword"), password);
		return this;
	}

	public RegistrationPage enterConfirmPassword(String confirmPassword) throws IOException {
		enterText(readFromXpath("EnterConfirmPassword"), confirmPassword);
		return this;
	}
	
	public AccountPage clickRegister() throws IOException {
		click(readFromXpath("ClickRegisterButton"));
		return new AccountPage();
	}

}
