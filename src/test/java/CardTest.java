
import junit.framework.TestCase;

import org.junit.Test;
import RSG.Card;
import RSG.Country;


public class CardTest extends TestCase {
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
