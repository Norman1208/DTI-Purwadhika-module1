package org.example;

import org.example.day1.*;
import org.example.day2.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        rectangleArea recArea = new rectangleArea();
//
//        // call the method to input dimension
//        recArea.inputDimension();
//
//        // call the method to display the area
//        recArea.displayArea();


//        System.out.println("Hello world!");

        // day2 no 1
        temperatureConverter temp = new temperatureConverter();

        temp.inputTemperature();

        double fahrenheit = temp.calculateConvertion();
        System.out.println("The Celcius temperature:" + fahrenheit);


        // day 2 no 2
        longConverter length = new longConverter();

        length.inputLong();

        double km = length.calculateLongConversion();
        System.out.println("length conversion: "+ km +"km");

        // day 2 no 3
        detectOddEven number = new detectOddEven();
        number.inputNumber();
        number.devideCheck();
        number.trueFalse();

        // day 2 no 4
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the main string: ");
        String inputString = input.nextLine();

        System.out.print("Enter the search string: ");
        String searchString = input.nextLine();

        removeString manipulator = new removeString();

        String result = manipulator.removeFirstOccurence(inputString, searchString);

        System.out.println("Resulting String: "+ result);

        // day 2 no 5
        System.out.print("Enter a string to check if it is a palindrome: ");
        String inputString2 = input.nextLine();

        palindrome palindromeChecker = new palindrome();

        boolean isPalindrome = palindromeChecker.isPalindrome(inputString2);

        if (isPalindrome) {
            System.out.println("The String '"+ inputString2 + "' is a palindrome");

        } else {
            System.out.println("The String '"+ inputString2 + "'is not a palindrome");
        }

    }
}