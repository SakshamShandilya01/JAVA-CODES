import java.util.Scanner;

class CelsiustoFarenheitConversion {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

      
   
        double celsius = sc.nextDouble();

 
        double fahrenheit = (celsius * 9 / 5) + 32;


        System.out.println("Temperature in Fahrenheit = " + fahrenheit);
    }
}
