package org.example.day3;

public class bubbleSort {
    // method to sort an arrya using buble sort
    public void sort(int[] array){
        int n = array.length;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n-i-1; j++){
                if (array[j] > array[j+1]){
                    // swap array [j] and array [j+1]
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
