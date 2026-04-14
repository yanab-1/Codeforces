import java.util.Scanner;

public class C_2220 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        long p = sc.nextLong();
        long q = sc.nextLong();
        long k = 2 * p + 4 * q + 1;
        long N = -1;
        long M = -1;
        for (long i = 3; i * i <= k; i += 2) {
            if (k % i == 0) {
                long B = k / i;
                long n = (i - 1) / 2;
                long m = (B - 1) / 2;
                long h = m * (n + 1);
                long v = n * (m + 1);
                if (q <= h && q <= v) {
                    N = n;
                    M = m;
                    break;
                }
            }
        }
        if (M == -1) {
            System.out.println(-1);
        } else {
            System.out.println(N + " " + M);
        }
    }
}
