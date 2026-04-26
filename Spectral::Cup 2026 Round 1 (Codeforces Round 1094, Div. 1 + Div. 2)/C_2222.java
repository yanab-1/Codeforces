import java.util.Arrays;
import java.util.Scanner;

public class C_2222 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
    }

    static int n;
    static int[] a;
    static int[] preMax, preMin;
    static int[] dp;
    static int m;

    private static void solve(Scanner sc) {
        n = sc.nextInt();
        a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        int[] b = a.clone();
        Arrays.sort(b);
        m = b[n / 2];
        preMax = new int[n + 1];
        preMin = new int[n + 1];
        for (int i = 0; i < n; i++) {
            preMax[i + 1] = preMax[i] + (a[i] > m ? 1 : 0);
            preMin[i + 1] = preMin[i] + (a[i] < m ? 1 : 0);
        }
        dp = new int[n + 1];
        Arrays.fill(dp, -2);
        System.out.println(solve(0));
    }
    static int solve(int i) {
        if (i == n) return 0;
        if (dp[i] != -2) return dp[i];
        int ans = -1;
        for (int j = i + 1; j <= n; j += 2) {
            int len = j - i;
            int g = preMax[j] - preMax[i];
            int l = preMin[j] - preMin[i];
            if (g <= len / 2 && l <= len / 2) {
                int next = solve(j);
                if (next != -1) {
                    ans = Math.max(ans, 1 + next);
                }
            }
        }
        return dp[i] = ans;
    }
}
