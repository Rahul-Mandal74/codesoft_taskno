import java.util.Random;
import java.util.Scanner;

public class Number_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int maxChances = 8;
        int chance = 0;
        int totalScore = 0;
        boolean playAgain = true;

        System.out.println("Welcome To The Number Guessing Game!");
        System.out.println("Guess the number between 1 and 100. You have " + maxChances + " chances.");

        while (playAgain) {
            int numberToGuess = rand.nextInt(100) + 1;
            boolean guess = false;

            for (int i = 0; i < maxChances; i++) {
                System.out.print("chance " + (i + 1) + " Enter your Guess : ");
                int userGuess = sc.nextInt();
                if (userGuess == numberToGuess) {
                    guess = true;
                    totalScore = (maxChances - chance + 1);
                    chance += 1;
                    System.out.println("Congratulations! You guessed the correct number.");
                    break;
                } else if (userGuess > numberToGuess) {
                    System.out.println("Too high! Try Again.");
                } else {
                    System.out.println("Too low! Try Again.");
                }
            }
            if (guess == false) {
                System.out.println("Sorry, you've used all your chances.The correct number was " + numberToGuess + ".");
            }
            System.out.println("Do you want to play again ? (y/n) : ");
            String in = sc.next();
            playAgain = in.equalsIgnoreCase("y");

        }
        System.out.println("That's it! Hope you injoy it.");
        System.out.println("Your total score is: " + totalScore);
        sc.close();
    }

}
