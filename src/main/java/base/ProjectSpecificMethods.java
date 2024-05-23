package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import Seleniumapi.SeleniumBase;
import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ReadExcel;


public class ProjectSpecificMethods extends SeleniumBase {
	
	
	public static Properties prop;
	
	public String excelFileName;
	public String excelSheetName;
	
	public String readFromXpath(String data) throws IOException {
		FileInputStream xpath = new FileInputStream("./src/test/resources/Xpath.properties");
		prop = new Properties();
		prop.load(xpath);
		String xpathData = prop.getProperty(data);
		return xpathData;
	}

	public String getProperty(String properties) {
		return prop.getProperty(properties);
	}
	
	@DataProvider()
	public String[][] provideData() throws IOException
	{
		return ReadExcel.readData(excelFileName, excelSheetName);
	}
	
	@BeforeMethod
	public void preCondition()
	{
		
		startApp();
	}
	
	@AfterMethod
	public void postCondition()
	{
		closeApp();
	}

}
