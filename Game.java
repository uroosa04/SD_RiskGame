import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Game {

	public static void main(String[] args) {
		
		///////////////////////////////////////////////////////////////////////////////////
		/////// Initializes everything in the game
		///////    Creates countries and loads them into their continents
		///////    Creates adjacency lists and fills them
		///////    Creates cards and loads them into the deck (not done yet)
		///////////////////////////////////////////////////////////////////////////////////
		
		
		//North America
		Country Alaska = new Country("Alaska");
		Country Alberta = new Country("Alberta");
		Country CentralAmerica = new Country("Central America");
		Country EasternUnitedStates = new Country("Eastern United States");
		Country Greenland = new Country("Greenland");
		Country NorthwestTerritory = new Country("Northwest Territory");
		Country Ontario = new Country("Ontario");
		Country Quebec = new Country("Quebec");
		Country WesternUnitedStates = new Country("Western United States");
		ArrayList<Country> NorthAmericaCountryList = new ArrayList<Country>() {{
			add(Alaska);
			add(Alberta);
			add(CentralAmerica);
			add(EasternUnitedStates);
			add(Greenland);
			add(NorthwestTerritory);
			add(Ontario);
			add(Quebec);
			add(WesternUnitedStates);
		}};
		//South America
		Country Argentina = new Country("Argentina");
		Country Brazil = new Country("Brazil");
		Country Peru = new Country("Peru");
		Country Venezuela = new Country("Venezuela");
		ArrayList<Country> SouthAmericaCountryList = new ArrayList<Country>() {{
			add(Argentina);
			add(Brazil);
			add(Peru);
			add(Venezuela);
		}};
		//Europe
		Country GreatBritain = new Country("Great Britain");
		Country Iceland = new Country("Iceland");
		Country NorthernEurope = new Country("Northern Europe");
		Country Scandinavia = new Country("Scandinavia");
		Country SouthernEurope = new Country("Southern Europe");
		Country Ukraine = new Country("Ukraine");
		Country WesternEurope = new Country("Western Europe");
		ArrayList<Country> EuropeCountryList = new ArrayList<Country>() {{
			add(GreatBritain);
			add(Iceland);
			add(NorthernEurope);
			add(Scandinavia);
			add(SouthernEurope);
			add(Ukraine);
			add(WesternEurope);
		}};
		//Africa
		Country Congo = new Country("Congo");
		Country EastAfrica = new Country("East Africa");
		Country Egypt = new Country("Egypt");
		Country Madagascar = new Country("Madagascar");
		Country NorthAfrica = new Country("North Africa");
		Country SouthAfrica = new Country("South Africa");
		ArrayList<Country> AfricaCountryList = new ArrayList<Country>() {{
			add(Congo);
			add(EastAfrica);
			add(Egypt);
			add(Madagascar);
			add(NorthAfrica);
			add(SouthAfrica);
		}};
		//Asia
		Country Afghanistan = new Country("Afghanistan");
		Country China = new Country("China");
		Country India = new Country("India");
		Country Irkutsk = new Country("Irkutsk");
		Country Japan = new Country("Japan");
		Country Kamchatka = new Country("Kamchatka");
		Country MiddleEast = new Country("Middle East");
		Country Mongolia = new Country("Mongolia");
		Country Siam = new Country("Siam");
		Country Siberia = new Country("Sibaria");
		Country Ural = new Country("Ural");
		Country Yakutsk = new Country("Yakutsk");
		ArrayList<Country> AsiaCountryList = new ArrayList<Country>() {{
			add(Afghanistan);
			add(China);
			add(India);
			add(Irkutsk);
			add(Japan);
			add(Kamchatka);
			add(MiddleEast);
			add(Mongolia);
			add(Siam);
			add(Siberia);
			add(Ural);
			add(Yakutsk);
		}};
		//Australia
		Country EasternAustralia = new Country("Easter Australia");
		Country Indonesia = new Country("Indonesia");
		Country NewGuinea = new Country("NewGuinea");
		Country WesternAustralia = new Country("Western Australia");
		ArrayList<Country> AustraliaCountryList = new ArrayList<Country>() {{
			add(EasternAustralia);
			add(Indonesia);
			add(NewGuinea);
			add(WesternAustralia);
		}};
				
		////Continents
		Continent NorthAmerica = new Continent ("North America", 5, NorthAmericaCountryList);
		Continent SouthAmerica = new Continent ("North America", 2, SouthAmericaCountryList);
		Continent Europe = new Continent ("North America", 5, EuropeCountryList);
		Continent Africa = new Continent ("North America", 3, AfricaCountryList);
		Continent Asia = new Continent ("North America", 7, AsiaCountryList);
		Continent Australia = new Continent ("Australia", 2, AustraliaCountryList);
		
		////Adjacency lists
		
		//North America
		
		ArrayList<Country> adjacentToAlaska = new ArrayList<Country>() {{
			add(NorthwestTerritory);
			add(Alaska);
			add(Kamchatka);
		}};
		Alaska.setAdjacent(adjacentToAlaska);
		
		ArrayList<Country> adjacentToAlberta = new ArrayList<Country>() {{
			add(NorthwestTerritory);
			add(Alberta);
			add(Ontario);
			add(WesternUnitedStates);
		}};
		Alberta.setAdjacent(adjacentToAlberta);
		
		ArrayList<Country> adjacentToCentralAmerica = new ArrayList<Country>() {{
			add(WesternUnitedStates);
			add(EasternUnitedStates);
			add(Venezuela);
		}};
		CentralAmerica.setAdjacent(adjacentToCentralAmerica);
		
		ArrayList<Country> adjacentToEasternUnitedStates = new ArrayList<Country>() {{
			add(WesternUnitedStates);
			add(CentralAmerica);
			add(Ontario);
			add(Quebec);
		}};
		EasternUnitedStates.setAdjacent(adjacentToEasternUnitedStates);
		
		ArrayList<Country> adjacentToGreenland = new ArrayList<Country>() {{
			add(NorthwestTerritory);
			add(Iceland);
			add(Ontario);
			add(Quebec);
		}};
		Greenland.setAdjacent(adjacentToGreenland);
		
		ArrayList<Country> adjacentToNorthwestTerritory = new ArrayList<Country>() {{
			add(Alaska);
			add(Alberta);
			add(Ontario);
			add(Greenland);
		}};
		NorthwestTerritory.setAdjacent(adjacentToNorthwestTerritory);
		
		ArrayList<Country> adjacentToOntario = new ArrayList<Country>() {{
			add(NorthwestTerritory);
			add(Alberta);
			add(Quebec);
			add(Greenland);
			add(WesternUnitedStates);
			add(EasternUnitedStates);
		}};
		Ontario.setAdjacent(adjacentToOntario);
		
		ArrayList<Country> adjacentToQuebec = new ArrayList<Country>() {{
			add(Ontario);
			add(Greenland);
			add(EasternUnitedStates);
		}};
		Quebec.setAdjacent(adjacentToQuebec);
		
		ArrayList<Country> adjacentToWesternUnitedStates = new ArrayList<Country>() {{
			add(CentralAmerica);
			add(Ontario);
			add(EasternUnitedStates);
			add(Alberta);
		}};
		WesternUnitedStates.setAdjacent(adjacentToWesternUnitedStates);
		
		//South America
		
		ArrayList<Country> adjacentToArgentina = new ArrayList<Country>() {{
			add(Brazil);
			add(Peru);
		}};
		Argentina.setAdjacent(adjacentToArgentina);
		
		ArrayList<Country> adjacentToBrazil = new ArrayList<Country>() {{
			add(Argentina);
			add(Peru);
			add(Venezuela);
			add(NorthAfrica);
		}};
		Brazil.setAdjacent(adjacentToBrazil);
		
		ArrayList<Country> adjacentToPeru = new ArrayList<Country>() {{
			add(Argentina);
			add(Brazil);
			add(Venezuela);
		}};
		Peru.setAdjacent(adjacentToPeru);
		
		ArrayList<Country> adjacentToVenezuela = new ArrayList<Country>() {{
			add(Argentina);
			add(Brazil);
			add(Peru);
			add(CentralAmerica);
		}};
		Venezuela.setAdjacent(adjacentToVenezuela);
		
		//Europe
		
		ArrayList<Country> adjacentToGreatBritain = new ArrayList<Country>() {{
			add(Iceland);
			add(Scandinavia);
			add(NorthernEurope);
			add(WesternEurope);
		}};
		GreatBritain.setAdjacent(adjacentToGreatBritain);
		
		ArrayList<Country> adjacentToIceland = new ArrayList<Country>() {{
			add(Greenland);
			add(GreatBritain);
			add(Scandinavia);
		}};
		Iceland.setAdjacent(adjacentToIceland);
		
		ArrayList<Country> adjacentToNorthernEurope = new ArrayList<Country>() {{
			add(WesternEurope);
			add(SouthernEurope);
			add(Ukraine);
			add(Scandinavia);
			add(GreatBritain);
		}};
		NorthernEurope.setAdjacent(adjacentToNorthernEurope);
		
		ArrayList<Country> adjacentToScandinavia = new ArrayList<Country>() {{
			add(Iceland);
			add(GreatBritain);
			add(NorthernEurope);
			add(Ukraine);
		}};
		Scandinavia.setAdjacent(adjacentToScandinavia);
		
		ArrayList<Country> adjacentToSouthernEurope = new ArrayList<Country>() {{
			add(WesternEurope);
			add(NorthernEurope);
			add(Ukraine);
			add(NorthAfrica);
			add(Egypt);
			add(MiddleEast);
		}};
		SouthernEurope.setAdjacent(adjacentToSouthernEurope);
		
		ArrayList<Country> adjacentToUkraine = new ArrayList<Country>() {{
			add(Scandinavia);
			add(NorthernEurope);
			add(SouthernEurope);
			add(Ural);
			add(Afghanistan);
			add(MiddleEast);
		}};
		Ukraine.setAdjacent(adjacentToUkraine);
		
		ArrayList<Country> adjacentToWesternEurope = new ArrayList<Country>() {{
			add(GreatBritain);
			add(NorthernEurope);
			add(SouthernEurope);
		}};
		WesternEurope.setAdjacent(adjacentToWesternEurope);
		
		//Africa
		
		ArrayList<Country> adjacentToCongo = new ArrayList<Country>() {{
			add(NorthAfrica);
			add(EastAfrica);
			add(SouthAfrica);
		}};
		Congo.setAdjacent(adjacentToCongo);
		
		ArrayList<Country> adjacentToEastAfrica = new ArrayList<Country>() {{
			add(Egypt);
			add(NorthAfrica);
			add(Congo);
			add(SouthAfrica);
			add(Madagascar);
			add(MiddleEast);
		}};
		EastAfrica.setAdjacent(adjacentToEastAfrica);
		
		ArrayList<Country> adjacentToEgypt = new ArrayList<Country>() {{
			add(NorthAfrica);
			add(EastAfrica);
			add(SouthernEurope);
			add(MiddleEast);
		}};
		Egypt.setAdjacent(adjacentToEgypt);
		
		ArrayList<Country> adjacentToMadagascar = new ArrayList<Country>() {{
			add(SouthAfrica);
			add(EastAfrica);
		}};
		Madagascar.setAdjacent(adjacentToMadagascar);
		
		ArrayList<Country> adjacentToNorthAfrica = new ArrayList<Country>() {{
			add(SouthernEurope);
			add(Egypt);
			add(EastAfrica);
			add(Congo);
			add(Brazil);
		}};
		NorthAfrica.setAdjacent(adjacentToNorthAfrica);
		
		ArrayList<Country> adjacentToSouthAfrica = new ArrayList<Country>() {{
			add(Congo);
			add(EastAfrica);
			add(Madagascar);
		}};
		SouthAfrica.setAdjacent(adjacentToSouthAfrica);
		
		//Asia
		
		ArrayList<Country> adjacentToChina = new ArrayList<Country>() {{
			add(Siam);
			add(India);
			add(Ural);
			add(Siberia);
			add(Mongolia);
		}};
		China.setAdjacent(adjacentToChina);
		
		ArrayList<Country> adjacentToIndia = new ArrayList<Country>() {{
			add(Siam);
			add(China);
			add(MiddleEast);
			add(Afghanistan);
		}};
		India.setAdjacent(adjacentToIndia);
		
		ArrayList<Country> adjacentToIrkutsk = new ArrayList<Country>() {{
			add(Mongolia);
			add(Siberia);
			add(Yakutsk);
			add(Kamchatka);
		}};
		Irkutsk.setAdjacent(adjacentToIrkutsk);
		
		ArrayList<Country> adjacentToJapan = new ArrayList<Country>() {{
			add(Mongolia);
			add(Kamchatka);
		}};
		Japan.setAdjacent(adjacentToJapan);
		
		ArrayList<Country> adjacentToKamchatka = new ArrayList<Country>() {{
			add(Japan);
			add(Mongolia);
			add(Irkutsk);
			add(Yakutsk);
		}};
		Kamchatka.setAdjacent(adjacentToKamchatka);
		
		ArrayList<Country> adjacentToMiddleEast = new ArrayList<Country>() {{
			add(India);
			add(Afghanistan);
			add(Ukraine);
			add(SouthernEurope);
			add(Egypt);
		}};
		MiddleEast.setAdjacent(adjacentToMiddleEast);
		
		ArrayList<Country> adjacentToMongolia = new ArrayList<Country>() {{
			add(Japan);
			add(China);
			add(Siberia);
			add(Irkutsk);
			add(Kamchatka);
		}};
		Mongolia.setAdjacent(adjacentToMongolia);
		
		ArrayList<Country> adjacentToSiam = new ArrayList<Country>() {{
			add(China);
			add(India);
			add(Indonesia);
		}};
		Siam.setAdjacent(adjacentToSiam);
		
		ArrayList<Country> adjacentToSiberia = new ArrayList<Country>() {{
			add(Ural);
			add(China);
			add(Mongolia);
			add(Irkutsk);
			add(Yakutsk);
			
		}};
		Siberia.setAdjacent(adjacentToSiberia);
		
		ArrayList<Country> adjacentToUral = new ArrayList<Country>() {{
			add(Ural);
			add(Afghanistan);
			add(China);
			add(Mongolia);
			add(Irkutsk);
			add(Yakutsk);
		}};
		Ural.setAdjacent(adjacentToUral);
		
		ArrayList<Country> adjacentToYakutsk = new ArrayList<Country>() {{
			add(Siberia);
			add(Irkutsk);
			add(Kamchatka);
		}};
		Yakutsk.setAdjacent(adjacentToYakutsk);
		
		ArrayList<Country> adjacentToAfghanistan = new ArrayList<Country>() {{
			add(MiddleEast);
			add(India);
			add(China);
			add(Ural);
			add(Ukraine);
		}};
		
		Afghanistan.setAdjacent(adjacentToAfghanistan);
		
		
		//Australia
		
		ArrayList<Country> adjacentToEasternAustralia = new ArrayList<Country>() {{
			add(WesternAustralia);
			add(NewGuinea);
		}};
		EasternAustralia.setAdjacent(adjacentToEasternAustralia);
		
		ArrayList<Country> adjacentToIndonesia = new ArrayList<Country>() {{
			add(Siam);
			add(NewGuinea);
			add(WesternAustralia);
		}};
		Indonesia.setAdjacent(adjacentToIndonesia);
		
		ArrayList<Country> adjacentToNewGuinea = new ArrayList<Country>() {{
			add(EasternAustralia);
			add(Indonesia);
			add(WesternAustralia);
		}};
		NewGuinea.setAdjacent(adjacentToNewGuinea);
		
		ArrayList<Country> adjacentToWesternAustralia = new ArrayList<Country>() {{
			add(EasternAustralia);
			add(Indonesia);
			add(NewGuinea);
		}};
		WesternAustralia.setAdjacent(adjacentToWesternAustralia);
		
		//Cards and Deck (Not Done)
		
		List<Card> cardList = new ArrayList<Card>();
		cardList.add(new Card(5,"Afghanistan"));
		//one for each country. look up rick cards online
		
		///////////////////////////////////////////////////////////////////////////////////
		/////////
		///////// Done initializing everything
		/////////
		///////////////////////////////////////////////////////////////////////////////////
		
		
		
		
		
		
		
		Scanner sc = new Scanner(System.in);
		int numberOfPlayers;
		int counter;
		List<Player> playerList = new ArrayList<Player>();
		int totalNumberOfArmyPerPlayer = 0;
		
		
		System.out.println("Welcome to RISK!");
		System.out.println("How many players? (2, 3, 4, 5, or 6)");
		numberOfPlayers = sc.nextInt();
		while (numberOfPlayers < 2 || numberOfPlayers > 6) {
			System.out.println("Please input an appropiate number of players. (2, 3, 4, 5, or 6)");
			numberOfPlayers = sc.nextInt() ;
		}
		
		switch(numberOfPlayers) {
	        case 2 :
	        	totalNumberOfArmyPerPlayer = 40;
	           break;
	        case 3 :
	        	totalNumberOfArmyPerPlayer = 35;
	        case 4 :
	        	totalNumberOfArmyPerPlayer = 30;
	           break;
	        case 5 :
	        	totalNumberOfArmyPerPlayer = 25;
	           break;
	        case 6 :
	        	totalNumberOfArmyPerPlayer = 20;
	            break;
		}
		
		System.out.println("Got it, " + numberOfPlayers + " players.");
		String[] playerNameArray = new String[numberOfPlayers];
		
		sc.reset();
		counter = 0;
		while (sc.hasNextLine()) {
			System.out.println("What Player " + (counter+1) + "s name?");
			playerNameArray[counter] = sc.next();
			counter++;
			if (counter == numberOfPlayers) {
				break;
			}
		}
		
		for (int x = 0 ; x < numberOfPlayers ; x++) {
			playerList.add(new Player(String.valueOf(playerNameArray[x]), totalNumberOfArmyPerPlayer));
		}
		
		System.out.println();
		
		sc.close();
		
	}
	
	
	/*
	This method initialized the board by filling the continent and country classes.
	it fills the initialized countries into the appropriate continents, and
	fills the adjacency lists for the countries
	*/
}
