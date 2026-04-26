import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class D_1875 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            solve(sc);
        }
    }

    static int n;
    static int[] a;
    static  Map<Integer, Integer> freq;
    static int[][] dp;

    private static int solve2(int i, int mex){
        if (i == 0) {
            return (freq.getOrDefault(0, 0) - 1) * mex;
        }

        if (dp[i][mex] != -1) return dp[i][mex];

        int take = (freq.getOrDefault(i, 0) - 1) * mex + i + solve2(i - 1, i);
        int skip = solve2(i - 1, mex);

        dp[i][mex] = Math.min(take, skip);
        return dp[i][mex];
    }

    private static void solve(Scanner sc) {
        n = sc.nextInt();
        a = new int[n];
        freq = new HashMap<>();
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            freq.put(a[i], freq.getOrDefault(a[i], 0) + 1);
        }
        if (freq.getOrDefault(0, 0) <= 1) {
            System.out.println(0);
            return;
        }
        int mex = 1;
        for (int i = 1; i <= n; i++) {
            if (!freq.containsKey(i)) {
                mex = i;
                break;
            }
        }
        dp = new int[mex + 1][mex + 1];
        for(int[] i : dp){
            Arrays.fill(i, -1);
        }
        System.out.println(solve2(mex - 1, mex));
    }
}
