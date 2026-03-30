import java.util.Scanner;

public class E_2195 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0) solve(sc);    
    }

    static int[] l;
    static int[] r;
    static long[] dp;
    static long MOD = 1_000_000_007;

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        l = new int[n];
        r = new int[n];
        for(int i = 0; i < n; i++){
            l[i] = sc.nextInt() - 1;
            r[i] = sc.nextInt() - 1;
        }
        dp = new long[n];

        dfs(0);
        dfs1(0);

        for(long i : dp){
            System.out.print(i % MOD + " ");
        }
        System.out.println();
    }

    private static long dfs(int i) {
        if(l[i] == -1){
            return dp[i] = 1;
        }
        long left = dfs(l[i]) % MOD;
        long right = dfs(r[i]) % MOD;
        return dp[i] = (left + right + 3) % MOD;
    }

    private static void dfs1(int i) {
        if(l[i] == -1){
            return;
        }
        dp[l[i]] = (dp[l[i]] + dp[i]) % MOD;
        dp[r[i]] = (dp[r[i]] + dp[i]) % MOD;
        dfs1(l[i]);
        dfs1(r[i]);
    }
}
