import java.util.Scanner;

public class C_2152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t--> 0) {
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        int[][] pre = new int[2][n + 1];
        for (int x = 0; x < 2; x++) {
            for (int i = 0; i < n; i++) {
                pre[x][i + 1] = pre[x][i] + (a[i] == x ? 1 : 0);
            }
        }
        int[] d = new int[n];
        for (int i = 1; i < n; i++) {
            d[i] = d[i - 1] + (a[i] == a[i - 1] ? 1 : 0);
        }
        while (q-- > 0) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            l--; 
            int c0 = pre[0][r] - pre[0][l];
            int c1 = pre[1][r] - pre[1][l];
            if (c0 % 3 != 0 || c1 % 3 != 0) {
                System.out.println(-1);
            } else {
                System.out.println((r - l) / 3 + ((d[r - 1] == d[l]) ? 1 : 0));
            }
        }
    }
}
