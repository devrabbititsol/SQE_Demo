package web.sqe_demo.parabank.webtestclasses;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import web.sqe_demo.parabank.webpageclasses.LoginScreen;
import web.sqe_demo.parabank.webpageclasses.Dashboardscreen;
import web.sqe_demo.parabank.webpageclasses.Transfer_funds_screen;
import web.sqe_demo.parabank.webpageclasses.Transfer_results_and_logout;
import com.utilities.BaseClass;
import com.utilities.ConfigFilesUtility;
import com.utilities.Utilities;
import org.json.JSONObject;

@SuppressWarnings("unused")
public class TC_TransferFunds extends BaseClass {
	private Logger logger;
	private ConfigFilesUtility configFileObj;
	private String browserName = "chrome";
	public boolean isElementDispalyed = false;


	public TC_TransferFunds() throws Exception {
		PropertyConfigurator.configure("log4j.properties");
		logger = Logger.getLogger(TC_TransferFunds.class);
		configFileObj = new ConfigFilesUtility();
		configFileObj.loadPropertyFile("tc_transferfunds.properties");
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
		objDashboardscreen.clka_784992();
		printSuccessLogAndReport( logger,  "Text is displayed as : Link");

	   } catch (Exception e) {
		  isElementDispalyed = false;
		  printFailureLogAndReport( logger,  "Element is not found" + e.getLocalizedMessage());
		}
	}
	

	public void Transfer_funds_screenTest(int i) throws Exception {

	 try{
		int datasetScreencount = 3;
		Transfer_funds_screen objTransfer_funds_screen = PageFactory.initElements(driver, Transfer_funds_screen.class);
		testLogHeader("Verify Transfer_funds_screen page");
		objTransfer_funds_screen.clkaTransferFunds_785020();
		printSuccessLogAndReport( logger,  "Text is displayed as : TransferFundsLink");
		objTransfer_funds_screen.fillinputAmount_785045(configFileObj.getProperty("Amount"+ i + datasetScreencount));
		printSuccessLogAndReport(logger,  "Entered Amount : " + configFileObj.getProperty("Amount"+ i + datasetScreencount));
		objTransfer_funds_screen.clkinputTransfer_785021();
		printInfoLogAndReport(logger, "Clicked on TransferButton");
		
	   } catch (Exception e) {
		  isElementDispalyed = false;
		  printFailureLogAndReport( logger,  "Element is not found" + e.getLocalizedMessage());
		}
	}
	

	public void Transfer_results_and_logoutTest(int i) throws Exception {

	 try{
		int datasetScreencount = 4;
		Transfer_results_and_logout objTransfer_results_and_logout = PageFactory.initElements(driver, Transfer_results_and_logout.class);
		testLogHeader("Verify Transfer_results_and_logout page");
		objTransfer_results_and_logout.textspan_785104();
		printInfoLogAndReport( logger, "Label text value is:  ");
		objTransfer_results_and_logout.textspan_785105();
		printInfoLogAndReport( logger, "Label text value is:  ");
		objTransfer_results_and_logout.clkaLogOut_785087();
		printSuccessLogAndReport( logger,  "Text is displayed as : LogOutLink");

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
			setTestcaseName(browserName,"TC_TransferFunds - " + configFileObj.getProperty("dataset" + (datasets)));
			if(isElementDispalyed) {LoginScreenTest(datasets);}
			if(isElementDispalyed) {DashboardscreenTest(datasets);}
			if(isElementDispalyed) {Transfer_funds_screenTest(datasets);}
			if(isElementDispalyed) {Transfer_results_and_logoutTest(datasets);}
			tearDown();
		}	}

	
	public void tearDown() throws Exception {
		driver.quit();
	}
}