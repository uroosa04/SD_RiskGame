import java.util.Random;

public class Dice {
	private Random rand;
	private int outcome;
	
	public Dice() {
		roll();
	}
	public void roll() {
		outcome = rand.nextInt(5) + 1;
	}
	public int getDice() {
		return outcome;
	}
}
