package org.example.day5;

import java.util.ArrayList;
import java.util.List;

public class EvenNumberFilter {
    // methods to filter out odd number and return an array of even number
    public int[] filterEvenNumbers(int[] inputArray){
        List<Integer> evenNumbers = new ArrayList<>();

        for (int number : inputArray) {
            if (number % 2 == 0){
                evenNumbers.add(number);
            }
        }

        // convert int the list back to an array
        int[] evenArray = new int[evenNumbers.size()];
        for (int i = 0; i < evenNumbers.size(); i++){
            evenArray[i] = evenNumbers.get(i);
        }
        return evenArray;
    }
}
