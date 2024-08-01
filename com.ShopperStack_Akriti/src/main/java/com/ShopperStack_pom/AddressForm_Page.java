package com.ShopperStack_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressForm_Page {
	
	public AddressForm_Page(WebDriver driver) {
		PageFactory.initElements(driver , this);
	}
	
	@FindBy(id = "Office")
	private WebElement officeRadioBtn;
	
	@FindBy(id = "Name")
	private WebElement nameTextField;
	
	@FindBy(xpath ="//input[contains(@id,'House')]")
	private WebElement houseInfoTextField;
	
	@FindBy(xpath ="//input[contains(@id,'Street')]")
	private WebElement streetInfoTextField;
	
	@FindBy(id = "Landmark")
	private WebElement landmarkTextField;
	
	@FindBy(id = "Country")
	private WebElement countryDropDown;
	
	@FindBy(id = "State")
	private WebElement stateDropDown;
	
	@FindBy(id = "City")
	private WebElement cityDropDown;
	
	@FindBy(id = "Pincode")
	private WebElement pincodeTextField;
	
	@FindBy(xpath = "//input[contains(@id,'Phone')]")
	private WebElement phoneNumberTextField;
	
	@FindBy(id = "addAddress")
	private WebElement addAddressBtn;

	public WebElement getOfficeRadioBtn() {
		return officeRadioBtn;
	}

	public WebElement getNameTextField() {
		return nameTextField;
	}

	public WebElement getHouseInfoTextField() {
		return houseInfoTextField;
	}

	public WebElement getStreetInfoTextField() {
		return streetInfoTextField;
	}

	public WebElement getLandmarkTextField() {
		return landmarkTextField;
	}

	public WebElement getCountryDropDown() {
		return countryDropDown;
	}

	public WebElement getStateDropDown() {
		return stateDropDown;
	}

	public WebElement getCityDropDown() {
		return cityDropDown;
	}

	public WebElement getPincodeTextField() {
		return pincodeTextField;
	}

	public WebElement getPhoneNumberTextField() {
		return phoneNumberTextField;
	}

	public WebElement getAddAddressBtn() {
		return addAddressBtn;
	}
	
	
	

}
