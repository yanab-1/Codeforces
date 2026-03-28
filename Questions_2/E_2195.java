import java.util.ArrayList;
import java.util.Scanner;

public class E_2195 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0) solve(sc);    
    }

    static int n;
    static int[] l, r, siz, pos, p;
    static ArrayList<Integer> ord;
    static int[][] f;
    static long[] g;
    static int logn;

    static void dfs(int x) {
        f[0][x] = p[x];
        for (int j = 0; j < logn; j++) {
            f[j + 1][x] = f[j][f[j][x]];
        }

        pos[x] = ord.size();
        ord.add(x);
        siz[x] = 1;

        if (l[x] != -1) {
            p[l[x]] = x;
            p[r[x]] = x;

            dfs(l[x]);
            ord.add(x);
            dfs(r[x]);
            ord.add(x);

            siz[x] += siz[l[x]] + siz[r[x]];
        }
    }

    static void dfs1(int x) {
        g[x] += 2L * siz[x] - 1;

        if (l[x] != -1) {
            g[l[x]] = g[x];
            g[r[x]] = g[x];

            dfs1(l[x]);
            dfs1(r[x]);
        }
    }

    private static void solve(Scanner sc) {
        n = sc.nextInt();
        l = new int[n];
        r = new int[n];
        for(int i = 0; i < n; i++){
            l[i] = sc.nextInt() - 1;
            r[i] = sc.nextInt() - 1;
        }
        siz = new int[n];
        pos = new int[n];
        p = new int[n];
        ord = new ArrayList<>();
        g = new long[n];

        logn = 31 - Integer.numberOfLeadingZeros(n);
        f = new int[logn + 1][n];

        dfs(0);
        dfs1(0);

        for(long i : g){
            System.out.print(i % 1_000_000_007 + " ");
        }
        System.out.println();
    }
}
