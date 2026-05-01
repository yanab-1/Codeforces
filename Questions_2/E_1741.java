import java.util.Scanner;

public class E_1741 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            solve(sc);
        }
    }

    static int n;
    static int[] b;
    static boolean[] dp;

    private static void solve(Scanner sc) {
        n = sc.nextInt();
        b = new int[n];
        for(int i = 0; i < n; i++){
            b[i] = sc.nextInt();
        }
        dp = new boolean[n + 1];
        dp[0] = true;
        for(int i = 1; i <= n; i++){
            if(i + b[i - 1] <= n && dp[i - 1]) dp[i + b[i - 1]] = true;
            if(i - b[i - 1] - 1 >= 0 && dp[i - b[i - 1] - 1]) dp[i] = true;
        }
        System.out.println(dp[n] ? "YES" : "NO");
    }
}
