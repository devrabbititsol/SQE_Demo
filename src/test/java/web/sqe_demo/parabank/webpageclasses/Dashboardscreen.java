package web.sqe_demo.parabank.webpageclasses;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.utilities.BaseClass;

public class Dashboardscreen extends BaseClass {
	public static String projectName = "sqe_demo";
	public WebDriver driver;

	public Dashboardscreen(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//table[@id='accountTable']/tbody[1]/tr[1]/td[1]/a")	
	private WebElement	_784992a;
	public String clka_784992() {
		waitForExpectedElement(driver, _784992a);		
		String text = _784992a.getText();
		_784992a.click();
		return text;
	}

}