package com.ShopperStack_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {
	
	public Home_Page(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//div[text()='A']")
	private WebElement accountSettings;
	
	@FindBy(xpath = "//li[text()='My Profile']")
	private WebElement myProfile;
	
	
	@FindBy(xpath = "//li[text()='Logout']")
	private WebElement logout;


	public WebElement getAccountSettings() {
		return accountSettings;
	}


	public WebElement getMyProfile() {
		return myProfile;
	}


	public WebElement getLogout() {
		return logout;
	}

}
