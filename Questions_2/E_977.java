import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class E_977 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
    }
    static List<List<Integer>> adj;
    static boolean[] vis;
    static int[] deg;
    static boolean flag;
    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        adj = new ArrayList<>();
        deg = new int[n];
        for(int i = 0 ; i < n; i++){
            adj.add(new ArrayList<>());
        }

        for(int i = 0; i < m; i++){
            int u = sc.nextInt() - 1;
            int v = sc.nextInt() - 1;
            adj.get(u).add(v);
            adj.get(v).add(u);
            deg[u]++;
            deg[v]++;
        }
        vis = new boolean[n];
        int c = 0;
        for(int i = 0; i < n; i++){
            if(!vis[i]){
                flag = false;
                dfs(i);
                if(!flag) c++;
            }
        }
        System.out.println(c);
    }
    private static void dfs(int i) {
        vis[i] = true;
        if(deg[i] != 2) flag = true;
        for(int j : adj.get(i)){
            if(!vis[j]){
                dfs(j);
            }
        }
    }
}
