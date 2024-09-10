package org.example.day2;
import java.util.Scanner;

public class longConverter {
    private double length;

    public void inputLong() {
        Scanner input = new Scanner(System.in);
        System.out.println("Long Converter");
        System.out.println("Input the length in centimeter:");
        this.length = input.nextDouble();
    }

    public double calculateLongConversion() {
        return length / 100000;
    }
}
