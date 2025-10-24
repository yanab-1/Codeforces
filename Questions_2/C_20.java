import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class C_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<List<int[]>> adj = new ArrayList<>();
        for(int i = 0; i <= n; i++){
            adj.add(new ArrayList<>());
        }
        for(int i = 0; i < m; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            int w = sc.nextInt();
            adj.get(u).add(new int[]{v, w});
            adj.get(v).add(new int[]{u, w});
        }
        int[] dist = new int[n + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[1] = 0;
        boolean[] visited = new boolean[n + 1];
        int[] parent = new int[n + 1];
        for(int i = 0; i <= n; i++){
            parent[i] = i;
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        pq.offer(new int[]{1, 0});
        while(!pq.isEmpty()){
            int[] cur = pq.poll();
            int node = cur[0];
            int d = cur[1];
            if(visited[node]) continue;
            visited[node] = true;
            for(int[] neighbor : adj.get(node)){
                int nextNode = neighbor[0];
                int weight = neighbor[1];
                if(!visited[nextNode] && dist[node] + weight < dist[nextNode]){
                    dist[nextNode] = dist[node] + weight;
                    parent[nextNode] = node;
                    pq.offer(new int[]{nextNode, dist[nextNode]});
                }
            }
        }
        if(dist[n] == Integer.MAX_VALUE){
            System.out.println(-1);
        } else {
            List<Integer> path = new ArrayList<>();
            int curr = n;
            while(curr != 1){
                path.add(curr);
                curr = parent[curr];
            }
            path.add(1);
            for(int i = path.size() - 1; i >= 0; i--){
                System.out.print(path.get(i) + " ");
            }
            System.out.println();
        }
    }
}
