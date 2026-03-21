import java.util.*;

class SubstringProgram {

    static String makeSubstring(String str, int start, int end) {
        String res = "";
        for (int i = start; i < end; i++) {
            res += str.charAt(i);
        }
        return res;
    }

    static boolean compare(String a, String b) {
        if (a.length() != b.length()) return false;

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int start = sc.nextInt();
        int end = sc.nextInt();

        String s1 = makeSubstring(str, start, end);
        String s2 = str.substring(start, end);

        System.out.println(compare(s1, s2));
    }
}