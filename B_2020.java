import java.util.Scanner;

public class B_2020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) solve(sc);
    }

    private static void solve(Scanner sc) {
        long k = sc.nextLong();
        long l = 0;
        long r = Long.MAX_VALUE; // safe; we use l + (r - l) / 2 to avoid overflow
        long ans = -1;

        while (l <= r) {
            long mid = l + (r - l) / 2;
            long s = floorSqrt(mid);       // exact floor(sqrt(mid))
            long n = mid - s;

            if (n >= k) {
                ans = mid;
                r = mid - 1; // try to find smaller valid mid
            } else {
                l = mid + 1;
            }
        }
        System.out.println(ans);
    }

    // returns floor(sqrt(x)) using integer binary search (safe for all long x)
    private static long floorSqrt(long x) {
        if (x < 0) throw new IllegalArgumentException("x must be >= 0");
        long lo = 0, hi = Math.min(x, 3037000499L); // sqrt(Long.MAX_VALUE) ≈ 3037000499
        long res = 0;
        while (lo <= hi) {
            long m = lo + (hi - lo) / 2;
            long sq = m * m;
            if (sq <= x) {
                res = m;
                lo = m + 1;
            } else {
                hi = m - 1;
            }
        }
        return res;
    }
}
