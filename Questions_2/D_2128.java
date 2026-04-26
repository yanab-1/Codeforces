import java.util.Scanner;

public class D_2128 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int[] p = new int[n];
        for(int i = 0; i < n; i++){
            p[i] = sc.nextInt();
        }
        long[] dp = new long[n];
        dp[0] = 1;
        if(n > 1){
            dp[1] = p[1] < p[0] ? 2 : 1;
        }
        for(int i = 2; i < n; i++){
            if(p[i] < p[i - 1]){
                dp[i] = dp[i - 1] + 1;
            }else{
                dp[i] = dp[i - 2] + 1;
            }
        }
        long sum = 0;
        for(int i = 0; i < n; i++){
            sum += dp[i];
        }
        long ans = sum;
        for(int i = 0; i < n - 1; i++){
            sum--;
            if(dp[i] != dp[i + 1]){
                sum -= (n - i - 1);
            }
            ans += sum;
        }
        System.out.println(ans);
    }
}
