package com.gla.arrays.Level1;

import java.util.Scanner;

public class MeanHeightFootballTeam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] heights = new double[11];
        System.out.println("Enter heights of 11 football players:");
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Player " + (i+1) + ": ");
            heights[i] = sc.nextDouble();
        }
        double sum = 0.0;
        for (double height : heights) {
            sum += height;
        }
        double mean = sum / 11;
        System.out.printf("\nMean height of football team: %.2f%n", mean);

        sc.close();
    }
}

