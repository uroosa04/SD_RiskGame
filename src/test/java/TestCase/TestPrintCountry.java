package TestCase;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.junit.Before;
import org.junit.Test;


import RSG.Game;
import RSG.Player;
import RSG.Country;
import RSG.Continent;
import RSG.Card;
public class TestPrintCountry {
	
	Player player = new Player("Jim", 3);
	
	
	Country Alaska = new Country("Alaska");
	ArrayList<Country> NorthAmericaCountryList = new ArrayList<Country>();
		
	//South America
	Country Peru = new Country("Peru");
	ArrayList<Country> SouthAmericaCountryList = new ArrayList<Country>(); 
	
	//Europe
	Country WesternEurope = new Country("Western Europe");
	ArrayList<Country> EuropeCountryList = new ArrayList<Country>(); 
	
	//Africa
	Country Congo = new Country("Congo");
	ArrayList<Country> AfricaCountryList = new ArrayList<Country>();
	
	//Asia
	Country Afghanistan = new Country("Afghanistan");
	ArrayList<Country> AsiaCountryList = new ArrayList<Country>();
	
	//Australia
	Country EasternAustralia = new Country("Eastern Australia");
	ArrayList<Country> AustraliaCountryList = new ArrayList<Country>();
	
	
	////Continents
	Continent NorthAmerica = new Continent ("North America", 5, NorthAmericaCountryList);
	Continent SouthAmerica = new Continent ("South America", 2, SouthAmericaCountryList);
	Continent Europe = new Continent ("Europe", 5, EuropeCountryList);
	Continent Africa = new Continent ("Africa", 3, AfricaCountryList);
	Continent Asia = new Continent ("Asia", 7, AsiaCountryList);
	Continent Australia = new Continent ("Australia", 2, AustraliaCountryList);
	
	Player p1 = new Player("Jim",3);
	Player p2 = new Player("Kim",3);
	Player p3 = new Player("Kim",3);
	Card c1 = new Card("Artillery", Afghanistan);
	Card c2 = new Card("Infantry", EasternAustralia);
	Card c3 = new Card("Cavalry", Congo);
	Card c4 = new Card("Infantry", WesternEurope);
	Card c5 = new Card("Cavalry", Peru);
	List<Card> deck = new ArrayList<Card>();
	List<Player> plist = new ArrayList<Player>();
	
	@Before
	public void initize() {
		
		AsiaCountryList.add(Afghanistan);
		AfricaCountryList.add(Congo);
		EuropeCountryList.add(WesternEurope);
		SouthAmericaCountryList.add(Peru);
		NorthAmericaCountryList.add(Alaska);	
		Country Brazil = new Country("Brazil");
		Afghanistan.setOwner(p2);
		Congo.setOwner(p2);
		Alaska.setOwner(p1);
		Peru.setOwner(p1);
		Brazil.setOwner(p3);
		WesternEurope.setOwner(p2);
		EasternAustralia.setOwner(p1);
		p1.addCard(c1);
		p1.addCard(c2);
		p1.addCard(c5);
		p2.addCard(c3);
		p2.addCard(c4);
		deck.add(c1);
		deck.add(c2);
		deck.add(c3);
		deck.add(c4);
		deck.add(c5);
		plist.add(p1);
		plist.add(p2);
		
	}
	@Test
	public void testOwner() {
		boolean test = true;
		if(test == Game.allCountriesOwned(NorthAmerica, SouthAmerica, Europe, Africa, Asia, Australia)) {
			System.out.println("Has Player");
		}else {
			System.out.println("No player own this place");
		}
	}
	@Test
	public void testGetArmy() {
		assertEquals(9, Game.getNewArmiesFromCountriesAndContinents(p1,NorthAmerica, SouthAmerica, Europe, Africa, Asia, Australia));
		assertEquals(17, Game.getNewArmiesFromCountriesAndContinents(p2,NorthAmerica, SouthAmerica, Europe, Africa, Asia, Australia));
	}
	@Test
	public void testprint() {
		
		try {
			Game.printCountries(NorthAmerica, SouthAmerica, Europe, Africa, Asia, Australia);
		}catch (Exception e) {
			System.out.println("Print Country");
		}
	}
	@Test 
	public void TestGetCard() {
		Scanner sc = new Scanner("1");
		Scanner sb = new Scanner("N");
		try {
			assertEquals(0,Game.getNewArmiesFromCards(p2,sc,3));
			assertEquals(0,Game.getNewArmiesFromCards(p1,sb,3));
		}catch (Exception e) {
			System.out.println("Fail Test");
		}
		//Game.getNewArmiesFromCards(p1,sc,3);
	}
	
	@Test
	public void TestAskForCountry() {
		Country congo = new Country("Congo");
		Scanner sc = new Scanner("Congo");
		//assertEquals("Congo",Game.askPlayerForCountry(sc,NorthAmerica, SouthAmerica, Europe, Africa, Asia, Australia).getName());
		try {
			assertEquals("Congo",Game.askPlayerForCountry(sc,NorthAmerica, SouthAmerica, Europe, Africa, Asia, Australia).getName());
		}
		catch(Exception e) {
			System.out.println("Country Name");
		}
		
	}

	@Test
	public void testFile() {
		
		try {
			Game.writeGameToFile(player);
		}catch (Exception e) {
			System.out.println("Sending File");
		}
	}

	@Test
	public void testInt() {
		Scanner sc = new Scanner("5");

		try {
			 assertTrue( 5 ==  Game.askPlayerForInt(sc));
		}catch (Exception e) {
			System.out.println("Sending File");
		}
	}
	@Test
	public void testAnswer() {
		Scanner sc = new Scanner("No");
		try {
			assertEquals("NO", Game.askPlayerForYesOrNo(sc));
		}catch (Exception e) {
			System.out.println("No answers");
		}
	}
	
	@Test
	public void TestAttack() {
		Scanner sc = new Scanner("N");
		try {
			Game.attack(p1, p2, sc, NorthAmerica, SouthAmerica, Europe, Africa, Asia, Australia);
		}catch (Exception e){
			System.out.println("Fail to attack");
		}

	}
	@Test
	public void testUndo() {
		boolean test = false;
		try {
			Game.undoAttack(p1, p2, Congo, Peru, 4, 4, test);
		}catch (Exception e) {
			System.out.println("undo");
		}
		try {
			test = true;
			Game.undoAttack(p2, p1, Peru, Congo, 2, 3, test);
		}catch (Exception e) {
			System.out.println("undo");
		}
	}
	
	@Test 
	public void Testfortify() {
		Scanner sc = new Scanner("N");
		try {
			Game.fortify(p2,sc, NorthAmerica, SouthAmerica, Europe, Africa, Asia, Australia);
		}catch (Exception e) {
			System.out.println("Not moving");
		}
	}
	@Test 
	public void TestUndofortify() {
		try {
			Game.undoFortify(p2, Congo, WesternEurope, 5);
			
		}catch (Exception e) {
			System.out.println("Cancel moving");
		}
	}
	@Test 
	public void decreaseDeck() {
		Game.givePlayerRandomCard(p1, deck);
	}
	@Test 
	public void TestBoolean() {
		int[] num = new int[2];
		boolean test = false;
		try {
			assertEquals(test,Game.intIsInArray(num, 1, 1) );
		}catch (Exception e) {
			System.out.println("Test");
		}
		//Game.intIsInArray(num, 1, 1);
	}
	@Test 
	public void TestCombineCard() {
		int[] num = new int[0];
		try {
			Game.hasCombinationOfCardsToTurnIn(num, p1);
		}catch (Exception e) {
			System.out.println("No Combine");
		}
	}
	@Test
	public void OwnCountryMatch() {
		int[] num = new int[0];
		try {
			Game.ownedCountryMatchesCard(num, p2);
		}catch (Exception e) {
			System.out.println("No Match");
		}
	}
	
	@Test
	public void askForPlayer() {
		Scanner sc = new Scanner("Jim");
		Scanner sb = new Scanner("Tone");
		try {
			Game.askPlayerForPlayer(sc, plist);
			Game.askPlayerForPlayer(sb, plist);
		}catch (Exception e) {
			System.out.println("No such Player in the Game");
		}
	}
	
	@Test
	public void attackbool() {
		boolean test = false;
		try {
			assertEquals(test,Game.playerCanAttackPlayer(p2, p3));
		}catch (Exception e) {
			System.out.println("No such Player in the Game");
		}
	}
	
	
	@Test
	public void TestChat() {
		File test = new File("");
		try {
			Game.clearChat(test);
		}catch (Exception e) {
			System.out.println("Clearing File");
		}
	}
	@Test 
	public void TestCredit() {
		Scanner sc = new Scanner ("Y");
		try {
			Game.creditStore(p1, sc, plist, deck);
		}catch (Exception e) {
			System.out.println("Exchange Credit");
		}
		
	}
	
	@Test
	public void testMain() throws FileNotFoundException {
		String[] args = null;
	
		try {
		
			Game.main(args);
		
		}catch (Exception e) {
			System.out.println("No such Player in the Game");
		}
		
	}
	

}
