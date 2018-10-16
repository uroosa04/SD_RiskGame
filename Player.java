import java.util.ArrayList;

public class Player {
	private String name;
	private int army;
	private ArrayList<Country> countriesHeld = new ArrayList<Country>();
	private ArrayList<Card> cardsHeld = new ArrayList<Card>();
	private int credits;
	
	public Player(String name, int army) {
		this.name = name;
		this.army = army;
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
}
