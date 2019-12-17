package web.sqe_demo.parabank.webtestclasses;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.configurations.Constants;
import com.configurations.ExtentConfigurations;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import web.sqe_demo.parabank.webpageclasses.Home_Screen;
import web.sqe_demo.parabank.webpageclasses.Screen_Test;
import com.utilities.BaseClass;
import com.utilities.ConfigFilesUtility;
import com.utilities.Utilities;
import org.json.JSONObject;

@SuppressWarnings("unused")
public class TC_Home_Test extends BaseClass {
	ExtentReports reports;
	ExtentTest test;
	ITestResult result;
	private Logger logger;
	private ConfigFilesUtility configFileObj;
	private String browserName = "chrome";
	public boolean isElementDispalyed = false;
	public static final int datasetsLength = 1;
	String[] datasetNames = new String[] {"ds2"};

	public TC_Home_Test() throws Exception {
		PropertyConfigurator.configure("log4j.properties");
		logger = Logger.getLogger(TC_Home_Test.class);
		configFileObj = new ConfigFilesUtility();
		configFileObj.loadPropertyFile("tc_home_test.properties");
	}

	@BeforeTest
	@Parameters("browser")
	public void browserName(String browser) throws Exception {
		browserName = browser;
		reports = ExtentConfigurations.getExtentInstance(reportsPath, projectPath, Home_Screen.projectName);
		test = reports.startTest(setTestcaseName(browserName,"TC_Home_Test - " + datasetNames[0]));
	}

	
	public void setUP() throws Exception {
		String primaryInfo = Home_Screen.primaryInfo;
		Constants.PRIMARY_INFO = primaryInfo;
		driver = launchBrowser(browserName, configFileObj);
	}

	public void Home_ScreenTest(int i) throws Exception {

	 try{
		int datasetScreencount = 1;
		Home_Screen objHome_Screen = PageFactory.initElements(driver, Home_Screen.class);
		testLogHeader(test, "Verify Home_Screen page");
		objHome_Screen.clkAContactUs_371660();
		printSuccessLogAndReport(test, logger,  "Text is displayed as : ContactUsLink");
		String text2 = objHome_Screen.clkAAboutUs_371666();
		if(skipifElementisNotDisplayed()) {
		if(text2.equalsIgnoreCase(configFileObj.getProperty("AboutUs"+ i + datasetScreencount))){
			printSuccessLogAndReport(text2, test, logger,  "Validated Link Text : " + configFileObj.getProperty("AboutUs"+ i + datasetScreencount));
		} else {
			printFailureLogAndReport(text2, test, logger,  "Link Text is not displayed  : " + configFileObj.getProperty("AboutUs"+ i + datasetScreencount));
		}

		}		objHome_Screen.clkAAdminPage_371663();
		printSuccessLogAndReport(test, logger,  "Text is displayed as : AdminPageLink");

	   } catch (Exception e) {
		  isElementDispalyed = false;
		  printFailureLogAndReport(test, logger,  "Element is not found" + e.getLocalizedMessage());
		}
	}
	

	public void Screen_TestTest(int i) throws Exception {

	 try{
		int datasetScreencount = 2;
		Screen_Test objScreen_Test = PageFactory.initElements(driver, Screen_Test.class);
		testLogHeader(test, "Verify Screen_Test page");
		objScreen_Test.clkAAboutUs_371534();
		printSuccessLogAndReport(test, logger,  "Text is displayed as : AboutUsLink");
		String text2 = objScreen_Test.clkAAdminPage_371531();
		if(text2.equalsIgnoreCase(configFileObj.getProperty("AdminPage"+ i + datasetScreencount))){
			printSuccessLogAndReport(text2, test, logger,  "Validated Link Text : " + configFileObj.getProperty("AdminPage"+ i + datasetScreencount));
		} else {
			printFailureLogAndReport(text2, test, logger,  "Link Text is not displayed  : " + configFileObj.getProperty("AdminPage"+ i + datasetScreencount));
		}

	   } catch (Exception e) {
		  isElementDispalyed = false;
		  printFailureLogAndReport(test, logger,  "Element is not found" + e.getLocalizedMessage());
		}
	}
	
	@Test
	public void screensTest() throws Exception {
		for(int datasets = 1; datasets <= Screen_Test.datasetsLength; datasets++) {
			isElementDispalyed = true;			
			setUP();			
			if(datasets > 1) { test = reports.startTest(setTestcaseName(browserName,"TC_Home_Test - " + datasetNames[datasets-1]));}
			if(isElementDispalyed) { Home_ScreenTest(datasets);}
			if(isElementDispalyed) { Screen_TestTest(datasets);}
			tearDown();
		}	}

	
	public void tearDown() throws Exception {
		reports.endTest(test);
		reports.flush();
		driver.quit();
	}
}