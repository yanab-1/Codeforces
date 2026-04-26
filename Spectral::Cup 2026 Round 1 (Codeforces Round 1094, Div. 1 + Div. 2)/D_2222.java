import java.util.Arrays;
import java.util.Scanner;

public class D_2222 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        long[] a = new long[n + 1];
        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextLong();
        }
        long[] suf = new long[n + 1];
        suf[n] = 0;
        for (int i = n - 1; i >= 1; i--) {
            suf[i] = suf[i + 1] + a[i];
        }
        long[][] arr = new long[n][2];
        for (int i = 1; i <= n; i++) {
            arr[i - 1] = new long[]{i, suf[i]};
        }
        Arrays.sort(arr, (x, y) -> Long.compare(y[1], x[1])); 
        int[] p = new int[n + 1];
        for (int i = 0; i < n; i++) {
            p[(int) arr[i][0]] = n - i;
        }
        for (int i = 1; i <= n; i++) {
            System.out.print(p[i] + " ");
        }
        System.out.println();
    }
}
