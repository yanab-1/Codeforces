import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class E_2060 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) solve(sc);
    }
    public static class DisJoinSet {
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
            rank[v] = 1;
        }

        public int find(int node) {
            if (parent[node] == node) {
                return node;
            }
            int n = find(parent[node]);
            parent[node] = n;// path Compression
            return n;

        }

        public void unionByRank(int v1, int v2) {
            int re1 = find(v1);// v1 ka re node hai
            int re2 = find(v2);// v2 ka re node hai
            if(parent[re1] == parent[re2]) return;
            else if (rank[re1] == rank[re2]){
                parent[re1] = re2;
                rank[re2]++;
            }
            else if (rank[re1] < rank[re2]) {
                parent[re1] = re2;
            } 
            else {
                parent[re2] = re1;
            }
        }

        public void unionBySize(int v1, int v2) {
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
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        List<List<Integer>> fadj = new ArrayList<>();
        List<List<Integer>> gadj = new ArrayList<>();
        for(int i = 0; i < n; i++){
            fadj.add(new ArrayList<>());
            gadj.add(new ArrayList<>());
        }
        for(int i = 0; i < m1; i++){
            int u = sc.nextInt() - 1;
            int v = sc.nextInt() - 1;
            fadj.get(u).add(v);
        }
        for(int i = 0; i < m2; i++){
            int u = sc.nextInt() - 1;
            int v = sc.nextInt() - 1;
            gadj.get(u).add(v);
        }
        DisJoinSet g = new DisJoinSet(n);
        DisJoinSet f = new DisJoinSet(n);
        for(int i = 0; i < n; i++){
            for(int j : gadj.get(i)){
                g.unionBySize(i, j);
            }
        }
        int ans = m1;
        for(int i = 0; i < n; i++){
            for(int j : fadj.get(i)){
                if(g.find(i) == g.find(j)){
                    ans--;
                    f.unionBySize(i, j);
                }
            }
        }
        for(int i = 0; i < n; i++){
            for(int j : gadj.get(i)){
                if(f.find(i) != f.find(j)){
                    ans++;
                    f.unionBySize(i, j);
                }
            }
        }
        System.out.println(ans);
    }
}
