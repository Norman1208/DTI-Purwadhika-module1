package org.example.day7;

import java.util.Scanner;

public class AverageCalculator {
    private double sum;
    private int count;

    public AverageCalculator() {
        sum = 0;
        count = 0;
    }

    // method to start collecting input and calculate the average
    public void calculateAverage() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a number or 'q' to finish: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("q")) {
                break; // exit the loop
            }

            try {
                double number = Double.parseDouble(input);
                sum += number;
                count++;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number or 'q' to finish.");
            }
        }
        scanner.close();
    }

    // method to display
    public void displayAverage() {
        if (count > 0) {
            double average = sum / count;
            System.out.println("Average: "+ average);
        } else {
            System.out.println("No numbers entered.");
        }
    }
}
