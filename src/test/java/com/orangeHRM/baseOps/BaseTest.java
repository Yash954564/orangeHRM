package com.orangeHRM.baseOps;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.orangeHRM.pageObjects.PageObjects;

public class BaseTest extends PageObjects{
	@BeforeClass
	public static void Login() throws IOException {
		try {
			 openURL(URL);
			 sendkey(USERNAME, USERNAME_value);
			 sendkey(PASSWORD, PASSWORD_value);
			 click(LOGIN_BTN);
			 verifyTitle(DASHBOARD_HEADING, "Dashboard");
			 ExtentReportTest("Login with valid credential", "PASS", "");
		} catch (Exception e) {
			System.out.println(e);
			 ExtentReportTest("Login with valid credential", "FAIL", "ISSUE:"+e+"");
			 Assert.assertFalse(true);
		}
	
	}
	 
	@AfterClass
	public static void END() throws IOException {
		try {
			 click(PROFILE_DROPDOWN);
			 click(LOGOUT_SELECT);
			 ExtentReportTest("Logout", "PASS", "");
			Thread.sleep(5000);
			 closeURL();
		} catch (Exception e) {
			System.out.println(e);
			 ExtentReportTest("Logout", "FAIL", "ISSUE:"+e+"");
			 Assert.assertFalse(true);
		}
	}
	

}
