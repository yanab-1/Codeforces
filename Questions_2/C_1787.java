import java.util.Scanner;

public class C_1787 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            solve(sc);
        }
    }

    static final int N = 200005;
    static long[][] f = new long[N][2];
    static long[] x = new long[N];
    static long[] y = new long[N];

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int s = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            long j = sc.nextLong();
            if (i == 1 || i == n) {
                x[i] = y[i] = j;
            } 
            else if (j <= s) {
                x[i] = 0;
                y[i] = j;
            } 
            else {
                x[i] = s;
                y[i] = j - s;
            }
        }
        f[1][0] = 0;
        f[1][1] = 0;
        for (int i = 2; i <= n; i++) {
            f[i][0] = Math.min(f[i - 1][0] + y[i - 1] * x[i], f[i - 1][1] + x[i - 1] * x[i]);
            f[i][1] = Math.min(f[i - 1][0] + y[i - 1] * y[i], f[i - 1][1] + x[i - 1] * y[i]);
        }
        System.out.println(f[n][0]);
    }
}
