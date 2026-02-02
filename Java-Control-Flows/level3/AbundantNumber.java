import java.util.Scanner;

public class AbundantNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int sum = 0;

        // Find sum of divisors
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum = sum + i;
            }
        }

        // Check Abundant condition
        if (sum > number) {
            System.out.println(number + " is an Abundant Number");
        } else {
            System.out.println(number + " is not an Abundant Number");
        }

        sc.close();
    }
}
