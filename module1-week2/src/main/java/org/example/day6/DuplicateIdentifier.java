package org.example.day6;

import java.util.ArrayList;
import java.util.List;

public class DuplicateIdentifier {
    public static void run() {
        // Example 1: Find duplicates in the array [4,3,2,7,8,2,3,1]
        int[] nums1 = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> result1 = findDuplicates(nums1);
        System.out.println("Duplicates in array 1: " + result1);  // Output: [2, 3]

        // Example 2: Find duplicates in the array [1,1,2]
        int[] nums2 = {1, 1, 2};
        List<Integer> result2 = findDuplicates(nums2);
        System.out.println("Duplicates in array 2: " + result2);  // Output: [1]

        // Example 3: Find duplicates in the array [1]
        int[] nums3 = {1};
        List<Integer> result3 = findDuplicates(nums3);
        System.out.println("Duplicates in array 3: " + result3);  // Output: []

    }
    // Method to find all duplicates in the array using loops
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> duplicates = new ArrayList<>();  // To store duplicates

        // Outer loop to go through each element of the array
        for (int i = 0; i < nums.length; i++) {
            // Inner loop to compare the current element with the rest
            for (int j = i + 1; j < nums.length; j++) {
                // Check if the current element is equal to any of the following elements
                if (nums[i] == nums[j]) {
                    // Check if the duplicate is not already in the list
                    if (!duplicates.contains(nums[i])) {
                        duplicates.add(nums[i]);  // Add the duplicate to the list
                    }
                    break;  // Stop checking for this element after finding the first duplicate
                }
            }
        }

        return duplicates;  // Return the list of duplicates
    }
}
