package Testing;

import static org.junit.Assert.*;

import org.junit.Test;
import RSG.Dice;

public class DiceNumberTest {
	

	@Test
	public void test() {
		Dice dice = new Dice();
		dice.roll();
		int rollNum = dice.getDice();
		//System.out.println(rollNum);
		assertTrue(1 <= rollNum && rollNum <=7);
	}

}