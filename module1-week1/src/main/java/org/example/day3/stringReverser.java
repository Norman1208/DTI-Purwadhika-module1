package org.example.day3;

public class stringReverser {
    public String reverse(String input) {
        char[] chars = input.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right){
            // swap character
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            // move towards the center
            left++;
            right--;
        }
        return new String(chars);
    }
}
