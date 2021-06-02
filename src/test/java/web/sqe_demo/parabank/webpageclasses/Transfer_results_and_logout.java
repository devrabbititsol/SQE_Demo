package web.sqe_demo.parabank.webpageclasses;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.utilities.BaseClass;

public class Transfer_results_and_logout extends BaseClass {
	public static String projectName = "sqe_demo";
	public WebDriver driver;

	public Transfer_results_and_logout(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//span[@id='fromAccountId']")	
	private WebElement	_785104span;
	public String textspan_785104() {
		waitForExpectedElement(driver, _785104span);		
		String text = _785104span.getText();
		_785104span.click();
		return text;
	}

	@FindBy(how = How.XPATH, using = "//span[@id='toAccountId']")	
	private WebElement	_785105span;
	public String textspan_785105() {
		waitForExpectedElement(driver, _785105span);		
		String text = _785105span.getText();
		_785105span.click();
		return text;
	}

	@FindBy(how = How.XPATH, using = "//div[@id='leftPanel']/ul[1]/li[8]/a")	
	private WebElement	LogOut_785087a;
	public String clkaLogOut_785087() {
		waitForExpectedElement(driver, LogOut_785087a);		
		String text = LogOut_785087a.getText();
		LogOut_785087a.click();
		return text;
	}

}