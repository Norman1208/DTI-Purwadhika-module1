package org.example.day3;

public class sumOfDigits {
    // method to calculate the sum of digits
    public int calculateSum(int number) {
        int sum = 0;
        while (number != 0){
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
