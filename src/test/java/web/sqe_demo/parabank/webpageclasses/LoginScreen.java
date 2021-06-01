package web.sqe_demo.parabank.webpageclasses;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.utilities.BaseClass;

public class LoginScreen extends BaseClass {
	public static String projectName = "sqe_demo";
	public WebDriver driver;

	public LoginScreen(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//div[@id='loginPanel']/form[1]/div[1]/input")	
	private WebElement	Username_784879input;
	public String fillinputUsername_784879(String varInputValue) {
		waitForExpectedElement(driver, Username_784879input);
		Username_784879input.sendKeys(varInputValue);
		return text;
	}

	@FindBy(how = How.XPATH, using = "//div[@id='loginPanel']/form[1]/div[2]/input")	
	private WebElement	Password_784883input;
	public String fillinputPassword_784883(String varInputValue) {
		waitForExpectedElement(driver, Password_784883input);
		Password_784883input.sendKeys(varInputValue);
		return text;
	}

	@FindBy(how = How.XPATH, using = "//div[@id='loginPanel']/form[1]/div[3]/input")	
	private WebElement	LogIn_784916input;
	public String clkinputLogIn_784916() {
		waitForExpectedElement(driver, LogIn_784916input);		
		String text = LogIn_784916input.getText();
		LogIn_784916input.click();
		return text;
	}

}