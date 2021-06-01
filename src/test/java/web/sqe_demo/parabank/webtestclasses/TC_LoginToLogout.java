package web.sqe_demo.parabank.webtestclasses;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import web.sqe_demo.parabank.webpageclasses.LoginScreen;
import web.sqe_demo.parabank.webpageclasses.Dashboardscreen;
import web.sqe_demo.parabank.webpageclasses.Navigate_sidemenu;
import com.utilities.BaseClass;
import com.utilities.ConfigFilesUtility;
import com.utilities.Utilities;
import org.json.JSONObject;

@SuppressWarnings("unused")
public class TC_LoginToLogout extends BaseClass {
	private Logger logger;
	private ConfigFilesUtility configFileObj;
	private String browserName = "chrome";
	public boolean isElementDispalyed = false;


	public TC_LoginToLogout() throws Exception {
		PropertyConfigurator.configure("log4j.properties");
		logger = Logger.getLogger(TC_LoginToLogout.class);
		configFileObj = new ConfigFilesUtility();
		configFileObj.loadPropertyFile("tc_logintologout.properties");
	}

	@BeforeTest
	@Parameters("browser")
	public void browserName(String browser) throws Exception {
		browserName = browser;
	}

	
	public void setUP() throws Exception {
		driver = launchBrowser(browserName, configFileObj);
	}

	public void LoginScreenTest(int i) throws Exception {

	 try{
		int datasetScreencount = 1;
		LoginScreen objLoginScreen = PageFactory.initElements(driver, LoginScreen.class);
		testLogHeader("Verify LoginScreen page");
		objLoginScreen.fillinputUsername_785188(configFileObj.getProperty("Username"+ i + datasetScreencount));
		printSuccessLogAndReport(logger,  "Entered Username : " + configFileObj.getProperty("Username"+ i + datasetScreencount));
		objLoginScreen.fillinputPassword_785192(configFileObj.getProperty("Password"+ i + datasetScreencount));
		printSuccessLogAndReport(logger,  "Entered Password : " + configFileObj.getProperty("Password"+ i + datasetScreencount));
		objLoginScreen.clkinputLogIn_784916();
		printInfoLogAndReport(logger, "Clicked on LogInButton");
		
	   } catch (Exception e) {
		  isElementDispalyed = false;
		  printFailureLogAndReport( logger,  "Element is not found" + e.getLocalizedMessage());
		}
	}
	

	public void DashboardscreenTest(int i) throws Exception {

	 try{
		int datasetScreencount = 2;
		Dashboardscreen objDashboardscreen = PageFactory.initElements(driver, Dashboardscreen.class);
		testLogHeader("Verify Dashboardscreen page");
		String text1 = objDashboardscreen.clka_784992();
		if(text1.contains(configFileObj.getProperty(""+ i + datasetScreencount))){
			printSuccessLogAndReport(text1,  logger,  "Clicked on : " + configFileObj.getProperty(""+ i + datasetScreencount));
			printSuccessLogAndReport(text1,  logger,  "Validated Link Text : " + configFileObj.getProperty(""+ i + datasetScreencount));
		} else {
			printFailureLogAndReport(text1,  logger,  "Link Text is not displayed  : " + configFileObj.getProperty(""+ i + datasetScreencount));
		}

	   } catch (Exception e) {
		  isElementDispalyed = false;
		  printFailureLogAndReport( logger,  "Element is not found" + e.getLocalizedMessage());
		}
	}
	

	public void Navigate_sidemenuTest(int i) throws Exception {

	 try{
		int datasetScreencount = 3;
		Navigate_sidemenu objNavigate_sidemenu = PageFactory.initElements(driver, Navigate_sidemenu.class);
		testLogHeader("Verify Navigate_sidemenu page");
		String text1 = objNavigate_sidemenu.clkaRequestLoan_785082();
		if(text1.contains(configFileObj.getProperty("RequestLoan"+ i + datasetScreencount))){
			printSuccessLogAndReport(text1,  logger,  "Clicked on : " + configFileObj.getProperty("RequestLoan"+ i + datasetScreencount));
			printSuccessLogAndReport(text1,  logger,  "Validated Link Text : " + configFileObj.getProperty("RequestLoan"+ i + datasetScreencount));
		} else {
			printFailureLogAndReport(text1,  logger,  "Link Text is not displayed  : " + configFileObj.getProperty("RequestLoan"+ i + datasetScreencount));
		}
		String text2 = objNavigate_sidemenu.clkaBillPay_785099();
		if(text2.contains(configFileObj.getProperty("BillPay"+ i + datasetScreencount))){
			printSuccessLogAndReport(text2,  logger,  "Clicked on : " + configFileObj.getProperty("BillPay"+ i + datasetScreencount));
			printSuccessLogAndReport(text2,  logger,  "Validated Link Text : " + configFileObj.getProperty("BillPay"+ i + datasetScreencount));
		} else {
			printFailureLogAndReport(text2,  logger,  "Link Text is not displayed  : " + configFileObj.getProperty("BillPay"+ i + datasetScreencount));
		}
		String text3 = objNavigate_sidemenu.clkaUpdateContactInfo_785076();
		if(text3.contains(configFileObj.getProperty("UpdateContactInfo"+ i + datasetScreencount))){
			printSuccessLogAndReport(text3,  logger,  "Clicked on : " + configFileObj.getProperty("UpdateContactInfo"+ i + datasetScreencount));
			printSuccessLogAndReport(text3,  logger,  "Validated Link Text : " + configFileObj.getProperty("UpdateContactInfo"+ i + datasetScreencount));
		} else {
			printFailureLogAndReport(text3,  logger,  "Link Text is not displayed  : " + configFileObj.getProperty("UpdateContactInfo"+ i + datasetScreencount));
		}
		String text4 = objNavigate_sidemenu.clkaOpenNewAccount_785086();
		if(text4.contains(configFileObj.getProperty("OpenNewAccount"+ i + datasetScreencount))){
			printSuccessLogAndReport(text4,  logger,  "Clicked on : " + configFileObj.getProperty("OpenNewAccount"+ i + datasetScreencount));
			printSuccessLogAndReport(text4,  logger,  "Validated Link Text : " + configFileObj.getProperty("OpenNewAccount"+ i + datasetScreencount));
		} else {
			printFailureLogAndReport(text4,  logger,  "Link Text is not displayed  : " + configFileObj.getProperty("OpenNewAccount"+ i + datasetScreencount));
		}
		String text5 = objNavigate_sidemenu.clkaFindTransactions_785097();
		if(text5.contains(configFileObj.getProperty("FindTransactions"+ i + datasetScreencount))){
			printSuccessLogAndReport(text5,  logger,  "Clicked on : " + configFileObj.getProperty("FindTransactions"+ i + datasetScreencount));
			printSuccessLogAndReport(text5,  logger,  "Validated Link Text : " + configFileObj.getProperty("FindTransactions"+ i + datasetScreencount));
		} else {
			printFailureLogAndReport(text5,  logger,  "Link Text is not displayed  : " + configFileObj.getProperty("FindTransactions"+ i + datasetScreencount));
		}
		String text6 = objNavigate_sidemenu.clkaAccountsOverview_785101();
		if(text6.contains(configFileObj.getProperty("AccountsOverview"+ i + datasetScreencount))){
			printSuccessLogAndReport(text6,  logger,  "Clicked on : " + configFileObj.getProperty("AccountsOverview"+ i + datasetScreencount));
			printSuccessLogAndReport(text6,  logger,  "Validated Link Text : " + configFileObj.getProperty("AccountsOverview"+ i + datasetScreencount));
		} else {
			printFailureLogAndReport(text6,  logger,  "Link Text is not displayed  : " + configFileObj.getProperty("AccountsOverview"+ i + datasetScreencount));
		}
		String text7 = objNavigate_sidemenu.clkaLogOut_785087();
		if(text7.contains(configFileObj.getProperty("LogOut"+ i + datasetScreencount))){
			printSuccessLogAndReport(text7,  logger,  "Clicked on : " + configFileObj.getProperty("LogOut"+ i + datasetScreencount));
			printSuccessLogAndReport(text7,  logger,  "Validated Link Text : " + configFileObj.getProperty("LogOut"+ i + datasetScreencount));
		} else {
			printFailureLogAndReport(text7,  logger,  "Link Text is not displayed  : " + configFileObj.getProperty("LogOut"+ i + datasetScreencount));
		}

	   } catch (Exception e) {
		  isElementDispalyed = false;
		  printFailureLogAndReport( logger,  "Element is not found" + e.getLocalizedMessage());
		}
	}
	
	@Test
	public void screensTest() throws Exception {
		for(int datasets = 1; datasets <= configFileObj.getIntProperty("datasetsLength"); datasets++) {
			isElementDispalyed = true;			
			setUP();			
			setTestcaseName(browserName,"TC_LoginToLogout - " + configFileObj.getProperty("dataset" + (datasets)));
			if(isElementDispalyed) {LoginScreenTest(datasets);}
			if(isElementDispalyed) {DashboardscreenTest(datasets);}
			if(isElementDispalyed) {Navigate_sidemenuTest(datasets);}
			tearDown();
		}	}

	
	public void tearDown() throws Exception {
		driver.quit();
	}
}