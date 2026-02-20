package com.gla.arrays.Level2;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a positive number!");
            return;
        }
        int tempNum = number;
        int digitCount = 0;
        while (tempNum != 0) {
            tempNum /= 10;
            digitCount++;
        }
        int[] digits = new int[digitCount];
        tempNum = number;
        for (int i = 0; i < digitCount; i++) {
            digits[i] = tempNum % 10;
            tempNum /= 10;
        }
        int[] reversedDigits = new int[digitCount];
        for (int i = 0; i < digitCount; i++) {
            reversedDigits[i] = digits[digitCount - 1 - i];
        }
        System.out.print("Original digits: ");
        for (int d : digits) {
            System.out.print(d + " ");
        }
        System.out.print("\nReversed digits: ");
        for (int d : reversedDigits) {
            System.out.print(d + " ");
        }
        System.out.println();
        int reversedNum = 0;
        for (int d : reversedDigits) {
            reversedNum = reversedNum * 10 + d;
        }
        System.out.println("Reversed number: " + reversedNum);

        sc.close();
    }
}

