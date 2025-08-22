
import java.util.Scanner;

public class B_1541 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) solve(sc);
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int[] a = new int[n+1];
        for(int i=1; i<=n; i++){
            a[i] = sc.nextInt();
        }
        long ans = 0;
        for (int i = 1; i <= n; i++) {
            int val = a[i];
            for (int j = val - i; j <= 2 * n; j += val) {
                int k = j;
                if (k > 0 && k <= n && k > i) {
                    if ((long) val * a[k] == i + k) {
                        ans++;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
