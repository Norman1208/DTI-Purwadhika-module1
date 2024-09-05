package org.example.day4;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        // day 4 no 1
//        System.out.println("Multiplication Table Program");
//        System.out.print("Enter the value of n:");
//        int n = scanner.nextInt();
//
//        MultiplicationTable mtpltable = new MultiplicationTable();
//        mtpltable.printMultiplicationTable(n);


//        // day 4 no 2
//        System.out.println("Star Pattern Program");
//        System.out.print("Enter the number of rows: ");
//        int n = scanner.nextInt();
//
//        StarPattern starPattern = new StarPattern();
//        starPattern.printPattern(n);

//        // day 4 no 3
//        InputReader inputReader = new InputReader();
//
//        // get the list of inputs from the user
//        System.out.println("Input Readers Program");
//        System.out.println("Please input the numbers:");
//        System.out.println("Enter 'y' to continue or 'n' to stop: ");
//
//        // call the readInputs method
//        System.out.println("Your inputs: " + inputReader.readInputs());

//        // day 4 no 4
//        NumberGuessingGame game = new NumberGuessingGame();
//        game.playGame();

        // day 4 no 5
        System.out.println("Case Swapper Program");
        System.out.print("Enter a String: ");
        String input = scanner.nextLine();

        CaseSwapper caseSwapper = new CaseSwapper();
        String result = caseSwapper.swapCase(input);

        System.out.println("Swapped case: "+ result);
    }
}
