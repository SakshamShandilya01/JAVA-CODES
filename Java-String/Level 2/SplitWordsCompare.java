import java.util.*;

class SplitWordsCompare {

    static String[] splitWords(String str) {
        ArrayList<String> list = new ArrayList<>();
        String word = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                if (!word.equals("")) {
                    list.add(word);
                    word = "";
                }
            } else {
                word += str.charAt(i);
            }
        }
        if (!word.equals("")) list.add(word);

        return list.toArray(new String[0]);
    }

    static boolean compare(String[] a, String[] b) {
        if (a.length != b.length) return false;

        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String[] a = splitWords(str);
        String[] b = str.split(" ");

        System.out.println(compare(a, b));
    }
}