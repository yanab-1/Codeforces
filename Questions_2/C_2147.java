import java.util.Scanner;

public class C_2147 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) solve(sc);
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        String s = sc.next();
        boolean ok = true;
        boolean curr = (s.charAt(0) == '1');
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '0')
                cnt++;
            if (i == 0)
                continue;
            if (s.charAt(i) == s.charAt(i - 1) && s.charAt(i) == '0')
                curr = false;

            if (s.charAt(i) == s.charAt(i - 1) && s.charAt(i) == '1') {
                if (curr && cnt % 2 == 1)
                    ok = false;
                curr = true;
                cnt = 0;
            }
        }
        if (curr && cnt % 2 == 1 && s.charAt(n - 1) == '1')
            ok = false;
        System.out.println(ok ? "YES" : "NO");
    }
}
