import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class A_377 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
    }

    static int n, m, k;
    static char[][] grid;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    
    private static void solve(Scanner sc) {
        n = sc.nextInt();
        m = sc.nextInt();
        k = sc.nextInt();
        grid = new char[n][m];
        int free = 0;
        int x = -1;
        int y = -1;
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            grid[i] = s.toCharArray();
            for (int j = 0; j < m; j++) {
                if(grid[i][j] == '.') {
                    free++;
                    if(x == -1){
                        x = i;
                        y = j;
                    }
                }
            }
        }
        int tar = free - k;
        Queue<int[]> q = new LinkedList<>();
        boolean[][] ok = new boolean[n][m];
        q.add(new int[]{x, y});
        ok[x][y] = true;
        tar--;
        while (!q.isEmpty() && tar > 0) {
            int[] cur = q.poll();
            int cx = cur[0];
            int cy = cur[1];
            for (int i = 0; i < 4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];
                if (nx >= 0 && nx < n && ny >= 0 && ny < m && grid[nx][ny] == '.' && !ok[nx][ny]) {
                    ok[nx][ny] = true; 
                    q.add(new int[]{nx, ny});
                    tar--;

                    if (tar == 0) break;
                }
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(!ok[i][j] && grid[i][j] == '.'){
                    grid[i][j] = 'X';
                }
                System.out.print(grid[i][j]);
            }
            System.out.println();
        }

    }
}
