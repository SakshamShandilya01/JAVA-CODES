import java.util.*;

class BMIProgram {

    static String getStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 25) return "Normal";
        else return "Overweight";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            double weight = sc.nextDouble();
            double height = sc.nextDouble() / 100.0;

            double bmi = weight / (height * height);

            System.out.println(weight + " " + height + " " + bmi + " " + getStatus(bmi));
        }
    }
}