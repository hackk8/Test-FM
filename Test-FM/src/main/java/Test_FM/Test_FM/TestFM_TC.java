package Test_FM.Test_FM;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

import testsuitebase.SuiteBase;
import testsuitebase.TestResultStatus;
import utility.FetchExcelDataSet;
import utility.Read_XLS;
import utility.SuiteUtility;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.AfterSuite;

public class TestFM_TC extends SuiteBase {
	Read_XLS filePath = null;
	//String Environment;
	String TestCaseName = null;
	public boolean testSkip = false;
	String sheetName = "TestFMTC";
	public ExtentTest test;
	
	@BeforeClass(alwaysRun = true)
	public void setUp() throws Exception {
		init();
		filePath = TestFile;
		URLs = TestFile.getEnvURL("TestFMTC");
		/*
		 * for (String env : URLs.keySet()) { Environment = env; }
		 */
	}
	
	@Test(dataProvider = "TestFM", dataProviderClass = utility.XLSDataProvider.class, groups = "testfm", alwaysRun = true)
	public void TestFM_TC1(LinkedHashMap<String, String> data) throws Exception {
		TestCaseName = getData(data, "TestCaseName");
		test = extent.createTest(TestCaseName);
		CaseToRun = getData(data, "CaseToRun");
		
		HashMap<String, String> param = new HashMap<String, String>();
		param.put("TestCaseName", TestCaseName);
		param.put("URL", getData(data, "URL"));
		param.put("gatewayopt", getData(data, "GatewayOpt"));
		param.put("amount", getData(data, "Amount"));
		param.put("mobile", getData(data, "Mobile"));
		
		if (CaseToRun.equalsIgnoreCase("N")) {
			System.out.println("CaseToRun = N for " + TestCaseName + "So skipping Exceution.");
			testSkip = true;
			test.skip("CaseToRun = N for " + TestCaseName + "So skipping Exceution.");
			throw new SkipException("CaseToRun = N for " + TestCaseName + "So skipping Exceution.");
		} else {
			
			loadBrowser();
			testFM.verifyFieldTable(getDriver(), param, test);
			if (!(getDriver() == null)) {
				closeWebBrowser();
			}
		}
		
	}
	
	@Test(dataProvider = "TestFM", dataProviderClass = utility.XLSDataProvider.class, groups = "testfm", alwaysRun = true)
	public void TestFM_TC2(LinkedHashMap<String, String> data) throws Exception {
		TestCaseName = getData(data, "TestCaseName");
		test = extent.createTest(TestCaseName);
		CaseToRun = getData(data, "CaseToRun");
		
		HashMap<String, String> param = new HashMap<String, String>();
		param.put("TestCaseName", TestCaseName);
		param.put("URL", getData(data, "URL"));
		param.put("gatewayopt", getData(data, "GatewayOpt"));
		param.put("amount", getData(data, "Amount"));
		param.put("mobile", getData(data, "Mobile"));
		
		if (CaseToRun.equalsIgnoreCase("N")) {
			System.out.println("CaseToRun = N for " + TestCaseName + "So skipping Exceution.");
			testSkip = true;
			test.skip("CaseToRun = N for " + TestCaseName + "So skipping Exceution.");
			throw new SkipException("CaseToRun = N for " + TestCaseName + "So skipping Exceution.");
		} else {
			
			loadBrowser();
			testFM.verifyFieldTable(getDriver(), param, test);
			testFM.verifyFieldDescription(getDriver(), param, test);
			if (!(getDriver() == null)) {
				closeWebBrowser();
			}
		}
		
	}
	
	@Test(dataProvider = "TestFM", dataProviderClass = utility.XLSDataProvider.class, groups = "testfm", alwaysRun = true)
	public void TestFM_TC3(LinkedHashMap<String, String> data) throws Exception {
		TestCaseName = getData(data, "TestCaseName");
		test = extent.createTest(TestCaseName);
		CaseToRun = getData(data, "CaseToRun");
		
		HashMap<String, String> param = new HashMap<String, String>();
		param.put("TestCaseName", TestCaseName);
		param.put("URL", getData(data, "URL"));
		param.put("gatewayopt", getData(data, "GatewayOpt"));
		param.put("amount", getData(data, "Amount"));
		param.put("mobile", getData(data, "Mobile"));
		
		if (CaseToRun.equalsIgnoreCase("N")) {
			System.out.println("CaseToRun = N for " + TestCaseName + "So skipping Exceution.");
			testSkip = true;
			test.skip("CaseToRun = N for " + TestCaseName + "So skipping Exceution.");
			throw new SkipException("CaseToRun = N for " + TestCaseName + "So skipping Exceution.");
		} else {
			
			loadBrowser();
			testFM.verifyFieldTable(getDriver(), param, test);
			testFM.verifyGatewayField(getDriver(), param, test);
			if (!(getDriver() == null)) {
				closeWebBrowser();
			}
		}
		
	}
	
	@Test(dataProvider = "TestFM", dataProviderClass = utility.XLSDataProvider.class, groups = "testfm", alwaysRun = true)
	public void TestFM_TC4(LinkedHashMap<String, String> data) throws Exception {
		TestCaseName = getData(data, "TestCaseName");
		test = extent.createTest(TestCaseName);
		CaseToRun = getData(data, "CaseToRun");
		
		HashMap<String, String> param = new HashMap<String, String>();
		param.put("TestCaseName", TestCaseName);
		param.put("URL", getData(data, "URL"));
		param.put("gatewayopt", getData(data, "GatewayOpt"));
		param.put("amount", getData(data, "Amount"));
		param.put("mobile", getData(data, "Mobile"));
		
		if (CaseToRun.equalsIgnoreCase("N")) {
			System.out.println("CaseToRun = N for " + TestCaseName + "So skipping Exceution.");
			testSkip = true;
			test.skip("CaseToRun = N for " + TestCaseName + "So skipping Exceution.");
			throw new SkipException("CaseToRun = N for " + TestCaseName + "So skipping Exceution.");
		} else {
			
			loadBrowser();
			testFM.verifyFieldTable(getDriver(), param, test);
			testFM.verifyAmountField(getDriver(), param, test);
			if (!(getDriver() == null)) {
				closeWebBrowser();
			}
		}
		
	}
	
	@Test(dataProvider = "TestFM", dataProviderClass = utility.XLSDataProvider.class, groups = "testfm", alwaysRun = true)
	public void TestFM_TC5(LinkedHashMap<String, String> data) throws Exception {
		TestCaseName = getData(data, "TestCaseName");
		test = extent.createTest(TestCaseName);
		CaseToRun = getData(data, "CaseToRun");
		
		HashMap<String, String> param = new HashMap<String, String>();
		param.put("TestCaseName", TestCaseName);
		param.put("URL", getData(data, "URL"));
		param.put("gatewayopt", getData(data, "GatewayOpt"));
		param.put("amount", getData(data, "Amount"));
		param.put("mobile", getData(data, "Mobile"));
		
		if (CaseToRun.equalsIgnoreCase("N")) {
			System.out.println("CaseToRun = N for " + TestCaseName + "So skipping Exceution.");
			testSkip = true;
			test.skip("CaseToRun = N for " + TestCaseName + "So skipping Exceution.");
			throw new SkipException("CaseToRun = N for " + TestCaseName + "So skipping Exceution.");
		} else {
			
			loadBrowser();
			testFM.verifyFieldTable(getDriver(), param, test);
			testFM.verifyLenderField(getDriver(), param, test);
			if (!(getDriver() == null)) {
				closeWebBrowser();
			}
		}
		
	}
	
	@Test(dataProvider = "TestFM", dataProviderClass = utility.XLSDataProvider.class, groups = "testfm", alwaysRun = true)
	public void TestFM_TC6(LinkedHashMap<String, String> data) throws Exception {
		TestCaseName = getData(data, "TestCaseName");
		test = extent.createTest(TestCaseName);
		CaseToRun = getData(data, "CaseToRun");
		
		HashMap<String, String> param = new HashMap<String, String>();
		param.put("TestCaseName", TestCaseName);
		param.put("URL", getData(data, "URL"));
		param.put("gatewayopt", getData(data, "GatewayOpt"));
		param.put("amount", getData(data, "Amount"));
		param.put("mobile", getData(data, "Mobile"));
		
		if (CaseToRun.equalsIgnoreCase("N")) {
			System.out.println("CaseToRun = N for " + TestCaseName + "So skipping Exceution.");
			testSkip = true;
			test.skip("CaseToRun = N for " + TestCaseName + "So skipping Exceution.");
			throw new SkipException("CaseToRun = N for " + TestCaseName + "So skipping Exceution.");
		} else {
			
			loadBrowser();
			testFM.verifyFieldTable(getDriver(), param, test);
			testFM.selectGateway(getDriver(), param, test);
			if (!(getDriver() == null)) {
				closeWebBrowser();
			}
		}
		
	}
	
	@Test(dataProvider = "TestFM", dataProviderClass = utility.XLSDataProvider.class, groups = "testfm", alwaysRun = true)
	public void TestFM_TC7(LinkedHashMap<String, String> data) throws Exception {
		TestCaseName = getData(data, "TestCaseName");
		test = extent.createTest(TestCaseName);
		CaseToRun = getData(data, "CaseToRun");
		
		HashMap<String, String> param = new HashMap<String, String>();
		param.put("TestCaseName", TestCaseName);
		param.put("URL", getData(data, "URL"));
		param.put("gatewayopt", getData(data, "GatewayOpt"));
		param.put("amount", getData(data, "Amount"));
		param.put("mobile", getData(data, "Mobile"));
		
		if (CaseToRun.equalsIgnoreCase("N")) {
			System.out.println("CaseToRun = N for " + TestCaseName + "So skipping Exceution.");
			testSkip = true;
			test.skip("CaseToRun = N for " + TestCaseName + "So skipping Exceution.");
			throw new SkipException("CaseToRun = N for " + TestCaseName + "So skipping Exceution.");
		} else {
			
			loadBrowser();
			testFM.verifyFieldTable(getDriver(), param, test);
			testFM.enterAmount(getDriver(), param, test);
			if (!(getDriver() == null)) {
				closeWebBrowser();
			}
		}
		
	}
	
	@Test(dataProvider = "TestFM", dataProviderClass = utility.XLSDataProvider.class, groups = "testfm", alwaysRun = true)
	public void TestFM_TC8(LinkedHashMap<String, String> data) throws Exception {
		TestCaseName = getData(data, "TestCaseName");
		test = extent.createTest(TestCaseName);
		CaseToRun = getData(data, "CaseToRun");
		
		HashMap<String, String> param = new HashMap<String, String>();
		param.put("TestCaseName", TestCaseName);
		param.put("URL", getData(data, "URL"));
		param.put("gatewayopt", getData(data, "GatewayOpt"));
		param.put("amount", getData(data, "Amount"));
		param.put("mobile", getData(data, "Mobile"));
		
		if (CaseToRun.equalsIgnoreCase("N")) {
			System.out.println("CaseToRun = N for " + TestCaseName + "So skipping Exceution.");
			testSkip = true;
			test.skip("CaseToRun = N for " + TestCaseName + "So skipping Exceution.");
			throw new SkipException("CaseToRun = N for " + TestCaseName + "So skipping Exceution.");
		} else {
			
			loadBrowser();
			testFM.verifyFieldTable(getDriver(), param, test);
			testFM.enterMobile(getDriver(), param, test);
			if (!(getDriver() == null)) {
				closeWebBrowser();
			}
		}
		
	}
	
	@Test(dataProvider = "TestFM", dataProviderClass = utility.XLSDataProvider.class, groups = "testfm", alwaysRun = true)
	public void TestFM_TC9(LinkedHashMap<String, String> data) throws Exception {
		TestCaseName = getData(data, "TestCaseName");
		test = extent.createTest(TestCaseName);
		CaseToRun = getData(data, "CaseToRun");
		
		HashMap<String, String> param = new HashMap<String, String>();
		param.put("TestCaseName", TestCaseName);
		param.put("URL", getData(data, "URL"));
		param.put("gatewayopt", getData(data, "GatewayOpt"));
		param.put("amount", getData(data, "Amount"));
		param.put("mobile", getData(data, "Mobile"));
		
		if (CaseToRun.equalsIgnoreCase("N")) {
			System.out.println("CaseToRun = N for " + TestCaseName + "So skipping Exceution.");
			testSkip = true;
			test.skip("CaseToRun = N for " + TestCaseName + "So skipping Exceution.");
			throw new SkipException("CaseToRun = N for " + TestCaseName + "So skipping Exceution.");
		} else {
			
			loadBrowser();
			testFM.verifyFieldTable(getDriver(), param, test);
			testFM.selectGateway(getDriver(), param, test);
			testFM.enterAmount(getDriver(), param, test);
			testFM.enterMobile(getDriver(), param, test);
			testFM.clickContinue(getDriver(), param, test);
			if (!(getDriver() == null)) {
				closeWebBrowser();
			}
			
		}
		
	}
	
	@Test(dataProvider = "TestFM", dataProviderClass = utility.XLSDataProvider.class, groups = "testfm", alwaysRun = true)
	public void TestFM_TC10(LinkedHashMap<String, String> data) throws Exception {
		TestCaseName = getData(data, "TestCaseName");
		test = extent.createTest(TestCaseName);
		CaseToRun = getData(data, "CaseToRun");
		
		HashMap<String, String> param = new HashMap<String, String>();
		param.put("TestCaseName", TestCaseName);
		param.put("URL", getData(data, "URL"));
		param.put("gatewayopt", getData(data, "GatewayOpt"));
		param.put("amount", getData(data, "Amount"));
		param.put("mobile", getData(data, "Mobile"));
		
		if (CaseToRun.equalsIgnoreCase("N")) {
			System.out.println("CaseToRun = N for " + TestCaseName + "So skipping Exceution.");
			testSkip = true;
			test.skip("CaseToRun = N for " + TestCaseName + "So skipping Exceution.");
			throw new SkipException("CaseToRun = N for " + TestCaseName + "So skipping Exceution.");
		} else {
			
			loadBrowser();
			testFM.verifyFieldTable(getDriver(), param, test);
			testFM.selectGateway(getDriver(), param, test);
			testFM.enterAmount(getDriver(), param, test);
			testFM.enterMobile(getDriver(), param, test);
			testFM.clickContinue(getDriver(), param, test);
			testFM.verifyAmountPg2(getDriver(), param, test);
			testFM.verifyMobilePg2(getDriver(), param, test);
			testFM.selectEMIoption(getDriver(), param, test);
			if (!(getDriver() == null)) {
				closeWebBrowser();
			}
			
		}
		
	}
	
	@Test(dataProvider = "TestFM", dataProviderClass = utility.XLSDataProvider.class, groups = "testfm", alwaysRun = true)
	public void TestFM_TC11(LinkedHashMap<String, String> data) throws Exception {
		TestCaseName = getData(data, "TestCaseName");
		test = extent.createTest(TestCaseName);
		CaseToRun = getData(data, "CaseToRun");
		
		HashMap<String, String> param = new HashMap<String, String>();
		param.put("TestCaseName", TestCaseName);
		param.put("URL", getData(data, "URL"));
		param.put("gatewayopt", getData(data, "GatewayOpt"));
		param.put("amount", getData(data, "Amount"));
		param.put("mobile", getData(data, "Mobile"));
		
		if (CaseToRun.equalsIgnoreCase("N")) {
			System.out.println("CaseToRun = N for " + TestCaseName + "So skipping Exceution.");
			testSkip = true;
			test.skip("CaseToRun = N for " + TestCaseName + "So skipping Exceution.");
			throw new SkipException("CaseToRun = N for " + TestCaseName + "So skipping Exceution.");
		} else {
			
			loadBrowser();
			testFM.verifyFieldTable(getDriver(), param, test);
			testFM.selectGateway(getDriver(), param, test);
			testFM.enterAmount(getDriver(), param, test);
			testFM.enterMobile(getDriver(), param, test);
			testFM.clickContinue(getDriver(), param, test);
			testFM.cancelTransaction(getDriver(), param, test);
			if (!(getDriver() == null)) {
				closeWebBrowser();
			}
			
		}
		
	}


	@AfterMethod(alwaysRun = true)
	public void reporterDataResults(ITestResult Result) throws IOException {
		if (Result.getStatus() == ITestResult.SKIP) {
			Reporter.log(Result.getName() + " is SKIPPED.");
			Add_Log.info(Result.getName() + " is SKIPPED.");
			TestResultTL.put(Result.getName(), "SKIP");
			test.skip(Result.getName() + " is SKIPPED.");
		} else if (Result.getStatus() == ITestResult.FAILURE) {
			String path = captureScreenShot(Result, "FAIL", getDriver());
			
			Reporter.log(Result.getName() + " is FAILED.");
			Add_Log.info(Result.getName() + " is FAILED.");
			TestResultTL.put(Result.getName(), "FAIL");
			test.fail(Result.getName() + " is FAILED.", (MediaEntityBuilder.createScreenCaptureFromPath(takescreenshots(getDriver())).build()));
//			String path = captureScreenShot(Result, "FAIL", getDriver());
			if (!(getDriver() == null)) {
				closeWebBrowser();
			}
		} else if (Result.getStatus() == ITestResult.SUCCESS) {
//			String path = captureScreenShot(Result, "PASS", getDriver());
			
			Reporter.log(Result.getName() + " is PASSED.");
			Add_Log.info(Result.getName() + " is PASSED.");
			TestResultTL.put(Result.getName(), "PASS");
			test.pass(Result.getName() + " is PASSED.");
			if (!(getDriver() == null)) {
				closeWebBrowser();
			}
		}
		testSkip = false;
	}

	@AfterSuite(alwaysRun = true)
	public void afterSuite() {
		
			SuiteUtility.WriteResultUtility(filePath, sheetName, "Pass/Fail/Skip", TestResultTL);
			SuiteUtility.WriteResultUtility1(filePath, sheetName, "Failure Reason", TestResultStatus.failureReason);
			extent.flush();
			fetchExcelData.reportLog("Test_FM", "Report", "xlsx");
		
	}

}
