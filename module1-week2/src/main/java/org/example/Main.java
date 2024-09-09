package org.example;

import org.example.day6.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Day 6 Exercise");
        Scanner scanner = new Scanner(System.in);

        // several case
        System.out.println("please choose the problem:");
        System.out.println("1. Left Rotation Problem");
        System.out.println("2. Array duplicate Checker");
        System.out.println("3. Array duplicate remover");
        System.out.println("4. Array Sorting order Program");
        System.out.println("5. Array Element Remover");
        System.out.println("6. String Reverser");
        System.out.println("7. Duplicate Finder");
        System.out.println("8. Number of day until get the warmer temperature");

        // input for case
        System.out.print("Enter your number of case (0 to end the case): ");
        int choose = scanner.nextInt();

        // using switch
        if (choose != 0){
            switch (choose) {
                case 1:
                    LeftRotation.run();
                case 2:
                    DuplicatesChecker.run();
                case 3:
                    RemoveDuplicates.run();
                case 4:
                    ArraySorting.run();
                case 5:
                    RemoveElementArray.run();
                case 6:
                    ReverseString.run();
                case 7:
                    DuplicateIdentifier.run();
                case 8:
                    WarmerDayCounter.run();
            }
        }

//
//        System.out.println("Hello world!");
    }
}