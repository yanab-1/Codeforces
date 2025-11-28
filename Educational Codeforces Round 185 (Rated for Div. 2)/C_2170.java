import java.util.*;

public class C_2170 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) solve(sc);
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        long k = sc.nextLong();

        TreeMap<Long, Integer> freq = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            long q = sc.nextLong();
            freq.put(q, freq.getOrDefault(q, 0) + 1);
        }

        long[] r = new long[n];
        for (int i = 0; i < n; i++) r[i] = sc.nextLong();
        Arrays.sort(r);

        long ans = 0;

        for (int i = n - 1; i >= 0; i--) {
            long rv = r[i];
            long maxQ = (k - rv) / (rv + 1);

            if (maxQ < 1) continue;

            Long chosen = freq.floorKey(maxQ);
            if (chosen == null) continue;

            int c = freq.get(chosen);
            if (c == 1) freq.remove(chosen);
            else freq.put(chosen, c - 1);

            ans++;
        }

        System.out.println(ans);
    }
}
