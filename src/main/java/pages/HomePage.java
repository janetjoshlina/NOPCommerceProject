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

public class HomePage extends ProjectSpecificMethods {
	
	
	public LoginPage clickLogin() throws IOException
	{
		click(readFromXpath("ClickLogin"));
		reportStep("click login", "pass");
		return new LoginPage();
	}
	
	public RegistrationPage clickRegister() throws IOException
	{
		click(readFromXpath("ClickRegister"));
		return new RegistrationPage();
	}

}
