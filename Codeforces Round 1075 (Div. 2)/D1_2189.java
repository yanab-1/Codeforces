import java.util.Scanner;

public class D1_2189 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int MOD = 1_000_000_007;
        int n = sc.nextInt();
        long c = sc.nextLong();
        String s = sc.next();
        if (s.charAt(0) != '1' || s.charAt(n - 1) != '1') {
            System.out.println(-1);
            return;
        }
        long prod_c = 1;
        long prod_mod = 1;
        for (int i = 1; i <= n - 1; i++) {
            long factor;
            if (s.charAt(i - 1) == '1') {
                factor = 2;
            } else {
                factor = i - 1; 
            }
            prod_c = (prod_c * factor) % c;
            prod_mod = (prod_mod * factor) % MOD;
        }
        if (prod_c % c != 0) {
            System.out.println(prod_mod);
        } else {
            System.out.println(-1);
        }
    }
}
