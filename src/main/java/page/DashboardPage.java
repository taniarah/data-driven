package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class DashboardPage extends BasePage{
	
	WebDriver driver;
	
	public DashboardPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//WebElements
	@FindBy(how = How.XPATH, using = "//h2[contains(text(), 'Dashboard')]") WebElement DASHBOARD_TITLE_ELEMENT;
	@FindBy(how = How.XPATH, using = "//span[contains(text(), 'Customers')]") WebElement CUSTOMERS_ELEMENT;
	@FindBy(how = How.XPATH, using = "//a[contains(text(), 'Add Customer')]") WebElement ADD_CUSTOMERS_ELEMENT;
	@FindBy(how = How.XPATH, using = "//a[contains(text(), 'List Customer')]") WebElement LIST_CUSTOMERS_ELEMENT;
	
	//Interactive Methods
	public void varifyDashboarPage() {
		Assert.assertEquals(DASHBOARD_TITLE_ELEMENT.getText(), "Dashboard", "Wrong page!!!");
	}
	
	public void clickCustomerButton() {
		CUSTOMERS_ELEMENT.click();
		
	}
	
	public void clickAddCustomerButton() {
		waitForElement(driver, 5, ADD_CUSTOMERS_ELEMENT);
		ADD_CUSTOMERS_ELEMENT.click();
	}

	public void clickListCustomerButton() {
		LIST_CUSTOMERS_ELEMENT.click();
	}

}
