import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {

		int secretNumber;
		int userGuess;
		int guessCount = 0;
		boolean correct = false;
		int maxNumber = 1000;
		int minNumber = 1;
		
		
		Scanner keyboard = new Scanner(System.in);
		Random randomNumber = new Random();
		secretNumber = minNumber + randomNumber.nextInt(maxNumber);
		
		while (!correct) {
			
			System.out.print("Guess what number I'm thinking: ");
			userGuess = keyboard.nextInt();
			
			if (userGuess == secretNumber) {
				correct = true;
				System.out.println("You are correct!");
				System.out.println("It took you " + guessCount + " tries!");
			}
			else if (userGuess < secretNumber) {
				System.out.println("The secret number is higher than this guess");
				guessCount++;
			}
			else if (userGuess > secretNumber) {
				System.out.println("The secret number is lower than this guess");
				guessCount++;
			}
			
		}

	}

}
