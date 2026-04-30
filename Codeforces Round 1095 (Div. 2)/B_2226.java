import java.util.Scanner;

public class B_2226 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int[] p = new int[n];
        for(int i = 0; i < n; i++){
            p[i] = sc.nextInt();
        }
        int ans = 0;
        for(int i = 0; i < n - 1; i++){
            int gc = Math.abs(p[i] - p[i + 1]);
            if(gcd(p[i], p[i + 1]) == gc){
                ans++;
            }
        }
        System.out.println(ans);
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
