package org.example.day3;

public class calculator {
    public double add(double a, double b){
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double mutiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b){
        if (b == 0){
            throw new ArithmeticException("Division by zero is not allowed!");
        }
        return a / b;
    }
}
