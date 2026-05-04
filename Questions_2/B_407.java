import java.util.*;

public class B_407 {
    static int MOD = 1000000007;
    static int n;
    static int[] p;
    static long[] dp;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        p = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            p[i] = sc.nextInt();
        }

        dp = new long[n + 1];
        Arrays.fill(dp, -1);

        System.out.println(f(n));
    }

    static long f(int i) {
        if (i == 0) return 0;
        if (dp[i] != -1) return dp[i];
        long ans = (2 * f(i - 1) % MOD - f(p[i] - 1) % MOD + 2) % MOD;
        if (ans < 0) ans += MOD;
        return dp[i] = ans;
    }
}