import java.util.*;

class Trigonometry {

    static double[] calculate(double angle) {
        double rad = Math.toRadians(angle);

        return new double[]{
            Math.sin(rad),
            Math.cos(rad),
            Math.tan(rad)
        };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double angle = sc.nextDouble();

        double[] res = calculate(angle);

        System.out.println(res[0] + " " + res[1] + " " + res[2]);
    }
}
