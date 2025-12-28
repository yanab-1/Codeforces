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
        long sum = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
            sum += a[i];
        }
        long pref = 0;
        long ans = Long.MIN_VALUE;
        for(int i = 0; i < n; i++){
            sum -= a[i];
            ans = Math.max(ans, pref - sum);
            pref += (i == 0 ? a[i] : Math.abs(a[i]));
        }
        System.out.println(ans);
    }
}