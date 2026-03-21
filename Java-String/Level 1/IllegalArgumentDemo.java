import java.util.*;

class IllegalArgumentDemo {

    static void handle(String str) {
        try {
            System.out.println(str.substring(5, 2));
        } catch (Exception e) {
            System.out.println("Handled IllegalArgumentException");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        handle(str);
    }
}