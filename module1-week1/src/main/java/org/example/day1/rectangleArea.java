package org.example.day1;

import java.util.Scanner;

public class rectangleArea {
    private int length;
    private int width;

    // method to prompt the user length and width
    public void inputDimension() {
        Scanner input = new Scanner(System.in);
        System.out.println("Rectangle calculator");
        System.out.println("Input the length:");
        this.length = input.nextInt();
        System.out.println("Input the width:");
        int num2 = input.nextInt();
//        System.out.println("Rectangle Area:" + num1*num2);
    }

    // method to calculate the area of the rectangle
    public double calculateArea() {
        return length * width;
    }

    // method to display the area
    public void displayArea() {
        double area = calculateArea();
        System.out.println("The area of the rectangle is: "+ area);
    }
}
