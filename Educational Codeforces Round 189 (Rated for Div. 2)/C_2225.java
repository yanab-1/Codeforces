import java.util.Arrays;
import java.util.Scanner;

public class C_2225 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) solve(sc);
    }

    static char[][] a;
    static int n;
    static int[][] dp;
    static int inf = 1_000_000_000;

    private static void solve(Scanner sc) {
        n = sc.nextInt();
        a = new char[n][2];
        String s1 = sc.next();
        String s2 = sc.next();
        for(int i = 0; i < n; i++){
            a[i][0] = s1.charAt(i);
            a[i][1] = s2.charAt(i);
        }
        dp = new int[n][4];
        for(int[] i : dp){
            Arrays.fill(i, -1);
        }
        System.out.println(solve2(0, 0));
    }

    private static int solve2(int i, int m){
        if(i == n){
            if(m == 0) return 0;
            return inf;
        }
        if (dp[i][m] != -1) return dp[i][m];
        int ans = inf;
        if (m == 0) {
            int c = (a[i][0] == a[i][1]) ? 0 : 1;
            ans = Math.min(ans, c + solve2(i + 1, 0));
            if (i + 1 < n) {
                int c1 = (a[i][0] == a[i + 1][0] ? 0 : 1)
                          + (a[i][1] == a[i + 1][1] ? 0 : 1);
                ans = Math.min(ans, c1 + solve2(i + 1, 3));
            }
        }
        else if (m == 1) {
            if (i + 1 < n) {
                int c = (a[i][1] == a[i + 1][1]) ? 0 : 1;
                ans = Math.min(ans, c + solve2(i + 1, 2));
            }
        }
        else if (m == 2) {
            if (i + 1 < n) {
                int c = (a[i][0] == a[i + 1][0]) ? 0 : 1;
                ans = Math.min(ans, c + solve2(i + 1, 1));
            }
        }
        else if (m == 3) {
            ans = Math.min(ans, solve2(i + 1, 0));
        }
        return dp[i][m] = ans;
    }
}
