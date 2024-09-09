package org.example.day6;

public class WarmerDayCounter {
    public static void run() {
        // Example 1: Input temperatures = [73,74,75,71,69,72,76,73]
        int[] temperatures1 = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] result1 = dailyTemperatures(temperatures1);
        System.out.print("Output 1: ");
        for (int r : result1) {
            System.out.print(r + " ");
        }
        System.out.println();

        // Example 2: Input temperatures = [30,40,50,60]
        int[] temperatures2 = {30, 40, 50, 60};
        int[] result2 = dailyTemperatures(temperatures2);
        System.out.print("Output 2: ");
        for (int r : result2) {
            System.out.print(r + " ");
        }
        System.out.println();

        // Example 3: Input temperatures = [30,60,90]
        int[] temperatures3 = {30, 60, 90};
        int[] result3 = dailyTemperatures(temperatures3);
        System.out.print("Output 3: ");
        for (int r : result3) {
            System.out.print(r + " ");
        }
    }


    public static int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] result = new int[n];

        // loop through the temperature array from the end to the start
        for (int i = n - 2; i >= 0; i--){
            int j = i + 1;
            // Check for the next warmer day
            while (j < n && temperatures[i] >= temperatures[j]) {
                if (result[j] == 0) {
                    j = n;  // No warmer day found, exit the loop
                } else {
                    j += result[j];  // Jump to the next possible warmer day
                }
            }
            if (j < n) {
                result[i] = j - i;  // Calculate the number of days to wait
            }
        }

        return result;
    }
}
