package utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.remote.UnreachableBrowserException;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

public abstract class Reporter1 {
	public static ExtentReports extent;
	public static ExtentTest test;

	public String name;
	public String desc;
	public String category;
	public String author;

	@BeforeSuite
	public void startReport() {
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./reports/result.html");
		reporter.setAppendExisting(true);
		extent = new ExtentReports();
		extent.attachReporter(reporter);
	}

	@BeforeClass
	public void startTestCase() {
		test = extent.createTest(name, desc);
		test.assignCategory(category);
		test.assignAuthor(author);
	}

	public void reportStep(String msg, String status) throws IOException {
		if (status.equalsIgnoreCase("pass")) {
			test.pass(msg,
					MediaEntityBuilder.createScreenCaptureFromPath(".././Snaps/img" + takeSnap() + ".png").build());
		} else if (status.equalsIgnoreCase("fail")) {
			test.fail(msg);
			throw new RuntimeException("look in to the report for failure details");
		}

	}

	public abstract long takeSnap();

	@AfterSuite
	public void endResult() {
		extent.flush();
	}

}