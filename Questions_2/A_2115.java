import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class A_2115 {
   
    static final int N = 5005;
    static int[][] g = new int[N][N];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int x = 0; x < N; x++) {
            g[x][0] = g[0][x] = g[x][x] = x;
        }

        for (int x = 1; x < N; x++) {
            for (int y = 1; y < x; y++) {
                g[x][y] = g[y][x] = g[y][x % y];
            }
        }
        int t = sc.nextInt();
        while(t-- > 0) solve(sc);
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int[] v = new int[n];
        for (int i = 0; i < n; i++) {
            v[i] = sc.nextInt();
        }
        int MAX = 5001;
        int[] mi = new int[MAX];
        Arrays.fill(mi, Integer.MAX_VALUE);
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            mi[v[i]] = 0;
            q.add(v[i]);
        }
        int G = 0;
        for (int i = 0; i < n; i++) {
            G = g[G][v[i]];
        }
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (v[i] == G) cnt++;
        }
        if (cnt > 0) {
            System.out.println(n - cnt);
            return;
        }
        while (!q.isEmpty()) {
            int val = q.poll();
            for (int x : v) {
                int gc = g[x][val];
                if (mi[(int)gc] == Integer.MAX_VALUE) {
                    mi[(int)gc] = mi[(int)val] + 1;
                    q.add(gc);
                }
            }
        }
        System.out.println(n + mi[G] - 1);
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
