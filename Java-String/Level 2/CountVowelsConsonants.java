import java.util.*;

class CountVowelsConsonants {

    static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int v = 0, c = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isLetter(ch)) {
                if (isVowel(ch)) v++;
                else c++;
            }
        }

        System.out.println("Vowels: " + v);
        System.out.println("Consonants: " + c);
    }
}