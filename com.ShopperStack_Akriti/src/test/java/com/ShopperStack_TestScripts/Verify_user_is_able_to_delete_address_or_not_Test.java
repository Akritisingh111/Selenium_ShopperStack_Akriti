package com.ShopperStack_TestScripts;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.ShopperStack_GenericUtility.Base_Test;
import com.ShopperStack_GenericUtility.Listerners;
import com.ShopperStack_pom.MyAddress_Page;
import com.ShopperStack_pom.MyProfile_Page;
import com.aventstack.extentreports.Status;
@Listeners(Listerners.class)
public class Verify_user_is_able_to_delete_address_or_not_Test extends Base_Test{

	@Test
	public void deleteAddress() throws InterruptedException
	{   test.log(Status.INFO, "Home Page is displayed");
		homePage.getAccountSettings().click();
		homePage.getMyProfile().click();
		test.log(Status.INFO, "MyProfile Page is displayed");
		MyProfile_Page myProfilePage = new MyProfile_Page(driver);
		myProfilePage.getMyAddressBtn().click();
		
		test.log(Status.INFO, "MyAddress Page is displayed");
		MyAddress_Page myAddressPage = new MyAddress_Page(driver);
		Thread.sleep(1000);
		myAddressPage.getDeleteAddressBtn().click();
		Thread.sleep(1000);
        myAddressPage.getRemoveAddressPopUp().click();
		Thread.sleep(2000);
		test.log(Status.INFO, "Alert is displayed");

		driver.switchTo().alert().accept();

		
	}
	
}
