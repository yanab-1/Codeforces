import java.util.Scanner;

public class D_2167 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0) solve(sc);    
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
        long ans = Long.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            ans = Math.min(ans, smallestCoprimeGreaterThanOne(a[i]));
        }
        System.out.println(ans);
    } 
    static long gcd(long a, long b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    static long smallestCoprimeGreaterThanOne(long n) {
        for (long i = 2; ; i++) {
            if (gcd(n, i) == 1) return i;
        }
    }
}
