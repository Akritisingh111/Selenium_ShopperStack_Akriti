package com.ShopperStack_GenericUtility;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.ShopperStack_pom.Home_Page;
import com.ShopperStack_pom.Login_Page;
import com.ShopperStack_pom.Welcome_Page;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


public class Base_Test {
	public	ExtentSparkReporter spark;
	public	ExtentReports report;
	public ExtentTest test;
	public	WebDriver driver;
	public	static WebDriver sDriver;
	public	File_Utility file = new File_Utility();
	public	Welcome_Page welcomePage;
	public	Login_Page loginPage;
	public	Home_Page homePage;
	public	WebDriverWait wait;
	public WebDriver_Utility webDriverUtility;



	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("@BeforeSuite");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("@BeforeTest");
        spark = new ExtentSparkReporter(Framework_Constants.reportPath);
        report = new ExtentReports();
        report.attachReporter(spark);
        test=report.createTest("Demo");


	}
	
	@BeforeClass
	public void beforeClass() throws IOException
	{
		System.out.println("@BeforeClass");
        
		String browser = file.readPropertyData("browser");
		String url = file.readPropertyData("url");
		
//		String browser=System.getProperty("browser");  --- using these commands we can enter values from command line
//		String url = System.getProperty("url");
		
		if(browser.contains("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(browser.contains("firefox"))
		{
			driver = new FirefoxDriver();
        }
		else if(browser.contains("edge"))
		{
			driver = new EdgeDriver();
		}
		else
		{
			System.out.println("Enter a valid browser");
		}
		sDriver=driver;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get(url);
		homePage = new Home_Page(driver);

		

	}
	
	@BeforeMethod
	public void beforeMethod() throws IOException, InterruptedException
	{
		System.out.println("@BeforeMethod");
		//WelcomePage
		welcomePage = new Welcome_Page(driver);
		WebElement element = welcomePage.getLoginBtn();
		wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		Thread.sleep(3000);
		element.click();
		
		//Login Page
		loginPage = new Login_Page(driver);
		loginPage.getEmail().sendKeys(file.readPropertyData("username"));
		loginPage.getPassword().sendKeys(file.readPropertyData("password"));
		loginPage.getLoginBtn().click();
		
		}
	
	@AfterMethod
	public void afterMethod() throws InterruptedException
	{
		System.out.println("@AfterMethod");
		//Home Page
		
//		Thread.sleep(5000);
				homePage.getAccountSettings().click();
				Thread.sleep(3000);
				homePage.getLogout().click();

	}
	
	@AfterClass
	public void afterClass() throws InterruptedException
	{
		System.out.println("@AfterClass");
		Thread.sleep(3000);
		driver.quit();

	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("@AfterTest");
		report.flush();

	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("@AfterSuite");

	}
	

}
