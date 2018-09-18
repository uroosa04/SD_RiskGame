
public class Card {
	private int army;
	private Country country;
	
	public Card(int army, String string) {
		this.army = army;
		this.country = string;
	}
	
	public Country getCountry() {
		return country;
	}
	
	public int getType() {
		return army;
	}
}