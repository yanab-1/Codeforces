import java.util.ArrayList;
import java.util.Scanner;

public class C_891 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
    }

    static final int N = 100001;
    static ArrayList<Integer>[] g = new ArrayList[N];
    static ArrayList<Integer> leafs = new ArrayList<>();

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        for (int i = 0; i < N; i++) {
            g[i] = new ArrayList<>();
        }
        for (int i = 1; i < n; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            g[a].add(b);
            g[b].add(a);
        }
        int root = 0;
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            if (g[i].size() > 2) {
                cnt++;
                root = i;
            }
        }
        if (cnt > 1) {
            System.out.println("No");
        } else {
            System.out.println("Yes");

            dfs(root, -1);

            System.out.println(leafs.size());

            for (int leaf : leafs) {
                System.out.println((root + 1) + " " + (leaf + 1));
            }
        }
    }
    private static void dfs(int v, int pr) {
        int deg = 0;

        for (int to : g[v]) {
            if (to != pr) {
                deg++;
                dfs(to, v);
            }
        }

        if (deg == 0) {
            leafs.add(v);
        }
    }
}
