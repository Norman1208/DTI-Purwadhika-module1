package org.example.day4;

public class StarPattern {
    public void printPattern(int n) {
        for (int i = 1; i <= n; i++){
            for (int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
