package homework2.iterative.loops;
import java.util.Random;
import java.util.Scanner;

public class PigGame {

    public static void main(String[] args) {
        new PigGame().start();
    }

    private final Scanner scanner = new Scanner(System.in);
    private final Random random = new Random();
    private int totalScore = 0;
    private int turnScore = 0;
    private int turnCount = 0; 
    private boolean continuePlaying = true;

    public void start() {
        System.out.println("Welcome to the Pig Game!");

        while (totalScore < 20 && continuePlaying) {
            playTurn();
        }

        scanner.close(); 
    }

    private void playTurn() {
        turnCount++; 
        System.out.println("Turn " + turnCount + ": Wait a moment, the dice is rolling...");
        int roll = rollDice();
        System.out.println("...And the number you rolled is: " + roll);

        if (roll == 1) {
            handleRollOne();
        } else {
            handleRollOther(roll);
        }
    }

    private int rollDice() {
        return random.nextInt(6) + 1;
    }

    private void handleRollOne() {
        System.out.println("OOPS!! You rolled a 1, your turn score is reset to zero.");
        turnScore = 0;
    }

    private void handleRollOther(int roll) {
        turnScore += roll;
        System.out.println("Your turn score is: " + turnScore);
        System.out.println("Choose from the options below:");
        System.out.println("Do you want to hold or roll again? (h/r)");
        char option = scanner.next().charAt(0);

        if (option == 'h') {
            hold();
        } else if (option == 'r') {
            System.out.println("Thank you for playing");
        }
    }

    private void hold() {
        totalScore += turnScore;
        System.out.println("Your total score is: " + totalScore);
        turnScore = 0;

        if (totalScore >= 20) {
            System.out.println("Yay, you won!");
            System.out.println("It took you " + turnCount + " turns to win.");
            continuePlaying = false;
        }
    }
}
