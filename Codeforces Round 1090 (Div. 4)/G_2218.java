import java.util.Scanner;

public class G_2218 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--> 0){
            solve(sc);
        }
    }

    static int MOD = 676767677;

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] b = new int[n];
        for(int i = 0; i < n; i++) b[i] = sc.nextInt();
        int[] cnt = new int[m + 1];
        for (int i = 0; i < n; i++) {
            cnt[b[i]]++;
        }
        long[] p = new long[m + 1];
        for (int i = 1; i <= m; i++) {
            p[i] = p[i - 1] + cnt[i - 1];
        }
        long ans = 1;
        for (int i = 0; i < n; i++) {
            if (b[i] > 0) {
                int tVal = Integer.MAX_VALUE;
                if (i - 1 >= 0) {
                    tVal = Math.min(tVal, b[i - 1]);
                }
                if (i + 1 < n) {
                    tVal = Math.min(tVal, b[i + 1]);
                }
                tVal += 1;
                if (b[i] > tVal) {
                    ans = (ans * cnt[b[i] - 1]) % MOD;
                } else if (b[i] == tVal) {
                    ans = (ans * p[b[i]]) % MOD;
                } else {
                    ans = 0;
                }
            }
        }
        System.out.println(ans);
    }
}
