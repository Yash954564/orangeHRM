package com.orangeHRM.utilities;

import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;



public class operations {
	public static WebDriver driver;
	private static ExtentReports report;

	static {
	    report = new ExtentReports(System.getProperty("user.dir") + "//Reports//ExtentReport//" + "ExtentReportResults"+System.currentTimeMillis()+".html");
	}
	
	public static void openURL(String Baseurl) {
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yashgaikwad\\eclipse-workspace\\smartDataFirst\\Drivers\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "/ChromeDriver");
		WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--zoom=40%");
//        options.addArguments("-incognito");
//        options.addArguments("headless");
        driver = new ChromeDriver(options);
        driver.get(Baseurl);
	}
	
	public static void closeURL() {
		driver.quit();
	}
	
	public static void sendkey(String XPATHS, String KEYS) {
	    WAITING(XPATHS);
		driver.findElement(By.xpath(XPATHS)).sendKeys(KEYS);
	}
	
	public static void click(String XPATHS) {
		WAITING(XPATHS);
		driver.findElement(By.xpath(XPATHS)).click();
	}
	
	public static void submit(String XPATHS) {
		WAITING(XPATHS);
		driver.findElement(By.xpath(XPATHS)).submit();;
	}
	
	public static void WAITING(String PATHS) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(PATHS)));
	}
	
	public static void verifyTitle(String TPATHS, String actual) {
		WAITING(TPATHS);
	    String expected = driver.findElement(By.xpath(TPATHS)).getText();
	    Assert.assertEquals(actual, expected);
	    if (!expected.equals(actual)) {
	        throw new AssertionError("Expected title: \"" + actual + "\" but found: \"" + expected + "\"\nXPath: " + TPATHS);
	    }
	}
	
	public static void Attachment(String XPATHS) {
		String desc = System.getProperty("user.dir");
		System.out.println(desc);
		String ImageURL = desc+"\\Attachments\\Capture.PNG";
		sendkey(XPATHS, ImageURL);
	}
	
	public static void ScrollBY(int pxn) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,"+pxn+")", "");
	}
	
	public static void UploadFile(String fileInput, String filePath) {
		((JavascriptExecutor) driver).executeScript("arguments[0].value = arguments[1];", fileInput, filePath);

	}
	
    public static String capture(WebDriver driver, String Name)throws IOException {
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File Dest = new File(System.getProperty("user.dir") + "//Reports//Screenshots//"+Name+"" + System.currentTimeMillis()
                + ".png");
        String errflpath = Dest.getAbsolutePath();
        FileUtils.copyFile(scrFile, Dest);
        return errflpath;
    }


    public static void ExtentReportTest(String TestCase, String status, String Testdetails) throws IOException {
        ExtentTest test = report.startTest(TestCase);

        if (status.equalsIgnoreCase("Pass")) {
            test.log(LogStatus.PASS, test.addScreenCapture(capture(driver, TestCase)) + Testdetails);
            
        } else {
            test.log(LogStatus.FAIL, test.addScreenCapture(capture(driver, TestCase)) + Testdetails);
        }

        report.flush();
    }
	
	
	
}
