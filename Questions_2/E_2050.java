import java.util.Arrays;
import java.util.Scanner;

public class E_2050 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) solve(sc);
    }
    static String a;
    static String b;
    static String c;
    static int[][] dp;
    static int n, m, k;
    private static void solve(Scanner sc) {
        a = sc.next();
        b = sc.next();
        c = sc.next();
        n = a.length();
        m = b.length();
        k = c.length();
        dp = new int[n + 1][m + 1];
        for(int[] i : dp) {
            Arrays.fill(i, -1);
        }
        System.out.println(solve(0, 0));
    }
    private static int solve(int i, int j) {
        if(i == n && j == m){
            return 0;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        int ans = 1000000;
        if(i < n){
            int cost = (a.charAt(i) == c.charAt(i + j)) ? 0 : 1;
            ans = Math.min(ans, solve(i + 1, j) + cost);
        }
        if(j < m){
            int cost = (b.charAt(j) == c.charAt(i + j)) ? 0 : 1;
            ans = Math.min(ans, solve(i, j + 1) + cost);
        }
        return dp[i][j] = ans;
    }
}
