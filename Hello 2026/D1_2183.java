import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class D1_2183 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        List<List<Integer>> adj = new ArrayList<>();
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            adj.add(new ArrayList<>());
        }
        int[] degree = new int[n];
        for(int i = 0; i < n - 1; i++){
            int u = sc.nextInt() - 1;
            int v = sc.nextInt() - 1;
            adj.get(u).add(v);
            adj.get(v).add(u);
            degree[u]++;
            degree[v]++;
        }
        ArrayList<Integer> count = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        int[] visited = new int[n];
        visited[0] = 1;
        while(!q.isEmpty()){
            int s = q.size();
            count.add(s);
            for(int i = 0; i < s; i++){
                int node = q.poll();
                for(int nbr : adj.get(node)){
                    if(visited[nbr] == 0){
                        visited[nbr] = 1;
                        q.add(nbr);
                    }
                }
            }
        }
        int ans = 0;
        for(int i : count){
            ans = Math.max(ans, i);
        }
        ans = Math.max(ans, degree[0] + 1); 
        for (int i = 1; i < n; i++) {
            ans = Math.max(ans, degree[i]);
        }
        System.out.println(ans);
    }
}
