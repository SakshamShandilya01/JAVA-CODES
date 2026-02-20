package com.gla.arrays.Level2;

import java.util.Scanner;

public class LargestDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a positive number!");
            return;
        }

        // b. Initial setup
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;
        int tempNum = number;

        // Extract ALL digits with dynamic resizing
        while (tempNum != 0) {
            // f. Check if resize needed
            if (index == maxDigit) {
                maxDigit += 10;  // Increase by 10

                // b. Create temp array, copy, reassign
                int[] temp = new int[maxDigit];
                for (int i = 0; i < index; i++) {
                    temp[i] = digits[i];
                }
                digits = temp;  // Now digits has more space
            }

            // Extract digit
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
        System.out.print("All digits: ");
        for (int i = 0; i < index; i++) {
            System.out.print(digits[i] + " ");
        }
        System.out.println();
        System.out.printf("Largest: %d, Second Largest: %d%n", largest, secondLargest);

        sc.close();
    }
}

