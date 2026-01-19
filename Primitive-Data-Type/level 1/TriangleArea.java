

public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double base, height;
        System.out.print("Enter base: ");
        base = input.nextDouble();

        System.out.print("Enter height: ");
        height = input.nextDouble();

        double areaInches = 0.5 * base * height;
        double areaCm = areaInches * Math.pow(2.54, 2);

        System.out.println(
            "The area of the triangle is " + areaInches +
            " square inches and " + areaCm + " square centimeters"
        );

        input.close();
    }
}
