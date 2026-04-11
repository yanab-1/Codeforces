import java.util.Arrays;
import java.util.Scanner;

public class C_1842 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            solve(sc);
        }
    }

    static int[] dp;
    static int[] a;
    static int[] range;
    static int n;

    private static void solve(Scanner sc) {
        n = sc.nextInt();
        a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt() - 1;
        }
        dp = new int[n + 1];
        range = new int[n];
        Arrays.fill(range, Integer.MIN_VALUE);
        Arrays.fill(dp, -1);
        System.out.println(solve2(0));
    }

    private static int solve2(int i) {
        if(i == n) return 0;
        if(dp[i] != -1) return dp[i];
        int skip = solve2(i + 1);
        int take = 0;
        if(range[a[i]] != Integer.MIN_VALUE){
            take = range[a[i]] - i + 1;
        }
        range[a[i]] = Math.max(range[a[i]], i + skip);
        return dp[i] = Math.max(skip, take);
    }
}
