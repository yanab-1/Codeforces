import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A_1830 {
    static List<List<int[]>> adj;
    static int[] dp;
    static boolean[] visit;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        adj = new ArrayList<>();
        for(int i = 0; i < n; i++){
            adj.add(new ArrayList<>());
        }
        for(int i = 0 ;i < n - 1; i++){
            int u = sc.nextInt() - 1;
            int v = sc.nextInt() - 1;
            adj.get(u).add(new int[]{v, i});
            adj.get(v).add(new int[]{u, i});
        }
        visit = new boolean[n];
        dp = new int[n];
        dp[0] = 0;
        dfs(0, n);
        int ans = 0;
        for(int i : dp){
            ans = Math.max(ans, i);
        }
        System.out.println(ans);
    }

    private static void dfs(int node, int id) {
        visit[node] = true;
        for(int[] i : adj.get(node)){
            int j = i[0];
            int c = i[1];
            if(!visit[j]){
                dp[j] = dp[node] + (c < id ? 1 : 0);
                dfs(j, c);
            }
        }
    }
}
