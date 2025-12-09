import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class C_2127 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) solve(sc);
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[][] a = new int[n][2];

        for (int i = 0; i < n; i++) {
            a[i][0] = sc.nextInt();
        }

        long ans = 0;

        for (int i = 0; i < n; i++) {
            a[i][1] = sc.nextInt();
            if (a[i][1] < a[i][0]) {
                int tmp = a[i][0];
                a[i][0] = a[i][1];
                a[i][1] = tmp;
            }
            ans += Math.abs((long) a[i][1] - a[i][0]);
        }
        Arrays.sort(a, Comparator.comparingInt(x -> x[0]));

        int mn = (int) 2e9;

        for (int i = 1; i < n; i++) {
            int gap = a[i][0] - a[i - 1][1];
            mn = Math.min(mn, 2 * Math.max(0, gap));
        }

        ans += mn;

        System.out.println(ans);

    }
}
