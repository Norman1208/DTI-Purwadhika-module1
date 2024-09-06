package org.example.day5;

import java.util.Random;
import java.util.Scanner;

public class WordGuessingGame {
    private static final String[] WORDS = {"java", "python", "javascript", "kotlin", "ruby"};
    public static final int MAX_ATTEMPTS = 6;

    // select a random word from the array
    public String selectRandomWord() {
        Random random = new Random();
        return WORDS[random.nextInt(WORDS.length)];
    }

    // create and return a hidden word (underscores)
    public String hideWord(String word){
        return "_".repeat(word.length());
    }

    // prompt the player for a guess and return the guessed character
    public char getPlayerGuess() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your guess: ");
        return scanner.next().toLowerCase().charAt(0);
    }

    // check if the guessed character is in the word
    public boolean isGuessCorrect(String word, char guess){
        return word.indexOf(guess) >= 0;
    }

    // update the hidden word by revealing the correct guesses
    public String updateHiddenWord(String word, String hiddenWord, char guess){
        StringBuilder updatedHiddenWord = new StringBuilder(hiddenWord);
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i)== guess){
                updatedHiddenWord.setCharAt(i, guess);
            }
        }
        return updatedHiddenWord.toString();
    }

    // display the final game result
    public void displayGameResult(String wordToGuess, String hiddenWord, int attemptsLeft){
        if (hiddenWord.equals(wordToGuess)) {
            System.out.println("Congratulation! you guessed the word: "+ wordToGuess);
        } else {
            System.out.println("Game over! The word was: "+ wordToGuess);
        }
    }
}
