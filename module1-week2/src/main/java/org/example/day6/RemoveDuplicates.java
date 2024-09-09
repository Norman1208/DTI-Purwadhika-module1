package org.example.day6;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void run(){
        // input array
        int[] nums =  {1, 2, 2, 3, 3, 3, 4, 5};

        // remove duplicates
        int[] result = removeDuplicate(nums);

        // print
        System.out.println("new Array: "+ Arrays.toString(result));
    }

    public static int[] removeDuplicate(int[] arr){
        int n = arr.length;

        // outer loop iterates over each element
        for (int i = 0; i<n; i++){
            // inner loop for check for duplicate of arr[i]
            for (int j = i+1; j < n;j++){
                if(arr[i] == arr[j]) {
                    // shift element to the left to remove the duplicate
                    for (int k=j; k < n-1; k++) {
                        arr[k] = arr[k+1];
                    }
                    n--; // adjust the size of array
                    j--; // adjust of evalution of array
                }
            }
        }
        int[] result = Arrays.copyOf(arr, n);
        return result;
    }
}
