package RSG;

import static org.junit.Assert.*;
import java.util.Observable;
import org.junit.Test;
import RSG.Player;
import java.lang.Object;
import RSG.Country;

public class PlayerTest {
	Player test = new Player("Bob", 3);

	@Test
	public void testGetName() {
		assertEquals("Bob", test.getName());
	}

	@Test
	public void testNumOfCountriesHeld() {
		assertEquals(0, test.numOfCountriesHeld());
	}

	@Test
	public void testDecreaseArmy() {
		test.setArmy(4);
		test.decreaseArmy(2);
		assertEquals(2, test.getArmy());
	}

	@Test
	public void testIncreaseArmy() {
		test.setArmy(5);
		test.increaseArmy(1);
		assertEquals(6, test.getArmy());
	}


	@Test
	public void testGetArmy() {
		test.setArmy(4);
		assertEquals(4,test.getArmy());
	}



	@Test
	public void testAddCredits() {
		test.setCredits(3);
		test.addCredits(1);
		assertEquals(4, test.getCredits());
	}

	@Test
	public void testRemoveCredits() {
		test.removeCredits(0);
		assertEquals(0, test.getCredits());
	}

	@Test
	public void testGetCredits() {
		assertEquals(0, test.getCredits());
	}

	@Test
	public void testAddUndo() {
		test.addUndo();
		assertEquals(1, test.getUndo());
	}

	@Test
	public void testRemoveUndo() {
		test.removeUndo();
		assertEquals(-1, test.getUndo());
	}

	@Test
	public void testGetUndo() {
		assertEquals(0, test.getUndo());
	}

}
