import java.util.ArrayList;
import java.util.Scanner;

public class F_2167 {
    static ArrayList<ArrayList<Integer>> adj;
    static int[] size;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0) solve(sc);    
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i < n - 1; i++) {
            int u = sc.nextInt() - 1;
            int v = sc.nextInt() - 1;
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        size = new int[n];
        dfs(0, -1);
        long ans = n;
        for(int i = 1; i < n; i++){
            if(size[i] >= k){
                ans += n - size[i];
            }
            if(n - size[i] >= k){
                ans += size[i];
            }
        }
        System.out.println(ans);
    }

    private static void dfs(int i, int j) {
        size[i] = 1;
        for(int nbr : adj.get(i)) {
            if(nbr != j){
                dfs(nbr, i);
                size[i] += size[nbr];
            }
        }
    }
}
