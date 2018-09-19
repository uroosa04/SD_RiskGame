
public class Card {
	
	//Game Rules regarding cards:
	//
	//44 Cards total.
	//42 Cards with a territory and a type.
	//2 Wild cards with no country and all three types.
	//
	//At the end of any turn in which you have captured at least one territory, 
	//you will earn one (and only one) RISK card.
	//
	//You are trying to collect sets of 3 cards in any of the following combinations: 
	//     3 cards of the same type
	//     1 of each type
	//     Or any 2 plus a "wild" card
	//
	//If you have collected a set of 3 RISK cards, 
	//you may turn them in at the start of your next turn, or you may wait. 
	//But if you have 5 or 6 cards at the beginning of your turn, 
	//you must trade in at least one set and may trade in a second set if you have one.
	//
	//At the beginning of subsequent turns, 
	//you may trade in matched sets of cards and take additional armies 
	//based on the total number of sets anyone has traded in so far.
	
	private String type; // This is type of card (Infantry, Cavalry, or Artillery).
	private Country country; // One card per country.
	
	public Card(String type, Country country) {
		this.type = type;
		this.country = country;
	}
	
	public Country getCountry() {
		return country;
	}
	
	public int getType() {
		return army;
	}
}