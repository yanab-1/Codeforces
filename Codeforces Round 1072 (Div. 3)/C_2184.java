import java.util.Scanner;

public class C_2184 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        long n = sc.nextLong();
        long k = sc.nextLong();

        long lo = n, hi = n;
        long ans = 0;

        while (!(lo <= k && k <= hi)) {
            if (k > hi) break;
            hi = (hi + 1) / 2;
            lo = lo / 2;
            ans++;
        }

        if (lo <= k && k <= hi) System.out.println(ans);
        else System.out.println(-1);
    }
}
