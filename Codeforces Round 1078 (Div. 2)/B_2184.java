import java.util.Scanner;

public class B_2184 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        long x = sc.nextLong();
        long y = sc.nextLong();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
        long sum = 0;
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (a[i] / x) * y;
            sum += arr[i];
        }
        long ans = 0;
        for (int i = 0; i < n; i++) {
            long cur = a[i] + (sum - arr[i]);
            ans = Math.max(ans, cur);
        }
        System.out.println(ans);
    }
}
