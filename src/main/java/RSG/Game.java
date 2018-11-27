package RSG;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;

import java.util.*;

import java.util.Timer;
import java.util.TimerTask;

import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class Game {
	private String InputTime = "";
	private int playerIndex = 0;
	
public static void main(String[] args) {
	
		
		///////////////////////////////////////////////////////////////////////////////////
		/////// Initializes everything in the game
		///////    Creates countries and loads them into their continents
		///////    Creates adjacency lists and fills them
		///////    Creates cards and loads them into the deck (not done yet)
		///////////////////////////////////////////////////////////////////////////////////
		
		//Country for wild card
		Country WildCard = new Country("Wild Card");
		
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
		ArrayList<Country> NorthAmericaCountryList = new ArrayList<Country>();
			NorthAmericaCountryList.add(Alaska);
			NorthAmericaCountryList.add(Alberta);
			NorthAmericaCountryList.add(CentralAmerica);
			NorthAmericaCountryList.add(EasternUnitedStates);
			NorthAmericaCountryList.add(Greenland);
			NorthAmericaCountryList.add(NorthwestTerritory);
			NorthAmericaCountryList.add(Ontario);
			NorthAmericaCountryList.add(Quebec);
			NorthAmericaCountryList.add(WesternUnitedStates);
		//South America
		Country Argentina = new Country("Argentina");
		Country Brazil = new Country("Brazil");
		Country Peru = new Country("Peru");
		Country Venezuela = new Country("Venezuela");
		ArrayList<Country> SouthAmericaCountryList = new ArrayList<Country>(); 
			SouthAmericaCountryList.add(Argentina);
			SouthAmericaCountryList.add(Brazil);
			SouthAmericaCountryList.add(Peru);
			SouthAmericaCountryList.add(Venezuela);
		//Europe
		Country GreatBritain = new Country("Great Britain");
		Country Iceland = new Country("Iceland");
		Country NorthernEurope = new Country("Northern Europe");
		Country Scandinavia = new Country("Scandinavia");
		Country SouthernEurope = new Country("Southern Europe");
		Country Ukraine = new Country("Ukraine");
		Country WesternEurope = new Country("Western Europe");
		ArrayList<Country> EuropeCountryList = new ArrayList<Country>(); 
			EuropeCountryList.add(GreatBritain);
			EuropeCountryList.add(Iceland);
			EuropeCountryList.add(NorthernEurope);
			EuropeCountryList.add(Scandinavia);
			EuropeCountryList.add(SouthernEurope);
			EuropeCountryList.add(Ukraine);
			EuropeCountryList.add(WesternEurope);
		
		//Africa
		Country Congo = new Country("Congo");
		Country EastAfrica = new Country("East Africa");
		Country Egypt = new Country("Egypt");
		Country Madagascar = new Country("Madagascar");
		Country NorthAfrica = new Country("North Africa");
		Country SouthAfrica = new Country("South Africa");
		ArrayList<Country> AfricaCountryList = new ArrayList<Country>();
			AfricaCountryList.add(Congo);
			AfricaCountryList.add(EastAfrica);
			AfricaCountryList.add(Egypt);
			AfricaCountryList.add(Madagascar);
			AfricaCountryList.add(NorthAfrica);
			AfricaCountryList.add(SouthAfrica);
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
		ArrayList<Country> AsiaCountryList = new ArrayList<Country>();
			AsiaCountryList.add(Afghanistan);
			AsiaCountryList.add(China);
			AsiaCountryList.add(India);
			AsiaCountryList.add(Irkutsk);
			AsiaCountryList.add(Japan);
			AsiaCountryList.add(Kamchatka);
			AsiaCountryList.add(MiddleEast);
			AsiaCountryList.add(Mongolia);
			AsiaCountryList.add(Siam);
			AsiaCountryList.add(Siberia);
			AsiaCountryList.add(Ural);
			AsiaCountryList.add(Yakutsk);
		//Australia
		Country EasternAustralia = new Country("Eastern Australia");
		Country Indonesia = new Country("Indonesia");
		Country NewGuinea = new Country("New Guinea");
		Country WesternAustralia = new Country("Western Australia");
		ArrayList<Country> AustraliaCountryList = new ArrayList<Country>();
			AustraliaCountryList.add(EasternAustralia);
			AustraliaCountryList.add(Indonesia);
			AustraliaCountryList.add(NewGuinea);
			AustraliaCountryList.add(WesternAustralia);
	
				
		////Continents
		Continent NorthAmerica = new Continent ("North America", 5, NorthAmericaCountryList);
		Continent SouthAmerica = new Continent ("South America", 2, SouthAmericaCountryList);
		Continent Europe = new Continent ("Europe", 5, EuropeCountryList);
		Continent Africa = new Continent ("Africa", 3, AfricaCountryList);
		Continent Asia = new Continent ("Asia", 7, AsiaCountryList);
		Continent Australia = new Continent ("Australia", 2, AustraliaCountryList);
		
		////Adjacency lists
		
		//North America
		
		ArrayList<Country> adjacentToAlaska = new ArrayList<Country>();
			adjacentToAlaska.add(NorthwestTerritory);
			adjacentToAlaska.add(Alaska);
			adjacentToAlaska.add(Kamchatka);
		Alaska.setAdjacent(adjacentToAlaska);
		
		ArrayList<Country> adjacentToAlberta = new ArrayList<Country>();
			adjacentToAlberta.add(NorthwestTerritory);
			adjacentToAlberta.add(Alberta);
			adjacentToAlberta.add(Ontario);
			adjacentToAlberta.add(WesternUnitedStates);
		Alberta.setAdjacent(adjacentToAlberta);
		
		ArrayList<Country> adjacentToCentralAmerica = new ArrayList<Country>();
			adjacentToCentralAmerica.add(WesternUnitedStates);
			adjacentToCentralAmerica.add(EasternUnitedStates);
			adjacentToCentralAmerica.add(Venezuela);

		CentralAmerica.setAdjacent(adjacentToCentralAmerica);
		
		ArrayList<Country> adjacentToEasternUnitedStates = new ArrayList<Country>();
			adjacentToEasternUnitedStates.add(WesternUnitedStates);
			adjacentToEasternUnitedStates.add(CentralAmerica);
			adjacentToEasternUnitedStates.add(Ontario);
			adjacentToEasternUnitedStates.add(Quebec);
		EasternUnitedStates.setAdjacent(adjacentToEasternUnitedStates);
		
		ArrayList<Country> adjacentToGreenland = new ArrayList<Country>();
			adjacentToGreenland.add(NorthwestTerritory);
			adjacentToGreenland.add(Iceland);
			adjacentToGreenland.add(Ontario);
			adjacentToGreenland.add(Quebec);

		Greenland.setAdjacent(adjacentToGreenland);
		
		ArrayList<Country> adjacentToNorthwestTerritory = new ArrayList<Country>();
			adjacentToNorthwestTerritory.add(Alaska);
			adjacentToNorthwestTerritory.add(Alberta);
			adjacentToNorthwestTerritory.add(Ontario);
			adjacentToNorthwestTerritory.add(Greenland);

		NorthwestTerritory.setAdjacent(adjacentToNorthwestTerritory);
		
		ArrayList<Country> adjacentToOntario = new ArrayList<Country>();
			adjacentToOntario.add(NorthwestTerritory);
			adjacentToOntario.add(Alberta);
			adjacentToOntario.add(Quebec);
			adjacentToOntario.add(Greenland);
			adjacentToOntario.add(WesternUnitedStates);
			adjacentToOntario.add(EasternUnitedStates);

		Ontario.setAdjacent(adjacentToOntario);
		
		ArrayList<Country> adjacentToQuebec = new ArrayList<Country>();
			adjacentToQuebec.add(Ontario);
			adjacentToQuebec.add(Greenland);
			adjacentToQuebec.add(EasternUnitedStates);

		Quebec.setAdjacent(adjacentToQuebec);
		
		ArrayList<Country> adjacentToWesternUnitedStates = new ArrayList<Country>();
			adjacentToWesternUnitedStates.add(CentralAmerica);
			adjacentToWesternUnitedStates.add(Ontario);
			adjacentToWesternUnitedStates.add(EasternUnitedStates);
			adjacentToWesternUnitedStates.add(Alberta);

		WesternUnitedStates.setAdjacent(adjacentToWesternUnitedStates);
		
		//South America
		
		ArrayList<Country> adjacentToArgentina = new ArrayList<Country>();
			adjacentToArgentina.add(Brazil);
			adjacentToArgentina.add(Peru);
			
		Argentina.setAdjacent(adjacentToArgentina);
		
		ArrayList<Country> adjacentToBrazil = new ArrayList<Country>();
			adjacentToBrazil.add(Argentina);
			adjacentToBrazil.add(Peru);
			adjacentToBrazil.add(Venezuela);
			adjacentToBrazil.add(NorthAfrica);

		Brazil.setAdjacent(adjacentToBrazil);
		
		ArrayList<Country> adjacentToPeru = new ArrayList<Country>();
			adjacentToPeru.add(Argentina);
			adjacentToPeru.add(Brazil);
			adjacentToPeru.add(Venezuela);
		Peru.setAdjacent(adjacentToPeru);
		
		ArrayList<Country> adjacentToVenezuela = new ArrayList<Country>();
			adjacentToVenezuela.add(Argentina);
			adjacentToVenezuela.add(Brazil);
			adjacentToVenezuela.add(Peru);
			adjacentToVenezuela.add(CentralAmerica);

		Venezuela.setAdjacent(adjacentToVenezuela);
		
		//Europe
		
		ArrayList<Country> adjacentToGreatBritain = new ArrayList<Country>();
			adjacentToGreatBritain.add(Iceland);
			adjacentToGreatBritain.add(Scandinavia);
			adjacentToGreatBritain.add(NorthernEurope);
			adjacentToGreatBritain.add(WesternEurope);

		GreatBritain.setAdjacent(adjacentToGreatBritain);
		
		ArrayList<Country> adjacentToIceland = new ArrayList<Country>();
			adjacentToIceland.add(Greenland);
			adjacentToIceland.add(GreatBritain);
			adjacentToIceland.add(Scandinavia);

		Iceland.setAdjacent(adjacentToIceland);
		
		ArrayList<Country> adjacentToNorthernEurope = new ArrayList<Country>();
			adjacentToNorthernEurope.add(WesternEurope);
			adjacentToNorthernEurope.add(SouthernEurope);
			adjacentToNorthernEurope.add(Ukraine);
			adjacentToNorthernEurope.add(Scandinavia);
			adjacentToNorthernEurope.add(GreatBritain);

		NorthernEurope.setAdjacent(adjacentToNorthernEurope);
		
		ArrayList<Country> adjacentToScandinavia = new ArrayList<Country>();
			adjacentToScandinavia.add(Iceland);
			adjacentToScandinavia.add(GreatBritain);
			adjacentToScandinavia.add(NorthernEurope);
			adjacentToScandinavia.add(Ukraine);
		Scandinavia.setAdjacent(adjacentToScandinavia);
		
		ArrayList<Country> adjacentToSouthernEurope = new ArrayList<Country>();
			adjacentToSouthernEurope.add(WesternEurope);
			adjacentToSouthernEurope.add(NorthernEurope);
			adjacentToSouthernEurope.add(Ukraine);
			adjacentToSouthernEurope.add(NorthAfrica);
			adjacentToSouthernEurope.add(Egypt);
			adjacentToSouthernEurope.add(MiddleEast);

		SouthernEurope.setAdjacent(adjacentToSouthernEurope);
		
		ArrayList<Country> adjacentToUkraine = new ArrayList<Country>();
			adjacentToUkraine.add(Scandinavia);
			adjacentToUkraine.add(NorthernEurope);
			adjacentToUkraine.add(SouthernEurope);
			adjacentToUkraine.add(Ural);
			adjacentToUkraine.add(Afghanistan);
			adjacentToUkraine.add(MiddleEast);

		Ukraine.setAdjacent(adjacentToUkraine);
		
		ArrayList<Country> adjacentToWesternEurope = new ArrayList<Country>();
			adjacentToWesternEurope.add(GreatBritain);
			adjacentToWesternEurope.add(NorthernEurope);
			adjacentToWesternEurope.add(SouthernEurope);

		WesternEurope.setAdjacent(adjacentToWesternEurope);
		
		//Africa
		
		ArrayList<Country> adjacentToCongo = new ArrayList<Country>();
			adjacentToCongo.add(NorthAfrica);
			adjacentToCongo.add(EastAfrica);
			adjacentToCongo.add(SouthAfrica);

		Congo.setAdjacent(adjacentToCongo);
		
		ArrayList<Country> adjacentToEastAfrica = new ArrayList<Country>();
			adjacentToEastAfrica .add(Egypt);
			adjacentToEastAfrica .add(NorthAfrica);
			adjacentToEastAfrica .add(Congo);
			adjacentToEastAfrica .add(SouthAfrica);
			adjacentToEastAfrica .add(Madagascar);
			adjacentToEastAfrica .add(MiddleEast);

		EastAfrica.setAdjacent(adjacentToEastAfrica);
		
		ArrayList<Country> adjacentToEgypt = new ArrayList<Country>();
			adjacentToEgypt.add(NorthAfrica);
			adjacentToEgypt.add(EastAfrica);
			adjacentToEgypt.add(SouthernEurope);
			adjacentToEgypt.add(MiddleEast);

		Egypt.setAdjacent(adjacentToEgypt);
		
		ArrayList<Country> adjacentToMadagascar = new ArrayList<Country>();
			adjacentToMadagascar.add(SouthAfrica);
			adjacentToMadagascar.add(EastAfrica);

		Madagascar.setAdjacent(adjacentToMadagascar);
		
		ArrayList<Country> adjacentToNorthAfrica = new ArrayList<Country>();
			adjacentToNorthAfrica.add(SouthernEurope);
			adjacentToNorthAfrica.add(Egypt);
			adjacentToNorthAfrica.add(EastAfrica);
			adjacentToNorthAfrica.add(Congo);
			adjacentToNorthAfrica.add(Brazil);
	
		NorthAfrica.setAdjacent(adjacentToNorthAfrica);
		
		ArrayList<Country> adjacentToSouthAfrica = new ArrayList<Country>();
			adjacentToSouthAfrica.add(Congo);
			adjacentToSouthAfrica.add(EastAfrica);
			adjacentToSouthAfrica.add(Madagascar);
			
		SouthAfrica.setAdjacent(adjacentToSouthAfrica);
		
		//Asia
		
		ArrayList<Country> adjacentToChina = new ArrayList<Country>();
			adjacentToChina.add(Siam);
			adjacentToChina.add(India);
			adjacentToChina.add(Ural);
			adjacentToChina.add(Siberia);
			adjacentToChina.add(Mongolia);

		China.setAdjacent(adjacentToChina);
		
		ArrayList<Country> adjacentToIndia = new ArrayList<Country>();
			adjacentToIndia.add(Siam);
			adjacentToIndia.add(China);
			adjacentToIndia.add(MiddleEast);
			adjacentToIndia.add(Afghanistan);

		India.setAdjacent(adjacentToIndia);
		
		ArrayList<Country> adjacentToIrkutsk = new ArrayList<Country>();
			adjacentToIrkutsk.add(Mongolia);
			adjacentToIrkutsk.add(Siberia);
			adjacentToIrkutsk.add(Yakutsk);
			adjacentToIrkutsk.add(Kamchatka);

		Irkutsk.setAdjacent(adjacentToIrkutsk);
		
		ArrayList<Country> adjacentToJapan = new ArrayList<Country>();
			adjacentToJapan.add(Mongolia);
			adjacentToJapan.add(Kamchatka);

		Japan.setAdjacent(adjacentToJapan);
		
		ArrayList<Country> adjacentToKamchatka = new ArrayList<Country>();
			adjacentToKamchatka.add(Japan);
			adjacentToKamchatka.add(Mongolia);
			adjacentToKamchatka.add(Irkutsk);
			adjacentToKamchatka.add(Yakutsk);

		Kamchatka.setAdjacent(adjacentToKamchatka);
		
		ArrayList<Country> adjacentToMiddleEast = new ArrayList<Country>();
			adjacentToMiddleEast.add(India);
			adjacentToMiddleEast.add(Afghanistan);
			adjacentToMiddleEast.add(Ukraine);
			adjacentToMiddleEast.add(SouthernEurope);
			adjacentToMiddleEast.add(Egypt);

		MiddleEast.setAdjacent(adjacentToMiddleEast);
		
		ArrayList<Country> adjacentToMongolia = new ArrayList<Country>();
			adjacentToMongolia.add(Japan);
			adjacentToMongolia.add(China);
			adjacentToMongolia.add(Siberia);
			adjacentToMongolia.add(Irkutsk);
			adjacentToMongolia.add(Kamchatka);

		Mongolia.setAdjacent(adjacentToMongolia);
		
		ArrayList<Country> adjacentToSiam = new ArrayList<Country>();
			adjacentToSiam.add(China);
			adjacentToSiam.add(India);
			adjacentToSiam.add(Indonesia);

		Siam.setAdjacent(adjacentToSiam);
		
		ArrayList<Country> adjacentToSiberia = new ArrayList<Country>();
			adjacentToSiberia.add(Ural);
			adjacentToSiberia.add(China);
			adjacentToSiberia.add(Mongolia);
			adjacentToSiberia.add(Irkutsk);
			adjacentToSiberia.add(Yakutsk);
				

		Siberia.setAdjacent(adjacentToSiberia);
		
		ArrayList<Country> adjacentToUral = new ArrayList<Country>();
			adjacentToUral.add(Ural);
			adjacentToUral.add(Afghanistan);
			adjacentToUral.add(China);
			adjacentToUral.add(Mongolia);
			adjacentToUral.add(Irkutsk);
			adjacentToUral.add(Yakutsk);

		Ural.setAdjacent(adjacentToUral);
		
		ArrayList<Country> adjacentToYakutsk = new ArrayList<Country>();
			adjacentToYakutsk.add(Siberia);
			adjacentToYakutsk.add(Irkutsk);
			adjacentToYakutsk.add(Kamchatka);

		Yakutsk.setAdjacent(adjacentToYakutsk);
		
		ArrayList<Country> adjacentToAfghanistan = new ArrayList<Country>();
			adjacentToAfghanistan.add(MiddleEast);
			adjacentToAfghanistan.add(India);
			adjacentToAfghanistan.add(China);
			adjacentToAfghanistan.add(Ural);
			adjacentToAfghanistan.add(Ukraine);
		
		Afghanistan.setAdjacent(adjacentToAfghanistan);
		
		
		//Australia
		
		ArrayList<Country> adjacentToEasternAustralia = new ArrayList<Country>();
			adjacentToEasternAustralia .add(WesternAustralia);
			adjacentToEasternAustralia .add(NewGuinea);

		EasternAustralia.setAdjacent(adjacentToEasternAustralia);
		
		ArrayList<Country> adjacentToIndonesia = new ArrayList<Country>();
			adjacentToIndonesia.add(Siam);
			adjacentToIndonesia.add(NewGuinea);
			adjacentToIndonesia.add(WesternAustralia);

		Indonesia.setAdjacent(adjacentToIndonesia);
		
		ArrayList<Country> adjacentToNewGuinea = new ArrayList<Country>();
			adjacentToNewGuinea.add(EasternAustralia);
			adjacentToNewGuinea.add(Indonesia);
			adjacentToNewGuinea.add(WesternAustralia);

		NewGuinea.setAdjacent(adjacentToNewGuinea);
		
		ArrayList<Country> adjacentToWesternAustralia = new ArrayList<Country>();
			adjacentToWesternAustralia.add(EasternAustralia);
			adjacentToWesternAustralia.add(Indonesia);
			adjacentToWesternAustralia.add(NewGuinea);

		WesternAustralia.setAdjacent(adjacentToWesternAustralia);
		
		////////////ADD ADD////////////
		
		List<Card> cardList = new ArrayList<Card>();
		cardList.add(new Card("Wild Card", WildCard));
		cardList.add(new Card("Wild Card", WildCard));
		cardList.add(new Card("Artillery", Afghanistan));
		cardList.add(new Card("Infantry", Alaska));
		cardList.add(new Card("Cavalry", Alberta));
		cardList.add(new Card("Infantry", Argentina));
		cardList.add(new Card("Artillery", Brazil));
		cardList.add(new Card("Infantry", Congo));
		cardList.add(new Card("Artillery", CentralAmerica));
		cardList.add(new Card("Infantry", China));
		cardList.add(new Card("Infantry", EastAfrica));
		cardList.add(new Card("Artillery", EasternAustralia));
		cardList.add(new Card("Cavalry", Quebec));
		cardList.add(new Card("Infantry", Egypt));
		cardList.add(new Card("Artillery", EasternUnitedStates));
		cardList.add(new Card("Artillery", GreatBritain));
		cardList.add(new Card("Cavalry", Greenland));
		cardList.add(new Card("Infantry", Iceland));
		cardList.add(new Card("Cavalry", India));
		cardList.add(new Card("Artillery", Indonesia));
		cardList.add(new Card("Cavalry", Irkutsk));
		cardList.add(new Card("Artillery", Japan));
		cardList.add(new Card("Infantry", Kamchatka));
		cardList.add(new Card("Cavalry", Madagascar));
		cardList.add(new Card("Infantry", MiddleEast));
		cardList.add(new Card("Infantry", Mongolia));
		cardList.add(new Card("Infantry", NewGuinea));
		cardList.add(new Card("Cavalry", NorthAfrica));
		cardList.add(new Card("Artillery", NorthernEurope));
		cardList.add(new Card("Artillery", NorthwestTerritory));
		cardList.add(new Card("Cavalry", Ontario));
		cardList.add(new Card("Infantry", Peru));
		cardList.add(new Card("Cavalry", Ukraine));
		cardList.add(new Card("Cavalry", Scandinavia));
		cardList.add(new Card("Cavalry", Siberia));
		cardList.add(new Card("Artillery", SouthAfrica));
		cardList.add(new Card("Infantry", Siam));
		cardList.add(new Card("Artillery", SouthernEurope));
		cardList.add(new Card("Cavalry", Ural));
		cardList.add(new Card("Infantry", Venezuela));
		cardList.add(new Card("Artillery", WesternAustralia));
		cardList.add(new Card("Artillery", WesternEurope));
		cardList.add(new Card("Artillery", WesternUnitedStates));
		cardList.add(new Card("Cavalry", Yakutsk));
		
		
		///////////////////////////////////////////////////////////////////////////////////
		/////////
		///////// Done initializing everything
		/////////
		///////////////////////////////////////////////////////////////////////////////////
		
		
		
		
		
		
		//Everything has been initialized and now the game is ready to start
		Scanner sc = new Scanner(System.in); //Scanner to read players input.
		int numberOfPlayers; //Stores the total number of players
		int counter; //Helper variable for loops
		List<Player> playerList = new ArrayList<Player>(); //Array list with players name in turn order
		int totalNumberOfArmyPerPlayer = 0; //The number of armies per player decided by game rules and total players
		int numberOfTurnIns = 1;
		
		
		//Game starts and asks the amount of players
		System.out.println("Welcome to RISK!");
		System.out.println("How many players? (2, 3, 4, 5, or 6)");
		numberOfPlayers = askPlayerForInt(sc);
		while (numberOfPlayers < 2 || numberOfPlayers > 6) {
			System.out.println("Please input an appropiate number of players. (2, 3, 4, 5, or 6)");
			numberOfPlayers = askPlayerForInt(sc);
		}
		
		//start chatbot
		System.out.println("You are able to chat during the game. Number of players in chat is 3.");
		// Initialize Api Context
    	ApiContextInitializer.init();
    	
        // Instantiate Telegram Bots API
    	TelegramBotsApi botsApi = new TelegramBotsApi();
    	
        // Register our bot
    	try {
            botsApi.registerBot(new Bot());
            botsApi.registerBot(new botTwo());
            botsApi.registerBot(new botThree());
            //botsApi.registerBot(new botgroup());
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    
		
		
		
		//connect Twitter to game
		//TwitterRG newTwitterAcc = new TwitterRG();
		//newTwitterAcc.establishTwitterConnection(newTwitterAcc.getSecretData());
		
		
		
		//Sets the total number of armies available for each player according to numberOfPlayers
		//This numbers are set by the game rules
		switch(numberOfPlayers) {
	        case 2 :
	        	totalNumberOfArmyPerPlayer = 40;
	           break;
	        case 3 :
	        	totalNumberOfArmyPerPlayer = 35;
	        	break;
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
		
		//Asks the name of all players and creates Player instances for each
		System.out.println("Got it, " + numberOfPlayers + " players.");
		System.out.println("Everyone gets "+ totalNumberOfArmyPerPlayer + " armies.");
		System.out.println("Please provide player names in turn order.");
		String name;
		sc.reset();
		counter = 0;
		while (sc.hasNextLine()) {
			System.out.println("What's Player " + (counter+1) + "s name?");
			name = sc.next();
			playerList.add(new Player(name,totalNumberOfArmyPerPlayer));
			counter++;
			if (counter == numberOfPlayers) {
				break;
			}
		}		
		
		
		//The game starts for the players, as the rules dictate,
		//they place one army in open countries until they are all taken
		
		int indexHelper = 0;
		Country selectedCountry;
		
		System.out.println("Let's begin!");
		System.out.println("To start, all players most place one army in a country"
				+ "\nuntil the board is filled in turns.");
		for (int x=0 ; x < numberOfPlayers ; x++) {
			System.out.println("\n" + playerList.get(x).getName() + ", it's your turn!"
					+ " \nYou have " + playerList.get(x).getArmy() + " armies left.");
			System.out.println("\nCountries are: ");
			printCountries(NorthAmerica, SouthAmerica, Europe, Africa, Asia, Australia);
			System.out.println("\nType the country's name to place an army");
			while (true) {
				selectedCountry = askPlayerForCountry(sc, NorthAmerica, SouthAmerica, Europe, Africa, Asia, Australia);
				if (selectedCountry.hasPlayer() == false) {
					break;
				}
				if (selectedCountry.hasPlayer() == true) {
					System.out.println("That country already has an army, try again.");
				}
			}
			initialArmyPlacement(playerList.get(x), selectedCountry);
			if (allCountriesOwned(NorthAmerica, SouthAmerica, Europe, Africa, Asia, Australia) == true) {
				if (x == numberOfPlayers - 1) {
					indexHelper = 0;
				}
				else {
					indexHelper = x+1;
				}
				x = numberOfPlayers;
			}
			if (x == numberOfPlayers - 1) {
				x = -1;
			}
			
		}
		
		//Every country now had an army.
		//After all 42 territories are claimed, each player in turn places one additional 
		//army onto any territory he or she already occupies.
		
		System.out.println("\nAll countries now have an army. Place your remaining armies in countries you own.");
		for (int x=indexHelper ; x < numberOfPlayers ; x++) {
			System.out.println("\n" + playerList.get(x).getName() + ", it's your turn!"
					+ " \nYou have " + playerList.get(x).getArmy() + " armies left.");
			System.out.println("\nCountries are: ");
			printCountries(NorthAmerica, SouthAmerica, Europe, Africa, Asia, Australia);
			System.out.println("\nType the country's name to place an army");
			while (true) {
				selectedCountry = askPlayerForCountry(sc, NorthAmerica, SouthAmerica, Europe, Africa, Asia, Australia);
				if (selectedCountry.getOwner() == playerList.get(x)) {
					break;
				}
				if (selectedCountry.hasPlayer() == true) {
					System.out.println("That country is not yours, try again.");
				}
			}
			initialArmyPlacement(playerList.get(x), selectedCountry);
			if (playerList.get(numberOfPlayers-1).getArmy() == 0) {
				x = numberOfPlayers;
			}
			if (x == numberOfPlayers - 1) {
				x = -1;
			}
		}
		
		

		//All armies have been placed and its time to start the game
		
		//initialArmyPlacement(playerList.get(0) , Argentina); //testing lines
		//initialArmyPlacement(playerList.get(0) , Peru);
		//initialArmyPlacement(playerList.get(0) , Brazil);
		//initialArmyPlacement(playerList.get(0) , Venezuela);
		//initialArmyPlacement(playerList.get(1) , CentralAmerica);
		
		for (int x=0; x < 5; x++) {
			givePlayerRandomCard(playerList.get(0), cardList);
		}
		//playerList.get(0).decreaseArmy(36); // TESTING PURPOSES!!! THIS LINE TO BE ERASED LATER
		System.out.println(playerList.get(0).getArmy());
		
		System.out.println("\nTime to start the game!");
		
	

		//int playerIndex = 0;

		
		for (int x=indexHelper ; x < numberOfPlayers ; x++) {
			System.out.println("\n" + playerList.get(x).getName() + ", it's your turn!");
			
			//Set timer for player to have 30 second on each move. 
			Timer time = new Timer();
			
			time.schedule(new timeCheck(),0,30*1000);
			//playerIndex = x;
			
			//long start = System.currentTimeMillis();
			
			//while (System.currentTimeMillis() - start < 30) {
			
			//Credits
			System.out.println("Do you want to buy, use, or transfer credits?");
			boolean playerAnswer = askPlayerForYesOrNo(sc);
			if (playerAnswer) {
				creditStore(playerList.get(x), sc, playerList, cardList);
			}
			
			//Getting new armies
			int newArmiesFromCountriesAndContinents = getNewArmiesFromCountriesAndContinents(playerList.get(x),NorthAmerica, SouthAmerica, Europe, Africa, Asia, Australia);
			int newArmiesFromCards = getNewArmiesFromCards(playerList.get(x), sc, numberOfTurnIns);
			if (newArmiesFromCards > 0) {
				numberOfTurnIns++;
			}
			playerList.get(x).increaseArmy(newArmiesFromCountriesAndContinents + newArmiesFromCards);
			
			
			//Placing new armies
			while (playerList.get(x).getArmy() != 0) {
				System.out.println("\nYou have " + playerList.get(x).getArmy() + " armies to place.");
				System.out.println("\nCountries are: ");
				printCountries(NorthAmerica, SouthAmerica, Europe, Africa, Asia, Australia);
				System.out.println("\nType the country's name to place an army");
				while (true) {
					selectedCountry = askPlayerForCountry(sc, NorthAmerica, SouthAmerica, Europe, Africa, Asia, Australia);
					if (selectedCountry.getOwner() == playerList.get(x)) {
						break;
					}
					if (selectedCountry.hasPlayer() == true) {
						System.out.println("That country is not yours, try again.");
					}
				}
				initialArmyPlacement(playerList.get(x), selectedCountry);
			}
			System.out.println("You placed all your armies!");
			
			//Attacking
			System.out.println("Do you want to attack? (type Y or N)");
			playerAnswer = askPlayerForYesOrNo(sc);
			while (playerAnswer == true) {
				//Attack
				Player selectedPlayer = null;
				if (numberOfPlayers > 2) {
					System.out.println(playerList.get(x).getName() + " ,who would you like to attack?");
					while (true) {
						selectedPlayer = askPlayerForPlayer(sc , playerList);
						if (selectedPlayer != playerList.get(x) && playerCanAttackPlayer(playerList.get(x) , selectedPlayer)) {
							break;
						}
						if (playerCanAttackPlayer(playerList.get(x) , selectedPlayer) == false) {
							System.out.println("You can't attack " + selectedPlayer + " because there aren't adjacent countries. Try Again");
						}
						if (selectedPlayer == playerList.get(x)) {
							System.out.println("You can't attack yourself! Try again.");
						}
					} 
				}
				else {
					if (x == 0) {
						selectedPlayer = playerList.get(1);
					}
					else {
						selectedPlayer = playerList.get(0);
					}
				}
				attack(playerList.get(x), selectedPlayer, sc, NorthAmerica, SouthAmerica, Europe, Africa, Asia, Australia);
				System.out.println(playerList.get(x).getName() + " ,who would you like to attack again?");
				playerAnswer = askPlayerForYesOrNo(sc);
			}
			
			//Fortifying
			System.out.println("Do you want to fortify? (type Y or N)");
			playerAnswer = askPlayerForYesOrNo(sc);
			if (playerAnswer == true) {
				//Fortify
			}
			
			if (playerList.get(x).getCountries().size() == 42) {
				x = numberOfPlayers;
				System.out.println("Congratulations " + playerList.get(x).getName() + ", you won the game!");
			}
			if (x == numberOfPlayers - 1) {
				x = -1;
			}
			//post a Tweet after every turn
			//newTwitterAcc.updateTweet(playerList.get(x).getName() + " now has " + playerList.get(x).numOfCountriesHeld() + " territories!"); 
		}
		//}
		
		
		//post a Tweet at the end of the game
		/*for(int u=0;u < numberOfPlayers ; u=u+1){
			newTwitterAcc.updateTweet(playerList.get(u).getName() + " had " + playerList.get(u).numOfCountriesHeld() + " territories at the end of the game!"); 
		}*/
		
		/////
		sc.close();
	}
	
		static class timeCheck extends TimerTask{
			boolean timecheck;
			
			public timeCheck() {
				
			}
			public void run() {
				if(timecheck == true) {
					System.out.println("Time's Up! ");
					//player end
					cancel();
				}
			}
		}
	
	public static void creditStore (Player player, Scanner sc, List<Player> playerList, List<Card> cardList) {

		System.out.println("What would you like to do? (Buy, Use, Transfer)");
		while (true) {
			String playerAnswerForCredits = sc.nextLine();
			if (playerAnswerForCredits.toLowerCase() == "buy") {
				System.out.println("How many credits would you like to buy?");
				int creditsToBuy = askPlayerForInt(sc);
				player.addCredits(creditsToBuy);
				System.out.println("Your new credit total is " + player.getCredits() + ".");
				break;
			}
			else if (playerAnswerForCredits.toLowerCase() == "use") {
				System.out.println("What would you like to buy? (undo,card)");
				while (true) {
					String itemToBuy = sc.nextLine();
					if (itemToBuy.toLowerCase() == "undo") {
						player.addUndo();
						System.out.println("Your new undio total is " + player.getUndo() + ".");
						break;
					}
					if (itemToBuy.toLowerCase() == "card") {
						givePlayerRandomCard(player, cardList);
						System.out.println("You got your new card.");
						break;
					}
				}
			}
			else if (playerAnswerForCredits.toLowerCase() == "transfer") {
				System.out.println("Who would you like to give credits to?");
				while (true) {
					Player playerToTransfer = askPlayerForPlayer(sc, playerList);
					if (playerToTransfer == player) {
						System.out.println("You can't transfer to yoursef, try again.");
					}
					else {
						System.out.println("How many credits would you like to transfer?");
						while (true) {
							int creditsToTransfer = askPlayerForInt(sc);
							if (creditsToTransfer <= player.getCredits()) {
								player.removeCredits(creditsToTransfer);
								playerToTransfer.addCredits(creditsToTransfer);
								break;
							}
							else {
								System.out.println("You dont have that many credits, try again.");
							}
						}
						break;
					}
				}
			}
			else {
				System.out.println("Invalid input, try again.");
			}
		}
	
	}

	public static void attack (Player attackingPlayer, Player attackedPlayer, Scanner input, Continent continent1, Continent continent2, Continent continent3, 
			Continent continent4, Continent continent5, Continent continent6) {
		Country attackingCountry;
		Country attackedCountry;
		System.out.println(attackedPlayer.getName() + ", you're being attacketd!");
		System.out.println(attackingPlayer.getName() + ", From which country are you attaking?");
		while (true) {
			attackingCountry = askPlayerForCountry(input, continent1, continent2, continent3, 
					continent4, continent5, continent6);
			
		}		
	}
	
	public static boolean playerCanAttackPlayer(Player attackingPlayer, Player attackedPlayer) {
		for (int x=0 ; x < attackingPlayer.getCountries().size() ; x++ ) {
			for(int y = 0 ; y < attackingPlayer.getCountries().get(x).getAdjacentCountries().size() ; y++) {
				if (attackedPlayer.getCountries().contains(attackingPlayer.getCountries().get(x).getAdjacentCountries().get(y)) 
						&& attackingPlayer.getCountries().get(x).getArmy() > 1) {
					return true;
				}
			}
		}
		return false;
	}
	
	public static Player askPlayerForPlayer (Scanner input, List<Player> playerList) {
		Player player = null;
		boolean hasReturned = false;
		while (true) {
			input.reset();
			String line = input.nextLine();
			for (int x=0 ; x < playerList.size() ; x++) {
				if (line.toLowerCase().equals(playerList.get(x).getName().toLowerCase())) {
					player = playerList.get(x);
					hasReturned = true;
					return player;
				}
			}
			if (!hasReturned) {
				System.out.println("Invalid input, please try again");
			}
		}
	}
	
	public static int getNewArmiesFromCards(Player player, Scanner scanner, int numberOfTurnIns) {
		
		boolean hasWildCard = false;
		int infantry = 0;
		int cavalry = 0;
		int artillery = 0;
		boolean playerAnswer = false;
		int total = 0;
		
		
		if (player.getCards().size() < 3) {
			System.out.println("You dont have cards to turn in.");
		}
		else {
			for (int x=0 ; x < player.getCards().size() ; x++) {
				if (player.getCards().get(x).getType() == "Infantry") {
					infantry++;
				}
				if (player.getCards().get(x).getType() == "Cavalry") {
					cavalry++;
				}
				if (player.getCards().get(x).getType() == "Artillery") {
					artillery++;
				}
				if (player.getCards().get(x).getType() == "Wild Card") {
					hasWildCard = true;
				}
			}
			if ((infantry >= 3 || cavalry >= 3 || artillery >= 3) || (infantry >= 1 && cavalry >= 1 && artillery >= 1) || hasWildCard ) {
				if (player.getCards().size() > 4) {
					System.out.println("You have to turn cards in.");
				}
				if (player.getCards().size() < 5) {
					System.out.println("Would you like to turn cards in? (type Y or N)");
					playerAnswer = askPlayerForYesOrNo(scanner);
				}
				if ((playerAnswer == true) || (player.getCards().size() > 4)) {
					System.out.println("These are the cards you have:");
					for (int x = 0 ; x < player.getCards().size() ; x++) {
						if (player.getCountries().contains(player.getCards().get(x).getCountry())) {
							System.out.println((x+1) + " " + player.getCards().get(x).getType() + " - " 
									+ player.getCards().get(x).getCountry().getName() + " (You own this country)");
						}
						else if (player.getCards().get(x).getType() == "Wild Card") {
							System.out.println((x+1) + " Wild Card");
						}
						else {
							System.out.println((x+1) + " " + player.getCards().get(x).getType() + " - " + player.getCards().get(x).getCountry().getName());
						}
						
					}
					int[] selectedCards = new int[3];
					boolean appropriateSelection = false;
					System.out.println("Which cards would you like to turn in?\n(Input each card number individually)");
					for (int x=0 ; x < selectedCards.length ; x++) {
						selectedCards[x] = askPlayerForInt(scanner);
						while (selectedCards[x] < 0 || selectedCards[x] > player.getCards().size() || intIsInArray(selectedCards, selectedCards[x], x)) {
							System.out.println("Please input an appropiate number.");
							selectedCards[x] = askPlayerForInt(scanner);
						}
					}
					
					if (hasCombinationOfCardsToTurnIn(selectedCards, player)) {
						appropriateSelection = true;
					}
					
					while (!appropriateSelection) {
						System.out.println("That combination of cards cannot be turned in, try again");
						for (int x=0 ; x < selectedCards.length ; x++) {
							selectedCards[x]=0;
						}
						for (int x=0 ; x < selectedCards.length ; x++) {
							selectedCards[x] = askPlayerForInt(scanner);
							while (selectedCards[x] < 0 || selectedCards[x] > player.getCards().size() || intIsInArray(selectedCards, selectedCards[x], x)) {
								System.out.println("Please input an appropiate number.");
								selectedCards[x] = askPlayerForInt(scanner);
							}
						}
						if (hasCombinationOfCardsToTurnIn(selectedCards, player)) {
							appropriateSelection = true;
						}
					}
					
					if (numberOfTurnIns < 6) {
						total = (2+(2*numberOfTurnIns));
						System.out.println("You got " + total + " cards from cards.");
					}
					
					if (numberOfTurnIns > 5) {
						total = (15+(5*(numberOfTurnIns-6)));
					}
					if (ownedCountryMatchesCard(selectedCards, player)) {
						total = total+2;
						System.out.println("And 2 extra cards from a matched country.");
					}
					
					Arrays.sort(selectedCards);
					
					
					
					for (int x=(selectedCards.length-1) ; x > -1 ; x--) {
						player.getCards().remove(selectedCards[x]-1);
					}
					
					return total;
				}
			}
			else {
				System.out.println("You dont have cards to turn in.");
			}
		}
		return 0;
	}
	
	public static boolean ownedCountryMatchesCard(int[] array , Player player) {
		for (int x=0 ; x < array.length ; x++) {
			if (player.getCountries().contains(player.getCards().get(array[x]-1).getCountry())) {
				return true;
			}
		}
		return false;
	}
	
	public static boolean hasCombinationOfCardsToTurnIn(int[] array , Player player) {
		boolean hasWildCard = false;
		int infantry = 0;
		int cavalry = 0;
		int artillery = 0;
		
		for (int x=0 ; x < array.length ; x++) {
			if (player.getCards().get(array[x]-1).getType() == "Infantry") {
				infantry++;
			}
			if (player.getCards().get(array[x]-1).getType() == "Cavalry") {
				cavalry++;
			}
			if (player.getCards().get(array[x]-1).getType() == "Artillery") {
				artillery++;
			}
			if (player.getCards().get(array[x]-1).getType() == "Wild Card") {
				hasWildCard = true;
			}
		}
		if ((infantry >= 3 || cavalry >= 3 || artillery >= 3) || (infantry >= 1 && cavalry >= 1 && artillery >= 1) || hasWildCard ) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean intIsInArray(int[] array, int number, int index) {
		for (int x=0 ; x < array.length ; x++) {
			if (number == array[x] && index != x) {
				return true;
			}
		}
		return false;
	}
	
	public static boolean askPlayerForYesOrNo(Scanner input) {
		boolean firstTime = true;

		while (true) {
			input.reset();

			String line = input.nextLine();
			
			if (line.toLowerCase().equals("y")) {
				return true;
			}
			
			if (line.toLowerCase().equals("n")) {
				return false;
			}
			if (firstTime == false) {
				System.out.println("Invalid input, please try again");
			}
			firstTime = false;
		}
	}
	

	
	
	public static void givePlayerRandomCard(Player player, List<Card> list) {
		if(list.size() != 0) {
			int r = (int) (Math.random() * list.size());
			player.addCard(list.get(r));
			list.remove(r);
		}
	}
	
	public static int getNewArmiesFromCountriesAndContinents(Player player, Continent continent1, Continent continent2, Continent continent3, 
			Continent continent4, Continent continent5, Continent continent6) {
		int total = 0;
		
		total = player.getCountries().size()/3;
		System.out.println("You got " + total + " armies from countries owned.");
		
		boolean continentOwned = true;
		for (int x=0 ; x < continent1.getCountries().size() ; x++) {
			if (continent1.getCountries().get(x).getOwner() != player) {
				continentOwned = false;
			}
		}
		if (continentOwned == true) {
			total = total + 5;
			System.out.println("You got 5 from owning North America.");
		}
		continentOwned = true;
		for (int x=0 ; x < continent2.getCountries().size() ; x++) {
			if (!(continent2.getCountries().get(x).getOwner() == player)) {
				continentOwned = false;
			}
		}
		if (continentOwned == true) {
			total = total + 2;
			System.out.println("You got 2 from owning South America.");
		}
		continentOwned = true;
		for (int x=0 ; x < continent3.getCountries().size() ; x++) {
			if (!(continent3.getCountries().get(x).getOwner() == player)) {
				continentOwned = false;
			}
		}
		if (continentOwned == true) {
			total = total + 5;
			System.out.println("You got 5 from owning Europe.");
		}
		continentOwned = true;
		for (int x=0 ; x < continent4.getCountries().size() ; x++) {
			if (!(continent4.getCountries().get(x).getOwner() == player)) {
				continentOwned = false;
			}
		}
		if (continentOwned == true) {
			total = total + 3;
			System.out.println("You got 3 from owning Africa");
		}
		continentOwned = true;
		for (int x=0 ; x < continent5.getCountries().size() ; x++) {
			if (!(continent5.getCountries().get(x).getOwner() == player)) {
				continentOwned = false;
			}
		}
		if (continentOwned == true) {
			total = total + 7;
			System.out.println("You got 7 from owning Asia.");
		}
		continentOwned = true;
		for (int x=0 ; x < continent6.getCountries().size() ; x++) {
			if (!(continent6.getCountries().get(x).getOwner() == player)) {
				continentOwned = false;
			}
		}
		if (continentOwned == true) {
			total = total + 2;
			System.out.println("You got 2 from owning Australia.");
		}
		
		return total;
	}
	
	public static boolean allCountriesOwned (Continent continent1, Continent continent2, Continent continent3, 
			Continent continent4, Continent continent5, Continent continent6) {
		boolean allOwned = true;
		for (int x=0 ; x < continent1.getCountries().size() ; x++) {
			if (!continent1.getCountries().get(x).hasPlayer()) {
				allOwned = false;
			}
		}
		for (int x=0 ; x < continent2.getCountries().size() ; x++) {
			if (!continent2.getCountries().get(x).hasPlayer()) {
				allOwned = false;
			}
		}
		for (int x=0 ; x < continent3.getCountries().size() ; x++) {
			if (!continent3.getCountries().get(x).hasPlayer()) {
				allOwned = false;
			}
		}
		for (int x=0 ; x < continent4.getCountries().size() ; x++) {
			if (!continent4.getCountries().get(x).hasPlayer()) {
				allOwned = false;
			}
		}
		for (int x=0 ; x < continent5.getCountries().size() ; x++) {
			if (!continent5.getCountries().get(x).hasPlayer()) {
				allOwned = false;
			}
		}
		for (int x=0 ; x < continent6.getCountries().size() ; x++) {
			if (!continent6.getCountries().get(x).hasPlayer()) {
				allOwned = false;
			}
		}
		return allOwned;
	}
	
	
	public static int askPlayerForInt(Scanner input) {
		input.reset();
		while(!input.hasNextInt()) {
		    input.next();
		    System.out.println("Invalid input, please try again");
		}
		int number = input.nextInt();
		return number;
	}
	
	public static Country askPlayerForCountry (Scanner input, Continent continent1, Continent continent2, Continent continent3, 
			Continent continent4, Continent continent5, Continent continent6) {
		Country country = null;
		boolean firstTime = true;
		while (true) {
			input.reset();
			String line = input.nextLine();
			for (int x=0 ; x < continent1.getCountries().size() ; x++) {
				if (line.toLowerCase().equals(continent1.getCountries().get(x).getName().toLowerCase())) {
					country = continent1.getCountries().get(x);
					return country;
				}
			}
			for (int x=0 ; x < continent2.getCountries().size() ; x++) {
				if (line.toLowerCase().equals(continent2.getCountries().get(x).getName().toLowerCase())) {
					country = continent2.getCountries().get(x);
					return country;
				}
			}
			for (int x=0 ; x < continent3.getCountries().size() ; x++) {
				if (line.toLowerCase().equals(continent3.getCountries().get(x).getName().toLowerCase())) {
					country = continent3.getCountries().get(x);
					return country;
				}
			}
			for (int x=0 ; x < continent4.getCountries().size() ; x++) {
				if (line.toLowerCase().equals(continent4.getCountries().get(x).getName().toLowerCase())) {
					country = continent4.getCountries().get(x);
					return country;
				}
			}
			for (int x=0 ; x < continent5.getCountries().size() ; x++) {
				if (line.toLowerCase().equals(continent5.getCountries().get(x).getName().toLowerCase())) {
					country = continent5.getCountries().get(x);
					return country;
				}
			}
			for (int x=0 ; x < continent6.getCountries().size() ; x++) {
				if (line.toLowerCase().equals(continent6.getCountries().get(x).getName().toLowerCase())) {
					country = continent6.getCountries().get(x);
					return country;
				}
			}
			if (firstTime == false) {
				System.out.println("Invalid input, please try again");
			}
			firstTime = false;
		}
	}
	
	public static void initialArmyPlacement(Player name, Country country) {
		name.decreaseArmy(1);
		name.addCountry(country);
		country.setOwner(name);
		country.increaseArmy(1);
	}
	
	public static void printCountries(Continent continent1, Continent continent2, Continent continent3, 
			Continent continent4, Continent continent5, Continent continent6) {
		
		System.out.println("\nNorth America:");
		for (int x=0 ; x < continent1.getCountries().size() ; x++) {
			if (continent1.getCountries().get(x).hasPlayer() == false) {
				System.out.println(continent1.getCountries().get(x).getName() + "- Unowned");
			}
			if (continent1.getCountries().get(x).hasPlayer() == true) {
				System.out.println(continent1.getCountries().get(x).getName() + 
						" -Owned by " + continent1.getCountries().get(x).getOwner().getName()
						+ " with " + continent1.getCountries().get(x).getArmy() + " armies");
			}
		}
		System.out.println("SouthAmerica:");
		for (int x=0 ; x < continent2.getCountries().size() ; x++) {
			if (continent2.getCountries().get(x).hasPlayer() == false) {
				System.out.println(continent2.getCountries().get(x).getName() + "- Unowned");
			}
			if (continent2.getCountries().get(x).hasPlayer() == true) {
				System.out.println(continent2.getCountries().get(x).getName() + 
						" -Owned by " + continent2.getCountries().get(x).getOwner().getName()
						+ " with " + continent2.getCountries().get(x).getArmy() + " armies");
			}
		}
		System.out.println("Europe:");
		for (int x=0 ; x < continent3.getCountries().size() ; x++) {
			if (continent3.getCountries().get(x).hasPlayer() == false) {
				System.out.println(continent3.getCountries().get(x).getName() + "- Unowned");
			}
			if (continent3.getCountries().get(x).hasPlayer() == true) {
				System.out.println(continent3.getCountries().get(x).getName() + 
						" -Owned by " + continent3.getCountries().get(x).getOwner().getName()
						+ " with " + continent3.getCountries().get(x).getArmy() + " armies");
			}
		}
		System.out.println("Africa:");
		for (int x=0 ; x < continent4.getCountries().size() ; x++) {
			if (continent4.getCountries().get(x).hasPlayer() == false) {
				System.out.println(continent4.getCountries().get(x).getName() + "- Unowned");
			}
			if (continent4.getCountries().get(x).hasPlayer() == true) {
				System.out.println(continent4.getCountries().get(x).getName() + 
						" -Owned by " + continent4.getCountries().get(x).getOwner().getName()
						+ " with " + continent4.getCountries().get(x).getArmy() + " armies");
			}
		}
		System.out.println("Asia:");
		for (int x=0 ; x < continent5.getCountries().size() ; x++) {
			if (continent5.getCountries().get(x).hasPlayer() == false) {
				System.out.println(continent5.getCountries().get(x).getName() + "- Unowned");
			}
			if (continent5.getCountries().get(x).hasPlayer() == true) {
				System.out.println(continent5.getCountries().get(x).getName() + 
						" -Owned by " + continent5.getCountries().get(x).getOwner().getName()
						+ " with " + continent5.getCountries().get(x).getArmy() + " armies");
			}
		}
		System.out.println("Australia:");
		for (int x=0 ; x < continent6.getCountries().size() ; x++) {
			if (continent6.getCountries().get(x).hasPlayer() == false) {
				System.out.println(continent6.getCountries().get(x).getName() + "- Unowned");
			}
			if (continent6.getCountries().get(x).hasPlayer() == true) {
				System.out.println(continent6.getCountries().get(x).getName() + 
						" -Owned by " + continent6.getCountries().get(x).getOwner().getName()
						+ " with " + continent6.getCountries().get(x).getArmy() + " armies");
			}
		}
		
	}
	
}
