package prod_Script;

import org.testng.Assert;
import org.testng.annotations.Test;

import pom.SignUpPage;

public class SignInTest extends BaseTest {

	@Test
	public void shouldThrowAnErrorIfSignInDetailsAreMissing() {

		SignUpPage sp = new SignUpPage(driver);
		sp.click_On_YourTrip();
		sp.click_On_SignBtn();
		sp.click_On_SingInBtn();
		if (sp.verify_Err_Msg() == false) {
			Assert.fail();
		}

	}

}
