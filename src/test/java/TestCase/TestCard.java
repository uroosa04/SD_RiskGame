package TestCase;

import static org.junit.Assert.*;

import org.junit.Test;
import RSG.Card;
import RSG.Country;
public class TestCard {
	Country testC = new Country("India");
	Card test = new Card("Infantry", testC);
	@Test
	public void testGetCountry() {
		assertEquals(testC, test.getCountry());
	}

	@Test
	public void testGetType() {
		assertEquals("Infantry", test.getType());
	}


}
