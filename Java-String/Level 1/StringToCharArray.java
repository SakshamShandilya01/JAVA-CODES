import java.util.*;

class StringToCharArray {

    static char[] convert(String str) {
        char[] arr = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }
        return arr;
    }

    static boolean compare(char[] a, char[] b) {
        if (a.length != b.length) return false;

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        char[] arr1 = convert(str);
        char[] arr2 = str.toCharArray();

        System.out.println(compare(arr1, arr2));
    }
}