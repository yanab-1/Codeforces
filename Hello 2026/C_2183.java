import java.util.Scanner;

public class C_2183 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int time = sc.nextInt();
        while(time-- > 0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        long n = sc.nextLong();
        long m = sc.nextLong();
        long k = sc.nextLong();
        long lim = k - 1;
        long min = n - k;
        long res = 1;
        for (long i = 1; i <= n; i++) {
            long c = 2 * i - 1;
            if (c > m) break;
            long s = m - c;
            if (i <= lim) {
                long time = Math.min(i, min);
                time = Math.min(time, s);
                res = Math.max(res, i + time + 1);
            }
            if (i <= min) {
                long time = Math.min(i, lim);
                time = Math.min(time, s);
                res = Math.max(res, i + time + 1);
            }
        }
        System.out.println(res);
    }
}
