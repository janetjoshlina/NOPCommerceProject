package pages;

import static org.testng.Assert.assertEquals;
import utils.*;

import java.io.IOException;

import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Seleniumapi.SeleniumBase;
import base.ProjectSpecificMethods;

public class AccountPage extends SeleniumBase{
	
	ExtentTest tc = ProjectSpecificMethods.startTest();

	public AccountPage validateRegistration(String actualText) throws IOException {
		tc.info("Validating Registration");
		boolean displayed = verifyExactText(readFromXpath("VerifyText"), actualText);
		Assert.assertTrue(displayed);
		tc.log(Status.PASS,"Registration validated successfully").addScreenCaptureFromPath("./Screenshot]/test.png");
		return this;
	}

	public AccountPage clickContinue() throws IOException {
		click(readFromXpath("ClickContinue"));
		return this;
	}

	public AccountPage enterProductName(String productName) throws IOException {
		enterText(readFromXpath("EnterProductName"), productName);
		return this;
	}

	public AccountPage clickSearch() throws IOException {
		click(readFromXpath("ClickSearch"));
		return this;
	}

	public AccountPage verifyProductAvailability(String productName) throws IOException {
		boolean display = verifyExactText(readFromXpath("VerifyProductAvailability"), productName);
		Assert.assertTrue(display);
		return this;
	}

	public AccountPage listProductNames() throws IOException {
		displayProductNames(readFromXpath("ListProductNames"));
		return this;
	}

	public AccountPage productScreenshot() throws IOException, InterruptedException {
		scrollIntoView(readFromXpath("ProductScreenshot"));
		TakeScreenshot();
		return this;
	}

	public AccountPage clickAddToCart() throws InterruptedException, IOException {
		scrollIntoView(readFromXpath("ClickAddToCart"));
		click(readFromXpath("ClickAddToCart"));
		return this;
	}

	public AccountPage clickAddToCartProduct() throws InterruptedException, IOException {
		scrollIntoView(readFromXpath("ClickAddToCartProduct"));
		click(readFromXpath("ClickAddToCartProduct"));
		return this;
	}

	public ShoppingCartPage clickShoppingCart() throws IOException {
		click(readFromXpath("ClickShoppingCart"));
		return new ShoppingCartPage();
	}

	public MyAccountPage clickMyAccount() throws IOException {
		click(readFromXpath("ClickMyAccount"));
		return new MyAccountPage();
	}

}
