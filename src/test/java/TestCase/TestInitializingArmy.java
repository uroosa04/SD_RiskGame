package TestCase;

import static org.junit.Assert.*;
import java.io.IOException;
import org.junit.Before;
import RSG.Game;
import RSG.Player;
import RSG.Country;

import org.junit.Test;

public class TestInitializingArmy  {
	private Game board;
	Country test = new Country("Japan");
	Player player = new Player("Jim", 3);
	Country test2 = new Country("India");
	Player player2 = new Player("Kim", 4);
	@Before
	public void setUp() {
		board = new Game();
	}

	@Test
	public void initializeingArmy() throws IOException{	
		
		Game.initialArmyPlacement(player, test);
		//int num = test.getArmy();
		//assertTrue(test.getArmy() == 1);
		//assertTrue(test.getName() == "Japan");
		//assertTrue(player.getArmy() == 2);
		assertEquals(2,player.getArmy());
		assertEquals("Jim",player.getName());
		assertEquals("Japan",test.getName());
		assertEquals(1,test.getArmy());
		
		assertEquals(4,player2.getArmy());
		assertEquals("Kim",player2.getName());
		assertEquals("India",test2.getName());
		assertEquals(0,test2.getArmy());
		
		//assertTrue(2 ==player2.getArmy());
		//assertTrue("Kim"==test2.getName());
		//assertTrue(1 == test2.getArmy());
	}

}
