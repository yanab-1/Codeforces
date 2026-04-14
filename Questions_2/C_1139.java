import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C_1139 {
static final int MAXN = 100000;
    static final int P = 1_000_000_007;
    static List<List<Integer>> e = new ArrayList<>();
    static boolean[] vis;
    static int n, k;

    static int pow(int a, int b) {
        long res = 1;
        long base = a;

        while (b > 0) {
            if ((b & 1) == 1) {
                res = (res * base) % P;
            }
            base = (base * base) % P;
            b >>= 1;
        }
        return (int) res;
    }

    static int dfs(int u) {
        vis[u] = true;
        int sz = 1;

        for (int v : e.get(u)) {
            if (!vis[v]) {
                sz += dfs(v);
            }
        }
        return sz;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            e.add(new ArrayList<>());
        }
        for (int i = 1; i < n; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            int x = sc.nextInt();
            if (x == 0) {
                e.get(u).add(v);
                e.get(v).add(u);
            }
        }
        vis = new boolean[n + 1];
        int ans = pow(n, k);
        for (int i = 1; i <= n; i++) {
            if (!vis[i]) {
                int size = dfs(i);
                ans = (ans - pow(size, k) + P) % P;
            }
        }
        System.out.println(ans);
    }
}
