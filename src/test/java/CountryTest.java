package Testing;

import static org.junit.Assert.*;
import RSG.Country;
import org.junit.Test;
import RSG.Player;
public class CountryTest {
	Country test = new Country("Japan");
	
	@Test
	public void countryMade() {
		assertEquals("Japan", test.getName());
	}

	@Test
	public void testHasPlayer() {
		assertFalse(test.hasPlayer());
	}

	@Test
	public void testSetOwner() {
		Player testP = new Player("Uroosa", 2);
		test.setOwner(testP);
		assertEquals(testP, test.getOwner());
	}

	@Test
	public void testSetArmyNumber() {
		test.setArmyNumber(19);
		assertEquals(19, test.getArmy());
	}

	@Test
	public void testIncreaseArmy() {
		test.setArmyNumber(19);
		test.increaseArmy(1);
		assertEquals(20, test.getArmy());
	}

	@Test
	public void testDecreaseArmy() {
		test.setArmyNumber(19);
		test.decreaseArmy(2);
		assertEquals(17, test.getArmy());
	}

}
