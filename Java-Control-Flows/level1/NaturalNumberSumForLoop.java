import java.util.Scanner;

public class NaturalNumberSumForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("The number is not a natural number");
        } else {
            // Sum using formula
            int formulaSum = n * (n + 1) / 2;

            // Sum using for loop
            int loopSum = 0;
            for (int i = 1; i <= n; i++) {
                loopSum += i;
            }

            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using for loop: " + loopSum);

            if (formulaSum == loopSum) {
                System.out.println("Both computations are correct");
            } else {
                System.out.println("The computations are not equal");
            }
        }
    }
}
