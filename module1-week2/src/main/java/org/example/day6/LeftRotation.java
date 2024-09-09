package org.example.day6;

import java.util.Arrays;

public class LeftRotation {
    public static void run() {
        // known array and d
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int d = 2;

        System.out.println("original array: "+ Arrays.toString(arr));
        rotateArray(arr, d);
        System.out.println("Rotated array: "+ Arrays.toString(arr));

    }

    public static void rotateArray(int[] arr, int d) {
        // read length of array
        int n = arr.length;
        int[] temp = new int[d]; // make temporary array to save d element that will move to the end of main array

        // input several element in main array to temp array
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }

        // shift several element from main array with index from d to n
        for (int i = 0; i < n-d; i++) {
            arr[i] = arr[i+d];
        }

        // input temp array in the end of main array
        for (int i = 0; i < d; i++) {
            arr[n - d + i] = temp[i];
        }
    }
}



