import java.util.*;

class AnagramCheck {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        if (a.length() != b.length()) {
            System.out.println(false);
            return;
        }

        int[] freq = new int[256];

        for (int i = 0; i < a.length(); i++) {
            freq[a.charAt(i)]++;
            freq[b.charAt(i)]--;
        }

        for (int i = 0; i < 256; i++) {
            if (freq[i] != 0) {
                System.out.println(false);
                return;
            }
        }

        System.out.println(true);
    }
}