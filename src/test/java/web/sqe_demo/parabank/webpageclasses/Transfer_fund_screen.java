package web.sqe_demo.parabank.webpageclasses;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.utilities.BaseClass;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

@SuppressWarnings("unused")
public class Transfer_fund_screen extends BaseClass {
	
	public static String primaryInfo  = "{\"user_id\":7,\"executed_user_id\":7,\"is_generate\":false,\"is_execute\":false,\"is_web\":true,\"project_url\":\"https://parabank.parasoft.com/parabank/index.htm\",\"report_upload_url\":\"https://smartqe.io:443/UploadReportFile\",\"project_name\":\"SQE_Demo\",\"project_description\":\"desc\",\"project_id\":343,\"module_name\":\"parabank\",\"module_description\":\"desc\",\"sub_module_id\":0,\"module_id\":621,\"testcase_name\":\"TC_Parabank\",\"testcase_id\":543,\"testset_id\":0,\"executed_timestamp\":-2098418875,\"browser_type\":\"chrome\",\"testcase_overwrite\":true,\"client_timezone_id\":\"Asia/Calcutta\"}";

	public static String projectName = "sqe_demo";
	public WebDriver driver;
	public ExtentReports reports;
	public ExtentTest test;
	public static final int datasetsLength = 1;

	public Transfer_fund_screen(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//input[@id='amount']")	
	private WebElement	Input_364904input;
	public String fillinputInput_364904(String varInputValue) {
		waitForExpectedElement(driver, Input_364904input);
		Input_364904input.sendKeys(varInputValue);
		return text;
	}

	@FindBy(how = How.XPATH, using = "//div[@id='rightPanel']/div[1]/div[1]/form[1]/div[2]/input[1]")	
	private WebElement	Transfer_364913input;
	public String clkinputTransfer_364913() {
		waitForExpectedElement(driver, Transfer_364913input);		
		String text = Transfer_364913input.getText();
		Transfer_364913input.click();
		return text;
	}

}