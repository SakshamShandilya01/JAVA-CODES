import java.util.*;

class RockPaperScissors {

    static int getComputer() {
        return (int)(Math.random() * 3);
    }

    static int winner(int user, int comp) {
        if (user == comp) return 0;
        if ((user==0&&comp==2)||(user==1&&comp==0)||(user==2&&comp==1)) return 1;
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int userWin = 0, compWin = 0;

        for (int i = 0; i < n; i++) {
            int user = sc.nextInt();
            int comp = getComputer();

            int res = winner(user, comp);

            if (res == 1) userWin++;
            else if (res == -1) compWin++;
        }

        System.out.println("User: " + userWin);
        System.out.println("Computer: " + compWin);
    }
}