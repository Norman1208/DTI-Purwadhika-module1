package org.example.day2;
import java.util.Scanner;

public class detectOddEven {
    private int num;

    public void inputNumber() {
        Scanner input = new Scanner(System.in);
        System.out.println("Odd Even Detector");
        System.out.print("Please input the number:");
        this.num = input.nextInt();
    }

    public int devideCheck() {
        return num % 2;
    }

    public void trueFalse() {
        int res = devideCheck();
        if (res == 0){
            System.out.println("Number is Even");
        } else{
            System.out.println("Number is Odd");
        }
    }
}
