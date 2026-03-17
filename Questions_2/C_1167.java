import java.util.Scanner;

public class C_1167 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
    }
    public static class DisJoinSet {
        int[] parent, size;

        public DisJoinSet(int n){
            parent = new int[n];
            size = new int[n];
            for(int i = 0; i < n; i++) create(i);
        }

        public void create(int v) {
            parent[v] = v;
            size[v] = 1;
        }

        public int find(int node) {
            if (parent[node] == node) {
                return node;
            }
            int n = find(parent[node]);
            parent[node] = n;// path Compression
            return n;

        }

        public void union(int v1, int v2) {
            int re1 = find(v1);// v1 ka re node hai
            int re2 = find(v2);// v2 ka re node hai
            if(parent[re1] == parent[re2]) return;
            else if (size[re1] < size[re2]) {
                parent[re1] = re2;
                size[re2] += size[re1];
            } else {
                parent[re2] = re1;
                size[re1] += size[re2];
            }
        }
    }
    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        DisJoinSet dsu = new DisJoinSet(n);
        for(int i = 0; i < m; i++){
            int s = sc.nextInt();
            int prev = -1;
            for(int j = 0; j < s; j++){
                int p = sc.nextInt() - 1;
                if(j == 0){
                    prev = p;
                    continue;
                }
                dsu.union(prev, p);
                prev = p;
            }
        }
        for(int i = 0; i < n; i++){
            System.out.print(dsu.size[dsu.find(i)] + " ");
        }
        System.out.println();
    }
}
