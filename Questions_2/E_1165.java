import java.util.Arrays;
import java.util.Scanner;

public class E_1165 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
    }

    static long MOD = 998244353;

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        long[] a = new long[n];
        for(int i = 0; i < n; i++){
            long x = sc.nextLong();
            a[i] = x * (i + 1) * 1l * (n - i);
        }
        int[] b = new int[n];
        for(int i = 0; i < n; i++){
            b[i] = sc.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b);
        long ans = 0;
        for(int i = 0; i < n; i++){
            ans = (ans + (a[i] % MOD) * 1l * b[n - 1 - i]) % MOD;
        }
        System.out.println(ans);
    }
}
