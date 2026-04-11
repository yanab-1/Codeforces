import java.util.Scanner;

public class D_991 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
    }

    private static void solve(Scanner sc) {
        String s1 = sc.next();
        String s2 = sc.next();
        int ans = 0;
        int x = 0;
        for (int i = 0; i < s1.length(); i++) {
            int y = 0;
            if (s1.charAt(i) == '0') y++;
            if (s2.charAt(i) == '0') y++;
            x += y;
            if (x >= 3) {
                ans++;
                x -= 3;
            } else {
                x = y;
            }
        }
        System.out.println(ans);
    }
}
