package org.example.day6;

import java.util.Arrays;

public class ArraySorting {
    public static void run() {
        int[] nums1 = {8, 7, 5, 2};
        sortArray(nums1, "asc");
        System.out.println("Sorted in ascending order: " + Arrays.toString(nums1)); // Output: [2, 5, 7, 8]

        // Example 2: Sort in descending order
        int[] nums2 = {8, 7, 5, 2};
        sortArray(nums2, "desc");
        System.out.println("Sorted in descending order: " + Arrays.toString(nums2)); // Output: [8, 7, 5, 2]
    }

    // method to sort array
    public static void sortArray(int[] arr, String direction) {
        if(direction.equalsIgnoreCase("asc")) {
            Arrays.sort(arr);
        } else if (direction.equalsIgnoreCase("desc")){
            Arrays.sort(arr);
            reverseArray(arr);
        } else {
            System.out.println("Invalid direction!");
        }
    }

    public static void reverseArray(int[] arr){
        int start = 0, end = arr.length-1;
        while (start < end) {
            // swap elements
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
