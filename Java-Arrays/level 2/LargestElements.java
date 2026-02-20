package com.gla.arrays.Level2;

import java.util.Scanner;

public class LargestElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a positive number!");
            return;
        }
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;
        int tempNum = number;
        while (tempNum != 0 && index < maxDigit) {
            int digit = tempNum % 10;
            digits[index] = digit;
            tempNum /= 10;
            index++;
        }
        int largest = 0;
        int secondLargest = 0;
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }
        System.out.println("Number: " + number);
        System.out.print("Digits: ");
        for (int i = 0; i < index; i++) {
            System.out.print(digits[i] + " ");
        }
        System.out.println();
        System.out.printf("Largest digit: %d%n", largest);
        System.out.printf("Second largest digit: %d%n", secondLargest);

        sc.close();
    }
}

