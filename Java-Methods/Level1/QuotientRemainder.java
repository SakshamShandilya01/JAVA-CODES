import java.util.*;

class QuotientRemainder {

    static int[] calculate(int a, int b) {
        return new int[]{a / b, a % b};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int[] res = calculate(a, b);

        System.out.println(res[0] + " " + res[1]);
    }
}
