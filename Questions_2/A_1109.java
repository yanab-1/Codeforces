import java.util.Scanner;

public class A_1109 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
    }

    static final int MAX = (1 << 20) + 3;

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[][] dp = new int[2][MAX];
        dp[1][0] = 1;
        int x = 0;
        long res = 0;
        for (int i = 0; i < n; i++) {
            x ^= a[i];
            res += dp[i % 2][x];
            dp[i % 2][x]++;
        }
        System.out.println(res);
    }
}
