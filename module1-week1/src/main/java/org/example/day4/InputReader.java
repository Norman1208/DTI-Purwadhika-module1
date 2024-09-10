package org.example.day4;

import java.util.ArrayList;
import java.util.Scanner;

public class InputReader {
    public ArrayList<Integer> readInputs() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> inputs = new ArrayList<>();
        String continueInput;

        do {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            inputs.add(number);

            System.out.print("Do you want to continue ? (y/n): ");
            continueInput = scanner.next();
        } while (continueInput.equalsIgnoreCase("y"));

        return inputs;
    }
}
