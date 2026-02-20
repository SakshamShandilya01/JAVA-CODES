package com.gla.arrays.Level1;

    import java.util.Scanner;
    public class MultiplicationOfTable {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int number = sc.nextInt();
            int[] table = new int[10];
            for (int i = 0; i < table.length; i++) {
                table[i] = number * (i + 1);  // i+1 for 1 to 10
            }
            System.out.println("\nMultiplication Table of " + number + ":");
            for (int i = 0; i < table.length; i++) {
                System.out.printf("%d * %d = %d%n", number, (i+1), table[i]);
            }

            sc.close();
        }
    }
