import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class F_2193 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            solve(sc);
        }
    }

    static long[][] dp;
    static List<long[]> b;

    private static long solve(int i, int state) {
        if (i == b.size()) return 0;
        if (dp[i][state] != -1) return dp[i][state];
        long[] curr = b.get(i);
        long[] prev = b.get(i - 1);
        long x = curr[0], y1 = curr[1], y2 = curr[2];
        long px = prev[0], py1 = prev[1], py2 = prev[2];
        long base = (x - px) + (y2 - y1);
        long res;
        if (state == 0) {
            long op1 = Math.abs(y1 - py2) + solve(i + 1, 0);
            long op2 = Math.abs(y2 - py2) + solve(i + 1, 1);
            res = Math.min(op1, op2) + base;
        } else {
            long op1 = Math.abs(y1 - py1) + solve(i + 1, 0);
            long op2 = Math.abs(y2 - py1) + solve(i + 1, 1);
            res = Math.min(op1, op2) + base;
        }

        return dp[i][state] = res;
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        long ax = sc.nextLong(), ay = sc.nextLong();
        long bx = sc.nextLong(), by = sc.nextLong();
        long[] x = new long[n];
        long[] y = new long[n];
        for (int i = 0; i < n; i++) x[i] = sc.nextLong();
        for (int i = 0; i < n; i++) y[i] = sc.nextLong();
        long[][] a = new long[n][2];
        for (int i = 0; i < n; i++) {
            a[i][0] = x[i];
            a[i][1] = y[i];
        }
        Arrays.sort(a, Comparator.comparingLong(o -> o[0]));
        b = new ArrayList<>();
        b.add(new long[]{ax, ay, ay});
        for (int i = 0; i < n; i++) {
            int j = i;
            long mn = a[i][1], mx = a[i][1];
            while (j + 1 < n && a[j + 1][0] == a[i][0]) {
                j++;
                mn = Math.min(mn, a[j][1]);
                mx = Math.max(mx, a[j][1]);
            }
            b.add(new long[]{a[i][0], mn, mx});
            i = j;
        }
        b.add(new long[]{bx, by, by});
        dp = new long[b.size()][2];
        for (long[] row : dp) Arrays.fill(row, -1);
        long ans = solve(1, 0);
        System.out.println(ans);
    }
}
