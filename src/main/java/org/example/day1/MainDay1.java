package org.example.day1;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

import static java.lang.Math.abs;

public class MainDay1 {
    public static void main(String[] args) {
//        // task no 1
//        Scanner num = new Scanner(System.in);
//        System.out.println("Rectangle calculator");
//        System.out.println("Input the length:");
//        int num1 = num.nextInt();
//        System.out.println("Input the width:");
//        int num2 = num.nextInt();
//        int area = num1*num2;
//        System.out.println("Rectangle Area:" + area);

//       //  task no 2
//        Scanner num = new Scanner(System.in);
//        System.out.println("input the radius:");
//        short r = num.nextShort();
//        int d = 2*r;
//        float pi = 3.14f;
//        float peri = pi * d;
//        float area = pi * r * r;
//        System.out.println("Diameter:"+ d);
//        System.out.println("Circumference:"+ peri);
//        System.out.println("Area:"+ area);

//        // task no 3
//        Scanner num = new Scanner(System.in);
//        System.out.println("Find the angle for triangle");
//        System.out.println("Input the 1st angle:");
//        int angle1 = num.nextInt();
//        System.out.println("Input the 2nd angle:");
//        int angle2 = num.nextInt();
//        int angle3 = 180 - angle2 - angle1;
//        System.out.println("3rd angle:"+angle3);

//        // task 4
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first date (YYYY-MM-DD): ");
        String date1String = input.nextLine();
        System.out.println("Enter the second date (YYYY-MM-DD): ");
        String date2String = input.nextLine();

        LocalDate date1 = LocalDate.parse(date1String);
        LocalDate date2 = LocalDate.parse(date2String);

        long daysBetween = ChronoUnit.DAYS.between(date2, date1);

        System.out.println("Difference in days: " + abs(daysBetween));

//        //task 5
//        Scanner input = new Scanner(System.in);
//        System.out.println("Get your initial");
//        System.out.println("Write ur name please:");
//        String names = input.nextLine();
//
//        String[] nameParts = names.split(" ");
//
//        System.out.println("Your Initial name are: ");
//        for (String part: nameParts) {
//            System.out.print(part.charAt(0));
//        }

    }
}
