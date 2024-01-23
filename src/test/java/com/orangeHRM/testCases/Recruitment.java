package com.orangeHRM.testCases;


import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.Test;
import com.orangeHRM.baseOps.BaseTest;

public class Recruitment extends BaseTest{
	@Test(priority = 1)
	public static void NavigateToRecruitment() throws IOException {
		try {
			click(RECRUITMENT_TAB);
			 verifyTitle(RECRUITMENT_TAB_TITLE, "Recruitment");
			 ExtentReportTest("Navigate to Recruitment", "PASS", "");
		} catch (Exception e) {
			System.out.println(e);
			 ExtentReportTest("Navigate to Recruitment", "FAIL", "ISSUE: "+e+"");
			 Assert.assertFalse(true);
			 
		}
	}
	 
	@Test(priority = 2)
	public static void NavigateToVacancies() throws IOException {
		try {
			 click(VACANCIES_TAB);
			 verifyTitle(VACANCIES_TITLE, "Vacancies");
			 ExtentReportTest("Navigate To Vacancies", "PASS", "");
		} catch (Exception e) {
			System.out.println(e);
			 ExtentReportTest("Navigate To Vacancies", "FAIL", "ISSUE: "+e+"");
			 Assert.assertFalse(true);
		}
	}
	
	@Test(priority = 3)
	public static void NavigateToAddVacancy() throws IOException {
		try {
			 click(ADD_VACANCY_BUTTON);
			 verifyTitle(ADD_VACANCY_TITLE, "Add Vacancy");
			 ExtentReportTest("Navigate To ADD Vacancies", "PASS", "");
		} catch (Exception e) {
			System.out.println(e);
			 ExtentReportTest("Navigate To ADD Vacancies", "FAIL", "ISSUE: "+e+"");
			 Assert.assertFalse(true);
		}
	}
	
	@Test(priority = 4)
	public static void AddVacancy() throws IOException {
		try {
			 sendkey(VACANCY_NAME_INPUT, "Associate QA");
			 click(JOB_TITLE_SELECT);
			 click(QA_ENGINEER_OPTION);
			 sendkey(VACANCY_DESCRIPTION_INPUT, DESCRIPTION);
			 sendkey(HIRING_MANAGER_INPUT, "o");
			 click(ODIS_OPTION); 
			 sendkey(NO_OF_POSITIONS_INPUT, "13");
			 click(HIRING_MANAGER_SELECTION_CHECKBOX);
			 click(HIRING_MANAGER_SELECTION_CHECKBOX);
			 click(VACANCY_STATUS_SELECTION_CHECKBOX);
			 click(SAVE_BUTTON);
			 ExtentReportTest("ADD Vacancy", "PASS", "");
		
		} catch (Exception e) {
			System.out.println(e);
			ExtentReportTest("ADD Vacancy", "FAIL", "ISSUE: "+e+"");
			 Assert.assertFalse(true);
		}
	}
	
	@Test(priority = 5)
	public static void AddAttachment() throws IOException {
		try {
			Thread.sleep(5000);
			click(ADD_ATTACHMENT_BTN);
			sendkey(SEND_ATTACHMENT_DESCRIPTION, "Testing discription");
			Attachment(SEND_ATTACHMENT);
			click(SUBMIT_ATTACHMENT);
			ExtentReportTest("Add Attachment", "PASS", "");
		} catch (Exception e) {
			System.out.println(e);
			ExtentReportTest("Add Attachment", "FAIL", "ISSUE: "+e.getMessage()+"");
			Assert.assertFalse(true);
		}
	}
	 
	@Test(priority = 6)
	public static void NavigateToBack() throws IOException {
		try {
			Thread.sleep(5000);
			NavigateToRecruitment();
			NavigateToVacancies();
			ExtentReportTest("Navigate To Back Vacancies", "PASS", "");
		} catch (Exception e) {
			System.out.println(e);
			ExtentReportTest("Navigate To Back Vacancies", "FAIL", "ISSUE: "+e+"");
			 Assert.assertFalse(true);
		}
	}
	
	
	@Test(priority = 7)
	public static void SearchVacancies() throws IOException {
		try {
			 click(VACANCY_SEARCH_INPUT);
			 click(QA_ENGINEER_OPTION_IN_SEARCH);
			 click(HIRING_MANAGER_SEARCH_INPUT);
			 click(ODIS_OPTION_IN_SEARCH);
			 click(SEARCH_BUTTON);
			 ExtentReportTest("Search Vacancies", "PASS", "");
		} catch (Exception e) {
			System.out.println(e);
			ExtentReportTest("Search Vacancies", "FAIL", "ISSUE: "+e+"");
			 Assert.assertFalse(true);
		}
	}
	
	
	@Test(priority = 8)
	public static void VerifyAddedVacancy() throws IOException {
		try {
			 verifyTitle(ASSOCIATE_QA, ASSOCIATE_QA_value);
			 ExtentReportTest("Verify Added Vacancy", "PASS", "");
		} catch (Exception e) {
			System.out.println(e);
			ExtentReportTest("Verify Added Vacancy", "FAIL", "ISSUE: "+e+"");
			 Assert.assertFalse(true);
		}
	}
	@Test(priority = 9)
	public static void DeleteVacancy() throws IOException {
		try {
			 click(DELETE_ICON);
			 click(YES_BUTTON);
			 ExtentReportTest("Delete Vacancy", "PASS", "");
		} catch (Exception e) {
			System.out.println(e);
			ExtentReportTest("Delete Vacancy", "FAIL", "ISSUE: "+e+"");
			 Assert.assertFalse(true);
		}
	}
}
