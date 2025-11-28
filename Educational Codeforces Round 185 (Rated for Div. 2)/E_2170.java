import java.util.*;

public class E_2170 {
    static final int MOD = 998244353;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int t = sc.nextInt(); t-- > 0;) solve(sc);
    }

    static void solve(Scanner sc) {
        int n = sc.nextInt(), k = sc.nextInt();
        int[] L = new int[n + 1];

        while (k-- > 0) {
            int s = sc.nextInt(), e = sc.nextInt();
            L[e] = Math.max(L[e], s);
        }
        for (int i = 1; i <= n; i++) L[i] = Math.max(L[i], L[i - 1]);

        int[] pref = new int[n + 1];
        int[] ways = new int[n + 1];
        pref[0] = 2;

        for (int i = 1; i <= n; i++) {
            int v = pref[i - 1];
            if (L[i] > 0) v = (v - pref[L[i] - 1] + MOD) % MOD;
            ways[i] = v;
            pref[i] = (pref[i - 1] + v) % MOD;
        }
        System.out.println(ways[n]);
    }
}
