import java.util.Scanner;

public class G_2167 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0) solve(sc);    
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        long[] c = new long[n];
        long sum = 0;
        for (int i = 0; i < n; i++) {
            c[i] = sc.nextInt();
            sum += c[i];
        }
        long[] dp = new long[n];
        for(int i = 0; i < n; i++){
            dp[i] = c[i];
            for(int j = 0; j < i; j++){
                if(a[j] <= a[i]){
                    dp[i] = Math.max(dp[i], dp[j] + c[i]);
                }
            }
        }
        long ans = 0;
        for(long i : dp){
            ans = Math.max(ans, i);
        }
        System.out.println(sum - ans);
    }
}
