package pages;

import java.io.IOException;

import org.testng.Assert;

import Seleniumapi.SeleniumBase;
import base.ProjectSpecificMethods;

public class ShoppingCartPage extends ProjectSpecificMethods {

	public ShoppingCartPage verifyCartProductDetails(String productName) throws IOException {
		boolean display = verifyExactText(readFromXpath("VerifyCartProductDetails"), productName);
		Assert.assertTrue(display);
		return this;
	}

	public ShoppingCartPage clickTernOfService() throws IOException {
		click(readFromXpath("ClickTermsOfCondition"));
		return this;
	}

	public ShoppingCartPage clickCheckOut() throws IOException {
		click(readFromXpath("ClickCheckout"));
		return this;
	}
	
	public ShoppingCartPage deleteAddress() throws IOException {
		click(readFromXpath("DeleteAddress"));
		return this;
	}
	

	public ShoppingCartPage selectCountry(String country) throws IOException {
		selectDropDownUsingValue(readFromXpath("SelectBillingCountry"), country);
		return this;
	}

	public ShoppingCartPage enterCity(String city) throws IOException {
		enterText(readFromXpath("EnterBillingCity"), city);
		return this;
	}

	public ShoppingCartPage enterAddress(String address) throws IOException {
		enterText(readFromXpath("EnterBillingAddress"), address);
		return this;
	}

	public ShoppingCartPage enterPostalCode(String pincode) throws IOException {
		enterText(readFromXpath("EnterBillingPostalCode"), pincode);
		return this;
	}

	public ShoppingCartPage enterPhoneNumber(String phoneNumber) throws IOException {
		enterText(readFromXpath("EnterBillingPhoneNumber"), phoneNumber);
		return this;
	}

	public ShoppingCartPage clickContinue() throws IOException {
		click(readFromXpath("ClickContinueSave"));
		return this;
	}

	public ShoppingCartPage clickShippingContinue() throws IOException {
		click(readFromXpath("ClickShippingContinue"));
		return this;
	}

	public ShoppingCartPage clickPaymentContinue() throws IOException {
		click(readFromXpath("ClickPaymentContinue"));
		return this;
	}
	
	public ShoppingCartPage clickPaymentInformationContinue() throws IOException {
		click(readFromXpath("ClickPaymentInformationContinue"));
		return this;
	}
	
	
	public ShoppingCartPage clickOrderConfirm() throws IOException {
		click(readFromXpath("ClickOrderConfirm"));
		return this;
	}
	
	public ShoppingCartPage clickOrderContinue() throws InterruptedException, IOException {
		Thread.sleep(5000);
		driver.navigate().refresh();
		click(readFromXpath("ClickOrderContinue"));
		return this;
	}

}
