package homework2.iterative.loops;

import java.util.Random;
import java.util.Scanner;

public class WordGuesser {

    public static void main(String[] args) {
        String[] words = {"java", "mrunalini","smoky", "sanjay", "shalini"};
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        String wordToGuess = words[random.nextInt(words.length)];
        char[] guessedLetters = new char[wordToGuess.length()];
        for (int i = 0; i < guessedLetters.length; i++) {
            guessedLetters[i] = '_';
        }

        int attempts = wordToGuess.length() + 3;

        while (attempts > 0 && new String(guessedLetters).contains("_")) {
            System.out.println("Word: " + new String(guessedLetters));
            System.out.println("Attempts left: " + attempts);
            System.out.print("Guess a letter: ");
            char letter = scanner.nextLine().toLowerCase().charAt(0);

            boolean found = false;
            for (int i = 0; i < wordToGuess.length(); i++) {
                if (wordToGuess.charAt(i) == letter) {
                    guessedLetters[i] = letter;
                    found = true;
                }
            }

            if (!found) {
                attempts--;
                System.out.println("Incorrect guess.");
            }
        }

        if (attempts == 0) {
            System.out.println("You lost! The word was: " + wordToGuess);
        } else {
            System.out.println("You guessed the word: " + wordToGuess);
        }

        scanner.close();
    }
}