package com.gla.arrays.Level1;

import java.util.Scanner;

public class TableMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int[] multiplicationResult = new int[4];

        // Calculate table 6 to 9
        for (int i = 0; i < 4; i++) {
            int multiplier = 6 + i;  // 6,7,8,9
            multiplicationResult[i] = number * multiplier;
        }
        System.out.println("\nMultiplication Table (" + number + ") from 6 to 9:");
        for (int i = 0; i < multiplicationResult.length; i++) {
            int multiplier = 6 + i;
            System.out.printf("%d * %d = %d%n", number, multiplier, multiplicationResult[i]);
        }

        sc.close();
    }
}

