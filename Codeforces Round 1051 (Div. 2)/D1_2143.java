import java.util.Arrays;
import java.util.Scanner;

public class D1_2143 {
    static int[][][] dp;
    static int[] a;
    static final int MOD = 1_000_000_007;
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        n = sc.nextInt();
        a = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        dp = new int[n][n + 1][n + 1];
        for(int[][] i : dp){
            for(int[] j : i){
                Arrays.fill(j, -1);
            }
        }
        System.out.println(dfs(0, 0, 0));
    }
    
    private static int dfs(int i, int x, int y){
        if(i == n){
            return 1;
        }
        if(dp[i][x][y] != -1){
            return dp[i][x][y];
        }
        long res = 0;
        res += dfs(i + 1, x, y) % MOD;
        if(a[i] >= x){
            res += dfs(i + 1, a[i], y) % MOD;
        }
        else if(a[i] >= y){
            res += dfs(i + 1, x, a[i]) % MOD;
        }
        return dp[i][x][y] = (int) (res % MOD);
    }
}
