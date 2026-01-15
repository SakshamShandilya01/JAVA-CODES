import java.util.Scanner;

class VolumeofCylinder {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double radius = sc.nextDouble();

                double height = sc.nextDouble();

               double volume = 3.14159 * radius * radius * height;


        System.out.println("Volume of the cylinder = " + volume);
    }
}
