import java.util.Scanner;

public class B_2116 {
    static final int MAX_N = 100000;
    static long[] pow2 = new long[MAX_N + 1];

    public static void main(String[] args) {
        final int MOD = 998244353;
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        pow2[0] = 1;
        for (int i = 1; i <= MAX_N; i++) {
            pow2[i] = (pow2[i - 1] * 2) % MOD;
        }
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] p = new int[n];
            for (int i = 0; i < n; i++) p[i] = sc.nextInt();
            int[] q = new int[n];
            for (int i = 0; i < n; i++) q[i] = sc.nextInt();

            int[] pmax = new int[n];
            int[] pidx = new int[n];
            pmax[0] = p[0];
            pidx[0] = 0;
            for (int i = 1; i < n; i++) {
                if (p[i] > pmax[i - 1]) {
                    pmax[i] = p[i];
                    pidx[i] = i;
                } else {
                    pmax[i] = pmax[i - 1];
                    pidx[i] = pidx[i - 1];
                }
            }
            int[] qmax = new int[n];
            int[] qidx = new int[n];
            qmax[0] = q[0];
            qidx[0] = 0;
            for (int i = 1; i < n; i++) {
                if (q[i] > qmax[i - 1]) {
                    qmax[i] = q[i];
                    qidx[i] = i;
                } else {
                    qmax[i] = qmax[i - 1];
                    qidx[i] = qidx[i - 1];
                }
            }
            long[] r = new long[n];
            for (int i = 0; i < n; i++) {
                int pm = pmax[i];
                int qm = qmax[i];
                int a, b;
                if (pm > qm) {
                    a = pm;
                    int j = pidx[i];
                    int k = i - j;
                    b = q[k];
                } else if (pm < qm) {
                    a = qm;
                    int j = qidx[i];
                    int k = i - j;
                    b = p[k];
                } else {
                    a = pm;
                    int j = pidx[i];
                    int k = qidx[i];
                    int c1 = q[i - j];
                    int c2 = p[i - k];
                    b = Math.max(c1, c2);
                }
                r[i] = (pow2[a] + pow2[b]) % MOD;
            }
            for (int i = 0; i < n; i++) {
                System.out.print(r[i]);
                if (i < n - 1) System.out.print(" ");
            }
            System.out.println();
        }
    }
}
