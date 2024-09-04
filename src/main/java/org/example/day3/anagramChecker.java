package org.example.day3;

import java.util.Arrays;

public class anagramChecker {
    // method to check if two strings are anagrams
    public boolean areAnagrams(String str1, String str2) {
        // remove spaces and convert to lowercase for case-insensitive
        str1 = str1.replaceAll("\\s+", "").toLowerCase();
        str2 = str2.replaceAll("\\s+", "").toLowerCase();

        // if length differ, they cannot be anagrams
        if (str1.length() != str2.length()){
            return false;
        }

        // convert strings to character arrays
        char[] array1 = str1.toCharArray();
        char[] array2 = str2.toCharArray();

        // sort character arrays
        Arrays.sort(array1);
        Arrays.sort(array2);

        // compare sorted arrays
        return Arrays.equals(array1, array2);
    }
}
