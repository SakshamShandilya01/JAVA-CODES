import java.util.Scanner;

public class SumUntilZeroOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = 0.0;

        while (true) {
            System.out.print("Enter number: ");
            double number = sc.nextDouble();

            if (number <= 0) {
                break;
            }

            total += number;
        }

        System.out.println("Total sum is: " + total);
    }
}
