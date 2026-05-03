import java.util.Scanner;

public class B_429 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        long[][] a = new long[n][m];
        long[][] b = new long[n][m];
        long[][] c = new long[n][m];
        long[][] d = new long[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = 0;
                if (i > 0) a[i][j] = Math.max(a[i][j], a[i - 1][j]);
                if (j > 0) a[i][j] = Math.max(a[i][j], a[i][j - 1]);
                a[i][j] += arr[i][j];
            }
        }
        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {
                b[i][j] = 0;
                if (i + 1 < n) b[i][j] = Math.max(b[i][j], b[i + 1][j]);
                if (j + 1 < m) b[i][j] = Math.max(b[i][j], b[i][j + 1]);
                b[i][j] += arr[i][j];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = m - 1; j >= 0; j--) {
                c[i][j] = 0;
                if (i > 0) c[i][j] = Math.max(c[i][j], c[i - 1][j]);
                if (j + 1 < m) c[i][j] = Math.max(c[i][j], c[i][j + 1]);
                c[i][j] += arr[i][j];
            }
        }
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < m; j++) {
                d[i][j] = 0;
                if (i + 1 < n) d[i][j] = Math.max(d[i][j], d[i + 1][j]);
                if (j > 0) d[i][j] = Math.max(d[i][j], d[i][j - 1]);
                d[i][j] += arr[i][j];
            }
        }
        long ans = 0;
        for (int i = 1; i + 1 < n; i++) {
            for (int j = 1; j + 1 < m; j++) {
                long ans1 = a[i - 1][j] + b[i + 1][j] + d[i][j - 1] + c[i][j + 1];
                long ans2 = c[i - 1][j] + d[i + 1][j] + a[i][j - 1] + b[i][j + 1];
                ans = Math.max(ans, Math.max(ans1, ans2));
            }
        }
        System.out.println(ans);
    }
}
