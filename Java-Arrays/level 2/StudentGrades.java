package com.gla.arrays.Level2;

import java.util.Scanner;
public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        double[][] marks = new double[n][3];
        double[] percentage = new double[n];
        String[] grade = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1));

            for (int j = 0; j < 3; j++) {
                String subject = "";
                if (j == 0) subject = "Physics";
                if (j == 1) subject = "Chemistry";
                if (j == 2) subject = "Maths";

                do {
                    System.out.print("Enter marks in " + subject + ": ");
                    marks[i][j] = sc.nextDouble();

                    if (marks[i][j] < 0)
                        System.out.println("Marks cannot be negative. Enter again.");
                } while (marks[i][j] < 0);
            }
        }
        for (int i = 0; i < n; i++) {
            double total = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = total / 3;

            if (percentage[i] >= 80)
                grade[i] = "A";
            else if (percentage[i] >= 70)
                grade[i] = "B";
            else if (percentage[i] >= 60)
                grade[i] = "C";
            else if (percentage[i] >= 50)
                grade[i] = "D";
            else if (percentage[i] >= 40)
                grade[i] = "E";
            else
                grade[i] = "R";
        }
        System.out.println("\nPhy\tChem\tMath\t%\tGrade");
        for (int i = 0; i < n; i++) {
            System.out.printf("%.1f\t%.1f\t%.1f\t%.2f\t%s\n",
                    marks[i][0], marks[i][1], marks[i][2],
                    percentage[i], grade[i]);
        }

        sc.close();
    }
}
