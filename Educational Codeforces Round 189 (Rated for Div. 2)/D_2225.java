import java.util.Scanner;

public class D_2225 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) solve(sc);
    }

    static int MOD = 998244353;

    private static void solve(Scanner sc) {
        long n = sc.nextLong();
        long x = sc.nextLong() - 1;
        long left0 = pre0(x) % MOD;
        long left1 = pre1(x) % MOD;
        long right0 = (pre0(n) - pre0(x) + MOD) % MOD;
        long right1 = (pre1(n) - pre1(x) + MOD) % MOD;
        long ans = (left0 * right0) % MOD;
        ans = (ans + (left1 * right1) % MOD) % MOD;
        System.out.println(ans);
    }

    private static long pre1(long m){
        if(m < 0) return 0;
        long ans = 1;
        if(m >= 3){
            ans += (m - 3) / 4 + 1;
        }
        return ans;
    }

    private static long pre0(long m){
        if(m < 1) return 0;
        return (m - 1) / 4 + 1;
    }
}
