import java.util.Scanner;

public class B_2127 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) solve(sc);
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int x = sc.nextInt();
        String s = sc.next();

        x--; 

        int l = x;
        int r = x;

        while (l >= 0 && s.charAt(l) == '.') {
            l--;
        }

        while (r < n && s.charAt(r) == '.') {
            r++;
        }

        int ans = Math.max(
                        Math.min(x, n - r),
                        Math.min(l + 1, n - x - 1)
                  ) + 1;

        System.out.println(ans);
    }
}
