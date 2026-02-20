package com.gla.arrays.Level2;

import java.util.Scanner;

public class DigitsFrequency {
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
        int[] frequency = new int[10];
        for (int digit : digits) {
            frequency[digit]++;
        }
        System.out.println("Number: " + number);
        System.out.println("Digit frequencies:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.printf("Digit %d: %d times%n", i, frequency[i]);
            }
        }

        sc.close();
    }
}

