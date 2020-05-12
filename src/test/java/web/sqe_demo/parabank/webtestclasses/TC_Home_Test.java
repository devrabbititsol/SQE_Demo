package web.sqe_demo.parabank.webtestclasses;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
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
	private Logger logger;
	private ConfigFilesUtility configFileObj;
	private String browserName = "chrome";
	public boolean isElementDispalyed = false;


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
	}

	
	public void setUP() throws Exception {
		driver = launchBrowser(browserName, configFileObj);
	}

	public void Home_ScreenTest(int i) throws Exception {

	 try{
		int datasetScreencount = 1;
		Home_Screen objHome_Screen = PageFactory.initElements(driver, Home_Screen.class);
		testLogHeader("Verify Home_Screen page");
		objHome_Screen.clkAContactUs_371660();
		printSuccessLogAndReport( logger,  "Text is displayed as : ContactUsLink");
		String text2 = objHome_Screen.clkAAboutUs_371666();
		if(skipifElementisNotDisplayed()) {
		if(text2.contains(configFileObj.getProperty("AboutUs"+ i + datasetScreencount))){
			printSuccessLogAndReport(text2,  logger,  "Validated Link Text : " + configFileObj.getProperty("AboutUs"+ i + datasetScreencount));
		} else {
			printFailureLogAndReport(text2,  logger,  "Link Text is not displayed  : " + configFileObj.getProperty("AboutUs"+ i + datasetScreencount));
		}

		}		objHome_Screen.clkAAdminPage_371663();
		printSuccessLogAndReport( logger,  "Text is displayed as : AdminPageLink");

	   } catch (Exception e) {
		  isElementDispalyed = false;
		  printFailureLogAndReport( logger,  "Element is not found" + e.getLocalizedMessage());
		}
	}
	

	public void Screen_TestTest(int i) throws Exception {

	 try{
		int datasetScreencount = 2;
		Screen_Test objScreen_Test = PageFactory.initElements(driver, Screen_Test.class);
		testLogHeader("Verify Screen_Test page");
		objScreen_Test.clkAAboutUs_371534();
		printSuccessLogAndReport( logger,  "Text is displayed as : AboutUsLink");
		String text2 = objScreen_Test.clkAAdminPage_371531();
		if(text2.contains(configFileObj.getProperty("AdminPage"+ i + datasetScreencount))){
			printSuccessLogAndReport(text2,  logger,  "Validated Link Text : " + configFileObj.getProperty("AdminPage"+ i + datasetScreencount));
		} else {
			printFailureLogAndReport(text2,  logger,  "Link Text is not displayed  : " + configFileObj.getProperty("AdminPage"+ i + datasetScreencount));
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
			setTestcaseName(browserName,"TC_Home_Test - " + configFileObj.getProperty("dataset" + (datasets)));
			Home_ScreenTest(datasets);
			Screen_TestTest(datasets);
			tearDown();
		}	}

	
	public void tearDown() throws Exception {
		driver.quit();
	}
}