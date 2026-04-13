import java.util.Scanner;

public class A_744 {
    static class DisJoinSet {
        int[] parent, size, rank;

        public DisJoinSet(int n){
            parent = new int[n];
            size = new int[n];
            rank = new int[n];
            for(int i = 0; i < n; i++) create(i);
        }

        public void create(int v) {
            parent[v] = v;
            size[v] = 1;
            rank[v] = 0;
        }

        public int find(int node) {
            if (parent[node] != node) {
                parent[node] = find(parent[node]);
            }
            return parent[node];
        }

        public void unionBySize(int v1, int v2) {
            int re1 = find(v1);
            int re2 = find(v2);

            if(re1 == re2) return;

            if (size[re1] < size[re2]) {
                parent[re1] = re2;
                size[re2] += size[re1];
            } else {
                parent[re2] = re1;
                size[re1] += size[re2];
            }
        }
    }

    static long c2(long n) {
        return n * (n - 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[] gov = new int[k];
        for (int i = 0; i < k; i++) {
            gov[i] = sc.nextInt() - 1; 
        }
        DisJoinSet dsu = new DisJoinSet(n);
        for (int i = 0; i < m; i++) {
            int u = sc.nextInt() - 1;
            int v = sc.nextInt() - 1;
            dsu.unionBySize(u, v);
        }
        int[] compSize = new int[n];
        for (int i = 0; i < n; i++) {
            int root = dsu.find(i);
            compSize[root]++;
        }
        boolean[] used = new boolean[n];
        long ans = 0;
        int largest = 0;
        int leftover = n;
        for (int x : gov) {
            int root = dsu.find(x);
            if (used[root]) continue; 
            used[root] = true;
            int sz = compSize[root];
            largest = Math.max(largest, sz);
            ans += c2(sz);
            leftover -= sz;
        }
        ans -= c2(largest);
        ans += c2(largest + leftover);
        ans -= m;
        System.out.println(ans);
    }
}
