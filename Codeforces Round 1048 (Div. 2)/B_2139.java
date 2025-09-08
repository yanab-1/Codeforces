import java.util.Arrays;
import java.util.Scanner;

public class B_2139 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t -- > 0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        long m = sc.nextLong();
        int[] a = new int[n];
        for (int i = 0; i < n; ++i) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int K = (int) Math.min(n, m);
        long ans = 0L;
        for (int j = 1; j <= K; ++j) {
            int x = a[n - j];
            ans += x * m;
            m--;
        }
        System.out.println(ans);
    }
}
