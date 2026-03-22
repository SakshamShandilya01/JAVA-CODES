import java.util.*;

class SimpleInterest {

    static double calculate(double p, double r, double t) {
        return (p * r * t) / 100;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double p = sc.nextDouble();
        double r = sc.nextDouble();
        double t = sc.nextDouble();

        double si = calculate(p, r, t);

        System.out.println(si);
    }
}
