import java.util.Scanner;

public class C_2203 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        long s = sc.nextLong();
        long m = sc.nextLong();
        long l = m & (-m);
        if (s % l != 0) {
            System.out.println("-1");
            return;
        }
        long lo = 1, hi = s;
        long ans = -1;
        while (lo <= hi) {
            long mid = lo + (hi - lo) / 2;
            long r = s;
            for (int j = 60; j >= 0; j--) {
                if ((m & (1L << j)) != 0) {
                    long val = (1L << j);
                    long mn = Math.min(r / val, mid);
                    r -= mn * val;
                }
            }
            if (r == 0) {
                ans = mid;
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        System.out.println(ans);
    }
}
