import java.util.Scanner;

public class F_2172 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        int[] f = new int[n];   
        int[] g = new int[n];   
        f[0] = a[0];
        for (int i = 1; i < n; i++) {
            f[i] = gcd(f[i - 1], a[i]);
        }
        g[n - 1] = a[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            g[i] = gcd(g[i + 1], a[i]);
        }
        long ans = f[n - 1];
        int L = 1;      
        int R = n - 2;   
        while (L <= R) {
            if (g[L] < f[R]) {
                ans += g[L++];
            } else {
                ans += f[R--];
            }
        }

        System.out.println(ans);
    }

    private static int gcd(int a, int b){
        if(b == 0) return a;
        return gcd(b, a % b);
    }
}
