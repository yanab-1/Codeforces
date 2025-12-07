import java.util.Scanner;

public class D_2173 {

    static final int INF = (int)1e9 + 7;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            for (int i = 0; i < t; i++) {
                solve(sc);
            }
        }
    }

    public static void solve(Scanner sc) {
        long n = sc.nextLong();
        int k = sc.nextInt();
        if (k == 0) {
            System.out.println(0);
            return;
        }
        int[] a = new int[31];
        for (int i = 0; i < 30; i++) {
            a[i + 1] = (int)((n >> i) & 1L);
        }
        for (int i = 1; i <= 30; i++) {
            a[i] += a[i - 1];
        }
        int[][] dp = new int[31][31];
        for (int i = 1; i <= 30; i++) {
            for (int j = 0; j <= 30; j++) {
                dp[i][j] = Math.max(dp[i][j], dp[i - 1][j]);
            }
            for (int j = 0; j <= 30; j++) {
                for (int kk = i; kk <= 30; kk++) {
                    int have = a[kk] - a[i - 1]; 
                    int total = kk - i + 1;
                    int need = (total - have) + 1;
                    if (j + need > 30) continue;
                    dp[kk][j + need] = Math.max(dp[kk][j + need], dp[i - 1][j] + (kk - i + 1));
                }
            }
        }
        int ans = 0;
        for (int i = 0; i <= 30; i++) {
            if (i <= k) {
                ans = Math.max(ans, dp[30][i] + (k - i));
            }
        }
        System.out.println(ans);
    }
}