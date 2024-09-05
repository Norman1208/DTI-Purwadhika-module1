package org.example.day4;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    private int targetNumber;
    private int attempts;

    public NumberGuessingGame() {
        Random random = new Random();
        targetNumber = random.nextInt(100) + 1; // generate random number
        attempts = 0;
    }

    public void playGame() {
        Scanner scanner = new Scanner(System.in);
        int guess;

        System.out.println("Guess the number between 1 and 100!");

        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess > targetNumber){
                System.out.println("Too high!");
            } else if (guess < targetNumber){
                System.out.println("Too low!");
            } else {
                System.out.println("Correct! You guessed the number in "+ attempts+" attempts");
            }
        } while (guess != targetNumber);
    }
}
