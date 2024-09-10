package org.example.day4;

public class MultiplicationTable {
    public static void printMultiplicationTable(int n){
        for (int i = 1; i <= n; i++){
            for (int j= 1; j <=n; j++){
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }
}
