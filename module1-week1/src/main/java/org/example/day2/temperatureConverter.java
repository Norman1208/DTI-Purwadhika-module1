package org.example.day2;
import java.util.Scanner;

public class temperatureConverter {
    private double temp;

    public void inputTemperature() {
        Scanner input = new Scanner(System.in);
        System.out.println("Temperature Converter");
        System.out.println("Input Temperatur in Fahrenheit:");
        this.temp = input.nextInt();

    }

    public double calculateConvertion() {
        return (temp - 32)*5/9;
    }

}
