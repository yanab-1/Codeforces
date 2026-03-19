import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class C_1130 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int x1 = sc.nextInt() - 1, y1 = sc.nextInt() - 1;
        int x2 = sc.nextInt() - 1, y2 = sc.nextInt() - 1;
        String[] arr = new String[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.next();
        }
        int[][] dir = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        HashSet<int[]> set1 = new HashSet<>();
        Queue<int[]> q = new LinkedList<>();
        int[][] visit = new int[n][n];
        q.add(new int[]{x1, y1});
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int i = cur[0];
            int j = cur[1];
            if(visit[i][j] == 1) continue;
            visit[i][j] = 1;
            set1.add(new int[]{i, j});
            for(int[] d : dir){
                int x = cur[0] + d[0];
                int y = cur[1] + d[1];
                if(x < 0 || x >= n || y < 0 || y >= n || visit[x][y] == 1 || arr[x].charAt(y) == '1') continue;
                q.add(new int[]{x, y});
            }
        }
        HashSet<int[]> set2 = new HashSet<>();
        q = new LinkedList<>();
        visit = new int[n][n];
        q.add(new int[]{x2, y2});
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int i = cur[0];
            int j = cur[1];
            if(visit[i][j] == 1) continue;
            visit[i][j] = 1;
            set2.add(new int[]{i, j});
            for(int[] d : dir){
                int x = cur[0] + d[0];
                int y = cur[1] + d[1];
                if(x < 0 || x >= n || y < 0 || y >= n || visit[x][y] == 1 || arr[x].charAt(y) == '1') continue;
                q.add(new int[]{x, y});
            }
        }
        int ans = Integer.MAX_VALUE;
        for(int[] s1 : set1){
            for(int[] s2 : set2){
                ans = Math.min((s1[0] - s2[0]) * (s1[0] - s2[0]) + (s1[1] - s2[1]) * (s1[1] - s2[1]), ans);
            }
        }
        System.out.println(ans);
    }
}
