import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class D_2175 {
    static final long INF = (long)1e18;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) solve(sc);
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int k = sc.nextInt();

        long[] a = new long[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextLong();

        long[][] dp = new long[k + 1][k + 1];
        for (int i = 0; i <= k; i++)
            Arrays.fill(dp[i], -INF);
        for (int sum = 0; sum <= k; sum++)
            dp[sum][0] = 0;

        HashSet<Long> set = new HashSet<>();
        ArrayList<Integer> imp = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (!set.contains(a[i])) {
                imp.add(i);
                set.add(a[i]);
            }
        }
        imp.add(n);

        ArrayList<long[]> b = new ArrayList<>();
        for (int i = 0; i + 1 < imp.size(); i++) {
            long x = a[imp.get(i)];
            long y = imp.get(i + 1) - imp.get(i);
            b.add(new long[]{x, y});
        }

        for (long[] cur : b) {
            long x = cur[0], y = cur[1];

            long[][] ndp = new long[k + 1][k + 1];
            for (int i = 0; i <= k; i++)
                Arrays.fill(ndp[i], -INF);

            for (int sum = 0; sum <= k; sum++) {
                for (int val = 0; val <= sum; val++) {
                    ndp[sum][val] = Math.max(ndp[sum][val], dp[sum][val] + val * y);
                }
            }

            long[] best = new long[k + 1];
            Arrays.fill(best, -INF);

            for (int sum = 0; sum <= k; sum++) {
                for (int val = 0; val <= sum; val++) {
                    best[sum] = Math.max(best[sum], dp[sum][val]);
                }
            }

            for (int sum = 0; sum <= k; sum++) {
                int mx = (int)Math.min(sum, x);
                for (int newVal = 0; newVal <= mx; newVal++) {
                    ndp[sum][newVal] = Math.max(ndp[sum][newVal],
                                                best[sum - newVal] + newVal * y);
                }
            }

            dp = ndp;
        }

        long ans = -INF;
        for (int i = 0; i <= k; i++) ans = Math.max(ans, dp[k][i]);

        System.out.println(ans);
    }
}
