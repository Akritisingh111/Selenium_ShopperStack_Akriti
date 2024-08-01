package com.ShopperStack_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpdateAddress_Page {
	
   public UpdateAddress_Page(WebDriver driver)
   {
	   PageFactory.initElements(driver, this);
   }
   
   @FindBy(id = "Home")
   private WebElement homeRadioBtn;
   
   
   @FindBy(id = "Name")
   private WebElement updateNameTextField;
   
   @FindBy(id = "House/Office Info")
   private WebElement houseInfoTextField;
   @FindBy(id = "Street Info")
   private WebElement streetInfoTextField;
   
   @FindBy(id = "Landmark")
   private WebElement landmarkTextFeild;
   
   @FindBy(id = "Update Address")
   private WebElement updateAddressBtn;
   


public WebElement getHomeRadioBtn() {
	return homeRadioBtn;
}

public WebElement getUpdateNameTextField() {
	return updateNameTextField;
}

public WebElement getHouseInfoTextField() {
	return houseInfoTextField;
}

public WebElement getStreetInfoTextField() {
	return streetInfoTextField;
}

public WebElement getLandmarkTextFeild() {
	return landmarkTextFeild;
}

public WebElement getUpdateAddressBtn() {
	return updateAddressBtn;
}
   



   
   
   
	

}
