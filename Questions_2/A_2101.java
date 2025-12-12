import java.util.Scanner;

public class A_2101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) solve(sc);
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        int x = (n - 1) / 2;
        int y = (n - 1) / 2;
        a[x][y] = 0;             
        int val = 1;              
        int step = 1;   
        int[][] dir = { {0,1}, {1,0}, {0,-1}, {-1,0} };
        while (val < n * n) {
            for (int d = 0; d < 4; d++) {
                for (int s = 0; s < step; s++) {
                    if (val >= n * n) break;
                    x += dir[d][0];
                    y += dir[d][1];
                    if (x >= 0 && x < n && y >= 0 && y < n) {
                        a[x][y] = val++;
                    }
                }
                if (d == 1 || d == 3) step++;
            }
        }
        for (int[] row : a) {
            for (int num : row) {
                System.out.print(num + " ");;
            }
            System.out.println();
        }
    }
}
