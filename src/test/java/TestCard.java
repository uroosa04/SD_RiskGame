package Testing;
package RSG;
import static org.junit.Assert.*;

import org.junit.Test;

import RSG.Card;
import RSG.Country;

public class TestCard {
	Country test = new Country("Peru");
	Card testCard = new Card("Infantry", test);
	
	/*@Test
	public void testCountry() {
		assertEquals("Peru", testCard.getCountry());
	}
	*/
	@Test 
	public void testType() {
		assertEquals("Infantry",testCard.getType());
	
	}

}
