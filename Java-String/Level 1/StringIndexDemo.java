import java.util.*;

class StringIndexDemo {

    static void handle(String str) {
        try {
            System.out.println(str.charAt(100));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Handled StringIndexOutOfBoundsException");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        handle(str);
    }
}