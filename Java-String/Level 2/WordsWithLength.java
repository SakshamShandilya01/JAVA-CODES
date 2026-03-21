import java.util.*;

class WordsWithLength {

    static String[][] getWords(String str) {
        String[] words = str.split(" ");
        String[][] res = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            res[i][0] = words[i];
            res[i][1] = String.valueOf(words[i].length());
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String[][] arr = getWords(str);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }
    }
}