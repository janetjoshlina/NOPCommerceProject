package pages;

import java.io.IOException;

import java.util.Properties;

import org.openqa.selenium.By;
import org.testng.ITestContext;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Seleniumapi.SeleniumBase;
import base.ProjectSpecificMethods;
import testcases.TC002_UserLogin;

public class HomePage extends SeleniumBase {
	
	ExtentTest tc = ProjectSpecificMethods.startTest();
	
	public LoginPage clickLogin() throws IOException
	{
		click(readFromXpath("ClickLogin"));
		tc.log(Status.PASS, "Login successfull");
		return new LoginPage();
	}
	
	public RegistrationPage clickRegister() throws IOException
	{
		click(readFromXpath("ClickRegister"));
		tc.log(Status.PASS, "Clicking Register Button successfull");
		return new RegistrationPage();
	}

}
