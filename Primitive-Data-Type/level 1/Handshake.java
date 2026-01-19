import java.util.Scanner;

public class Handshakes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numberOfStudents;
        System.out.print("Enter number of students: ");
        numberOfStudents = input.nextInt();

        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        System.out.println(
            "The maximum number of handshakes is " + handshakes
        );

        input.close();
    }
}
