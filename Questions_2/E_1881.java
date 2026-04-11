import java.util.Arrays;
import java.util.Scanner;

public class E_1881 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            solve(sc);
        }
    }

    static int[] dp;
    static int[] a;
    static int n;

    private static void solve(Scanner sc) {
        n = sc.nextInt();
        a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        dp = new int[n + 1];
        Arrays.fill(dp, -1);
        System.out.println(solve2(0));
    }

    private static int solve2(int i){
        if(i == n){
            return 0;
        }
        if(dp[i] != -1){
            return dp[i];
        }
        int skip = 1 + solve2(i + 1);
        int take = Integer.MAX_VALUE;
        if(a[i] <= n - i - 1){
            take = solve2(i + a[i] + 1);
        }
        return dp[i] = Math.min(skip, take);
    } 
}
