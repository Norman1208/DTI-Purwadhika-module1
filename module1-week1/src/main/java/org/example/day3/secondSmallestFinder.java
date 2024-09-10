package org.example.day3;

public class secondSmallestFinder {
    // method to find the second smallest element in an array
    public int findSecondSmallest(int[] array) throws IllegalAccessException {
        if (array.length < 2) {
            throw new IllegalAccessException("Array must contain at least two elements.");
        }

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int num : array){
            if (num < smallest) {
                smallest = num;
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }
        }

        if (secondSmallest == Integer.MAX_VALUE){
            throw new IllegalArgumentException("No second smallest element found.");
        }
        return secondSmallest;
    }
}
