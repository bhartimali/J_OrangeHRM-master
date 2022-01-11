package com.OrangeHRM.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage {
//profile page
	@FindBy(xpath = "//*[@id=\"txtUsername\"]") WebElement username_Txt;
	@FindBy(xpath = "//*[@id='txtPassword']") WebElement password_Txt;
	@FindBy(xpath="//*[@id=\"btnLogin\"]") WebElement loginBtn;
	@FindBy(xpath="//*[@id='welcome']") WebElement userProfile;
	
	
}
