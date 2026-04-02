import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class A_2115 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) solve(sc);
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        long[] v = new long[n];
        for (int i = 0; i < n; i++) {
            v[i] = sc.nextLong();
        }

        int MAX = 5001;
        int[] mi = new int[MAX];
        Arrays.fill(mi, Integer.MAX_VALUE);

        Queue<Long> q = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            mi[(int)v[i]] = 0;
            q.add(v[i]);
        }
        long g = 0;
        for (int i = 0; i < n; i++) {
            g = gcd(g, v[i]);
        }

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (v[i] == g) cnt++;
        }

        if (cnt > 0) {
            System.out.println(n - cnt);
            return;
        }

        while (!q.isEmpty()) {
            long val = q.poll();

            for (long x : v) {
                long gc = gcd(x, val);

                if (mi[(int)gc] == Integer.MAX_VALUE) {
                    mi[(int)gc] = mi[(int)val] + 1;
                    q.add(gc);
                }
            }
        }

        System.out.println(n + mi[(int)g] - 1);
    }

    static long gcd(long a, long b) {
        while (b != 0) {
            long t = b;
            b = a % b;
            a = t;
        }
        return a;
    }
}
