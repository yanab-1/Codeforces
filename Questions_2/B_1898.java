import java.util.Scanner;

public class B_1898 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
        long ans = 0;
        for (int i = n - 2; i >= 0; i--) {
            if (a[i] <= a[i + 1]) continue;
            long curr = (a[i] + a[i + 1] - 1) / a[i + 1]; 
            ans += curr - 1;
            a[i] /= curr;
        }
        System.out.println(ans);
    }
}
