package Testing;
package RSG;
import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Before;

import RSG.Game;
import RSG.Player;
import RSG.Country;

import org.junit.Test;

public class TestInitializingArmy {
	private Game board;
	Country test = new Country("Japan");
	Player player = new Player("Jim", 3);
	@Before
	public void setUp() {
		board = new Game();
	}

	@Test
	public void initializeingArmy() throws IOException{	
		
		Game.initialArmyPlacement(player, test);
		int num = test.getArmy();
		assertTrue(test.getArmy() == 1);
		assertTrue(test.getName() == "Japan");
		assertTrue(player.getArmy() == 2);
		
		//assertEquals("2", player.getArmy());
		//assertEquals("1", test.getArmy());
		//assertEquals("Jim", player.getName());
		
	}

}
