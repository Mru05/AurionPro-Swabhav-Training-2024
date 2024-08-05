package homework2.iterative.loops;

import java.util.Random;
import java.util.Scanner;

public class NumberGuesser {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain;

        do {
            int numberToGuess = random.nextInt(100) + 1;
            int numberOfTries = 0;
            int maxAttempts = 50;
            boolean hasGuessedCorrectly = false;

            System.out.println("Welcome to the Number Guesser Game!");
            System.out.println("I have selected a number between 1 and 100. Try to guess it!");

            do {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                numberOfTries++;

                if (userGuess < numberToGuess) {
                    System.out.println("Sorry, too low.");
                } else if (userGuess > numberToGuess) {
                    System.out.println("Sorry, too high.");
                } else {
                    System.out.println("Congratulations! You've guessed the number.");
                    System.out.println("It took you " + numberOfTries + " tries.");
                    hasGuessedCorrectly = true;
                }

                int attemptsLeft = maxAttempts - numberOfTries;
                System.out.println("You have " + attemptsLeft + " attempts left.");

                if (numberOfTries >= maxAttempts) {
                    System.out.println("You've reached the maximum number of attempts (50). The correct number was " + numberToGuess + ".");
                    break;
                }
            } while (!hasGuessedCorrectly);

            System.out.print("Do you want to play again? ");
            System.out.println("1. Yes");
            System.out.println("2. No");
            int userResponse = scanner.nextInt();
            
            switch (userResponse) {
                case 1:
                    playAgain = true;
                    break;
                case 2:
                    playAgain = false;
                    break;
                default:
                    System.out.println("Invalid input. Exiting the game.");
                    playAgain = false;
                    break;
            }
        } while (playAgain);

        System.out.println("Thank you for playing! Goodbye.");
        scanner.close();
    }
}
