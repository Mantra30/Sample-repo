import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int numberToGuess = rand.nextInt(100) + 1;  // random number 1-100
        int numberOfTries = 0;
        int guess = 0;
        boolean hasWon = false;

        System.out.println("Welcome to Guess the Number!");
        System.out.println("I'm thinking of a number between 1 and 100.");

        while (!hasWon) {
            System.out.print("Enter your guess: ");
            if (input.hasNextInt()) {
                guess = input.nextInt();
                numberOfTries++;

                if (guess < 1 || guess > 100) {
                    System.out.println("Please guess a number between 1 and 100.");
                } else if (guess < numberToGuess) {
                    System.out.println("Too low! Try again.");
                } else if (guess > numberToGuess) {
                    System.out.println("Too high! Try again.");
                } else {
                    hasWon = true;
                    System.out.println("Correct! You guessed the number in " + numberOfTries + " tries.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                input.next(); // clear invalid input
            }
        }

        input.close();
        System.out.println("Thanks for playing!");
    }
}
