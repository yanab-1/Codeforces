import java.util.Scanner;

public class D_2169 {
    static final long LIMIT = 1_000_000_000_000L;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
    }
    private static void solve(Scanner sc) {
        long X = sc.nextLong();
        long Y = sc.nextLong();
        long need = sc.nextLong();
        if (rA(LIMIT, X, Y) < need) {
            System.out.println(-1);
            return;
        }
        long answer = fIM(X, Y, need);
        System.out.println(answer);
    }
    private static long fIM(long X, long Y, long need) {
        long low = 1, high = LIMIT;
        long res = -1;
        while (low <= high) {
            long mid = low + (high - low) / 2;
            long left = rA(mid, X, Y);
            if (left >= need) {
                res = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return res;
    }
    private static long rA(long n, long rounds, long step) {
        long cur = n;
        for (int r = 0; r < rounds; r++) {
            if (cur < step) break;
            long rm = cur / step;
            if (rm == 0) break;
            cur -= rm;
            if (cur == 0) break;
        }
        return cur;
    }
}
