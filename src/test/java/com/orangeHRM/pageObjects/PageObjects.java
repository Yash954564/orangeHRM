package com.orangeHRM.pageObjects;

import com.orangeHRM.utilities.operations;

public class PageObjects extends operations{
	public static final String RECRUITMENT_TAB = "//span[normalize-space()='Recruitment']";
	public static final String RECRUITMENT_TAB_TITLE = "//h6[normalize-space()='Recruitment']";
	
	// Locators for Vacancies tab
    public static final String VACANCIES_TAB = "//li[@class='oxd-topbar-body-nav-tab']";
    public static final String VACANCIES_TITLE = "//h5[normalize-space()='Vacancies']";

    // Locators for Add Vacancy button
    public static final String ADD_VACANCY_BUTTON = "//button[normalize-space()='Add']";
    public static final String ADD_VACANCY_TITLE = "//h6[normalize-space()='Add Vacancy']";

    // Locators for Add Vacancy form
    public static final String VACANCY_NAME_INPUT = "//div[@class='oxd-input-group oxd-input-field-bottom-space']/div/input[1]";
    public static final String JOB_TITLE_SELECT = "//div[@class='oxd-select-text oxd-select-text--active']";
    public static final String QA_ENGINEER_OPTION = "//div[@role='listbox']//div[2]";
    public static final String VACANCY_DESCRIPTION_INPUT = "//textarea[@placeholder='Type description here']";
    public static final String HIRING_MANAGER_INPUT = "//input[@placeholder='Type for hints...']";
    public static final String ODIS_OPTION = "//span[contains(text(),'Odis')]";
    public static final String NO_OF_POSITIONS_INPUT = "//div[@class='oxd-grid-2 orangehrm-full-width-grid']//div[@class='oxd-grid-item oxd-grid-item--gutters']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']";
    public static final String HIRING_MANAGER_SELECTION_CHECKBOX = "//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[4]/div[1]/div[1]";
    public static final String VACANCY_STATUS_SELECTION_CHECKBOX = "//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[5]/div[1]/div[1]/label[1]";
    public static final String SAVE_BUTTON = "//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[7]/button[2]";

    // Locators for search vacancies
    public static final String VACANCY_SEARCH_INPUT = "//body/div[@id='app']/div[@class='oxd-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container']/div[@class='oxd-table-filter']/div[@class='oxd-table-filter-area']/form[@class='oxd-form']/div[@class='oxd-form-row']/div[@class='oxd-grid-4 orangehrm-full-width-grid']/div[2]/div[1]/div[2]/div[1]/div[1]";
    public static final String QA_ENGINEER_OPTION_IN_SEARCH = "//span[normalize-space()='Associate QA']";
    public static final String HIRING_MANAGER_SEARCH_INPUT = "//body/div[@id='app']/div[@class='oxd-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container']/div[@class='oxd-table-filter']/div[@class='oxd-table-filter-area']/form[@class='oxd-form']/div[@class='oxd-form-row']/div[@class='oxd-grid-4 orangehrm-full-width-grid']/div[3]/div[1]/div[2]/div[1]/div[1]";
    public static final String ODIS_OPTION_IN_SEARCH = "//span[contains(text(),'Odis')]";
    public static final String SEARCH_BUTTON = "//button[normalize-space()='Search']"; 
    
    //Verify added vacancy
    public static final String ASSOCIATE_QA = "//div[contains(text(),'Associate QA')]";

    
    //Delete added vacancy
    public static final String DELETE_ICON = "//div[@class='orangehrm-container']//button[1]";
    public static final String YES_BUTTON = "//button[normalize-space()='Yes, Delete']";
    //public static final String = "";
    //public static final String = "";
    
    

    //Before Method
    public static final String URL = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
    public static final String USERNAME = "//input[@placeholder='Username']";
    public static final String PASSWORD = "//input[@placeholder='Password']";
    public static final String LOGIN_BTN= "//button[normalize-space()='Login']";
    public static final String DASHBOARD_HEADING = "//h6[normalize-space()='Dashboard']";
    
    //After Method
    public static final String PROFILE_DROPDOWN = "//span[@class='oxd-userdropdown-tab']";
    public static final String LOGOUT_SELECT = "//header[@class='oxd-topbar']//li[4]";
//    public static final String URL = "https://bard.google.com/";
    
    //Add Attachment
    public static final String ADD_ATTACHMENT_BTN = "//button[normalize-space()='Add']";
    public static final String SEND_ATTACHMENT = "//input[@type='file']";
    public static final String SEND_ATTACHMENT_DESCRIPTION = "//textarea[@placeholder='Type comment here']";
    public static final String SUBMIT_ATTACHMENT = "//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/form[1]/div[3]/button[2]";
    //public static final String = "";
    
    //Strings to pass
    public static final String DESCRIPTION = "Quality assurance (QA) testers play a critical role in delivering high quality, perfectly-functioning software and web applications to customers. They test and evaluate new and existing programs to identify and help remove bugs, glitches, and other user experience issues.";
    
    //credential
    public static final String PASSWORD_value = "admin123";
    public static final String USERNAME_value = "Admin";
    
    public static final String ASSOCIATE_QA_value = "Associate QA";
}
