import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class M_2172 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[] b = new int[n];
        for(int i = 0; i < n; i++){
            b[i] = sc.nextInt() - 1;
        }
        List<List<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < n; i++){
            adj.add(new ArrayList<>());
        }
        for(int i = 0; i < m; i++){
            int u = sc.nextInt() - 1;
            int v = sc.nextInt() - 1;
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        int[] dis = new int[n];
        int[] ans = new int[k];
        Arrays.fill(dis, -1);
        dis[0] = 0;
        Queue<Integer> q = new ArrayDeque<>();
        q.add(0);
        while (!q.isEmpty()) {
            int node = q.poll();
            ans[b[node]] = Math.max(ans[b[node]], dis[node]);
            for(int i : adj.get(node)){
                if(dis[i] == -1){
                    dis[i] = dis[node] + 1;
                    q.add(i);
                }
            }
        }
        for(int i : ans){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
