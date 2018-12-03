package RSG;
import java.util.Random;

public class Dice {
	private Random rand;
	private int outcome = 1;
	
	public Dice() {
		roll();
	}

	public void roll() {
		rand = new Random();
		outcome = rand.nextInt(6) + 1;
	}
	public int getDice() {

		return outcome;
	}

	public void SetDice(int num) {
		this.outcome = num;
	}
}
