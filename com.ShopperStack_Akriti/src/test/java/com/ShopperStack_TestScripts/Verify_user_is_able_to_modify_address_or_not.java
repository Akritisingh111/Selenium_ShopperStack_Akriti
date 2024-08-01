package com.ShopperStack_TestScripts;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import com.ShopperStack_GenericUtility.Base_Test;
import com.ShopperStack_pom.MyAddress_Page;
import com.ShopperStack_pom.MyProfile_Page;
import com.ShopperStack_pom.UpdateAddress_Page;

public class Verify_user_is_able_to_modify_address_or_not extends Base_Test{
    @Test
	public void updateAddress() throws EncryptedDocumentException, IOException, InterruptedException
	{  
    	homePage.getAccountSettings().click();
    	homePage.getMyProfile().click();
    	
    	MyProfile_Page myProfilePage = new MyProfile_Page(driver);
    	myProfilePage.getMyAddressBtn().click();
    	
    	MyAddress_Page myAddressPage = new MyAddress_Page(driver);
    	myAddressPage.getEditAddressBtn().click();
    	
    	UpdateAddress_Page updateAddressPage = new UpdateAddress_Page(driver);
    	updateAddressPage.getHomeRadioBtn().click();
    	updateAddressPage.getUpdateNameTextField().clear();
    	updateAddressPage.getUpdateNameTextField().sendKeys(file.readExcelData("Sheet1", 2, 0));

    	Thread.sleep(3000);

    	updateAddressPage.getHouseInfoTextField().clear();
    	updateAddressPage.getHouseInfoTextField().sendKeys(file.readExcelData("Sheet1", 2, 1));
    	Thread.sleep(3000);

    	updateAddressPage.getStreetInfoTextField().clear();
        updateAddressPage.getStreetInfoTextField().sendKeys(file.readExcelData("Sheet1", 2, 2));

    	Thread.sleep(3000);

    	updateAddressPage.getLandmarkTextFeild().clear();
        updateAddressPage.getLandmarkTextFeild().sendKeys(file.readExcelData("Sheet1", 2, 2));

    	Thread.sleep(3000);

    	updateAddressPage.getUpdateAddressBtn().click();
    	
    	Thread.sleep(1000);

    	
	}
}
