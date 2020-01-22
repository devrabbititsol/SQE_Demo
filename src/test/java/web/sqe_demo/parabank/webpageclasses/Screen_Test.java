package web.sqe_demo.parabank.webpageclasses;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.utilities.BaseClass;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

@SuppressWarnings("unused")
public class Screen_Test extends BaseClass {
	
	public static String primaryInfo  = "{\"user_id\":7,\"executed_user_id\":7,\"is_generate\":false,\"is_execute\":false,\"is_web\":true,\"project_url\":\"https://parabank.parasoft.com/parabank/index.htm\",\"report_upload_url\":\"https://smartqe.io:443/UploadReportFile\",\"project_name\":\"SQE_Demo\",\"project_description\":\"desc\",\"project_id\":343,\"module_name\":\"parabank\",\"module_description\":\"desc\",\"sub_module_id\":0,\"module_id\":621,\"testcase_name\":\"TC_Home_Test\",\"testcase_id\":544,\"testset_id\":0,\"executed_timestamp\":-879125502,\"browser_type\":\"chrome\",\"testcase_overwrite\":false,\"client_timezone_id\":\"Asia/Calcutta\"}";

	public static String projectName = "sqe_demo";
	public WebDriver driver;
	public ExtentReports reports;
	public ExtentTest test;
	public static final int datasetsLength = 1;

	public Screen_Test(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//DIV[@id='headerPanel']/UL[1]/LI[2]/A[1]")	
	private WebElement	AboutUs_371534A;
	public String clkAAboutUs_371534() {
		waitForExpectedElement(driver, AboutUs_371534A);		
		String text = AboutUs_371534A.getText();
		AboutUs_371534A.click();
		return text;
	}

	@FindBy(how = How.XPATH, using = "//DIV[@id='headerPanel']/UL[1]/LI[6]/A[1]")	
	private WebElement	AdminPage_371531A;
	public String clkAAdminPage_371531() {
		waitForExpectedElement(driver, AdminPage_371531A);		
		String text = AdminPage_371531A.getText();
		return text;
	}

}