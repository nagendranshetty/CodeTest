package prod_Script;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import pom.FilghtBookingPage;

public class FlightBookingTest extends BaseTest {

	@Test
	public void testFlightBooking() {
		
		FilghtBookingPage fb = new FilghtBookingPage(driver);
		
		fb.clear_OneWay();
		fb.clear_OneWay();
		fb.enter_Place("Bengaluru");
		
		 WebDriverWait wait = new WebDriverWait(driver, 10);
         wait.until(ExpectedConditions.elementToBeClickable(By.tagName("li")));

		 fb.getAllDestinations(0);
		 fb.click_Date();
		 fb.click_Search_Button();
	 
		 if(fb.get_Journy_Search_Result()==false){
			 Assert.fail();
		 }
	}

}
