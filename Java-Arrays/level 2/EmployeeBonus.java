package com.gla.arrays.Level2;

import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] salaries = new double[10];
        double[] yearsService = new double[10];
        double[] bonuses = new double[10];
        double[] newSalaries = new double[10];
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;
        double totalBonus = 0.0;

        int index = 0;
        while (index < 10) {
            System.out.print("Employee " + (index + 1) + " - Salary: ");
            double salary = sc.nextDouble();

            System.out.print("Employee " + (index + 1) + " - Years of service: ");
            double years = sc.nextDouble();
            if (salary <= 0 || years < 0) {
                System.out.println("Invalid input! Salary must be >0, years >=0. Try again.");
                continue;
            }
            salaries[index] = salary;
            yearsService[index] = years;
            totalOldSalary += salary;
            index++;
        }
        for (int i = 0; i < 10; i++) {
            double salary = salaries[i];
            double years = yearsService[i];
            double bonusRate = (years > 5) ? 0.05 : 0.02;
            double bonus = salary * bonusRate;
            double newSalary = salary + bonus;

            bonuses[i] = bonus;
            newSalaries[i] = newSalary;
            totalBonus += bonus;
            totalNewSalary += newSalary;
        }
        System.out.println("\n=== Zara Employee Bonus Report ===");
        System.out.printf("Total Old Salary: ₹%.2f%n", totalOldSalary);
        System.out.printf("Total New Salary: ₹%.2f%n", totalNewSalary);
        System.out.printf("Total Bonus Payout: ₹%.2f%n", totalBonus);

        System.out.println("\nIndividual Details:");
        for (int i = 0; i < 10; i++) {
            System.out.printf("Emp %d: Old=₹%.2f, Years=%.1f, Bonus=₹%.2f, New=₹%.2f%n",
                    (i+1), salaries[i], yearsService[i],
                    bonuses[i], newSalaries[i]);
        }

        sc.close();
    }
}


