import java.util.Scanner;

class AreaofCircle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();

        double area = 3.14159 * radius * radius;

        System.out.println("Area of the circle = " + area);
    }
}
