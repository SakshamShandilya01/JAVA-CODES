package com.gla.arrays.Level1;
import java.util.Scanner;
public class NumberAnalysis {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int[] numbers = new int[5];  // Array for 5 numbers

            // Take input for 5 numbers
            System.out.println("Enter 5 numbers:");
            for (int i = 0; i < numbers.length; i++) {
                System.out.print("Number " + (i+1) + ": ");
                numbers[i] = sc.nextInt();
            }

            // Analyze each number
            System.out.println("\n--- Analysis ---");
            for (int i = 0; i < numbers.length; i++) {
                int num = numbers[i];
                String type;

                if (num > 0) {
                    // Positive: check even/odd
                    type = (num % 2 == 0) ? "positive even" : "positive odd";
                } else if (num < 0) {
                    type = "negative";
                } else {
                    type = "zero";
                }

                System.out.printf("Number %d: %s%n", (i+1), type);
            }

            // Compare first and last elements
            int first = numbers[0];
            int last = numbers[4];
            System.out.printf("\n--- Comparison ---%n");
            System.out.printf("First: %d, Last: %d%n", first, last);

            if (first == last) {
                System.out.println("First and last elements are EQUAL");
            } else if (first > last) {
                System.out.println("First element is GREATER than last");
            } else {
                System.out.println("First element is LESS than last");
            }

            sc.close();
        }
    }


