package com.gla.arrays.Level1;
import java.util.Scanner;
public class StudentVotingCheck {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int[] ages = new int[10];  // Array for 10 students

            // Take input for all 10 students
            System.out.println("Enter age of 10 students:");
            for (int i = 0; i < ages.length; i++) {
                System.out.print("Student " + (i+1) + ": ");
                ages[i] = sc.nextInt();
            }

            // Check voting eligibility
            System.out.println("\nVoting Eligibility:");
            for (int i = 0; i < ages.length; i++) {
                int age = ages[i];

                if (age < 0) {
                    System.out.println("Invalid age for student " + (i+1));
                }
                else if (age >= 18) {
                    System.out.println("The student with the age " + age + " can vote.");
                }
                else {
                    System.out.println("The student with the age " + age + " cannot vote.");
                }
            }

            sc.close();
        }
    }
