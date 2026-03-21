import java.util.*;

class TrimString {

    static String trim(String str) {
        int start = 0, end = str.length() - 1;

        while (start <= end && str.charAt(start) == ' ') start++;
        while (end >= start && str.charAt(end) == ' ') end--;

        String res = "";
        for (int i = start; i <= end; i++) {
            res += str.charAt(i);
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String s1 = trim(str);
        String s2 = str.trim();

        System.out.println(s1.equals(s2));
    }
}