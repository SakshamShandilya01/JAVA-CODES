package com.gla.arrays.Level2;

import java.util.Scanner;

public class YoungestAndTallestFriends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] friends = {"Amar", "Akbar", "Anthony"};
        double[] ages = new double[3];
        double[] heights = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.print(friends[i] + " - Age: ");
            ages[i] = sc.nextDouble();
            System.out.print(friends[i] + " - Height (cm): ");
            heights[i] = sc.nextDouble();
        }
        int youngestIndex = 0;
        int tallestIndex = 0;

        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }
        System.out.println("\n Final Results Are : ");
        System.out.printf("%s is the YOUNGEST (age: %.1f)%n",
                friends[youngestIndex], ages[youngestIndex]);
        System.out.printf("%s is the TALLEST (height: %.1f cm)%n",
                friends[tallestIndex], heights[tallestIndex]);

        sc.close();
    }
}
