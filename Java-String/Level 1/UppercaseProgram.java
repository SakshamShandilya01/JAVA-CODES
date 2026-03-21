import java.util.*;

class UppercaseProgram {

    static String convert(String str) {
        String res = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                ch = (char)(ch - 32);
            }
            res += ch;
        }
        return res;
    }

    static boolean compare(String a, String b) {
        return a.equals(b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String s1 = convert(str);
        String s2 = str.toUpperCase();

        System.out.println(compare(s1, s2));
    }
}