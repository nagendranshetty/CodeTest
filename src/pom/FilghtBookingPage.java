package pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FilghtBookingPage extends BasePage {

	@FindBy(id = "OneWay")
	private WebElement oneway;

	@FindBy(tagName = "li")
	private List<WebElement> desOptions;

	@FindBy(xpath = "//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr[3]/td[7]/a")
	private WebElement date;

	@FindBy(id = "SearchBtn")
	private WebElement searchBtn;

	@FindBy(className = "searchSummary")
	private WebElement result;

	// Above are Web Elements
	public FilghtBookingPage(WebDriver driver) {
		super(driver);
	}

	// Generic methods for repeated tasks
	public void click_On_OneWay() {
		if (oneway.isDisplayed() && oneway.isEnabled()) {
			oneway.click();
		}
	}

	public void clear_OneWay() {
		if (oneway.isDisplayed() && oneway.isEnabled()) {
			oneway.clear();
		}
	}

	public void enter_Place(String s) {
		if (oneway.isDisplayed() && oneway.isEnabled()) {
			oneway.sendKeys(s);
		}
	}

	public void getAllDestinations(int index) {

		desOptions.get(index).click();

	}

	public void click_Date() {
		if (date.isDisplayed() && date.isEnabled()) {
			date.click();
		}
	}

	public void click_Search_Button() {
		if (searchBtn.isDisplayed() && searchBtn.isEnabled()) {
			searchBtn.click();
		}
	}

	public boolean get_Journy_Search_Result() {

		return result.isDisplayed() ? true : false;
	}

}
