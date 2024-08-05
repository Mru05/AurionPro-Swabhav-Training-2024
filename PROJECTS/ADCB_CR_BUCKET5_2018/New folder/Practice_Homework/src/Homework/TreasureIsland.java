package Homework;

import java.util.Scanner;

public class TreasureIsland {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Welcome to Treasure Island! Hope you will have fun.");
        System.out.println("Please choose any option below:");
        System.out.println("1 : Go left");
        System.out.println("2 : Go right");
        int number = scn.nextInt();
        switch (number) {
            case 1: {
                System.out.println("Yay!");
                System.out.println("Please choose another option:");
                System.out.println("1 : Swim");
                System.out.println("2 : Wait");
                int number2 = scn.nextInt();
                switch (number2) {
                    case 1: {
                        System.out.println("OOPS!! You were attacked by trout. Game over. Try again!");
                        break;
                    }
                    case 2: {
                        System.out.println("Yay! You waited.");
                        System.out.println("Please choose any door:");
                        System.out.println("1: Red");
                        System.out.println("2: Yellow");
                        System.out.println("3: Blue");
                        int number3 = scn.nextInt();
                        switch (number3) {
                            case 1: {
                                System.out.println("OOPS!! You were burned by fire. Game over. Try again!");
                                break;
                            }
                            case 2: {
                                System.out.println("Yay! You found the treasure. Congratulations!");
                                break;
                            }
                            case 3: {
                                System.out.println("OOPS!! You were eaten by beasts. Game over. Try again!");
                                break;
                            }
                            default: {
                                System.out.println("OOPS!! Game over. Try again!");
                                break;
                            }
                        }
                        break;
                    }
                    default: {
                        System.out.println("OOPS!! Game over. Try again!");
                        break;
                    }
                }
                break;
            }
            case 2: {
                System.out.println("OOPS!! You fell into a hole. Game over. Try again!");
                break;
            }
            default: {
                System.out.println("OOPS!! Game over. Try again!");
                break;
            }
        }
        scn.close();
    }
}
