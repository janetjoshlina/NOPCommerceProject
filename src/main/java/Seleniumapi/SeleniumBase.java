package Seleniumapi;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import base.ProjectSpecificMethods;
import design.Element;
import utils.Reporter;
import utils.Reporter1;

public class SeleniumBase extends Reporter1 implements Element {
	
	public static ChromeDriver driver;


	public void enterText(String value, String data) {
		try {
			driver.findElement(By.xpath("" + value + "")).sendKeys(data);
		} catch (Exception e) {
		}
	}

	@Override
	public boolean verifyExactText(String ele, String expectedText) {
		WebElement element = driver.findElement(By.xpath("" + ele + ""));
		String text = element.getText();
		if (text.contains(expectedText)) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void click(String ele) {
		try
		{
		driver.findElement(By.xpath("" + ele + "")).click();
		}
		catch (Exception e) {
		}
	}

	@Override
	public void selectDropDownUsingValue(String ele, String value) {
		try
		{
		Select sel = new Select(driver.findElement(By.xpath("" + ele + "")));
		sel.selectByValue(value);
		}
		catch (Exception e) {
		}

	}

	public void scrollIntoView(String ele) throws InterruptedException {
		try
		{
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoViewIfNeeded();",
				driver.findElement(By.xpath("" + ele + "")));
		Thread.sleep(500);
		}
		catch (Exception e) {
		}

	}

	public void acceptAlert() {
		try
		{
		Alert al = driver.switchTo().alert();
		al.accept();
		}
		catch (Exception e) {
		}
	}

	public void displayProductNames(String ele) {
		List<WebElement> element = driver.findElements(By.xpath("" + ele + ""));
		System.out.println(element.size());
		for (int i = 1; i <= element.size(); i++) {
			String productName = driver
					.findElement(By.xpath("(//div[@class='item-grid']/div)[" + i + "]/div/div[2]/h2/a")).getText();
			System.out.println(productName);
		}
	}

	public void TakeScreenshot() throws IOException {
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshot]/pic1.png");
		FileUtils.copyFile(src, dest);

	}

	@Override
	public void startApp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Janet Joshlina\\eclipse-workspace\\project\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	}

	@Override
	public void closeApp() {
		driver.close();
		
	}

	@Override
	public long takeSnap() {
		long number = (long) Math.floor(Math.random() * 900000000L) + 10000000L;
		try {
			FileUtils.copyFile(driver.getScreenshotAs(OutputType.FILE),
					new File("./Snaps/img" + number + ".png"));
		} catch (WebDriverException e) {
		} catch (IOException e) {
		}
		return number;
	}

}
