package org.example.day3;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

//        // day 3 no 1
//        sumOfDigits sumOfDigits = new sumOfDigits();
//
//        System.out.println("Calculate sum of digits program");
//        System.out.println("Please enter your digit to be sum: ");
//        int number = input.nextInt();
//
//        // calculate the sum
//        int result = sumOfDigits.calculateSum(number);
//
//        System.out.println("The sum of digits in " + number +" is: "+ result);
//
//        // day 3 no 2
//        primeChecker primeChecker = new primeChecker();
//
//        // input the number
//        System.out.println("Prime Checker program");
//        System.out.println("please input your number you want to check: ");
//        int number1 = input.nextInt();
//
//        //check if the numbers is prime
//        boolean isNumberPrime = primeChecker.isPrime(number1);
//
//        // print the result
//        System.out.println(number1 + " is prime: "+ isNumberPrime);
//
//        // day 3 no 3
//        System.out.println("Largest Element Finder Program");
//
//        // prompt user to enter the size of array
//        System.out.print("Enter the size of the array: ");
//        int size = input.nextInt();
//
//        // create an array of the given size
//        int[] array = new int[size];
//
//        // prompt the user to enter elements of the array
//        System.out.println("Enter "+ size + " elements:");
//        for (int i = 0; i < size; i++){
//            array[i] = input.nextInt();
//        }
//
//        // create an instance of the largestElementfinder class
//        largestElementFinder finder = new largestElementFinder();
//
//        // find the largest element
//        int largest = finder.findLargest(array);
//
//        // print the result
//        System.out.println("The largest element in the array is: "+ largest);

//        // day 3 no 4
//        calculator calculator = new calculator();
//        System.out.println("Simple Calculator program ");
//        System.out.print("Enter the Operation (e.g., 5 + 3): ");
//        String allNum = input.nextLine();
//
//        //remove spaces from the input
//        allNum = allNum.replaceAll("\\s+","");
//
//        // find the operator and split the input string
//        char operator = ' ';
//        for (char ch : allNum.toCharArray()){
//            if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
//                operator = ch;
//                break;
//            }
//        }
//
//        // split the string into two parts using the operator
//        String[] parts = allNum.split("\\"+ operator); // "\\" use as single backslash in regex for escape operator
//        double num1 = Double.parseDouble(parts[0]);
//        double num2 = Double.parseDouble(parts[1]);
//
//        double result2 = 0;
//
//        // perform the calculation based on the operator
//        switch (operator) {
//            case '+':
//                result2 = calculator.add(num1, num2);
//                break;
//            case '-':
//                result2 = calculator.subtract(num1, num2);
//                break;
//            case '*':
//                result2 = calculator.mutiply(num1, num2);
//                break;
//            case '/':
//                result2 = calculator.divide(num1, num2);
//                break;
//            default:
//                System.out.println("Invalid operator.");
//                return;
//        }
//        // print the result
//        System.out.println("Result: "+result2);


//        // day 3 no 5
//        // create an instance of the stringreverser class
//        stringReverser reverser = new stringReverser();
//
//        // prompt the user to enter a string
//        System.out.println("String Reverser Program");
//        System.out.print("Please enter your string: ");
//        String strIn = input.nextLine();
//
//        // reverse the string
//        String reversed = reverser.reverse(strIn);
//
//        // print the result
//        System.out.println("Reverse String: "+ reversed);
//
//        // day 3 no 6
//        // create instance of fibonacciGenerator class
//        fibonacciGenerator generator = new fibonacciGenerator();
//
//        // prompt the user to enter the number of terms
//        System.out.println("Fibonacci Generator Program");
//        System.out.println("Enter the number of terms: ");
//        int n = input.nextInt();
//
//        // generate the fibonacci sequence up to n terms
//        System.out.println("Fibonacci Sequence: ");
//        generator.generate(n);
//        System.out.println("");

//        // day 3 no 7
//        // create an instance of the vowelcounter class
//        vowelCounter vowelCounter = new vowelCounter();
//
//        // prompt the user to enter a string
//        System.out.println("Vowel Counter program");
//        System.out.println("Enter a String:");
//        String string1 = input.nextLine();
//
//        // count the number of vowels
//        int vowelCount = vowelCounter.countVowels(string1);
//
//        // print the result
//        System.out.println("Number of vowels: "+ vowelCount);
//
//        // day 3 no 8
//        System.out.println("Bubble Sort Program");
//        System.out.print("Enter the size of the array: ");
//        int size1 = input.nextInt();
//
//        // create an array of the given size
//        int[] array1 = new int[size1];
//
//        // prompt the user to element of the array
//        System.out.println("Enter "+ size1 +" elements:");
//        for (int i = 0; i < size1 ; i++){
//            array1[i] = input.nextInt();
//        }
//
//        // create an isntance of the bubblesort class
//        bubbleSort bubbleSort = new bubbleSort();
//
//        // sort the array using bubble sort
//        bubbleSort.sort(array1);
//
//        // print the sorted array
//        System.out.println("Sorted array: ");
//        for (int i = 0; i < size1; i++){
//            System.out.print(array1[i] + " ");
//        }
//
//        // day 3 no 9
//        // create an instances of the anagram checker class
//        anagramChecker checker = new anagramChecker();
//
//        // prompt user to enter two string
//        System.out.println("Anagram Checker Program");
//        System.out.println("Enter the first string: ");
//        String str1 = input.nextLine();
//        System.out.println("Enter the second string: ");
//        String str2 = input.nextLine();
//
//        // Check if the strings are anagrams
//        boolean result3 = checker.areAnagrams(str1, str2);
//
//        //print the result
//        System.out.println("Are the String anagrams ? "+ result3);
//
//        // day 3 no 10
//        // prompt the user to enter the size of array
//        System.out.println("Second Smallest Finder Program");
//        System.out.println("Enter the size of the array: ");
//        int size3 = input.nextInt();
//
//        // create an array of the given size
//        int[] array2 = new int[size3];
//
//        // prompt the user to enter elements of the array
//        System.out.println("Enter "+size3+" elements: ");
//        for(int i = 0; i < size3; i++) {
//            array2[i] = input.nextInt();
//        }
//
//        //create an instance of the second smallestfinder class
//        secondSmallestFinder finder2 = new secondSmallestFinder();
//
//        try {
//            // find the second smallest element
//            int secondSmallest = finder2.findSecondSmallest(array2);
//
//            // print the result
//            System.out.println("The second smallest element is: "+ secondSmallest);
//        } catch (IllegalArgumentException e) {
//            System.out.println(e.getMessage());
//        } catch (IllegalAccessException e) {
//            throw new RuntimeException(e);
//        }
    }
}
