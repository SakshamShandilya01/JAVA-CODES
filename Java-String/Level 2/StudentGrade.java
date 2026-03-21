import java.util.*;

class StudentGrade {

    static String getGrade(double per) {
        if (per >= 90) return "A";
        else if (per >= 75) return "B";
        else if (per >= 50) return "C";
        else return "Fail";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int p = sc.nextInt();
            int c = sc.nextInt();
            int m = sc.nextInt();

            int total = p + c + m;
            double per = total / 3.0;

            System.out.println(per + " " + getGrade(per));
        }
    }
}