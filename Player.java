import java.util.ArrayList;

public class Player {
	private String name;
	private int army;
	private ArrayList<Country> countriesHeld = new ArrayList<Country>();
	
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
}
