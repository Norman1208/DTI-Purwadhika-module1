package org.example.day5;

public class FizzBuzz {
    // method to print FizzBuzz sequence up to n
    public void printFizzBuzz(int n ) {
        for (int i = 1; i <= n; i++){
            if ( i % 3 == 0 && i % 5 == 0){
                System.out.print("FizzBuzz ");
            } else if (i%3 == 0){
                System.out.print("Fizz ");
            } else if ( i % 5 == 0){
                System.out.print("Buzz ");
            } else {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
