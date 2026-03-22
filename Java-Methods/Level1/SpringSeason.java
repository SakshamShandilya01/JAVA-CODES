import java.util.*;

class SpringSeason {

    static boolean isSpring(int month, int day) {
        if ((month == 3 && day >= 20) ||
            (month == 4 || month == 5) ||
            (month == 6 && day <= 20)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int month = sc.nextInt();
        int day = sc.nextInt();

        System.out.println(isSpring(month, day));
    }
}
