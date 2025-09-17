import java.util.Scanner;

public class A_2143 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
        }

        int[] d = new int[n + 2];
        d[1] = p[0];
        for (int i = 2; i <= n; i++) {
            d[i] = p[i - 1] - p[i - 2];
        }
        d[n + 1] = -p[n - 1];

        int sum = 0;
        for (int i = 1; i <= n + 1; i++) {
            if (d[i] > 0) sum += d[i];
        }
        if (sum != n) {
            System.out.println("NO");
            return;
        }

        boolean ok = true;
        for (int k = n; k >= 1; k--) {
            boolean found = false;
            int limit = n - k + 1;
            for (int i = 1; i <= limit; i++) {
                if (d[i] > 0 && d[i + k] < 0) {
                    d[i]--;
                    d[i + k]++;
                    found = true;
                    break;
                }
            }
            if (!found) {
                ok = false;
                break;
            }
        }
        if (ok) {
            for (int i = 1; i <= n + 1; i++) {
                if (d[i] != 0) {
                    ok = false;
                    break;
                }
            }
        }

        System.out.println(ok ? "YES" : "NO");
    }
}
