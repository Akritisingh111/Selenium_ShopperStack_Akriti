package com.ShopperStack_TestScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.ShopperStack_GenericUtility.Base_Test;
import com.ShopperStack_GenericUtility.Listerners;
import com.ShopperStack_pom.AddressForm_Page;
import com.ShopperStack_pom.MyAddress_Page;
import com.ShopperStack_pom.MyProfile_Page;
import com.aventstack.extentreports.Status;
@Listeners(Listerners.class)
public class Verify_user_is_able_to_Add_Address_or_not_Test extends Base_Test {
	
	@Test
	public void addAddress() throws EncryptedDocumentException, IOException 
	{   test.log(Status.INFO, "Home Page is displayed");
		homePage.getAccountSettings().click();
		homePage.getMyProfile().click();
		test.log(Status.INFO, "MyProfile Page is displayed");
		MyProfile_Page myProfilePage = new MyProfile_Page(driver);
		myProfilePage.getMyAddressBtn().click();
		 
		test.log(Status.INFO, "MyAddress Page is displayed");
        MyAddress_Page myAddress = new MyAddress_Page(driver);
		myAddress.getAddAddressBtn().click();
		
		
		test.log(Status.INFO, "Address Form Page is displayed");

		AddressForm_Page addressForm = new AddressForm_Page(driver);
		addressForm.getOfficeRadioBtn().click();
		addressForm.getNameTextField().sendKeys(file.readExcelData("Sheet1", 1, 0));
		addressForm.getHouseInfoTextField().sendKeys(file.readExcelData("Sheet1", 1, 1));
		addressForm.getStreetInfoTextField().sendKeys(file.readExcelData("Sheet1", 1, 2));
		addressForm.getLandmarkTextField().sendKeys(file.readExcelData("Sheet1", 1, 3));
		
//		addressForm.getCountryDropDown().sendKeys(file.readPropertyData("country"));
//		addressForm.getStateDropDown().sendKeys(file.readPropertyData("state"));
//		addressForm.getCityDropDown().sendKeys(file.readPropertyData("city"));
		
		webDriverUtility.selectByValue(addressForm.getCountryDropDown(), "country");
		webDriverUtility.selectByValue(addressForm.getStateDropDown(), "state");
		webDriverUtility.selectByValue(addressForm.getCityDropDown(), "city");


		addressForm.getPincodeTextField().sendKeys(file.readExcelData("Sheet1", 1, 4));
		addressForm.getPhoneNumberTextField().sendKeys(file.readExcelData("Sheet1", 1, 5));
		addressForm.getAddAddressBtn().click();
		
		
		
	}

}
