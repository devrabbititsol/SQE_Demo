package web.sqe_demo.parabank.webpageclasses;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.utilities.BaseClass;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

@SuppressWarnings("unused")
public class Home_Screen extends BaseClass {
	
	public static String primaryInfo  = "{\"user_id\":7,\"executed_user_id\":7,\"is_generate\":false,\"is_execute\":false,\"is_web\":true,\"project_url\":\"https://parabank.parasoft.com/parabank/index.htm\",\"report_upload_url\":\"https://smartqe.io:443/UploadReportFile\",\"project_name\":\"SQE_Demo\",\"project_description\":\"desc\",\"project_id\":343,\"module_name\":\"parabank\",\"module_description\":\"desc\",\"sub_module_id\":0,\"module_id\":621,\"testcase_name\":\"TC_Home_Test\",\"testcase_id\":544,\"testset_id\":0,\"executed_timestamp\":-895015702,\"browser_type\":\"chrome\",\"testcase_overwrite\":false,\"client_timezone_id\":\"Asia/Calcutta\"}";

	public static String projectName = "sqe_demo";
	public WebDriver driver;
	public ExtentReports reports;
	public ExtentTest test;
	public static final int datasetsLength = 1;

	public Home_Screen(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//DIV[@id='footerPanel']/UL[1]/LI[8]/A[1]")	
	private WebElement	ContactUs_371660A;
	public String clkAContactUs_371660() {
		waitForExpectedElement(driver, ContactUs_371660A);		
		String text = ContactUs_371660A.getText();
		ContactUs_371660A.click();
		return text;
	}

	@FindBy(how = How.XPATH, using = "//DIV[@id='footerPanel']/UL[1]/LI[2]/A[1]")	
	private WebElement	AboutUs_371666A;
	public String clkAAboutUs_371666() {
		if(isElementPresent(AboutUs_371666A)) { 
		waitForExpectedElement(driver, AboutUs_371666A);		
		String text = AboutUs_371666A.getText();
		return text;
		}
		return text;
	}

	@FindBy(how = How.XPATH, using = "//DIV[@id='headerPanel']/UL[1]/LI[6]/A[1]")	
	private WebElement	AdminPage_371663A;
	public String clkAAdminPage_371663() {
		waitForExpectedElement(driver, AdminPage_371663A);		
		String text = AdminPage_371663A.getText();
		AdminPage_371663A.click();
		return text;
	}

}