package pom;

import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage 
{

	public WebDriver driver;

	public BasePage(WebDriver driver)
	{
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}

	public void verifyTitle(String eTitle) 
	{
		String aTitle = driver.getTitle();
		Assert.assertEquals(eTitle, aTitle);
	}

}
