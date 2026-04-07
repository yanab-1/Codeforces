import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class E_2217 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t -- > 0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int[] p = new int[n];
        int[] d = new int[n];
        for (int i = 0; i < n; i++){
            p[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++){
            d[i] = sc.nextInt();
        }
        boolean[] ok = new boolean[n];
        Arrays.fill(ok, true);
        int[] q = new int[n];
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> {
            if (p[a] != p[b]) return p[a] - p[b];
            return a - b;
        });
        for (int i = 0; i < n; i++) {
            if (d[i] == 0) pq.add(i);
        }
        for (int cur = n; cur >= 1; cur--) {
            int idx = -1;
            while (!pq.isEmpty()) {
                int x = pq.peek();
                if (ok[x] && d[x] == 0) {
                    idx = x;
                    pq.poll();
                    break;
                }
                pq.poll();
            }
            if (idx == -1) {
                System.out.println(-1);
                return;
            }
            q[idx] = cur;
            ok[idx] = false;
            for (int j = 0; j < idx; j++) {
                if (ok[j] && p[j] < p[idx]) {
                    d[j]--;
                    if (d[j] < 0) {
                        System.out.println(-1);
                        return;
                    }
                    if (d[j] == 0) pq.add(j);
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(q[i] + " ");
        }
        System.out.println();
    }
}
