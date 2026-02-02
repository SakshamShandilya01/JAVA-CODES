import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int originalNumber = number;
        int sum = 0;

        // Find sum of digits
        while (number != 0) {
            int digit = number % 10;
            sum = sum + digit;
            number = number / 10;
        }

        // Check Harshad condition
        if (originalNumber % sum == 0) {
            System.out.println(originalNumber + " is a Harshad Number");
        } else {
            System.out.println(originalNumber + " is not a Harshad Number");
        }

        sc.close();
    }
}
