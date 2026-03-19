import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class C_2034 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >0) {
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        String[] arr = new String[n + 2];
        for(int i = 1; i <= n; i++){
            arr[i] = sc.next();
            arr[i] = "-" + arr[i];
        }
        ArrayList<int[]>[][] adj = new ArrayList[n + 2][m + 2];
        for(int i = 0; i <= n + 1; i++){
            for(int j = 0; j <= m + 1; j++){
                adj[i][j] = new ArrayList<>();
            }
        }
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){
                char ch = arr[i].charAt(j);
                if(ch == 'U') adj[i - 1][j].add(new int[]{i, j});
                if(ch == 'D') adj[i + 1][j].add(new int[]{i, j});
                if(ch == 'L') adj[i][j - 1].add(new int[]{i, j});
                if(ch == 'R') adj[i][j + 1].add(new int[]{i, j});
            }
        }
        int[][] vis = new int[n + 2][m + 2];
        Queue<int[]> q = new LinkedList<>();
        for (int j = 0; j <= m + 1; j++) {
            vis[0][j] = 1;
            q.add(new int[]{0, j});
        }
        for (int i = 1; i <= n + 1; i++) {
            vis[i][0] = 1;
            q.add(new int[]{i, 0});
        }
        for (int j = 1; j <= m + 1; j++) {
            vis[n + 1][j] = 1;
            q.add(new int[]{n + 1, j});
        }
        for (int i = 1; i <= n; i++) {
            vis[i][m + 1] = 1;
            q.add(new int[]{i, m + 1});
        }
        while(!q.isEmpty()){
            int[] cur = q.poll();
            int i = cur[0];
            int j = cur[1];
            for(int[] p : adj[i][j]){
                int x = p[0];
                int y = p[1];
                if(vis[x][y] == 0){
                    vis[x][y] = 1;
                    q.add(new int[]{x, y});
                }
            }
        }
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){
                if(arr[i].charAt(j) == '?' && vis[i - 1][j] == 1 && vis[i][j + 1] == 1 && vis[i + 1][j] == 1 && vis[i][j - 1] == 1){
                    vis[i][j] = 1;
                }
            }
        }
        int ans = n * m;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){
                if(vis[i][j] == 1){
                    ans--;
                }
            }
        }
        System.out.println(ans);
    }
}
