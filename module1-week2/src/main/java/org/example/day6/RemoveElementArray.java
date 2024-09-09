package org.example.day6;

import java.util.Arrays;

public class RemoveElementArray {
    public static void run() {
        // input array and the element to remove
        // Input array and the element to remove
        int[] nums = {1, 2, 1, 3, 5, 1};
        int key = 1;

        // Remove all occurrences of 'key' from the array
        int[] result = removeElement(nums, key);

        // Print the result array
        System.out.println("Array after removing all occurrences of " + key + ": " + Arrays.toString(result));
    }


    // method to remove all element that input
    public static int[] removeElement(int[] arr, int key) {
        // count the number of occurences of 'key' to determine new array size
        int count = 0;
        for (int num : arr) {
            if(num != key) {
                count++;
            }
        }

        // create a new array to store the element accept the key
        int[] result = new int[count];
        int index = 0;

        // add element to the result array
        for (int num : arr) {
            if (num != key){
                result[index++] = num;
            }
        }
        return result;
    }
}
