import java.util.*;

class CharacterType {

    static String check(char ch) {
        if (!Character.isLetter(ch)) return "Not Letter";

        ch = Character.toLowerCase(ch);

        if ("aeiou".indexOf(ch) != -1) return "Vowel";
        else return "Consonant";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i) + " -> " + check(str.charAt(i)));
        }
    }
}