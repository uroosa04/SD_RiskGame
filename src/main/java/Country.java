import java.util.ArrayList;

public class Country {
	private String name;
	private int armyNumber;
	private ArrayList<Country> adjacentCountries;
	private boolean hasPlayer;
	private Player owner;
	
	public Country(String name) {
		this.name = name;
		hasPlayer = false;
		armyNumber = 0;
	}
	
	public String getName() {
		return name;
	}
	
	public boolean hasPlayer() {
		return hasPlayer;
	}
	
	public void setOwner (Player owner) {
		hasPlayer = true;
		this.owner = owner;
	}
	
	public Player getOwner() {
		return owner;
	}
	
	public void setAdjacent (ArrayList<Country> adjacentCountries) {
		this.adjacentCountries = adjacentCountries;
	}
	
	public ArrayList<Country> getAdjacentCountries() {
		return adjacentCountries;
	}
	
	public void setArmyNumber (int armyNumber) {
		this.armyNumber = armyNumber;
	}
	
	public void increaseArmy (int armyChange) {
		armyNumber = armyNumber + armyChange;
	}
	
	public void decreaseArmy (int armyChange) {
		armyNumber = armyNumber - armyChange;
	}
	
	public int getArmy() {
		return armyNumber;
	}
}
