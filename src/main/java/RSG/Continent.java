package RSG;

import java.util.ArrayList;

public class Continent {
	private String name;
	private int continentalArmy;
	private ArrayList<Country> countries;

	public Continent(String name, int continentalArmies, ArrayList<Country> countries) {
		this.name = name;
		this.continentalArmy = continentalArmies;
		this.countries = countries;
    }
	
	public String getName() {
		return name;
	}
	
	public int getContinentalArmy() {
		return continentalArmy;
	}
	
	public ArrayList<Country> getCountries(){
		return countries;
	}
}
