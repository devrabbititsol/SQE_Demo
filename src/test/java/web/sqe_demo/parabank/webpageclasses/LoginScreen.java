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
	private WebElement	Username_785188input;
	public String fillinputUsername_785188(String varInputValue) {
		waitForExpectedElement(driver, Username_785188input);
		Username_785188input.sendKeys(varInputValue);
		return text;
	}

	@FindBy(how = How.XPATH, using = "//div[@id='loginPanel']/form[1]/div[2]/input")	
	private WebElement	Password_785192input;
	public String fillinputPassword_785192(String varInputValue) {
		waitForExpectedElement(driver, Password_785192input);
		Password_785192input.sendKeys(varInputValue);
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