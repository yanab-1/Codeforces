import java.util.Arrays;
import java.util.Scanner;

public class A_2209 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        long c = sc.nextLong();
        int k = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        for (int i = 0; i < n; i++) {
            if (a[i] > c) break;
            long cur = Math.min(k, c - a[i]);
            c += a[i] + cur;
            k -= cur;
        }
        System.out.println(c);
    }
}
