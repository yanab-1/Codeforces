import java.util.*;

public class C_2027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) solve(sc);
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        long[] a = new long[n + 1];
        HashMap<Long, List<Long>> mp = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextLong();
            long sz = a[i] + i - 1;
            long next = sz + (i - 1);
            mp.computeIfAbsent(sz, k -> new ArrayList<>()).add(next);
        }
        Queue<Long> q = new ArrayDeque<>();
        HashSet<Long> vis = new HashSet<>();
        q.add((long) n);
        vis.add((long) n);
        long ans = n;
        while (!q.isEmpty()) {
            long u = q.poll();
            ans = Math.max(ans, u);
            if (!mp.containsKey(u)) continue;
            for (long v : mp.get(u)) {
                if (!vis.contains(v)) {
                    vis.add(v);
                    q.add(v);
                }
            }
        }
        System.out.println(ans);
    }
}