import java.util.Scanner;

public class C_785 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
    }

    private static void solve(Scanner sc) {
        long n = sc.nextLong();
        long m = sc.nextLong();

        if (n <= m) {
            System.out.println(n);
        } else {
            n -= m;

            long l = 0, r = (long) 2e9;
            while (l < r) {
                long mid = (l + r) / 2;
                long val = mid * (mid + 1) / 2;

                if (val >= n) {
                    r = mid;
                } else {
                    l = mid + 1;
                }
            }

            System.out.println(l + m);
        }
    }
}
