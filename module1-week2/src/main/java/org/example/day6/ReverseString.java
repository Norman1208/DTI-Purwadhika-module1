package org.example.day6;

public class ReverseString {
    public static void run() {
        // Example 1: Reverse the string "malang"
        String input1 = "malang";
        String output1 = reverse(input1);
        System.out.println("Reversed string: " + output1);  // Output: "gnalam"

        // Example 2: Reverse the string "mas"
        String input2 = "mas";
        String output2 = reverse(input2);
        System.out.println("Reversed string: " + output2);  // Output: "sam"
    }

    // Method to reverse a string
    public static String reverse(String input) {
        // Create a char array to store the reversed characters
        char[] reversed = new char[input.length()];

        // Loop through the input string from the end to the start
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed[input.length() - 1 - i] = input.charAt(i);
        }

        // Convert the reversed char array back to a string and return
        return new String(reversed);
    }
}
