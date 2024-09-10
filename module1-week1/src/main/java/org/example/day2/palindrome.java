package org.example.day2;

public class palindrome {
    public boolean isPalindrome(String input){
        int length = input.length();
        for (int i = 0; i < length/2; i++){
            if (input.charAt(i) != input.charAt(length - i - 1)){
                return false; // not a palindrome
            }
        }
        return true; // is a palindrome
    }
}
