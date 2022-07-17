package pageobjects;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;

import org.apache.commons.io.FilenameUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentTest;

import property.ITestFM;
import testsuitebase.TestResultStatus;
import utility.SeleniumUtils;

public class TestFM  extends SeleniumUtils implements ITestFM{
	
	public void verifyFieldTable (WebDriver driver, HashMap <String, String> param, ExtentTest test) throws InterruptedException {
		String testcaseName = param.get("TestCaseName");
		driver.get(param.get("URL"));
		try {
			waitforElemPresent(driver, testcaseName, 20, field_desc, test);
			Thread.sleep(1000);
			waitforElemPresent(driver, testcaseName, 20, field_name, test);
			reportPass("Table fields are shown on the page", test);
		} catch(Exception e) {
			reportFail(testcaseName, "Tabke fields are not shown on the page", test);
		}
		
	}
	
	public void verifyFieldDescription (WebDriver driver, HashMap <String, String> param, ExtentTest test) throws InterruptedException {
		String testcaseName = param.get("TestCaseName");
		//driver.get(param.get("URL"));
		
			waitforElemPresent(driver, testcaseName, 20, gateway_field, test);
			Thread.sleep(1000);
			waitforElemPresent(driver, testcaseName, 20, amount_field, test);
			Thread.sleep(1000);
			waitforElemPresent(driver, testcaseName, 20, mobile_field, test);
			Thread.sleep(1000);
			waitforElemPresent(driver, testcaseName, 20, lender_field, test);
		
	}

	public void verifyGatewayField (WebDriver driver, HashMap <String, String> param, ExtentTest test) throws InterruptedException {
		String testcaseName = param.get("TestCaseName");
		//driver.get(param.get("URL"));
		waitforElemPresent(driver, testcaseName, 20, gateway, test);
		Thread.sleep(1000);
		click(driver, testcaseName, gateway, test);
		Thread.sleep(1000);
		waitforElemPresent(driver, testcaseName, 20, tpsl_option, test);
		waitforElemPresent(driver, testcaseName, 20, cashfree_option, test);
		waitforElemPresent(driver, testcaseName, 20, razorpay_option, test);
		waitforElemPresent(driver, testcaseName, 20, amazon_option, test);
		waitforElemPresent(driver, testcaseName, 20, worldline_option, test);
		waitforElemPresent(driver, testcaseName, 20, benow_option, test);
		waitforElemPresent(driver, testcaseName, 20, fiserv_option, test);
		
	}
	
	public void selectGateway (WebDriver driver, HashMap <String, String> param, ExtentTest test) throws InterruptedException {
		String testcaseName = param.get("TestCaseName");
		//driver.get(param.get("URL"));
		waitforElemPresent(driver, testcaseName, 20, gateway, test);
		Thread.sleep(1000);
		click(driver, testcaseName, By.xpath("//td/select/option[text()='"+ param.get("GatewayOpt") +"']"), param.get("GatewayOpt"),  test);
		// since selected option is shown using this.value the data can't be verified after selection
		try {
			waitforElemPresent(driver, testcaseName, 20, gateway, test);
			reportPass("Gateway option "+ param.get("GatewayOpt") +" is selected", test);
		} catch(Exception e) {
			reportFail(testcaseName, "Gateway option "+ param.get("GatewayOpt") +" is not selected", test);
		}
		
	}
	

	public void verifyAmountField (WebDriver driver, HashMap <String, String> param, ExtentTest test) throws InterruptedException {
		String testcaseName = param.get("TestCaseName");
		//driver.get(param.get("URL"));
		waitforElemPresent(driver, testcaseName, 20, amount_field, test);
		Thread.sleep(1000);
		// verify amount in text field
		String strAmt = driver.findElement(By.xpath("//input[@id='AMT']")).getAttribute("value").toString();
		if(param.get("Amount").equals(strAmt)) {
			reportPass("Amount shown in the field is "+ param.get("Amount") +"", test);
		}
		else {
			reportFail(testcaseName, "Amount shown in the field is not "+ param.get("Amount") +"", test);
		}
		
	}
	
	//verify JS validation 
	
	public void enterAmount (WebDriver driver, HashMap <String, String> param, ExtentTest test) throws InterruptedException {
		String testcaseName = param.get("TestCaseName");
		String amount = param.get("Amount");
		//driver.get(param.get("URL"));
		param.put("Amt", amount);
		waitforElemPresent(driver, testcaseName, 20, By.xpath("//input[@id='AMT']"), "Amount text field", test);
		click(driver, testcaseName, By.xpath("//input[@id='AMT']"), "Amount text field", test);
		clearText(driver, testcaseName, By.xpath("//input[@id='AMT']"), "Amount text field", test);
		Thread.sleep(1000);
		setText(driver, testcaseName, By.xpath("//input[@id='AMT']"), "Amount text field", amount, test);
		Thread.sleep(1000);
	}
	
	
	public void enterMobile (WebDriver driver, HashMap <String, String> param, ExtentTest test) throws InterruptedException {
		String testcaseName = param.get("TestCaseName");
		String mobile = param.get("Mobile");
		//driver.get(param.get("URL"));
		param.put("Mob", mobile);
		waitforElemPresent(driver, testcaseName, 20, By.xpath("//input[@id='CI']"), "Mobile text field", test);
		click(driver, testcaseName, By.xpath("//input[@id='CI']"), "Mobile text field", test);
		Thread.sleep(1000);
		setText(driver, testcaseName, By.xpath("//input[@id='CI']"), "Mobile text field", mobile, test);
		Thread.sleep(1000);
	}
	
	public void verifyLenderField (WebDriver driver, HashMap <String, String> param, ExtentTest test) throws InterruptedException {
		String testcaseName = param.get("TestCaseName");
		//driver.get(param.get("URL"));
		waitforElemPresent(driver, testcaseName, 20, lender, test);
		Thread.sleep(1000);
		click(driver, testcaseName, lender, test);
		Thread.sleep(1000);
			waitforElemPresent(driver, testcaseName, 20, By.xpath("//td/select/option[text()='Federal']"), "Federal lender option", test);
			scrollIntoView(driver, testcaseName, By.xpath("//td/select/option[text()='IDFC']"), "IDFC lender option", test);
			scrollIntoView(driver, testcaseName, By.xpath("//td/select/option[text()='Kotak']"), "Kotak lender option", test);
			scrollIntoView(driver, testcaseName, By.xpath("//td/select/option[text()='HDFC']"), "HDFC lender option", test);
			scrollIntoView(driver, testcaseName, By.xpath("//td/select/option[text()='HDFC Flexipay']"), "HDFC Flexipay lender option", test);
			scrollIntoView(driver, testcaseName, By.xpath("//td/select/option[text()='Home Credit']"), "Home Credit lender option", test);
			scrollIntoView(driver, testcaseName, By.xpath("//td/select/option[text()='ICICI']"), "ICICI lender option", test);
			scrollIntoView(driver, testcaseName, By.xpath("//td/select/option[text()='Mahindra Finance']"), "Mahindra Finance lender option", test);
			scrollIntoView(driver, testcaseName, By.xpath("//td/select/option[text()='Bank of Baroda']"), "Bank of Baroda lender option", test);
			scrollIntoView(driver, testcaseName, By.xpath("//td/select/option[text()='Kotak Pay Later']"), "Kotak Pay Later lender option", test);
			scrollIntoView(driver, testcaseName, By.xpath("//td/select/option[text()='InstaLend Pay Later']"), "InstaLend Pay Later lender option", test);
			scrollIntoView(driver, testcaseName, By.xpath("//td/select/option[text()='LazyPay']"), "LazyPay lender option", test);
			scrollIntoView(driver, testcaseName, By.xpath("//td/select/option[text()='HDB']"), "HDB lender option", test);
	
	}
	
	public void clickContinue (WebDriver driver, HashMap <String, String> param, ExtentTest test) throws InterruptedException {
		String testcaseName = param.get("TestCaseName");
		//driver.get(param.get("URL"));
		waitforElemPresent(driver, testcaseName, 20, continue_btn, test);
		Thread.sleep(1000);
		click(driver, testcaseName, continue_btn, test);
		Thread.sleep(2000);
		//loader
		waitForLoader(driver, testcaseName, 10, test);
		waitforElemPresent(driver, testcaseName, 10, By.xpath("//div[text()='Select Payment Type']"), "EMI transaction Page-2", test);
		Thread.sleep(1000);
		waitforElemPresent(driver, testcaseName, 10, By.xpath("//div[text()='Cardless EMI']"), "Cardless EMI option", test);
		waitforElemPresent(driver, testcaseName, 10, By.xpath("//div[text()='Pay Later']"), "Pay Later option", test);
		
	}
	
	public void verifyAmountPg2 (WebDriver driver, HashMap <String, String> param, ExtentTest test) throws InterruptedException {
		String testcaseName = param.get("TestCaseName");
		//driver.get(param.get("URL"));
		try {
			waitforElemPresent(driver, testcaseName, 10, By.xpath("//div[text()='10,000']"), "Amount on Page-2", test);
			reportPass("Correct amount is shown on the EMI page", test);
		} catch(Exception e) {
			reportFail(testcaseName, "Incorrect amount is shown on the EMI page", test);
		}
		
	}
	
	public void verifyMobilePg2 (WebDriver driver, HashMap <String, String> param, ExtentTest test) throws InterruptedException {
		String testcaseName = param.get("TestCaseName");
		//driver.get(param.get("URL"));
		try {
			waitforElemPresent(driver, testcaseName, 10, By.xpath("//div[text()='"+ param.get("Mobile") +"']"), "Mobile no. on Page-2", test);
			reportPass("Correct Mobile no. is shown on the EMI page", test);
		} catch(Exception e) {
			reportFail(testcaseName, "Incorrect Mobile no. is shown on the EMI page", test);
		}
		
	}
	
	public void selectEMIoption (WebDriver driver, HashMap <String, String> param, ExtentTest test) throws InterruptedException {
		String testcaseName = param.get("TestCaseName");
		//driver.get(param.get("URL"));
		waitforElemPresent(driver, testcaseName, 10, By.xpath("//div[text()='Cardless EMI']"), "Cardless EMI option", test);
		click(driver, testcaseName, By.xpath("//div[text()='Cardless EMI']"), "Cardless EMI option", test);
		Thread.sleep(2000);
		waitforElemPresent(driver, testcaseName, 10, By.xpath("//div[text()='Kotak Mahindra Bank']"), "Kotak Mahindra Bank option", test);
		click(driver, testcaseName, By.xpath("//div[text()='Kotak Mahindra Bank']"), "Kotak Mahindra Bank option", test);
		//loader
		Thread.sleep(2000);
		waitforElemPresent(driver, testcaseName, 10, By.xpath("//div[text()='Kotak Mahindra Bank']"), "Kotak Mahindra Bank header", test);
		waitforElemPresent(driver, testcaseName, 10, By.xpath("//div[text()='Select EMI']"), "Select EMI text", test);
		Thread.sleep(1000);
		waitforElemPresent(driver, testcaseName, 10, By.xpath("//img[@alt='help']"), "EMI help icom", test);
		click(driver, testcaseName, By.xpath("//img[@alt='help']"), "EMI help icom", test);
		try {
			waitforElemPresent(driver, testcaseName, 10, By.xpath("//div[text()='EMI Plans']"), "EMI help popup", test);
			Thread.sleep(1000);
			waitforElemPresent(driver, testcaseName, 10, By.xpath("//button[@id='help-text-close']"), "EMI help popup popup OK btn", test);
			click(driver, testcaseName, By.xpath("//button[@id='help-text-close']"), "EMI help popup popup OK btn", test);
			reportPass("EMI help pop up appeared", test);
		} catch(Exception e) {
			reportFail(testcaseName, "EMI help pop up did not appear", test);
		}
		Thread.sleep(1000);
		waitforElemPresent(driver, testcaseName, 10, By.xpath("//div[text()='3']/following-sibling::div"), "3 months EMI option", test);
		click(driver, testcaseName, By.xpath("//div[text()='3']/following-sibling::div"), "3 months EMI option", test);
		Thread.sleep(1000);
		waitforElemPresent(driver, testcaseName, 10, By.xpath("//button[@id='submitButton']"), "Confirm EMI btn", test);
		click(driver, testcaseName, By.xpath("//button[@id='submitButton']"), "Confirm EMI btn", test);
		Thread.sleep(1000);
		waitforElemPresent(driver, testcaseName, 10, By.xpath("//div[text()='Transaction Confirmation']"), "Confirmation text", test);
	}
	
	public void cancelTransaction (WebDriver driver, HashMap <String, String> param, ExtentTest test) throws InterruptedException {
		String testcaseName = param.get("TestCaseName");
		//driver.get(param.get("URL"));
		waitforElemPresent(driver, testcaseName, 10, By.xpath("//div[@id='cancelTransaction']"), "cancel transaction button", test);
		click(driver, testcaseName, By.xpath("//div[@id='cancelTransaction']"), "cancel transaction button", test);
		Thread.sleep(1000);
		try {
			waitforElemPresent(driver, testcaseName, 10, By.xpath("//div[text()='Cancel Transaction?']"), "cancel transaction pop up header", test);
			reportPass("Cancel transaction pop-up appeared", test);
		} catch(Exception e) {
			reportFail(testcaseName, "Cancel transaction pop-up didn't appear", test);
		}
		waitforElemPresent(driver, testcaseName, 10, By.xpath("//label[text()=' I want to know more about how cardless EMI works']"), "Cancel confirmation radio-option", test);
		click(driver, testcaseName, By.xpath("//label[text()=' I want to know more about how cardless EMI works']"), "Cancel confirmation radio-option", test);
		Thread.sleep(1000);
		waitforElemPresent(driver, testcaseName, 10, By.xpath("//div[@id='confirmCancelTransaction']"), "Cancel confirmation btn", test);
		click(driver, testcaseName, By.xpath("//div[@id='confirmCancelTransaction']"), "Cancel confirmation btn", test);
		//pop-up
		
		waitforElemPresent(driver, testcaseName, 10, By.xpath("//h3[text()=' STATUS : FAIL ']"), "Fail transaction status", test);
		
	}

}
