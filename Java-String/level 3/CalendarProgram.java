import java.util.*;

class CalendarProgram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int month = sc.nextInt();
        int year = sc.nextInt();

        int days = 30;

        System.out.println("Calendar for " + month + "/" + year);

        for (int i = 1; i <= days; i++) {
            System.out.print(i + " ");
            if (i % 7 == 0) System.out.println();
        }
    }
}