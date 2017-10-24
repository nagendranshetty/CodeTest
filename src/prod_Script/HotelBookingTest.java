package prod_Script;

import org.testng.annotations.Test;

import pom.HotelBookingPage;

public class HotelBookingTest extends BaseTest {

	@Test
	public void shouldBeAbleToSearchForHotels() {
		HotelBookingPage hp = new HotelBookingPage(driver);
		hp.click_On_HotelLink();
		hp.enterLocality("Indiranagar, Bangalore");
		hp.selectText("1 room, 2 adults");
		hp.click_Search_Button();
	}
}
