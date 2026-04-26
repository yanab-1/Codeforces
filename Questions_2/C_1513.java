import java.util.Scanner;

public class C_1513 {

    static int MOD = 1_000_000_007;
    static int MAX = 200001;
    static int[] dp = new int[MAX];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 9; i++) dp[i] = 2;
        dp[9] = 3;
        for(int i = 10; i < MAX; i++){
            dp[i] = (dp[i - 9] + dp[i - 10]) % MOD;
        }
        int t = sc.nextInt();
        while(t-->0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        long ans = 0;
        while(n > 0){
            int x = n % 10;
            ans = (ans + (m + x < 10 ? 1 : dp[m + x - 10])) % MOD;
            n /= 10;
        }
        System.out.println(ans);
    }
}
