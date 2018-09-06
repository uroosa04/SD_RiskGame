
public class Card {
	private String type;
	private Country country;
	
	public Card(String type, Country country) {
		this.type = type;
		this.country = country;
	}
	
	public Country getCountry() {
		return country;
	}
	
	public String getType() {
		return type;
	}
}