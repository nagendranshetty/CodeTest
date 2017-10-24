package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage extends BasePage {

	@FindBy(linkText = "Your trips")
	private WebElement yourtrip;

	@FindBy(id = "SignIn")
	private WebElement signin;

	@FindBy(id = "signInButton")
	private WebElement signinbtn;

	@FindBy(id = "errors1")
	private WebElement errmsg;

	public SignUpPage(WebDriver driver) {
		super(driver);
	}

	public void click_On_YourTrip() {
		if (yourtrip.isDisplayed() && yourtrip.isEnabled()) {
			yourtrip.click();
		}
	}

	public void click_On_SignBtn() {
		if (signin.isDisplayed() && signin.isEnabled()) {
			signin.click();
		}
	}

	public void click_On_SingInBtn() {
		if (signinbtn.isDisplayed() && signinbtn.isEnabled()) {
			signinbtn.click();
		}
	}
	public boolean verify_Err_Msg(){
		if(errmsg.isDisplayed()){
			String msg=errmsg.getText();
			return msg.contains("There were errors in your submission")?true:false;
				
			}
		return false;
		}
	}


