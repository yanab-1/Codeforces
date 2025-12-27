import java.util.Scanner;

public class C_2178 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0) solve(sc);    
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();

        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }

        long suffixSum = -a[n - 1];
        long best = a[n - 1];
        long answer = 0;

        for (int i = n - 2; i >= 0; i--) {
            long take = a[i] + best;
            if (take < 0) take = 0;

            long cur = suffixSum + take;

            suffixSum -= a[i];
            best = Math.max(best, cur - suffixSum);

            if (i == 0) answer = cur;
        }

        System.out.println(answer);
    }
}