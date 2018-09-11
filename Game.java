import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numberOfPlayers;
		
		System.out.println("Welcome to RISK!");
		System.out.println("How many players? (2, 3, 4, 5, or 6)");
		numberOfPlayers = sc.nextInt();
		while (numberOfPlayers != 2 && numberOfPlayers != 3) {
			System.out.println("Please input an appropiate number of players. (2, 3, 4, 5, or 6)");
			numberOfPlayers = sc.nextInt();
		}
		
		System.out.println("Got it, " + numberOfPlayers + " players.");
		
		System.out.println("What is Player 1's name?");
		
		
		InitializeBoard Risk = new InitializeBoard();
		
		Risk.initialize();
	}
}
