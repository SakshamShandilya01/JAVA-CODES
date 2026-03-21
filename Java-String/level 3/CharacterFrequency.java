import java.util.*;

class CharacterFrequency {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int[] freq = new int[256];

        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                System.out.println((char)i + " " + freq[i]);
            }
        }
    }
}