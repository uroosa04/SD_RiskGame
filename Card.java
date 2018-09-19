
public class Card {
	private int army;
	private Country country;
	
	public Card(int army, Country country) {
		this.army = army;
		this.country = country;
	}
	
	public Country getCountry() {
		return country;
	}
	
	public int getType() {
		return army;
	}
}