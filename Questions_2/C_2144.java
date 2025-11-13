import java.util.Scanner;

public class C_2144 {
    static int MOD = 998244353;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0) solve(sc);    
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        int ans = 1;
        for(int i = 0; i < n; i++){
            int min = Math.min(a[i], b[i]);
            int max = Math.max(a[i], b[i]);
            a[i] = min;
            b[i] = max;
            if(i == 0 || a[i] >= b[i - 1]){
                ans = (ans * 2) % MOD;
            }
        }
        System.out.println(ans);
    }
}
