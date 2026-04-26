import java.util.Arrays;
import java.util.Scanner;

public class B_2222 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        long[] odd = new long[(n + 1) / 2];
        long[] even = new long[n / 2];
        int ol = 0, el = 0;
        long total = 0;
        for (int i = 1; i <= n; i++) {
            long x = sc.nextLong();
            total += x;
            if (i % 2 == 1) odd[ol++] = x;
            else even[el++] = x;
        }
        int op = 0, eop = 0;
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            if (x % 2 == 1) op++;
            else eop++;
        }
        long ans1 = solve2(odd, ol, op);
        long ans2 = solve2(even, el, eop);
        long ans = total - ans1 - ans2;
        System.out.println(ans);
    }

    static long solve2(long[] arr, int n, int c) {
        if (c == 0 || n == 0) return 0;
        Arrays.sort(arr, 0, n);
        long sum = 0;
        int t = 0;
        for (int i = n - 1; i >= 0 && t < c; i--) {
            if (arr[i] > 0) {
                sum += arr[i];
                t++;
            } else {
                break;
            }
        }
        if (t == 0) {
            return arr[n - 1]; 
        }
        return sum;
    }
}
