import java.util.Scanner;

public class PurchasePrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double unitPrice;
        int quantity;

        System.out.print("Enter unit price: ");
        unitPrice = sc.nextDouble();

        System.out.print("Enter quantity: ");
        quantity = sc.nextInt();

        double totalPrice = unitPrice * quantity;

        System.out.println(
            "The total purchase price is INR " + totalPrice +
            " if the quantity " + quantity +
            " and unit price is INR " + unitPrice
        );
    }
}
