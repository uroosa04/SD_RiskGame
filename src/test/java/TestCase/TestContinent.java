package TestCase;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;
import RSG.Continent;
import RSG.Country;

public class TestContinent {
	Country Congo = new Country("Congo");
	ArrayList <Country> nation = new  ArrayList<Country>();

	
	String name = "Jim";
	Continent c = new Continent(name,1,nation);
	
	@Test
	public void testGet() {
		assertEquals("Jim", c.getName());
		assertEquals(1, c.getContinentalArmy());
	}
	

}
