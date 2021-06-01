package web.sqe_demo.parabank.webpageclasses;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.utilities.BaseClass;

public class Navigate_sidemenu extends BaseClass {
	public static String projectName = "sqe_demo";
	public WebDriver driver;

	public Navigate_sidemenu(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//div[@id='leftPanel']/ul[1]/li[7]/a")	
	private WebElement	RequestLoan_785082a;
	public String clkaRequestLoan_785082() {
		waitForExpectedElement(driver, RequestLoan_785082a);		
		String text = RequestLoan_785082a.getText();
		RequestLoan_785082a.click();
		return text;
	}

	@FindBy(how = How.XPATH, using = "//div[@id='leftPanel']/ul[1]/li[4]/a")	
	private WebElement	BillPay_785099a;
	public String clkaBillPay_785099() {
		waitForExpectedElement(driver, BillPay_785099a);		
		String text = BillPay_785099a.getText();
		BillPay_785099a.click();
		return text;
	}

	@FindBy(how = How.XPATH, using = "//div[@id='leftPanel']/ul[1]/li[6]/a")	
	private WebElement	UpdateContactInfo_785076a;
	public String clkaUpdateContactInfo_785076() {
		waitForExpectedElement(driver, UpdateContactInfo_785076a);		
		String text = UpdateContactInfo_785076a.getText();
		UpdateContactInfo_785076a.click();
		return text;
	}

	@FindBy(how = How.XPATH, using = "//div[@id='leftPanel']/ul[1]/li[1]/a")	
	private WebElement	OpenNewAccount_785086a;
	public String clkaOpenNewAccount_785086() {
		waitForExpectedElement(driver, OpenNewAccount_785086a);		
		String text = OpenNewAccount_785086a.getText();
		OpenNewAccount_785086a.click();
		return text;
	}

	@FindBy(how = How.XPATH, using = "//div[@id='leftPanel']/ul[1]/li[5]/a")	
	private WebElement	FindTransactions_785097a;
	public String clkaFindTransactions_785097() {
		waitForExpectedElement(driver, FindTransactions_785097a);		
		String text = FindTransactions_785097a.getText();
		FindTransactions_785097a.click();
		return text;
	}

	@FindBy(how = How.XPATH, using = "//div[@id='leftPanel']/ul[1]/li[2]/a")	
	private WebElement	AccountsOverview_785101a;
	public String clkaAccountsOverview_785101() {
		waitForExpectedElement(driver, AccountsOverview_785101a);		
		String text = AccountsOverview_785101a.getText();
		AccountsOverview_785101a.click();
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