import java.util.*;

class ChocolatesDistribution {

    static int[] distribute(int chocolates, int children) {
        return new int[]{chocolates / children, chocolates % children};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ch = sc.nextInt();
        int c = sc.nextInt();

        int[] res = distribute(ch, c);

        System.out.println(res[0] + " " + res[1]);
    }
}
