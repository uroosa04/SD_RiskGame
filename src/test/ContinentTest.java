package RSG;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
import java.util.*;

import org.junit.Test;


import RSG.Continent;
import RSG.Game;
import RSG.Country;

public class ContinentTest {
	ArrayList<Country> TestCountryList;
	{
	Country Alaska = new Country("Alaska");
	Country Alberta = new Country("Alberta");
	TestCountryList = new ArrayList<Country>();
		TestCountryList.add(Alaska);
		TestCountryList.add(Alberta);
	}
	Continent test = new Continent("Africa", 20 , TestCountryList);
	
	@Test
	public void testGetName() {
		assertEquals("Africa", test.getName());
	}

	@Test
	public void testGetContinentalArmy() {
		assertEquals(20, test.getContinentalArmy());
	}
	
	@Test
	public void testGetCountries() {
		assertEquals(TestCountryList, test.getCountries());
	}
	
}
