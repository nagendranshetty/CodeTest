package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class HotelBookingPage extends BasePage {

	@FindBy(linkText = "Hotels")
	private WebElement hotelLink;

	@FindBy(id = "Tags")
	private WebElement localityTextBox;

	@FindBy(id = "SearchHotelsButton")
	private WebElement searchButton;

	@FindBy(id = "travellersOnhome")
	private WebElement travellerSelection;

	public HotelBookingPage(WebDriver driver) {
		super(driver);
	}

	public void click_On_HotelLink() {
		if (hotelLink.isDisplayed() && hotelLink.isEnabled()) {
			hotelLink.click();
		}
	}

	public void enterLocality(String l) {
		if (localityTextBox.isDisplayed() && localityTextBox.isEnabled()) {
			localityTextBox.sendKeys(l);
		}
	}

	public void selectText(String s) {
		if (travellerSelection.isDisplayed()) {
			new Select(travellerSelection).selectByVisibleText(s);
		}
	}
	public void click_Search_Button(){
		if(searchButton.isDisplayed()&&searchButton.isEnabled()){
			searchButton.click();
		}
	}
}
