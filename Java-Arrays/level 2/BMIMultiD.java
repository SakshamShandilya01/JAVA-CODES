package com.gla.arrays.Level2;

import java.util.Scanner;

public class BMIMultiD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int number = sc.nextInt();
        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];
        for (int i = 0; i < number; i++) {
            System.out.println("\nPerson " + (i + 1));

            // By Using do while loop
            do {
                System.out.print("Enter height (in meters): ");
                personData[i][0] = sc.nextDouble();
                if (personData[i][0] <= 0)
                    System.out.println("Height must be positive. Please enter again.");
            } while (personData[i][0] <= 0);
            do {
                System.out.print("Enter weight (in kg): ");
                personData[i][1] = sc.nextDouble();
                if (personData[i][1] <= 0)
                    System.out.println("Weight must be positive. Please enter again.");
            } while (personData[i][1] <= 0);
        }
        for (int i = 0; i < number; i++) {
            double height = personData[i][0];
            double weight = personData[i][1];

            personData[i][2] = weight / (height * height);

            if (personData[i][2] <= 18.4)
                weightStatus[i] = "Underweight";
            else if (personData[i][2] <= 24.9)
                weightStatus[i] = "Normal";
            else if (personData[i][2] <= 39.9)
                weightStatus[i] = "Overweight";
            else
                weightStatus[i] = "Obese";
        }
        System.out.println("\nHeight\tWeight\tBMI\tStatus");
        for (int i = 0; i < number; i++) {
            System.out.printf("%.2f\t%.2f\t%.2f\t%s\n",
                    personData[i][0],
                    personData[i][1],
                    personData[i][2],
                    weightStatus[i]);
        }

        sc.close();
    }
}
