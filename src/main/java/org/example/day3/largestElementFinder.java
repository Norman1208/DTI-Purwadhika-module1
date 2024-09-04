package org.example.day3;

public class largestElementFinder {
    public int findLargest(int[] array){
        int largest = array[0]; // assume the first element is the largest
        for (int i = 1; i < array.length; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
        }
        return largest;
    }
}
