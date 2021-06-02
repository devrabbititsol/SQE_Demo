package web.sqe_demo.parabank.webpageclasses;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.utilities.BaseClass;

public class Transfer_funds_screen extends BaseClass {
	public static String projectName = "sqe_demo";
	public WebDriver driver;

	public Transfer_funds_screen(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//div[@id='leftPanel']/ul[1]/li[3]/a")	
	private WebElement	TransferFunds_785020a;
	public String clkaTransferFunds_785020() {
		waitForExpectedElement(driver, TransferFunds_785020a);		
		String text = TransferFunds_785020a.getText();
		TransferFunds_785020a.click();
		return text;
	}

	@FindBy(how = How.XPATH, using = "//input[@id='amount']")	
	private WebElement	Amount_785045input;
	public String fillinputAmount_785045(String varInputValue) {
		waitForExpectedElement(driver, Amount_785045input);
		Amount_785045input.sendKeys(varInputValue);
		return text;
	}

	@FindBy(how = How.XPATH, using = "//div[@id='rightPanel']/div[1]/div[1]/form[1]/div[2]/input")	
	private WebElement	Transfer_785021input;
	public String clkinputTransfer_785021() {
		waitForExpectedElement(driver, Transfer_785021input);		
		String text = Transfer_785021input.getText();
		Transfer_785021input.click();
		return text;
	}

}