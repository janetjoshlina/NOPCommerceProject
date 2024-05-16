package Seleniumapi;

import java.io.File;
import java.io.IOException;
import java.util.List;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import base.ProjectSpecificMethods;
import design.Element;

public class SeleniumBase extends ProjectSpecificMethods implements Element {

	ExtentTest tc = startTest();

	public void enterText(String value, String data) {
		try {
			tc.info("entering text");
			driver.findElement(By.xpath("" + value + "")).sendKeys(data);
			tc.log(Status.PASS, "Text entered successfully");
		} catch (Exception e) {
			tc.log(Status.FAIL, "unable to enter text");
		}
	}

	@Override
	public boolean verifyExactText(String ele, String expectedText) {
		tc.info("entering text");
		WebElement element = driver.findElement(By.xpath("" + ele + ""));
		String text = element.getText();
		if (text.contains(expectedText)) {
			tc.log(Status.PASS, "Text exactly matched");
			return true;
		} else {
			tc.log(Status.FAIL, "text dint match exactly");
			return false;
		}
	}

	@Override
	public void click(String ele) {
		try
		{
			tc.info("Clicking is performed");
		driver.findElement(By.xpath("" + ele + "")).click();
		tc.log(Status.PASS, "Clicked successfully");
		}
		catch (Exception e) {
			tc.log(Status.FAIL, "clicked not performed");
		}
	}

	@Override
	public void selectDropDownUsingValue(String ele, String value) {
		try
		{
			tc.info("Select from drop down");
		Select sel = new Select(driver.findElement(By.xpath("" + ele + "")));
		sel.selectByValue(value);
		tc.log(Status.PASS, "Value selected from drop down");
		}
		catch (Exception e) {
			tc.log(Status.FAIL, "Value not selected from drop down");
		}

	}

	public void scrollIntoView(String ele) throws InterruptedException {
		try
		{
			tc.info("Scrolling into view");
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoViewIfNeeded();",
				driver.findElement(By.xpath("" + ele + "")));
		Thread.sleep(500);
		tc.log(Status.PASS, "Successfully scrolled");
		}
		catch (Exception e) {
			tc.log(Status.FAIL, "Not able to scroll");
		}

	}

	public void acceptAlert() {
		try
		{
			tc.info("Accept alert");
		Alert al = driver.switchTo().alert();
		al.accept();
		tc.log(Status.PASS, "Alert accepted");
		}
		catch (Exception e) {
			tc.log(Status.FAIL, "Alert not accepted");
		}
	}

	public void displayProductNames(String ele) {
		List<WebElement> element = driver.findElements(By.xpath("" + ele + ""));
		System.out.println(element.size());
		for (int i = 1; i <= element.size(); i++) {
			String productName = driver
					.findElement(By.xpath("(//div[@class='item-grid']/div)[" + i + "]/div/div[2]/h2/a")).getText();
			System.out.println(productName);
			tc.log(Status.PASS, "Products displayed");
		}
	}

	public void TakeScreenshot() throws IOException {
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshot]/pic1.png");
		FileUtils.copyFile(src, dest);
		tc.log(Status.PASS, "Screenshot taken");

	}

}
