import java.util.ArrayList;
import java.util.Scanner;

public class C2_2132{
    static long[] p3 = new long[40];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        p3[0] = 1;
        for (int i = 1; i < 40; i++) {
            p3[i] = p3[i - 1] * 3L;
        }
        while (t-- > 0) solve(sc);
    }
    private static void solve(Scanner sc) {
        long n = sc.nextLong();
        long k = sc.nextLong();

        long s = s3(n);
        long d0 = Math.min(k, n);
        long d = (d0 % 2 == n % 2) ? d0 : d0 - 1;
        if (d < s) {
            System.out.println(-1);
            return;
        }
        long m = (n - d) / 2;
        ArrayList<Long> cnt = new ArrayList<>();
        cnt.add(n);
        long add = 0;
        int x = 0;

        while (m > 0) {
            if (x >= cnt.size()) cnt.add(0L);
            long avail = cnt.get(x) / 3L;
            if (avail == 0) {
                x++;
                continue;
            }
            long take = Math.min(avail, m);
            add += take * p3[x];
            cnt.set(x, cnt.get(x) - take * 3L);

            if (x + 1 >= cnt.size()) cnt.add(0L);
            cnt.set(x + 1, cnt.get(x + 1) + take);

            m -= take;
        }

        System.out.println(3L * n + add);
    }
    private static long s3(long n) {
        long s = 0;
        while (n > 0) {
            s += n % 3;
            n /= 3;
        }
        return s;
    }

}