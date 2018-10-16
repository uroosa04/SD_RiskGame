import java.util.ArrayList;

public class Player {
	private String name;
	private int army;
	private ArrayList<Country> countriesHeld = new ArrayList<Country>();
	private ArrayList<Card> cardsHeld = new ArrayList<Card>();
	private int credits;
	private int undo;
	
	public Player(String name, int army) {
		this.name = name;
		this.army = army;
		this.credits = 0;
		this.undo = 0;
	}
	
	public String getName() {
		return name;
	}
	
	public void decreaseArmy(int armyChange) {
		army = army - armyChange;
	}
	
	public void increaseArmy(int armyChange) {
		army = army + armyChange;
	}
	
	public void addCountry(Country country) {
		countriesHeld.add(country);
	}
	
	public void subtractCountry(Country country) {
		countriesHeld.remove(country);
	}
	
	public int getArmy() {
		return army;
	}
	
	public ArrayList<Country> getCountries(){
		return countriesHeld;
	}
	
	public void addCard(Card card) {
		cardsHeld.add(card);
	}
	
	public void subractCard(Card card) {
		cardsHeld.remove(card);
	}
	
	public ArrayList<Card> getCards(){
		return cardsHeld;
	}
	public void addCredits(int creditsToAdd) {
		credits = credits + creditsToAdd;
	}
	public void removeCredits(int creditsToRemove) {
		credits = credits - creditsToRemove;
	}
	public int getCredits() {
		return credits;
	}
	public void addUndo() {
		undo++;
	}
	public void removeUndo() {
		undo--;
	}
	public int getUndo() {
		return undo;
	}
}
