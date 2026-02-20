package com.gla.arrays.Level1;

    import java.util.Scanner;
    public class MultipleStoringArray {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            double[] numbers = new double[10];  // Max 10 elements
            double total = 0.0;                 // Sum
            int index = 0;                      // Current position


            while (true) {
                System.out.print("Enter number (0/negative to stop, max 10): ");
                double num = sc.nextDouble();

                // Break conditions
                if (num <= 0 || index >= 10) {
                    break;
                }

                numbers[index] = num;
                total += num;
                index++;

                System.out.println("Added: " + num + " (Total numbers: " + index + ")");
            }
            System.out.println("\n Results are :");
            System.out.print("Numbers entered: ");
            for (int i = 0; i < index; i++) {
                System.out.printf("%.2f ", numbers[i]);
            }
            System.out.println("\nSum: " + String.format("%.2f", total));

            sc.close();
        }
    }


