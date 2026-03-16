import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class D_2204 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<List<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < n; i++){
            adj.add(new ArrayList<>());
        }
        for(int i = 0; i < m; i++){
            int u = sc.nextInt() - 1;
            int v = sc.nextInt() - 1;
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        int[] color = new int[n];
        Arrays.fill(color, -1);
        long ans = 0;
        for (int i = 0; i < n; i++) {
            if (color[i] != -1) continue;
            Queue<Integer> q = new ArrayDeque<>();
            q.add(i);
            color[i] = 0;
            int cnt0 = 1;
            int cnt1 = 0;
            boolean ok = true;
            while (!q.isEmpty()) {
                int v = q.poll();
                for (int to : adj.get(v)) {
                    if (color[to] == -1) {
                        int nextColor = color[v] == 0 ? 1 : 0;
                        color[to] = nextColor;
                        if (nextColor == 0) cnt0++;
                        else cnt1++;
                        q.add(to);
                    } else if (color[to] == color[v]) {
                        ok = false;
                    }
                }
            }
            if (ok) ans += Math.max(cnt0, cnt1);
        }

        System.out.println(ans);
    }
}