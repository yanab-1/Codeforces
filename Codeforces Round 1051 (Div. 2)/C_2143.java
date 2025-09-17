import java.io.*;
import java.util.*;

public class C_2143 {
    static List<List<Integer>> g;
    static boolean[] vis;
    static Deque<Integer> st;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            solve(br, out);
        }
        out.flush();
    }
    private static void solve(BufferedReader br, PrintWriter out) throws IOException {
        int n = Integer.parseInt(br.readLine());
        g = new ArrayList<>();
        for (int i = 0; i <= n; i++) g.add(new ArrayList<>());

        for (int i = 0; i < n - 1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            long x = Long.parseLong(st.nextToken());
            long y = Long.parseLong(st.nextToken());

            if (x >= y) g.get(u).add(v);
            else g.get(v).add(u);
        }
        vis = new boolean[n + 1];
        st = new ArrayDeque<>();
        for (int i = 1; i <= n; i++) {
            if (!vis[i]) {
                Deque<Integer> stack = new ArrayDeque<>();
                Deque<Integer> post = new ArrayDeque<>();
                stack.push(i);
                while (!stack.isEmpty()) {
                    int u = stack.pop();
                    if (vis[u]) continue;
                    vis[u] = true;
                    post.push(u);
                    for (int v : g.get(u)) {
                        if (!vis[v]) stack.push(v);
                    }
                }

                while (!post.isEmpty()) st.push(post.pop());
            }
        }
        int[] p = new int[n + 1];
        int idx = 0;
        while (!st.isEmpty()) {
            int u = st.pop();
            p[u] = n - idx;
            idx++;
        }
        for (int i = 1; i <= n; i++) {
        out.print(p[i] + " ");
        }
        out.println();

    }
}
