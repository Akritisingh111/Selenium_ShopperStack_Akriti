package com.ShopperStack_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAddress_Page {
	
	public MyAddress_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[text()='Add Address']")
	private WebElement addAddressBtn;
	
	@FindBy(xpath ="(//span[contains(@class,'MuiButton-startIcon')])[2]")
	private WebElement deleteAddressBtn;
	
	@FindBy(xpath = "(//button[contains(@class,'MuiButtonBase-root')])[3]")
	private WebElement editAddressBtn;
	
	

	@FindBy(xpath = "//button[text()='Yes']")
	private WebElement removeAddressPopUp;

	public WebElement getRemoveAddressPopUp() {
		return removeAddressPopUp;
	}

	public WebElement getAddAddressBtn() {
		return addAddressBtn;
	}

	public WebElement getDeleteAddressBtn() {
		return deleteAddressBtn;
	}
	
	public WebElement getEditAddressBtn() {
		return editAddressBtn;
	}
	

}
