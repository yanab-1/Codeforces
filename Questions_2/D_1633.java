import java.util.Arrays;
import java.util.Scanner;

public class D_1633 {

    static int N = 1001;
    static int[] d = new int[N];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Arrays.fill(d, N);
        d[1] = 0;
        for (int i = 1; i < N; i++) {
            for (int x = 1; x <= i; x++) {
                int j = i + i / x;
                if (j < N) {
                    d[j] = Math.min(d[j], d[i] + 1);
                }
            }
        }
        int t = sc.nextInt();
        while(t-->0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] b = new int[n];
        int[] c = new int[n];
        for(int i = 0; i < n; i++){
            b[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            c[i] = sc.nextInt();
        }
        int sum = 0;
        for (int x : b) sum += d[x];
        k = Math.min(k, sum);
        int[] dp = new int[k + 1];
        for (int i = 0; i < n; i++) {
            int cost = d[b[i]];
            for (int j = k - cost; j >= 0; j--) {
                dp[j + cost] = Math.max(dp[j + cost], dp[j] + c[i]);
            }
        }

        int ans = 0;
        for (int val : dp) {
            ans = Math.max(ans, val);
        }

        System.out.println(ans);
    }
}
