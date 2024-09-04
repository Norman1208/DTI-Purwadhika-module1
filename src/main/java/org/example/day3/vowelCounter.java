package org.example.day3;

public class vowelCounter {
    // method to count the nuber of vowels in a string
    public int countVowels(String input) {
        int count = 0;
        input = input.toLowerCase();

        for (int i = 0; i < input.length(); i++){
            char ch = input.charAt(i);
            if (ch == 'a' || ch == 'i' || ch == 'u' || ch == 'e' || ch == 'o') {
                count++;
            }
        }
        return count;
    }
}
