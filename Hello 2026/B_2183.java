import java.util.Scanner;

public class B_2183 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
    }
    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        boolean[] is = new boolean[n + 2];
        
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (x <= n) {
                is[x] = true;
            }
        }
        int mex = 0;
        while (is[mex]) {
            mex++;
        }
        int ans = Math.min(mex, k - 1);
        System.out.println(ans);
    }
}
