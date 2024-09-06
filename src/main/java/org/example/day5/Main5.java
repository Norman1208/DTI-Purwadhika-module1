package org.example.day5;

import java.util.Arrays;
import java.util.Scanner;

public class Main5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        // day 5 no 1
        WordGuessingGame game = new WordGuessingGame();
        String wordToGuess = game.selectRandomWord();
        String hiddenWord = game.hideWord(wordToGuess);
        int attemptsLeft = WordGuessingGame.MAX_ATTEMPTS;

        System.out.println("Welcome to the Word Guessing Game");
        System.out.println("You have "+ attemptsLeft + " attempts to guess the word");
        System.out.println(hiddenWord);

        while (attemptsLeft > 0 && !hiddenWord.equals(wordToGuess)) {
            char guess = game.getPlayerGuess();

            if (game.isGuessCorrect(wordToGuess, guess)){
                    hiddenWord = game.updateHiddenWord(wordToGuess, hiddenWord, guess);
                    System.out.println("Correct guess: "+ hiddenWord);
                } else {
                    attemptsLeft--;
                    System.out.println("Wrong guess. Attempts left: " + attemptsLeft);
                }
            }

        game.displayGameResult(wordToGuess, hiddenWord, attemptsLeft);

        // day 5 no 2
        CurrencyConverter curConverter = new CurrencyConverter();

        // getting user input
        System.out.println("Currency Converter Program");
        System.out.print("Enter the amount to convert: ");
        double amount = scanner.nextDouble();
        System.out.print("Enter the source currency (USD, EUR): ");
        String sourceCurrency = scanner.next().toUpperCase();
        System.out.print("Enter the target currency (USD, EUR, GPB, JPY): ");
        String targetCurrency = scanner.next().toUpperCase();

        // performing conversion
        double result = curConverter.convertCurrency(amount, sourceCurrency, targetCurrency);

        // displaying the result
        if (result != -1){
            System.out.printf("%.2f %s is equal to %.2f %s%n", amount, sourceCurrency, result, targetCurrency);
        }

        // day 5 no 3
        EvenNumberFilter filter = new EvenNumberFilter();

        // example input array
        int[] inputArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // call the method to filter even number
        int[] evenArray = filter.filterEvenNumbers(inputArray);

        // display the filtered array of even numbers
        System.out.println("Even numbers: "+ Arrays.toString(evenArray));

        // day 5 no 4
        FizzBuzz fizzBuzz = new FizzBuzz();

        // get the number of times to loop (n)
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        // call the FizzBuzz method to print the sequence
        fizzBuzz.printFizzBuzz(n);

        // day 5 no 5
        TwoSum twoSum = new TwoSum();

        // example input
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        // call the method to find two sum
        int[] result2 = twoSum.findTwoSum(nums, target);

        // display the result
        if (result2.length == 2){
            System.out.println("Indices: "+ Arrays.toString(result2));
        } else {
            System.out.println("No pair exist");
        }
    }
}
