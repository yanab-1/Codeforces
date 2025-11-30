import java.util.*;

public class C_2170 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) solve(sc);
    }

    private static void solve(Scanner sc) {
        long n = sc.nextLong();
        long k = sc.nextLong();
        
        long[] q = new long[(int)n];
        long[] r = new long[(int)n];

        for (int i = 0; i < n; i++) q[i] = sc.nextLong();
        for (int i = 0; i < n; i++) r[i] = sc.nextLong();

        long[] a = new long[(int)n];
        long[] b = new long[(int)n];

        for (int i = 0; i < n; i++) {
            a[i] = q[i] + 1;
            b[i] = r[i] + 1;
        }

        Arrays.sort(a);
        Arrays.sort(b);

        long ans = 0;
        int start = 0;
        int end = (int)n - 1;
        long limit = k + 1;

        while (start < n && end >= 0) {
            if (a[start] <= limit / b[end]) {
                ans++;
                start++;
                end--;
            } else {
                end--;
            }
        }

        System.out.println(ans);
    }
}
