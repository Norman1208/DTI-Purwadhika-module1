package org.example.day3;

public class fibonacciGenerator {
    // method to generate the fibonacci sequence up to n terms
    public void generate (int n) {
        int a  = 0, b = 1;

        for (int i = 1; i<=n; i++){
            System.out.print(a + " ");
            int next = a+b;
            a = b;
            b = next;
        }
    }
}
