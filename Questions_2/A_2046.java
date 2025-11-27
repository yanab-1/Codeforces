import java.util.Scanner;

public class A_2046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int[][] a = new int[2][n];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        long[] best = new long[n];
        long[] full = new long[n];
        long sumBest = 0;
        for (int i = 0; i < n; i++) {
            best[i] = Math.max(a[0][i], a[1][i]);
            full[i] = a[0][i] + a[1][i];
            sumBest += best[i];
        }
        long ans = Long.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            ans = Math.max(ans, sumBest + full[i] - best[i]);
        }
        System.out.println(ans);
    }
}
