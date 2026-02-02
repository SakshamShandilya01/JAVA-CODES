import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input marks
        System.out.print("Enter Physics marks: ");
        int physics = sc.nextInt();

        System.out.print("Enter Chemistry marks: ");
        int chemistry = sc.nextInt();

        System.out.print("Enter Maths marks: ");
        int maths = sc.nextInt();

        // Calculate total and percentage
        int total = physics + chemistry + maths;
        double percentage = total / 3.0;

        System.out.println("\nAverage Marks: " + percentage + "%");

        // Grade calculation
        if (percentage >= 80) {
            System.out.println("Grade: A");
            System.out.println("Remarks: Level 4, above agency-normalized standards");
        }
        else if (percentage >= 70) {
            System.out.println("Grade: B");
            System.out.println("Remarks: Level 3, at agency-normalized standards");
        }
        else if (percentage >= 60) {
            System.out.println("Grade: C");
            System.out.println("Remarks: Level 2, below but approaching agency-normalized standards");
        }
        else if (percentage >= 50) {
            System.out.println("Grade: D");
            System.out.println("Remarks: Level 1, well below agency-normalized standards");
        }
        else if (percentage >= 40) {
            System.out.println("Grade: E");
            System.out.println("Remarks: Level 1-, too below agency-normalized standards");
        }
        else {
            System.out.println("Grade: R");
            System.out.println("Remarks: Remedial standards");
        }

        sc.close();
    }
}
