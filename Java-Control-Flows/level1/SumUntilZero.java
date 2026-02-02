import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = 0.0;
        double number;

        System.out.print("Enter number: ");
        number = sc.nextDouble();

        while (number != 0) {
            total += number;
            System.out.print("Enter number: ");
            number = sc.nextDouble();
        }

        System.out.println("Total sum is: " + total);
    }
}
