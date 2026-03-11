import java.util.*;

public class E_2114 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) solve(sc);
    }
    static int[] a;
    static int[] ans;
    static List<List<Integer>> adj;
    static long[] dp1, dp2; // dp1 store max
    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        adj = new ArrayList<>();
        for(int i = 0; i < n; i++){
            adj.add(new ArrayList<>());
        }
        for(int i = 0; i < n - 1 ; i++){
            int u = sc.nextInt() - 1;
            int v = sc.nextInt() - 1;
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        dp1 = new long[n];
        dp2 = new long[n];
        dp1[0] = dp2[0] = a[0];
        ans = new int[n];
        dfs(0, -1);
        for(long i : dp1){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void dfs(int node, int parent){
        for(int i : adj.get(node)){
            if(i != parent){
                dp1[i] = a[i] + Math.max(0L, -dp2[node]); 
                dp2[i] = a[i] + Math.min(0L, -dp1[node]);
                dfs(i, node);
            }
        }
    }
}
