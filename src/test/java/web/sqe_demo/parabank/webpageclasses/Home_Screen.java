package web.sqe_demo.parabank.webpageclasses;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.utilities.BaseClass;

public class Home_Screen extends BaseClass {
	public static String projectName = "sqe_demo";
	public WebDriver driver;

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