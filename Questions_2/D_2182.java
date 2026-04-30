import java.util.Scanner;

public class D_2182 {

    static long MOD = 998244353;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int[] a = new int[n + 1];
        for(int i = 0; i <= n; i++){
            a[i] = sc.nextInt();
        }
        long s = 0;
        for(int i = 0; i <= n; i++){
            s += a[i];
        }
        int r = (int)(s / n);
        int m = (int)(s % n);
        int mx = Integer.MIN_VALUE;
        for(int i = 1; i <= n; i++){
            mx = Math.max(mx, a[i]);
        }
        int cnt = 0;
        for(int i = 1; i <= n; i++){
            if(a[i] == mx) cnt++;
        }
        if((m != 0 && (mx > r + 1 || (mx == r + 1 && cnt > m))) ||
           (m == 0 && mx > r)) {
            System.out.println(0);
            return;
        }
        long[] fact = new long[n + 1];
        fact[0] = 1;
        for(int i = 1; i <= n; i++){
            fact[i] = (fact[i - 1] * i) % MOD;
        }
        if(mx == r + 1){
            long ans = nCr(n - cnt, m - cnt);
            ans = (ans * fact[m]) % MOD;
            ans = (ans * fact[n - m]) % MOD;
            System.out.println(ans);
        } else {
            System.out.println(fact[n]);
        }
    }

    private static long power(long a, long n){
        if(n == 0) return 1;
        long ans = power(a, n / 2);
        ans = (ans * ans) % MOD;
        if(n % 2 == 1) ans = (ans * a) % MOD;
        return ans;
    }

    private static long modInverse(long n) {
        return power(n, MOD - 2);
    }

    private static long nCr(long n, long r) {
        if (r < 0 || r > n) return 0;

        long num = 1;
        for (long i = 0; i < r; i++)
            num = (num * (n - i)) % MOD;

        long den = 1;
        for (long i = 1; i <= r; i++)
            den = (den * i) % MOD;

        return (num * modInverse(den)) % MOD;
    }
}