import java.util.Arrays;
import java.util.Scanner;

public class C_2007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) solve(sc);
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int d = gcd(a, b);
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt() % d;
        }
        Arrays.sort(arr);
        int res = arr[n - 1] - arr[0];
        for (int i = 1; i < n; i++) {
            res = Math.min(res, arr[i - 1] + d - arr[i]);
        }
        System.out.println(res);
    }

    static int gcd(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }
}
