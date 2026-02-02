import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input weight and height
        System.out.print("Enter weight (in kg): ");
        double weight = sc.nextDouble();

        System.out.print("Enter height (in cm): ");
        double heightCm = sc.nextDouble();

        // Convert height from cm to meters
        double heightM = heightCm / 100;

        // Calculate BMI
        double bmi = weight / (heightM * heightM);

        System.out.println("BMI: " + bmi);

        // Determine weight status
        if (bmi <= 18.4) {
            System.out.println("Status: Underweight");
        } 
        else if (bmi <= 24.9) {
            System.out.println("Status: Normal");
        } 
        else if (bmi <= 39.9) {
            System.out.println("Status: Overweight");
        } 
        else {
            System.out.println("Status: Obese");
        }

        sc.close();
    }
}
