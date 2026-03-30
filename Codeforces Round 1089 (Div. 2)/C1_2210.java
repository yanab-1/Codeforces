import java.util.Scanner;

public class C1_2210 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0) solve(sc);    
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        int[] b = new int[n];
        for(int i = 0; i < n; i++){
            b[i] = sc.nextInt();
        }
        long[] g = new long[n];
        for (int i = 0; i < n - 1; i++) {
            g[i] = gcd(a[i], a[i + 1]);
        }
        long ans = 0;
        for (int i = 0; i < n; i++) {
            long cur;
            if (i == 0) {
                cur = g[0];
            } else if (i == n - 1) {
                cur = g[n - 2];
            } else {
                cur = lcm(g[i - 1], g[i]);
            }
            if (a[i] > cur) ans++;
        }
        System.out.println(ans);
    }

    public static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static long lcm(long a, long b) {
        return a / gcd(a, b) * b;
    }

}
