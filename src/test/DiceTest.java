package RSG;

import static org.junit.Assert.*;

import org.junit.Test;
import RSG.Dice;

public class DiceTest {
	Dice test = new Dice();
	@Test
	public void testGetDice() {
		test.SetDice(5);
		assertEquals(5,test.getDice());
	}

	@Test
	public void testSetDice() {
		test.SetDice(2);
		assertEquals(2, test.getDice());
	}

}
